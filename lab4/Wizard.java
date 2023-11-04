package ioop.lab4;

public class Wizard extends Character{

    public Wizard(String name, Coordinates location, int maxHealth, World world, Damage attack, Coordinates goal) {
        super(name, location, maxHealth, world, attack, goal);
    }

    // Task 3.2
    public void encounter(WorldEntity entity){
        if (entity instanceof Adventurer){
            Adventurer adventurer = (Adventurer) entity;
            adventurer.addAttack(new Damage(10, DamageType.FIRE));
        }
        else if (entity instanceof Monster){
            super.encounter(entity);
         }
    }

}
