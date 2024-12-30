
public class details {
    public static void main(String[] args) {
        details ob=new details();
        ob.s1("kavya",24,"MCA");
        ob.s2("kiran",28,"BE",55);
        ob.T1("Ashwin",25);

    }
    public void s1(String name,int age,String branch)
    {
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("branch :"+branch);

    }
    public void s2(String name,int age,String branch,int rollno)
    {
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("branch :"+branch);
        System.out.println("rollno :"+rollno);
    }
    public void T1(String name,int age){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
