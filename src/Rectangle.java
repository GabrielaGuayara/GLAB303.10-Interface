public class Rectangle extends Shape implements Movable {
    protected double height;
    protected double weight;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getArea() {
        double area = height * width;
        return area;
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a rectangle of height " + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
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
        width--;
    }
    @Override
    public void moveRight() {
        width++;
    }

    @Override
    public String getCoordinate() {
        return  "(" + width + "," + height + ")";

    }
}
