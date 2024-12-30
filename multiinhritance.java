class c{
        public void Hi()
        {
            System.out.println("Hi");
        }
    }
    class d extends c{
        public void hello(){
            System.out.println("Hello");
        }
    }
    class e extends d{
        public void how()
        {
            System.out.println("how");
        }
}


public class multiinhritance {
    public static void main(String[] args) {
        d obj=new d();
        obj.Hi();
        obj.hello();
    }
}
