class dem{
    public void add(int a,int b)
    {
        System.out.println("add="+(a+b));
    }
    public int sub(int a,int b){
        return a-b;
    }
    public void mul(int a,int b){
        System.out.println("mul="+(a*b));
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}

public class method2 {
    public static void main(String[] args) {
        dem obj1=new dem();
        obj1.add(4,3);
        obj1.mul(2,2);
        int result=obj1.sub(2,5);
        int resultt=obj1.div(3,2);
        System.out.println("sub="+result);
        System.out.println("div="+resultt);
    }
}
