/**
 * Абстрактний клас GraphicElement для графічних елементів.
 * Включає загальні атрибути та методи для всіх елементів.
 */
public abstract class GraphicElement {
    protected String color;
    protected int x, y; // Позиція
    protected int size; // Розмір

    /**
     * Конструктор для створення графічного елемента.
     * @param color колір елемента.
     * @param x координата X.
     * @param y координата Y.
     * @param size розмір елемента.
     */
    public GraphicElement(String color, int x, int y, int size) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Метод для відображення елемента (заглушка).
     */
    public abstract void draw();

    /**
     * Збереження стану елемента.
     * @return Memento з поточним станом.
     */
    public Memento saveStateToMemento() {
        return new Memento(color, x, y, size);
    }

    /**
     * Відновлення стану елемента.
     * @param memento об'єкт Memento для відновлення стану.
     */
    public void restoreStateFromMemento(Memento memento) {
        this.color = memento.getColor();
        this.x = memento.getX();
        this.y = memento.getY();
        this.size = memento.getSize();
        System.out.println("Стан відновлено: " + this);
    }

    /**
     * Отримати поточний стан елемента.
     * @return Memento з поточним станом.
     */
    public Memento getState() {
        return new Memento(color, x, y, size);
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Position: (" + x + ", " + y + "), Size: " + size;
    }
}