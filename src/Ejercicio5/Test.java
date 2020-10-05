package Ejercicio5;

public class Test {

    public static void main(String[] args) {
        FiguresGroup figuresGroup = new FiguresGroup();

        Circunference circunference = new Circunference("Azul", 5);
        Rectangle rectangle = new Rectangle("Amarillo", 4, 2);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Verde", 8, 4);

        figuresGroup.addFigure(circunference);
        figuresGroup.addFigure(rectangle);
        figuresGroup.addFigure(equilateralTriangle);

        figuresGroup.showFiguresInfo();
    }

}
