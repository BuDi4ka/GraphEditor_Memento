/**
 * Основний клас для тестування шаблону Memento.
 */
public class Main {
    public static void main(String[] args) {
        // Створюємо графічні елементи
        GraphicElement circle = new Circle("Red", 10, 20, 30);
        GraphicElement triangle = new Triangle("Blue", 15, 25, 35);

        // Створюємо Caretaker для збереження стану
        Caretaker caretaker = new Caretaker();

        // Малюємо елементи
        circle.draw();
        triangle.draw();

        // Зберігаємо стан елементів
        caretaker.addMemento(circle.saveStateToMemento());
        caretaker.addMemento(triangle.saveStateToMemento());

        // Змінюємо елементи
        circle.restoreStateFromMemento(caretaker.getLastMemento());
        triangle.restoreStateFromMemento(caretaker.getLastMemento());

        // Відновлюємо стан
        System.out.println("\nВідновлений стан:");
        circle.draw();
        triangle.draw();
    }
}