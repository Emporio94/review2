package ioop.lab4;

public class Skeleton extends Monster{

    public Skeleton(String name, Coordinates location, int maxHealth, World world, Damage attack, int speed) {
        super(name, location, maxHealth, world, attack, speed);
    }

    // Task 2.3
    public void encounter(WorldEntity traveller)
    {
        boolean firstEncounter = true;
        if (firstEncounter == true){
            super.attack(traveller);
            firstEncounter = false;
        }
        else {
            super.encounter(traveller);
        }
    }

    
}
