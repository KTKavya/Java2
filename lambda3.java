interface v{
    public void mul(int a,int b,int c);
}
public class lambda3 {
    public static void main(String[] args) {
        v obj=(int a,int b,int c)-> System.out.println(a*b*c);
        obj.mul(2,3,4);
    }
}
