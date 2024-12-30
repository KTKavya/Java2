class dog1{
    public void details1(String name,String color,String bread)
    {
        System.out.println("name :"+name);
        System.out.println("color :"+color);
        System.out.println("bread :"+bread);
    }
}
class dog2 extends dog1{
    public void details2(String name,String color,String bread,String gender){
        System.out.println("name :"+name);
        System.out.println("color :"+color);
        System.out.println("bread :"+bread);
        System.out.println("gender :"+gender);
    }

}

public class singleinheritance2 {
    public static void main(String[] args) {
        dog2 obj=new dog2();
        obj.details2("puppy","brown","german","female");
        obj.details1("kutty","white","kkkk");

    }
}
