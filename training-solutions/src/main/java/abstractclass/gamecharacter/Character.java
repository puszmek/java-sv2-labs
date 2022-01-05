package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private final int MAX_DAMAGE = 10;
    private final int MAX_DEFENCE = 5;
    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive() {
        if (hitPoint > 0) {
            return true;
        }
        return false;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(MAX_DAMAGE - 1) + 1;
    }

    private int getActualDefence() {
        return random.nextInt(MAX_DEFENCE);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        this.hitPoint -= diff;
    }

    public abstract void secondaryAttack(Character enemy);
}
