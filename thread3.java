class t1 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("SSJVP");
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
class t2 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("Mandaara PU college");
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
class t3 extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("BIHE");
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


public class thread3 {
    public static void main(String[] args) {
        t3 obj1=new t3();
        t2 obj2=new t2();
        t1 oj=new t1();
        oj.start();
        obj2.start();
        obj1.start();
    }
}






