class parent{
    void mobile(){
        System.out.println("Nokia");
    }
}
class child extends parent{
    void mobile(){
        System.out.println("one plus");
    }
}

public class overriding {
    public static void main(String[] args) {
        child obj=new child();
        obj.mobile();
    }
}
