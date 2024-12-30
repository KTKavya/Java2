interface l{
    int add(int a,int b);
}
public class lambda1 {
    public static void main(String[] args) {
        l obj=(a,b)-> (a+b);
        int r=obj.add(2,2);
        System.out.println(r);

           }
}

