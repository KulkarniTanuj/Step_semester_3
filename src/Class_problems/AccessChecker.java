package Class_problems;

public class AccessChecker {

    static String classifyAccess(String modifier, String context) {

        if (modifier.equals("private")) {
            if (context.equals("SAME_CLASS"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (modifier.equals("default")) {
            if (context.equals("SAME_CLASS") || context.equals("SAME_PACKAGE"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (modifier.equals("protected")) {
            if (context.equals("SAME_CLASS") || context.equals("SAME_PACKAGE"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (modifier.equals("public"))
            return "ALLOWED";

        return "DENIED";
    }

    static String summarizeBatch(String[][] attempts) {

        int allowed = 0;
        int denied = 0;

        for (int i = 0; i < attempts.length; i++) {

            if (classifyAccess(attempts[i][0], attempts[i][1]).equals("ALLOWED"))
                allowed++;
            else
                denied++;
        }

        return "Allowed: " + allowed + " | Denied: " + denied;
    }

    public static void main(String[] args) {

        System.out.println(classifyAccess("private", "SAME_CLASS"));
        System.out.println(classifyAccess("protected", "DIFFERENT_PACKAGE"));

        String[][] attempts = {
                {"default", "SAME_PACKAGE"},
                {"default", "DIFFERENT_PACKAGE"},
                {"public", "DIFFERENT_PACKAGE"}
        };

        System.out.println(summarizeBatch(attempts));
    }
}
