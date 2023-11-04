package ioop.lab4;

public class Blob extends Monster{
    public Blob(String name, Coordinates location, int maxHealth, World world, Damage attack, int speed) {
        super(name, location, maxHealth, world, attack, speed);
    }

    public void encounter(WorldEntity traveller)
    {
        if (traveller instanceof Blob){
            Blob travellingBlob = (Blob) traveller;

            maxHealth += travellingBlob.getMaxHealth();
            currentHealth += travellingBlob.getCurrentHealth();
            gainXP(travellingBlob.getXp());
            travellingBlob.setCurrentHealth(0);    
         }
         else {
            super.encounter(traveller);
         }
    }


}
