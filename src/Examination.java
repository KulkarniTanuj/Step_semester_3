import java.util.*;

abstract class Question {
    String id; int maxMarks;
    public Question(String i, int m) { id = i; maxMarks = m; }
    abstract int evaluate(String ans);
}

class MCQ extends Question {
    String correct;
    public MCQ(String i, int m, String c) { super(i, m); correct = c; }
    int evaluate(String ans) { return correct.equalsIgnoreCase(ans) ? maxMarks : 0; }
}

class TFQ extends Question {
    String correct;
    public TFQ(String i, int m, String c) { super(i, m); correct = c; }
    int evaluate(String ans) { return correct.equalsIgnoreCase(ans) ? maxMarks : 0; }
}

class Examination {
    String name;
    List<Question> qs = new ArrayList<>();
    int totalMarks = 0;
    public Examination(String n) { name = n; }
    public void add(Question q) { qs.add(q); totalMarks += q.maxMarks; }
}

class Student {
    String name;
    public Student(String n) { name = n; }
}

class Attempt {
    Examination exam; Student student;
    Map<Question, String> ans = new LinkedHashMap<>();
    boolean sub = false;

    public Attempt(Examination e, Student s) {
        exam = e; student = s;
        System.out.println(exam.name + " started by " + student.name + ".");
    }

    public void record(Question q, String a) {
        if (sub) { System.out.println("Cannot change answers for a submitted examination."); return; }
        ans.put(q, a); System.out.println("Answer recorded for " + q.id + ".");
    }

    public void submit() {
        if (sub) return;
        sub = true; int score = 0;
        List<String> res = new ArrayList<>();
        for (Question q : exam.qs) {
            String a = ans.getOrDefault(q, "");
            int pts = q.evaluate(a); score += pts;
            res.add(q.id + ": " + (pts > 0 ? "Correct" : "Incorrect") + " (" + pts + " points)");
        }
        System.out.println(exam.name + " submitted by " + student.name + ". Result: " + String.join(", ", res) + ". Total score: " + score + "/" + exam.totalMarks + ".");
    }
}


