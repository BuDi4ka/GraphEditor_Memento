/**
 * Клас Triangle для представлення трикутника.
 */
public class Triangle extends GraphicElement {

    public Triangle(String color, int x, int y, int size) {
        super(color, x, y, size);
    }

    /**
     * Метод для малювання трикутника.
     */
    @Override
    public void draw() {
        System.out.println("Малювання трикутника: " + this);
    }
}