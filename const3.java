class E1{
    E1(String name,String role,int salary,String gender){
        System.out.println(name+role+salary+gender);
    }
    E1(String name,int age,String location,int experience){
        System.out.println(name+age+location+experience);
    }
    void H1(String name,int ID,String comapnyname){
        System.out.println(name+ID+comapnyname);
    }
    void D1(int deptid,String deptname,String location){
        System.out.println(deptid+deptname+location);
    }
}



public class const3 {
    public static void main(String[] args) {
        E1 obj=new E1("kavya "," developer ",120000," Female");
        E1 obj1=new E1("Kiran ",28," DVG ",2);
        obj.H1("Raki ",23," wipro");
        obj1.D1(3," MBA ","BNG");

    }
}
