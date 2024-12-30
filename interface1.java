interface Animal1{
    public void eat();
    public void travel();
}
class Mammal implements Animal1{
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal travel");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Mammal obj=new Mammal();
        obj.eat();
        obj.travel();
    }
}
