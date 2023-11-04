package ioop.lab4;

public class Healer extends Character {
    
    public Healer(String name, Coordinates location, int maxHealth, World world, Damage attack, Coordinates goal) {
        super(name, location, maxHealth, world, attack, goal);
    }

    // Task 3.2
    public void encounter(WorldEntity Healer){
        if (Healer instanceof Adventurer){
            healAdventurer((Adventurer)Healer);  
         }
         else if (Healer instanceof Monster){
            super.encounter(Healer);
         }
    }

    public void healAdventurer(Adventurer adventurer){
        adventurer.setCurrentHealth(adventurer.getMaxHealth());
    }

    public void takeDamage(Damage damage) {
        int newHealth = currentHealth - damage.getAmount();
        if (newHealth < 0){
            newHealth = 0;
        }

        if (currentHealth == 0){
            conscious = false;
        }
    }

    public void attack(WorldEntity Healer) {
        Healer.takeDamage(attack);
    }
}
