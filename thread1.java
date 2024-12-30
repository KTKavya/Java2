class hi{
    public void show(){
        for(int i=0;i<=4;i++){
            System.out.println("inside hi");
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
class hlo{
    public void show(){
        for(int i=0;i<=4;i++){
            System.out.println("inside hlo");
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

public class thread1 {
    public static void main(String[] args) {
        hi obj1=new hi();
        hlo obj2=new hlo();
        obj1.show();
        obj2.show();
    }
}
