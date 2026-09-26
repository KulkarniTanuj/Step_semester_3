abstract class Vehicle {
    String name;
    boolean available = true;
    public Vehicle(String n) { name = n; }
    abstract double calculateCharge(int days);
}

class Sedan extends Vehicle {
    public Sedan(String n) { super(n); }
    double calculateCharge(int days) { return days * 50.0; }
}

class SUV extends Vehicle {
    public SUV(String n) { super(n); }
    double calculateCharge(int days) { return days * 80.0; }
}

class Customer {
    String id;
    public Customer(String id) { this.id = id; }
}

public class VehicleRentalSystem {
    Vehicle vehicle;
    Customer customer;
    int days;
    public VehicleRentalSystem(Vehicle v, Customer c, int d) {
        vehicle = v; customer = c; days = d;
    }
}

class RentalManager {
    public void rentVehicle(Customer c, Vehicle v, int days) {
        if (!v.available) {
            System.out.println(v.name + " is currently unavailable.");
            return;
        }
        VehicleRentalSystem r = new VehicleRentalSystem(v, c, days);
        v.available = false;
        System.out.println(v.name + " rented successfully by Customer " + c.id + ". Rental charge: $" + v.calculateCharge(days) + ".");
    }

    public void returnVehicle(Customer c, Vehicle v) {
        v.available = true;
        System.out.println(v.name + " returned by Customer " + c.id + ".");
    }
}


