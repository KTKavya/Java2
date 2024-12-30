class car1{
//    car1(String name,int wheels){
//        System.out.println(name+wheels);
//    }
    void detail1(int price,String fueltype){
        System.out.println("price :"+price);
        System.out.println("fueltype :"+fueltype);
    }
    void detail3(String name,String color){
        System.out.println("name :"+name);
        System.out.println("color :"+color);
    }
}
class BMW extends car1{
    void detail2(int model,String color)
    {
        System.out.println("model :"+model);
        System.out.println("color :"+color);
    }
    void detail4(String name,String color) {
        System.out.println("name :" + name);
        System.out.println("color :" + color);
    }
}


public class singleinherit1 {
    public static void main(String[] args) {
        BMW obj=new BMW();
        obj.detail2(2000,"black");
        obj.detail1(20000000,"petrol");
        obj.detail3("XUV","blue");
        obj.detail4("mh","white");

    }
}
