public class main {
    public static void main(String[] args) {
        RentalManager rm = new RentalManager();
        Customer c1 = new Customer("1");
        Customer c2 = new Customer("2");
        Customer c3 = new Customer("3");

        Sedan sedanA = new Sedan("Sedan A");
        SUV suvB = new SUV("SUV B");

        rm.rentVehicle(c1, sedanA, 3);
        rm.rentVehicle(c2, sedanA, 2);
        rm.returnVehicle(c1, sedanA);
        rm.rentVehicle(c3, suvB, 5);
    }
}


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