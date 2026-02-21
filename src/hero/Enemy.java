package hero;

public class Enemy extends Character implements Attackable {

    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
    }

}