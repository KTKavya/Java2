class A{
    public void Hi()
    {
        System.out.println("Hi");
    }
}
class B extends A{
    public void hello(){
        System.out.println("Hello");
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.Hi();
        obj.hello();
    }
}
