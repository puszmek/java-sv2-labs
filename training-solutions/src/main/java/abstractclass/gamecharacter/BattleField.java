package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        boolean alive = attacker.isAlive() && defender.isAlive();
        if (alive) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return alive;
    }

    public Character fight(Character one, Character other){
        while(oneHit(one, other) && oneHit(other, one)) {
            round++;
        }
        if (one.isAlive()) {
            return one;
        }
        return other;
    }
}
