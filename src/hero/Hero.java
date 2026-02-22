package hero;

public class Hero extends Character implements Attackable {
    private String voiceline = "";

    public Hero(String name, int health, String voiceline) {
        super(name, health);
        this.voiceline = voiceline;
    }

    @Override
    public void attack() {
    }

    @Override
    public void voiceLine() {
        System.out.println(getName() + ": " + voiceline);
    }

}
