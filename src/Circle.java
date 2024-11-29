/**
 * Клас Circle для представлення кола.
 */
public class Circle extends GraphicElement {

    public Circle(String color, int x, int y, int size) {
        super(color, x, y, size);
    }

    /**
     * Метод для малювання кола.
     */
    @Override
    public void draw() {
        System.out.println("Малювання кола: " + this);
    }
}