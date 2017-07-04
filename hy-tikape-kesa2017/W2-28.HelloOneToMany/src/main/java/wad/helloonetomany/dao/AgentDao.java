package wad.helloonetomany.dao;

import wad.helloonetomany.domain.Agent;
import java.sql.SQLException;
import java.util.List;
import wad.helloonetomany.domain.Agency;

public class AgentDao implements Dao<Agent, String> {

    private Database database;

    public AgentDao(Database database) {
        this.database = database;
    }

    @Override
    public Agent create(Agent t) throws SQLException {
        return null;
    }

    @Override
    public Agent findOne(String key) throws SQLException {
        return null;
    }

    @Override
    public List<Agent> findAll() throws SQLException {
        return null;
    }

    public List<Agent> findByAgency(Agency a) throws SQLException {
        return null;
    }

    @Override
    public void delete(String key) throws SQLException {
    }

    @Override
    public void update(String key, Agent agent) throws SQLException {
        // can be left empty
    }
}
