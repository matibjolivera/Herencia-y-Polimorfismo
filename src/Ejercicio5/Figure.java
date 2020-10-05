package Ejercicio5;

/**
 * The type Figure.
 */
abstract public class Figure {

    private String colour;

    /**
     * Instantiates a new Figure.
     *
     * @param colour the colour
     */
    public Figure(String colour) {
        this.colour = colour;
    }

    /**
     * Gets colour.
     *
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets colour.
     *
     * @param colour the colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    abstract public double getArea();

    /**
     * Gets perimeter.
     *
     * @return the perimeter
     */
    abstract public double getPerimeter();

    /**
     * Show info.
     */
    public void showInfo() {
        System.out.println(this.getClass().getName() + " - Área: " + this.getArea() + " - Perímetro: " + this.getPerimeter() + " - Color: " + this.getColour());
    }
}
