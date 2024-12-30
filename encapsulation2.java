import java.security.PrivateKey;

class Student{
    private String name="kkk";
    private String branch="CS ";
    private int rollno = 55;
    private String address="DVG";
    private int age=24;
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public int getRollno(){
        return rollno;
    }
    public String setAddress(String address1){
        address=address1;
        return address;
    }
    public int setAge(int age1){
        age=age1;
        return age;

    }
}


public class encapsulation2 {
    public static void main(String[] args) {
        Student oj=new Student();
        System.out.println( oj.getName());
        System.out.println( oj.getBranch());
        System.out.println(oj.getRollno());
        System.out.println(oj.setAddress("BNG"));
        System.out.println(oj.setAge(22));

    }
}
