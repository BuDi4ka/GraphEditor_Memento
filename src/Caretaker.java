import java.util.Stack;

/**
 * Клас Caretaker зберігає об'єкти Memento.
 */
public class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();

    // Зберігає стан в стек
    public void addMemento(Memento memento) {
        mementoStack.push(memento);
    }

    // Відновлює останній збережений стан
    public Memento getLastMemento() {
        if (mementoStack.isEmpty()) {
            return null;
        }
        return mementoStack.pop();
    }
}