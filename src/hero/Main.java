package hero;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>();

        Hero moira = new Support("Moira", 225);
        Hero domina = new Tank("Domina", 250, 400);
        Hero vendetta = new Attacker("Vendetta", 175, 100);

        heroes.add(moira);
        heroes.add(domina);
            heroes.add(vendetta);

        for (Hero h : heroes) {
            h.ability();
        }
    }
}