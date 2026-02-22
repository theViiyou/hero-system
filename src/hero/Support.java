package hero;

public class Support extends Hero {

    public Support(String name, int hp) {
        super(name, hp);

    }

    @Override
    public void ability() {
        System.out.println("Heal, heal, heal!");
    }
}