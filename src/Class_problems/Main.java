package Class_problems;

//public class Main {
//    public static void main(String[] args) {
//        ToyCar c = new ToyCar("KIMI ANTENOLLI");
//        System.out.println(c.makeSound());
//
//        ToyRobot r = new ToyRobot("TOTO WOLF");
//        System.out.println(r.makeSound());
//
//        System.out.println(c.getToyId());
//        System.out.println(r.getToyId());
//    }
//}

//public class Main {
//    public static void printAll(Printable[] items) {
//        for (Printable item : items) {
//            System.out.println(item.printLabel());
//        }
//    }
//
//    public static void main(String[] args) {
//        WarehouseLableprinter p = new WarehouseLableprinter("TRK-88");
//        System.out.println(p.printLabel());
//
//        Invoice i = new Invoice("INV-42");
//        System.out.println(i.printLabel());
//
//        printAll(new Printable[]{ p, i });
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        StringInstrument s = new StringInstrument();
//        System.out.println(s.play());
//
//        Violin v = new Violin();
//        System.out.println(v.play());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Blender b = new Blender();
//
//        b.setSpeedLevel(3);
//        System.out.println(b.getSpeedLevel());
//
//        b.setSpeedLevel(9);
//        System.out.println(b.getSpeedLevel());
//
//        System.out.println(b.prepare());
//        System.out.println(b.clean());
//    }
//}

public class Main {
    public static void main(String[] args) {
        ParcelNote p = new ParcelNote("TRK-1");
        System.out.println(p.confirmDelivery());

        System.out.println(p.confirmDelivery("Tanuj"));

        PackageLog ref = p;
        PackageLog.logAll(new PackageLog[] { ref, new LetterNote("TRK-2") });
    }
}
