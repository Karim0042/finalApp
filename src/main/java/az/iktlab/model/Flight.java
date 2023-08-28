package az.iktlab.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Flight {
    private Long  id;
    private String flightNumber;
    private String airline;
    private String destination;
    private String departureCity;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private String gate;
    private String terminal;
    private String status;
    private int checkInCounter;
    private LocalTime boardingTime;

    public Flight(Long id, String flightNumber, String airline, String destination, String departureCity, LocalTime departureTime,LocalTime arrivalTime, String gate, String terminal, String status, int checkInCounter, LocalTime boardingTime) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.destination = destination;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.terminal = terminal;
        this.status = status;
        this.checkInCounter = checkInCounter;
        this.boardingTime = boardingTime;
    }

    public Flight() {
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline + '\'' +
                ", destination='" + destination + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", gate='" + gate + '\'' +
                ", terminal='" + terminal + '\'' +
                ", status='" + status + '\'' +
                ", checkInCounter=" + checkInCounter +
                ", boardingTime=" + boardingTime +
                '}';
    }
}
