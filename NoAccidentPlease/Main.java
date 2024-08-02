package NoAccidentPlease;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create flights
        Flight flight1 = new Flight(new Coordinate(1, 1), new Coordinate(2, 2), new Coordinate(3, 3));
        Flight flight2 = new Flight(new Coordinate(1, 1), new Coordinate(2, 4), new Coordinate(3, 2));
        Flight flight3 = new Flight(new Coordinate(1, 1), new Coordinate(4, 2), new Coordinate(3, 4));
        

        FlightPathOptimizer optimizer = new FlightPathOptimizer(List.of(flight1));

        List<List<Coordinate>> optimizedPaths = optimizer.optimize();

        // Print optimized paths
        for (List<Coordinate> path : optimizedPaths) {
            // Print coordinates
        }
    }
}

