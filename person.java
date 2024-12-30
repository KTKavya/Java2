class dem1{
    dem1(String name,int age){
        System.out.println(name+age);
    }
    public void p1(String name,int age,String branch){
        System.out.println(name+age+branch);
    }
}

public class person {
    public static void main(String[] args) {
        dem1 oj=new dem1(" kavya ",23);
        oj.p1(" sandee ",22," EEE");



    }
}
