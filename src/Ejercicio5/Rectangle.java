package Ejercicio5;

/**
 * The type Rectangle.
 */
public class Rectangle extends Figure {

    private double base;
    private double height;

    /**
     * Instantiates a new Figure.
     *
     * @param colour the colour
     */
    public Rectangle(String colour, double base, double height) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    /**
     * Gets side.
     *
     * @return the side
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets side.
     *
     * @param base the side
     */
    public void setBase(double base) {
        this.base = base;
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
        return this.getBase() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return this.getBase() * 2 + this.getHeight() * 2;
    }
}
