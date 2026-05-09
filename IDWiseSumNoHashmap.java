import java.io.File;
import java.util.Scanner;

public class IDWiseSumNoHashmap {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Shaaz\\Desktop\\JAVA\\SalesEveSession.txt");
        Scanner inp;
        String dl;

        String[] repIDs = {"E011", "E012", "E013", "E014"};
        double[] totals = {0, 0, 0, 0};

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine();
            System.out.println(dl);

            String[] parts;
            String repID;
            double qty, uPrice, amt;

            while (dl.length() > 0) {
                dl = inp.nextLine();
                System.out.println(dl);
                parts  = dl.split("\t");
                uPrice = Double.parseDouble(parts[2]);
                qty    = Double.parseDouble(parts[3]);
                repID  = parts[5];
                amt    = qty * uPrice;

                for (int i = 0; i < repIDs.length; i++) {
                    if (repIDs[i].equals(repID)) {
                        totals[i] += amt;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("--- End of file / error ---");
        } finally {
            System.out.println("\n=== Rep ID-wise Sales Total ===");
            for (int i = 0; i < repIDs.length; i++) {
                System.out.println(repIDs[i] + " --- " + totals[i]);
            }
        }
    }
}
