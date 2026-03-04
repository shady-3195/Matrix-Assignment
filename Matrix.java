import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size n: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        
        System.out.println("Enter matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        
        System.out.println("Row sums:");
        for(int i = 0; i < n; i++) {
            int s = 0;
            for(int j = 0; j < n; j++) s += a[i][j];
            System.out.println(s);
        }

        System.out.println("Column sums:");
        for(int j = 0; j < n; j++) {
            int s = 0;
            for(int i = 0; i < n; i++) s += a[i][j];
            System.out.println(s);
        }

        int fd = 0;
        for(int i = 0; i < n; i++) fd += a[i][i];
        System.out.println("Forward diagonal: " + fd);

        int rd = 0;
        for(int i = 0; i < n; i++) rd += a[i][n-1-i];
        System.out.println("Reverse diagonal: " + rd);
        
        sc.close();
    }
}
