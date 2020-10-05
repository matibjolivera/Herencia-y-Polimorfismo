package Ejercicio5;

/**
 * The type Circunference.
 */
public class Circunference extends Figure {

    private double ratio;

    /**
     * Instantiates a new Figure.
     *
     * @param colour the colour
     * @param ratio  the ratio
     */
    public Circunference(String colour, double ratio) {
        super(colour);
        this.ratio = ratio;
    }

    /**
     * Gets ratio.
     *
     * @return the ratio
     */
    public double getRatio() {
        return ratio;
    }

    /**
     * Sets ratio.
     *
     * @param ratio the ratio
     */
    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRatio(), 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.getRatio();
    }
}
