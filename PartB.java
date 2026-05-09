import java.util.Scanner;

public class PartB {

    public static int[] toBinaryArray(int num) {
        int n = num;
        int[] temp = new int[32];
        int index = 0;

        while (n > 0) {
            temp[index] = n % 2;
            n = n / 2;
            index++;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[index - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] binaryDigits = toBinaryArray(num);

        System.out.print(num + " in binary = ");
        for (int digit : binaryDigits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
