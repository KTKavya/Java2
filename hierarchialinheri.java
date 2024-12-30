class a1{
    void m1(){
        System.out.println("hi");
    }
}
class b1 extends a1{
    void m2(){
        System.out.println("hlo");
    }
}
class c1 extends a1{
    void m3(){
        System.out.println("hhh");
    }
}
public class hierarchialinheri {
    public static void main(String[] args) {
        b1 obj=new b1();
        c1 obj1=new c1();
        obj.m1();
        obj.m2();
        obj1.m3();


    }
}
