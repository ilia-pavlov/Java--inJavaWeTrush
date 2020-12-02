package strings;

public class EscapeSequences {
    public static void main(String[] args){
        String message = "Hello \"Adventurer\"";
        String path = "HoneyWood:\n\tViva\\New Zeeland\\...";   // \t - Tab
        String guest = "Find bootlegger:\tcreate a sour\\at HoneyWood!";
        System.out.println(message);
        System.out.println(path);
        System.out.println(guest);
    }
}
