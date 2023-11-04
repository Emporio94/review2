package ioop.lab4;

public class Coordinates extends World{
    public final static Coordinates NORTH_VECTOR = new Coordinates(1, 0);
    public final static Coordinates SOUTH_VECTOR = new Coordinates(-1, 0);
    public final static Coordinates EAST_VECTOR = new Coordinates(0, 1);
    public final static Coordinates WEST_VECTOR = new Coordinates(0, -1);
    public final static Coordinates STATIONARY = new Coordinates(0, 0);

    private int x;
    private int y;

    // Task 1.1
    public Coordinates(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    // Task 1.1
    public void addCoordinates(Coordinates vector) {
        this.x += vector.getX();
        this.y += vector.getY();
        int newXCoord = this.x + vector.getX();
        int newYCoord = this.y + vector.getY();
        if (newXCoord >= 0 && newYCoord >= 0){
            this.x = newXCoord;
            this.y = newYCoord;
        }
    }

    // Task 1.1
    public Coordinates findSafeMove(World world) {
        int currentXCoord = this.x;
        int currentYCoord = this.y;

        if (currentYCoord < yDimension - 1){
            return NORTH_VECTOR;
        }
        if (currentXCoord < xDimension - 1){
            return EAST_VECTOR;
        }
        if (currentYCoord > 0){
            return SOUTH_VECTOR;
        }
        if (currentXCoord > 0){
            return WEST_VECTOR;
        }
        return STATIONARY;
    }

    // Task 1.2
    public Coordinates getNextStepTo(Coordinates destination) {
        int yDifference = destination.getY() - this.y;
        int xDifference = destination.getX() - this.x;

        if (Math.abs(xDifference)>= Math.abs(yDifference)){
            if (xDifference > 0){
                return EAST_VECTOR;
            }
            else if (xDifference < 0){
                return WEST_VECTOR;
            }
        
            if (yDifference > 0){
                return NORTH_VECTOR;
            }
            else if(yDifference < 0){
                return SOUTH_VECTOR;
            }
        }
        return STATIONARY;
    }

    // Task 1.3
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
        {   
            return false;
        }
        
        Coordinates check = (Coordinates) obj;

        if (this.x == check.getX() && this.y == check.getY()){
            return true;
        }

        else{
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
