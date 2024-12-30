class s3 implements Runnable{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("Mandaara");
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class s4 implements Runnable {
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("Bapuji");
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public interface multiiThreadinginterface {
    public static void main(String[] args) {
        s3 oj=new s3();
        s4 oj1=new s4();

        Thread t1=new Thread(oj);
        Thread t2=new Thread(oj1);
        t1.start();
        t2.start();
    }
}
