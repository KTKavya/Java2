import java.util.*;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue4 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.offer(3);
        num.offer(8);
        num.offer(4);
        num.offer(1);
        num.offer(12);
        System.out.println("Removed :"+num.poll());
        System.out.println ("Front element :"+num.peek());
        System.out.println(num);
    }
}

