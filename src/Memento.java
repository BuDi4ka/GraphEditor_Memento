/**
 * Клас Memento зберігає стан графічного елемента.
 */
public class Memento {
    private String color;
    private int x, y;
    private int size;

    // Конструктор для створення об'єкта Memento
    public Memento(String color, int x, int y, int size) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    // Геттер для кольору
    public String getColor() {
        return color;
    }

    // Геттер для координати X
    public int getX() {
        return x;
    }

    // Геттер для координати Y
    public int getY() {
        return y;
    }

    // Геттер для розміру
    public int getSize() {
        return size;
    }
}