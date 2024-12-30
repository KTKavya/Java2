class G{
    public void add(){
        System.out.println("addition");
    }
}

public class anonumous {
    public static void main(String[] args) {
        G obj=new G(){
            public void add(){
                System.out.println("substraction");
            }
        };
        obj.add();
    }
}
