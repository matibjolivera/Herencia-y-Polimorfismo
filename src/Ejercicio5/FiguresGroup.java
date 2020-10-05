package Ejercicio5;

import java.util.ArrayList;

/**
 * The type Figures group.
 */
public class FiguresGroup {

    private ArrayList<Figure> figures;

    /**
     * Instantiates a new Figures group.
     */
    public FiguresGroup() {
        this.figures = new ArrayList<>();
    }

    /**
     * Gets figures.
     *
     * @return the figures
     */
    public ArrayList<Figure> getFigures() {
        return figures;
    }

    /**
     * Sets figures.
     *
     * @param figures the figures
     */
    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    /**
     * Add figure.
     *
     * @param figure the figure
     */
    public void addFigure(Figure figure) {
        this.getFigures().add(figure);
    }

    /**
     * Show figures info.
     */
    public void showFiguresInfo() {
        for (Figure figure : this.getFigures()) {
            figure.showInfo();
        }
    }
}
