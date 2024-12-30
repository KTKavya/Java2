public class exception1 {
    public static void main(String[] args) {
        int[] arr1=new int[4];
        int a=10;
        int b=2;
        try{
            System.out.println(a/b);
            for(int i=0;i<=4;i++)
            {
                System.out.println(arr1[i+1]);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("divided by zero is not acceptable");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
         finally{
            System.out.println("HI");
        }
    }
}
