package Class_problems;

class LibraryAccount {
    String memberId;
    int borrowLimit;
    int booksBorrowed;

    public LibraryAccount(String memberId, int borrowLimit) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("Invalid member ID");
        }
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;
    }

    public void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public String displayInfo() {
        return "General Member | Books Borrowed: " + booksBorrowed;
    }

    public static String enrollBatch(String[] memberIds, int borrowLimit) {
        int enrolled = 0;
        int rejected = 0;
        for (int i = 0; i < memberIds.length; i++) {
            try {
                new LibraryAccount(memberIds[i], borrowLimit);
                enrolled++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }
        return "Enrolled: " + enrolled + " | Rejected: " + rejected;
    }

    public static String classifyGeneration(LibraryAccount member) {
        if (member instanceof HonorsStudentAccount) {
            return "Multilevel descendant (3 generations deep)";
        } else if (member instanceof FacultyAccount) {
            return "Hierarchical sibling (independent branch)";
        }
        return "Base or Student member";
    }

    public static int getTotalBooksBorrowed(LibraryAccount[] members) {
        int total = 0;
        for (LibraryAccount member : members) {
            total += member.getBooksBorrowed();
        }
        return total;
    }
}

class StudentAccount extends LibraryAccount {
    String course;

    public StudentAccount(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public String displayInfo() {
        return "Student Member | Course: " + course + " | Books Borrowed: " + getBooksBorrowed();
    }
}

class HonorsStudentAccount extends StudentAccount {
    int bonusLimit;

    public HonorsStudentAccount(String memberId, int borrowLimit, String course, int bonusLimit) {
        super(memberId, borrowLimit, course);
        this.bonusLimit = bonusLimit;
    }

    @Override
    public String displayInfo() {
        return "Honors Student Member | Course: " + course + " | Bonus Limit: " + bonusLimit + " | Books Borrowed: " + getBooksBorrowed();
    }
}

class FacultyAccount extends LibraryAccount {
    String department;

    public FacultyAccount(String memberId, int borrowLimit, String department) {
        super(memberId, borrowLimit);
        this.department = department;
    }

    @Override
    public String displayInfo() {
        return "Faculty Member | Department: " + department + " | Books Borrowed: " + getBooksBorrowed();
    }
}