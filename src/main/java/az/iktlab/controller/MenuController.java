package az.iktlab.controller;

import az.iktlab.constants.Menu;
import az.iktlab.dao.FlightRepository;
import az.iktlab.dao.impl.FlightDaoImpl;
import az.iktlab.util.ScannerUtil;

import java.util.Arrays;

import static az.iktlab.util.ScannerUtil.getFlightId;
import static az.iktlab.util.ScannerUtil.getMenu;

public class MenuController {
    private final FlightController flightRepository = new FlightController();
    public  void selectMenu(){

        boolean ff=true;
        while (ff){
            showMenu();
            var index = getMenu();
            switch (index){
                case 1->{
                    System.out.println(flightRepository.getAllFlightsFromKiev());
                }
                case 2->{
                   int n =ScannerUtil.getFlightId();
                    System.out.println(flightRepository.getFlightById(n));
                }
                case 3->{

                }
                case 4->{

                }
                case 5->{

                }
                case 6->ff=false;
                default -> System.out.println("ENTER VALID COMMAND");
            }
        }
    }
    private void showMenu() {
        Arrays.stream(Menu.values())
                .forEach(it -> System.out.printf("%d-%s\n", it.getIndex(), it.getDescription()));
    }
}
