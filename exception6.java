abstract class f{
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}
public class exception6 {
    public static void main(String[] args) {
        f obj = new f() {
            public void add(int a, int b){
                System.out.println(a+b);
            }
            public void sub(int a,int b){
                System.out.println(a-b);
            }
            public void mul(int a,int b){
                System.out.println(a*b);
            }
            public void div(int a,int b){
                System.out.println(a/b);
            }
        };
        obj.add(2,3);
        obj.sub(3,2);
        obj.mul(2,2);
        obj.div(4,2);

    }
}