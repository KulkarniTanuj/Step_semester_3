package Class_problems;

class LibraryPatron {
    String memberId;
    int borrowLimit;
    int booksBorrowed;

    public LibraryPatron(String memberId, int borrowLimit) {
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
    }

    public String displayInfo() {
        return "General | Books: " + booksBorrowed;
    }

    public static String batchPrint(LibraryPatron[] members) {
        StringBuilder report = new StringBuilder();

        for (LibraryPatron member : members) {
            report.append(member.displayInfo());

            if (member instanceof StudentPatron) {
                StudentPatron student = (StudentPatron) member;
                report.append(" [Course via downcast: ").append(student.course).append("]");
            }

            report.append(" | ");
        }

        return report.toString();
    }
}

class StudentPatron extends LibraryPatron {
    String course;

    public StudentPatron(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public String displayInfo() {
        return "Student | Course: " + course + " | Books: " + booksBorrowed;
    }
}


