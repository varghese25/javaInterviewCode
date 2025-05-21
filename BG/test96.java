import java.util.LinkedList;

public class test96 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.push("UrgentTask");
        queue.poll();
        queue.pop();

        System.out.println(queue);
    }
}

/*
 * 
 * 2. [Task 2]
 * 
 * LinkedList can act both as a queue (FIFO) and a stack (LIFO) in Java.
 * 
 * 1) queue.offer("Task1");
 * -> adds an element to the end of the queue.
 * -> Queue now: ["Task1"]
 * 
 * 2) queue.offer("Task2");
 * -> Adds "Task2" to the end.
 * -> Queue now: ["Task1", "Task2"]
 * 
 * 3) queue.push("UrgentTask");
 * -> push() adds an element to the front (like a stack).
 * -> Queue now: ["UrgentTask", "Task1", "Task2"]
 * 
 * 4) queue.poll();
 * -> poll() removes and returns the first element (front of the queue).
 * -> removes "UrgentTask"
 * -> Queue now: ["Task1", "Task2"]
 * 
 * 5) queue.pop();
 * -> pop() also removes the first element (like a stack).
 * -> Removes "Task1"
 * -> Queue now: ["Task2"]
 * 
 * OutPut:
 * System.out.println(queue); // [Task2]
 */