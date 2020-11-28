package ifAndElse;

public class SwitchRole {
    public static void main(String[] args) {
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're an moderator");

            default:
                System.out.println("You're an guest");
        }
    }
}