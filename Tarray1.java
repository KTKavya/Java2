public class Tarray1 {
    public static void main(String[] args) {
        int a[]={9,3,5,11,10,2};
       /* int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);......(maximum)*/
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
