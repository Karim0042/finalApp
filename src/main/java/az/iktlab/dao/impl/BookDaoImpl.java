package az.iktlab.dao.impl;

import az.iktlab.dao.BookRepository;
import az.iktlab.dao.connection.JDBCConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDaoImpl implements BookRepository {
    @Override
    public int addBook(Integer usrId,Integer flightId) {
        String query = "INSERT INTO book (person_id,flight_id) " +
                "VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = JDBCConnection.getInstance().getConnection().prepareStatement(query);
            preparedStatement.setInt(1,usrId);
            preparedStatement.setInt(2, flightId);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int cancelBook() {
        return 0;
    }
}
