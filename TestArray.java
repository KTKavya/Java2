public class TestArray {
    public static void main(String[] args) {
        double[] myList={1.9,2.9,3.9,4.9};
        for(int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
        double sum=0;
        for(int i=0;i< myList.length;i++) {
         sum=sum+myList[i];
        }
        System.out.println("avg is :"+(sum/myList.length));
        System.out.println("sum is :"+sum);

    }
}
