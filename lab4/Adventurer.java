package ioop.lab4;

public class Adventurer extends WorldEntity{

    private Damage[] attacks = new Damage[3];
    private int attackCount = 0;

    // Task 3.1
    public Adventurer(String name, Coordinates location, int maxHealth, World world, Damage attack) {
        super(name, location, maxHealth, world, attack);
        attacks[0] = attack;
        attackCount = 1;
    }

    // Task 3.1
    public void addAttack(Damage attack)
    {
        if (attackCount < 3){
            attacks[attackCount] = attack;
            attackCount += 1;
        }
    }

    // Task 3.1
    public void attack(WorldEntity target)
    {
        for (Damage attack : attacks){
            if (attack != null){
                target.takeDamage(attack);
            }
        }
    }

    public Damage[] getAttacks()
    {
        return attacks;
    }
    


}