package ioop.lab4;

public class Monster extends TravellingWorldEntity{
    
    private int speed;
    private int stepTimer=0;
    protected int xp=0;
    protected int level=1;
    protected int nextLevel=2;
    protected boolean awake;
    
    //Task2.2
    public Monster(String name, Coordinates location, int maxHealth, World world, Damage attack, int speed) {
        super(name, location, maxHealth, world, attack);
        this.speed=speed;
        this.awake = false;
    }

    // Task 2.2
    public void takeTurn()
    {
        if (isAwake() == true){
            stepTimer += 1;

            if (stepTimer == speed){
                Coordinates nextStep = getNextStepTo(world.getAdventurer().getLocation());
                move(nextStep);
                stepTimer = 0;
            }
        }
        
    }
    
    //Task 2.2
    public void gainXP(int amount)
    {
        xp += amount;
        while (xp >= nextLevel){
            xp -= nextLevel;
            level += 1;
            maxHealth += 10;
            currentHealth = maxHealth;
            nextLevel *= 2;
        }
        
    }
    
    //Task 2.2 - this code is incomplete but note how the monster instance passes itself as a parameter to the battle method!
    public void encounter(WorldEntity traveller)
    {
        if (isAwake() == false){
            setAwake(true);
        }
        else {
        world.battle(this,traveller);
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getStepTimer() {
        return stepTimer;
    }

    public boolean isAwake() {
        return awake;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public int getNextLevel() {
        return nextLevel;
    }

    public void setAwake(boolean awake)
    {
        this.awake=awake;
    }

    
}
