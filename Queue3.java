
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue3{
    public static void main(String[] args) {
        ArrayDeque<Integer>num = new ArrayDeque<Integer>();
        num.offer(3);
        num.offer(8);
        num.offer(4);
        num.offer(1);
        num.offer(12);
        num.push(11);
        System.out.println("Removed :"+num.poll());
        System.out.println ("Front element :"+num.peek());
        System.out.println(num);
        num.pop();
    }
}

