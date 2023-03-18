package airport.model;

public class Plane {
    private String name;
    private int releasYear;
    private int hoursInAir;
    private boolean isMilitary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleasYear() {
        return releasYear;
    }

    public void setReleasYear(int releasYear) {
        this.releasYear = releasYear;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    }

    public boolean isMilitary() {

        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public void printInfo() {
        System.out.printf("Name = %s,Release year =%d,Hours in Air = %d, Is Militry = %s\n",
                name, releasYear, hoursInAir, isMilitary ? "yes" : "no");
    }

    public void printNameOrHours(Plane plane) {
        //  if (plane.getReleasYear()>2000)
        //    System.out.println(plane.getName());
        //else
        //  System.out.println(plane.getHoursInAir());
        System.out.println(plane.getReleasYear() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
        //     if (plane1.getHoursInAir() > plane2.getHoursInAir())
        //       return plane1.getName();
        // else
        //   return plane2.getName();
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();
    }
}
