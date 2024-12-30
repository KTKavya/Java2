/*class demo2{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}*/

class demo2{
    demo2(int a,int b){
        System.out.println(a+b);
    }
    demo2(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class overloading {
    public static void main(String[] args) {
        demo2 obj=new demo2(3,2);
        demo2 obj1=new demo2(1,3,5);

    }
}
