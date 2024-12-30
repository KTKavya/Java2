public class company {
    public static void main(String[] args) {
        company oj=new company();
        oj.Empdetails("Santhosh",22,500000,"developer");
        System.out.println();
        oj.depdetails("Sales",44,280,"9999999999");
    }
    public void Empdetails(String Ename,int EID,int ESalary,String ERole ){
        System.out.println("Ename:"+Ename);
        System.out.println("EID:"+EID);
        System.out.println("ESalary:"+ESalary);
        System.out.println("ERole:"+ERole);
    }
    public void depdetails(String dName,int dID,int nEmp,String phoneno){
        System.out.println("dName:"+dName);
        System.out.println("dID:"+dID);
        System.out.println("nEmp:"+nEmp);
        System.out.println("phoneno"+phoneno);
    }
}
