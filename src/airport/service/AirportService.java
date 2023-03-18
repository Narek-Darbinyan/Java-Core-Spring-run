package airport.service;

import airport.model.Plane;

import java.util.Scanner;

public class AirportService {
    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter release year");
        plane.setReleasYear(s.nextInt());
        System.out.println("Is Militry plane? Y/N");
        String m=s.next().toLowerCase();
        plane.setMilitary(m.charAt(0)=='y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + "," + plane.getReleasYear());

    }

    public void printNameOrHours(Plane plane) {
    }

    public boolean nameOfPlaneWithBiggerTime(Plane plane, Plane plane2) {
        return false;
    }
}
