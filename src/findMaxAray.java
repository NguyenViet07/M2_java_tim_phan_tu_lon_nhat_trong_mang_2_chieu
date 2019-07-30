import java.util.Scanner;
public class findMaxAray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.print("nhap so hang: ");
        m = input.nextInt();
        System.out.print("nhap so cot: ");
        n = input.nextInt();
        int a[][] = new int[m][n];
        System.out.print("nhap cac phan tu cua ma tran: ");
        for (int i=0;i<m;i++){
            for (int j=0; j<n;j++){
                System.out.print("A["+i+"]"+"["+j+"] ");
                a[i][j]= input.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0; j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int max = a[0][0];

        for (int i = 0; i<m;i++){
            for (int j=0; j<n;j++){
                if (max<a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        System.out.print("phần tử lớn nhất : " +max);
    }
}
