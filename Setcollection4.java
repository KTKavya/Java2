import java.util.Stack;
import java.util.List;

public class Setcollection4 {
    public static void main(String[] args) {
        Stack<Integer> List1=new Stack<Integer>();
        List1.add(5);
        List1.push(3);
        List1.push(6);
        List1.add(4);
        List1.pop();
        List1.push(8);
        List1.remove(2);
        System.out.println(List1);

    }
}
