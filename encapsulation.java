class person1{
    private String name ="kavya ";
    private int age=23;
    public String setName(String name1){
        name=name1;
        return name1;
    }
    public  int setAge(int age1){
        age=age1;
        return age1;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        person1 oj=new person1();
       System.out.println( oj.setName("kk ")+oj.setAge(22));

    }
}
