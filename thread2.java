class a8 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("Hi");
            try
            {
                Thread.sleep(1500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class a9 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("Hello");
            try
            {
                Thread.sleep(1500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class thread2 {
    public static void main(String[] args) {
        a8 obj1=new a8();
        a9 obj2=new a9();
        obj1.start();
        obj2.start();
    }
}

