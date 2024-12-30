import javax.xml.transform.Source;

/*abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}*/
abstract class arthametic{
    abstract void add(int a,int b);
    abstract void sub(int a,int b);
    abstract void mul(int a,int b);
    abstract void div(int a,int b);
}
class F extends arthametic{
    void add(int a,int b){
        System.out.println("add :"+(a+b));
    }
    void sub(int a,int b){
        System.out.println("sub:"+(a-b));
    }
    void mul(int a,int b){
        System.out.println("mul:"+(a*b));
    }
    void div(int a,int b){
        System.out.println("div:"+(a/b));
    }
}


public class abstractmethod {
    public static void main(String[] args) {
       /* Circle obj=new Circle();
        obj.draw();*/
        F obj=new F();
        obj.add(2,3);
        obj.sub(3,6);
        obj.mul(4,6);
        obj.div(8,2);
    }
}
