interface x{
    public void person(String name, int age);
}

public class lambda2 {
    public static void main(String[] args) {
        x obj=(String name,int age) -> System.out.println(name+" " +age);
        obj.person("kkk",22);
    }
}
