abstract class p1{
    abstract void officeworkdet(int id,String loginhr);
}
class p2 extends p1{
    void officeworkdet(int id,String loginhr){
        System.out.println(id+loginhr);
    }
    void personalwrkdet(int readinghr,String sleepinghr){
        System.out.println(readinghr+sleepinghr);
    }
    p2(String name,int age){
        System.out.println(name+age);
    }
}


public class abstract2 {
    public static void main(String[] args) {
        p2 oj=new p2("kk ",23);
        oj.officeworkdet(123," 10");
        oj.personalwrkdet(2," 8");

    }
}
