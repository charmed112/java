import java.util.LinkedList;
public class Lesson_8 {
    private LinkedList elements = new LinkedList();
    public Lesson_8() {
    }
    public Lesson_8(LinkedList elements) {
        this.elements = elements;
    }
    public void enqueue(Object element) {
        elements.add(element);
    }
    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }
    public Object first() {
        return elements.getFirst();
    }
    public LinkedList getElements() {
        return elements;
    }
    public void setElements(LinkedList elements) {
        this.elements = elements;
    }
    public static void main(String[] args) {
        Lesson_8 queue = new Lesson_8();
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(117);
        queue.enqueue(6);
        queue.enqueue(12);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}

