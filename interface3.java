interface Swimmer{
    void swim();
}
interface Flyer{
    void flyer();
}

class Bird1 implements Swimmer,Flyer{
    public void swim(){
        System.out.println("Bird swimming");
    }
    public void flyer(){
        System.out.println("Bird flying");
    }
}

public class interface3 {
    public static void main(String[] args) {
        Bird1 obj=new Bird1();
        obj.flyer();
        obj.swim();
    }
}
