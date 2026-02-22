import hero.*;

public class main {

    public static void main(String[] args) {

        Hero moira = new Hero("Moira", 225, "Science has no limits.");
        System.out.println("Name: " + moira.getName());
        moira.voiceLine();
    }
}