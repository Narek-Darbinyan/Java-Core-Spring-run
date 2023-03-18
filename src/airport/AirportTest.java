package airport;

import airport.model.Plane;
import airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.createPlane();
        Plane plane2  = service.createPlane();
        System.out.println("---------------------");
        service.printNameAndReleaseDate(plane);
        System.out.println("------------------------");
        service.printNameOrHours(plane);
        System.out.println(service.nameOfPlaneWithBiggerTime(plane,plane2));
    }
}
