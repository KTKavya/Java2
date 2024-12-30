class food{
    void n1(String typeoffood,String name,float rating){
        System.out.println("typeoffood :"+typeoffood);
        System.out.println("name:"+name);
        System.out.println("rating:"+rating);
    }
}
class f1 extends food{
    void n2(String name,int price,String quantity){
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("quantity:"+quantity);
    }
}
class f2 extends food{
    void n3(String name,int price,String quantity){
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("quantity:"+quantity);
    }
}

public class hierarchial2 {
    public static void main(String[] args) {
        f1 obj=new f1();
        f2 obj1=new f2();
        obj.n2("dosa",60,"medium");
        obj1.n1("Rice","pulav",4);
        obj1.n3("pannir",50,"large");
    }
}
