class dog{
    String name="munna";
    String age="2";
    String color="brown";
}
class cat{
    String name="kalyani";
    int age=1;
    String color="white";
}
public class classandobj1 {
    public static void main(String[] args) {
        dog obj1=new dog();
        cat obj2=new cat();
        {
            System.out.println(obj1.name);
            System.out.println(obj1.age);
            System.out.println(obj1.color);
            System.out.println(obj2.name);
            System.out.println(obj2.age);
            System.out.println(obj2.color);
        }
    }
}
