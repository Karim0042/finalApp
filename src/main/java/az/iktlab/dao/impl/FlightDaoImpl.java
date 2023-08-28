package az.iktlab.dao.impl;

import az.iktlab.dao.FlightRepository;
import az.iktlab.dao.connection.JDBCConnection;
import az.iktlab.model.Flight;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightDaoImpl implements FlightRepository {
    private Flight getFlight(ResultSet rs) {
        try {
            Long id = rs.getLong("id");
            String flightNumber = rs.getString("flightnumber");
            String airline = rs.getString("airline");
            String destination = rs.getString("destination");
            String departureCity = rs.getString("departurecity");
            Time timestamp = rs.getTime("departuretime");
            LocalTime departureTime = timestamp.toLocalTime();
            Time timestamp1 = rs.getTime("arrivaltime");
            LocalTime arrivalTime = timestamp1.toLocalTime();
            String gate = rs.getString("gate");
            String terminal = rs.getString("terminal");
            String status = rs.getString("status");
            Integer checkInCounter = rs.getInt("checkincounter");
            Time timestamp2 = rs.getTime("boardingtime");
            LocalTime boardingTime = timestamp2.toLocalTime();
            return new Flight(id, flightNumber, airline, destination, departureCity, departureTime, arrivalTime, gate, terminal, status, checkInCounter, boardingTime);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Flight> getAllFlightsFromKiev() {
        List<Flight> list = new ArrayList<>();
        try {
            Statement stmt = JDBCConnection.getInstance().getConnection().createStatement();
            stmt.execute("SELECT *\n" +
                    "FROM flight WHERE departuretime > current_date and departuretime<current_date + interval '1 day'");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Flight flight = getFlight(rs);
                list.add(flight);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public Flight getFlightById(Integer id) {
        Flight flight = null;
        try {
            Statement stmt = JDBCConnection.getInstance().getConnection().createStatement();

            stmt.execute("select *from flight where id=" + id);
            ResultSet rs = stmt.getResultSet();
            while (rs.next())
                flight = getFlight(rs);
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flight;
    }

    @Override
    public List<Flight> getAllFlightsByDestinationAndTimeAndCount() {
        return null;
    }
}
