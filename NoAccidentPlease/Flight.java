package NoAccidentPlease;
// This class represents a flight from one point to another.

// import java.util.List;

public class Flight {
    Coordinate start;
    Coordinate waypoint1;
    Coordinate end;

    Flight(Coordinate start, Coordinate waypoint1, Coordinate end) {
        this.start = start;
        this.waypoint1 = waypoint1;
        this.end = end;
    }
}
