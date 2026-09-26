//public class main {
//    public static void main(String[] args) {
//        RentalManager rm = new RentalManager();
//        Customer c1 = new Customer("1");
//        Customer c2 = new Customer("2");
//        Customer c3 = new Customer("3");
//
//        Sedan sedanA = new Sedan("Sedan A");
//        SUV suvB = new SUV("SUV B");
//
//        rm.rentVehicle(c1, sedanA, 3);
//        rm.rentVehicle(c2, sedanA, 2);
//        rm.returnVehicle(c1, sedanA);
//        rm.rentVehicle(c3, suvB, 5);
//    }
//}


//public class main {
//    public static void main(String[] args) {
//        Student s1 = new Student("Student 1");
//        Examination examA = new Examination("Exam A");
//
//        examA.add(new MCQ("Question 1", 25, "C"));
//        examA.add(new TFQ("Question 2", 25, "False"));
//
//        Attempt att1 = new Attempt(examA, s1);
//        att1.record(examA.qs.get(0), "C");
//        att1.record(examA.qs.get(1), "True");
//        att1.submit();
//        att1.record(examA.qs.get(0), "D");
//    }
//}

//public class main {
//    public static void main(String[] args) {
//        Custome cX = new Custome("X");
//        Order oX = cX.createOrder("X");
//        oX.add(new Product("A", 2));
//        oX.add(new Product("B", 1));
//        System.out.println();
//        oX.pay(new CreditCardPayment(true));
//
//        System.out.println();
//
//        Custome cY = new Custome("Y");
//        Order oY = cY.createOrder("Y");
//        System.out.println();
//        oY.pay(new PayPalPayment(true));
//
//        System.out.println();
//
//        Custome cZ = new Custome("Z");
//        Order oZ = cZ.createOrder("Z");
//        oZ.add(new Product("C", 1));
//        System.out.println();
//        oZ.pay(new PayPalPayment(false));
//    }
//}

//public class main {
//    public static void main(String[] args) {
//        BookingSystem system = new BookingSystem();
//        Guest guestA = new Guest("Customer A");
//        Guest guestB = new Guest("Customer B");
//        Guest guestC = new Guest("Customer C");
//
//        Room room101 = new StandardRoom("101");
//        Room room201 = new DeluxeRoom("201");
//
//        system.checkAvailability(room101, 1, 5, "Jan 1 to Jan 5");
//        Reservation res1 = system.reserve(guestA, room101, 1, 5, "Jan 1-5");
//        system.reserve(guestB, room101, 3, 7, "Jan 3 to Jan 7");
//
//        if (res1 != null) {
//            res1.cancel();
//        }
//
//        system.reserve(guestC, room201, 41, 43, "Feb 10-12");
//    }
//}

public class main {
    public static void main(String[] args) {
        Employee john = new FullTimeEmployee("John");
        Employee bob = new Contractor("Bob");
        Reviewer alice = new Reviewer("Alice");

        LeaveRequest req1 = new LeaveRequest(john, 5, "Jan 1-5");
        alice.review(req1, true);

        System.out.println();

        LeaveRequest req2 = new LeaveRequest(bob, 3, "Feb 10-12");
        alice.review(req2, true);

        System.out.println();

        req1.approve();
    }
}