package Class_problems;

import java.util.Arrays;

class LibraryUser {
    String memberId;
    int borrowLimit;
    private int[] fineHistory = new int[10];
    private int fineCount = 0;

    public LibraryUser(String memberId, int borrowLimit) {
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
    }

    protected void chargeFine(int amount) {
        if (fineCount < 10) {
            fineHistory[fineCount] = amount;
            fineCount++;
        }
    }

    public int[] getFineHistory() {
        return Arrays.copyOf(fineHistory, fineCount);
    }

    public int getTotalFine() {
        int total = 0;
        for (int i = 0; i < fineCount; i++) {
            total += fineHistory[i];
        }
        return total;
    }
}

class StudentUser extends LibraryUser {
    String course;

    public StudentUser(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    protected void chargeFine(int amount) {
        super.chargeFine(amount / 2);
    }
}


