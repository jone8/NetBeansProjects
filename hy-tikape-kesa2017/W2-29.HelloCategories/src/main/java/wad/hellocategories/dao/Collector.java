package wad.hellocategories.dao;

import java.sql.*;

public interface Collector<T> {

    T collect(ResultSet rs) throws SQLException;

}
