import java.util.Scanner;
public class multidimension2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of rows and cols");
            int row=sc.nextInt();
            int col=sc.nextInt();
            int m1[][]=new int[row][col];
            int m2[][]=new int[row][col];
            int sum[][]=new int[row][col];

            System.out.println("Enter the elements of matrix1");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    m1[i][j]=sc.nextInt();
                }
            }
        System.out.println("Enter the elements of matrix2");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("the final sum of matrix is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


        }
    }

