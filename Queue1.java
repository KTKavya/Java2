import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("kavya");
        queue.offer("kiran");
        queue.offer("ashu");
        queue.offer("sandee");
        System.out.println("Front element :"+queue.peek());
        System.out.println("Removing elements:"+queue.poll());
        System.out.println(queue);
    }
}
