public class Triangle extends Shape implements Movable {
    protected double height;
    protected double base;


    public Triangle(double height, double base) {
        this.height = height;
        this.base= base;
    }


    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return  0.5*super.base * super.height;
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a triangle of base " + this.base);
    }

    @Override
    public String toString() {
        return "Triangle[height=" + height + ",width=" + base + "," + super.toString() + "]";
    }


    @Override
    public void moveUp() {
        height++;
    }
    @Override
    public void moveDown() {
        height--;
    }
    @Override
    public void moveLeft() {
        base--;
    }
    @Override
    public void moveRight() {
       base++;
    }

    @Override
    public String getCoordinate() {
        return  "(" + base+ "," + height + ")";

    }
}
