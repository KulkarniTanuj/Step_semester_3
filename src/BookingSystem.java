import java.util.*;

abstract class Room {
    String id;
    String name;
    List<Reservation> reservations = new ArrayList<>();

    public Room(String id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculatePrice(int days);

    public boolean isAvailable(int start, int end) {
        for (Reservation r : this.reservations) {
            if (start < r.end && end > r.start) {
                return false;
            }
        }
        return true;
    }
}

class StandardRoom extends Room {
    public StandardRoom(String id) {
        super(id, "Standard Room");
    }

    public double calculatePrice(int days) {
        return days * 100.0;
    }
}

class DeluxeRoom extends Room {
    public DeluxeRoom(String id) {
        super(id, "Deluxe Room");
    }

    public double calculatePrice(int days) {
        return days * 250.0;
    }
}

class Guest {
    String name;

    public Guest(String name) {
        this.name = name;
    }
}

class Reservation {
    Guest guest;
    Room room;
    int start;
    int end;
    String dateString;

    public Reservation(Guest guest, Room room, int start, int end, String dateString) {
        this.guest = guest;
        this.room = room;
        this.start = start;
        this.end = end;
        this.dateString = dateString;
    }

    public void cancel() {
        this.room.reservations.remove(this);
        System.out.println("Reservation for " + this.guest.name + ", " + this.room.name + " " + this.room.id + " (" + this.dateString + ") cancelled successfully.");
    }
}

class BookingSystem {
    public void checkAvailability(Room room, int start, int end, String dateString) {
        if (room.isAvailable(start, end)) {
            System.out.println(room.name + " " + room.id + " is available from " + dateString + ".");
        } else {
            System.out.println(room.name + " " + room.id + " is not available from " + dateString + ".");
        }
    }

    public Reservation reserve(Guest guest, Room room, int start, int end, String dateString) {
        if (!room.isAvailable(start, end)) {
            System.out.println(room.name + " " + room.id + " is not available from " + dateString + ".");
            return null;
        }
        Reservation res = new Reservation(guest, room, start, end, dateString);
        room.reservations.add(res);
        double price = room.calculatePrice(end - start);
        System.out.println("Reservation confirmed for " + guest.name + ", " + room.name + " " + room.id + " (" + dateString + "). Price: $" + price + ".");
        return res;
    }
}

