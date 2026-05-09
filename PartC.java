import java.util.Scanner;

public class PartC {

    public static String toBinaryString(int num) {
        int n = num;
        int[] temp = new int[32];
        int index = 0;

        while (n > 0) {
            temp[index] = n % 2;
            n = n / 2;
            index++;
        }

        String result = "";
        for (int i = index - 1; i >= 0; i--) {
            result = result + temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String binary = toBinaryString(num);

        System.out.println(num + " in binary = " + binary);
    }
}
