import java.util.LinkedList;
public class Lesson_8 {
    private LinkedList numbers = new LinkedList();
    public Lesson_8() {
    }
    public Lesson_8(LinkedList elements) {
        this.numbers = elements;
    }
    public void enqueue(Object element) {
        numbers.add(element);
    }
    public Object dequeue() {
        Object first = numbers.getFirst();
        numbers.removeFirst();
        return first;
    }
    public Object first() {
        return numbers.getFirst();
    }
    public LinkedList getElements() {
        return numbers;
    }
    public void setElements(LinkedList elements) {
        this.numbers = elements;
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

