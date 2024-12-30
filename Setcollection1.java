import java.util.HashSet;
import java.util.Set;

public class Setcollection1 {
    public static void main(String[] args) {
        Set<String>fruits =new HashSet<>();
        fruits.add("Apple");
        fruits.add("Guva");
        fruits.add("apple");
        fruits.add("Guva");
        fruits.remove("apple");
        System.out.println(fruits);
    }
}
