package Ejercicio5;

/**
 * The type Equilateral triangle.
 */
public class EquilateralTriangle extends Figure {

    private double side;
    private double height;

    /**
     * Instantiates a new Figure.
     *
     * @param colour the colour
     * @param side   the side
     * @param height the height
     */
    public EquilateralTriangle(String colour, double side, double height) {
        super(colour);
        this.side = side;
        this.height = height;
    }

    /**
     * Gets side.
     *
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets side.
     *
     * @param side the side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.getHeight() * this.getSide()) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.getSide() * 3;
    }
}
