interface abc2{
    public void add(int a,int b);
}
interface abc3 extends abc2{
    public void sub(int a,int b);
}
class abc4 implements abc3{
        public void add(int a,int b){
            System.out.println("add :"+(a+b));
        }
        public void sub(int a,int b){
        System.out.println("sub :"+(a-b));
    }
}
public class singleinterface {
    public static void main(String[] args) {
        abc4 obj=new abc4();
        obj.add(3,2);
        obj.sub(4,2);
    }
}
