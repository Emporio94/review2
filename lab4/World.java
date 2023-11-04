package ioop.lab4;

public class World {

    public int xDimension;
    public int yDimension;
    private Adventurer adventurer;

    public World(int xDimension, int yDimension) {
        this.xDimension = xDimension;
        this.yDimension = yDimension;

    }

    // Task 3.1
    public void battle(WorldEntity resident, WorldEntity traveller) {
        while (resident.isConscious() && traveller.isConscious()){
            resident.attack(traveller);
            if (!traveller.isConscious()){
                break;
            }
            traveller.attack(resident);
            if (!resident.isConscious()){
                break;
            }
        }
    }

    public int getxDimension() {
        return xDimension;
    }

    public void setxDimension(int xDimension) {
        this.xDimension = xDimension;
    }

    public int getyDimension() {
        return yDimension;
    }

    public void setyDimension(int yDimension) {
        this.yDimension = yDimension;
    }

    public void setAdventurer(Adventurer adventurer)
    {
        this.adventurer=adventurer;
    }

    public Adventurer getAdventurer()
    {
        return adventurer;
    }

    public static void main(String[] args) {

    }
}
