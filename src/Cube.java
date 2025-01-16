public class Cube {
    //properties
    private int side;

    //constructors
    public Cube() {
        side = 1;
    }

    public Cube(int side) {
        if (side<1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }

        else {
            this.side = side;
        }
    }

    //methods
    public int getSide() {
        return side;
    }

    public int setSide(int side) {
        if (side<1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }

        else {
            return this.side = side;
        }
    }
    public int calculateSurfaceArea() {
        return (side*side)*6;
    }

    public int calculateVolume() {
        return side*side*side;
    }

    public String toString() {
        return "Cube{side=" + side + "}.";
    }
}
