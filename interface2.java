interface abc1{
    int a=5;
    int b=2;
    void add();
    void sub();
}
class def1 implements abc1{
    public void add() {
        System.out.println("add");
    }
    public void sub() {
        System.out.println("sub");
    }
}

public class interface2 {

    public static void main(String[] args) {
        def1 obj=new def1();
        obj.add();
        obj.sub();

        System.out.println(abc1.a+" "+abc1.b);
    }
}
