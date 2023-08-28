package az.iktlab.service.impl;

import az.iktlab.dao.FlightRepository;
import az.iktlab.dao.impl.FlightDaoImpl;
import az.iktlab.model.Flight;
import az.iktlab.service.FlightService;

import java.util.List;

public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository = new FlightDaoImpl();

    @Override
    public List<Flight> getAllFlightsFromKiev() {
        return flightRepository.getAllFlightsFromKiev();
    }

    @Override
    public Flight getFlightById(Integer id) {
        return flightRepository.getFlightById(id);
    }

    @Override
    public List<Flight> getAllFlightsByDestinationAndTimeAndCount() {
        return null;
    }
}
