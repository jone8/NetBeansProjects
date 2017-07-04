package wad.helloonetomany.dao;

import java.sql.SQLException;
import java.util.List;
import wad.helloonetomany.domain.Agency;

public class AgencyDao implements Dao<Agency, Integer> {

    private Database database;

    public AgencyDao(Database database) {
        this.database = database;
    }

    @Override
    public Agency create(Agency a) throws SQLException {
        database.update("INSERT INTO Agency (name) VALUES (?)", a.getName());
        return findByName(a.getName());
    }

    public Agency findByName(String name) throws SQLException {
        return (Agency) database.queryAndCollect("SELECT * FROM Agency WHERE name = ?", rs -> new Agency(rs.getInt("id"), rs.getString("name")), name).get(0);
    }

    @Override
    public Agency findOne(Integer key) throws SQLException {
        return (Agency) database.queryAndCollect("SELECT * FROM Agency WHERE id = ?", rs -> new Agency(rs.getInt("id"), rs.getString("name")), key).get(0);
    }

    @Override
    public List<Agency> findAll() throws SQLException {
        return database.queryAndCollect("SELECT * FROM Agency", rs -> new Agency(rs.getInt("id"), rs.getString("name")));
    }

    @Override
    public void update(Integer key, Agency t) throws SQLException {
        // not implemented
    }

    @Override
    public void delete(Integer key) throws SQLException {
        // not implemented
    }

}
