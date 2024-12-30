class animal{
    void d1(String color,String typeoffood){
        System.out.println("color :"+color);
        System.out.println("typeoffood :"+typeoffood);
    }
}
class dogg extends animal{
    void d2(int price,String breed,String color){
        System.out.println("price :"+price);
        System.out.println("breed:"+breed);
        System.out.println("color :"+color);
    }
}
class dogg1 extends dogg{
    void d3(String name,String breed,String color,String gender){
        System.out.println("name:"+name);
        System.out.println("breed:"+breed);
        System.out.println("color:"+color);
        System.out.println("gender:"+gender);
    }
}

public class mulinheritance1 {
    public static void main(String[] args) {
        dogg obj=new dogg();
        obj.d2(222222,"kkkk","white");
    }
}
