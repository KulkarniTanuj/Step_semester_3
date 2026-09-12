//package Class_problems;
//public class Main {
//    public static void main(String[] args) {
//        try {
//            new LibraryMember("LB1", 3);
//        } catch (IllegalArgumentException e) {
//            System.out.println("construction rejected");
//        }
//
//        StudentMember s = new StudentMember("STU10", 3, "CSE");
//        s.borrowBook();
//        s.borrowBook();
//        System.out.println(s.getBooksBorrowed());
//
//        String[] batch = {"STU1", "LB1", "STU2", "   ", "STU3"};
//        System.out.println(LibraryMember.enrollBatch(batch, 3));
//    }
//}


package Class_problems;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(new LibraryAccount("STU1", 3).displayInfo());
//        System.out.println(new StudentAccount("STU2", 3, "CSE").displayInfo());
//
//        HonorsStudentAccount honorsMember = new HonorsStudentAccount("STU3", 3, "ECE", 2);
//        System.out.println(honorsMember.displayInfo());
//
//        FacultyAccount facultyMember = new FacultyAccount("STU4", 5, "Physics");
//        System.out.println(facultyMember.displayInfo());
//
//
//
//        System.out.println(LibraryAccount.classifyGeneration(honorsMember));
//        System.out.println(LibraryAccount.classifyGeneration(facultyMember));
//
//
//
//        StudentAccount studentMember = new StudentAccount("STU2", 3, "CSE");
//
//        studentMember.borrowBook();
//        studentMember.borrowBook();
//        honorsMember.borrowBook();
//        facultyMember.borrowBook();
//        facultyMember.borrowBook();
//        facultyMember.borrowBook();
//
//        LibraryAccount[] mixedArray = { studentMember, honorsMember, facultyMember };
//        System.out.println(LibraryAccount.getTotalBooksBorrowed(mixedArray));
//    }
//}


//import Class_problems.StudentUser;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        StudentUser s = new StudentUser("STU5", 3, "CSE");
//
//        s.chargeFine(100);
//        System.out.println(s.getTotalFine());
//
//        int[] history = s.getFineHistory();
//        System.out.println(Arrays.toString(history));
//
//        history[0] = 999;
//        System.out.println(Arrays.toString(s.getFineHistory()));
//    }
//}

public class Main {
    public static void main(String[] args) {
        LibraryPatron[] members = {
                new LibraryPatron("LB5", 3),
                new StudentPatron("STU6", 3, "ECE")
        };

        System.out.println(LibraryPatron.batchPrint(members));

        try {
            LibraryPatron plain = new LibraryPatron("LB6", 3);
            StudentPatron bad = (StudentPatron) plain;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException at runtime");
        }
    }
}