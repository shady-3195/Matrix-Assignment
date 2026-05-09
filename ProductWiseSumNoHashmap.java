import java.io.File;
import java.util.Scanner;

public class ProductWiseSumNoHashmap {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Shaaz\\Desktop\\JAVA\\SalesEveSession.txt");
        Scanner inp;
        String dl;

        // Known products (no HashMap)
        String[] products   = {"Product A", "Product B", "Product C", "Product D"};
        double[] totals     = {0, 0, 0, 0};

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine(); // skip header
            System.out.println(dl);

            String[] parts;
            String prodName;
            double qty, uPrice, amt;

            while (dl.length() > 0) {
                dl = inp.nextLine();
                System.out.println(dl);
                parts    = dl.split("\t");
                prodName = parts[1];
                uPrice   = Double.parseDouble(parts[2]);
                qty      = Double.parseDouble(parts[3]);
                amt      = qty * uPrice;

                for (int i = 0; i < products.length; i++) {
                    if (products[i].equals(prodName)) {
                        totals[i] += amt;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("--- End of file / error ---");
        } finally {
            System.out.println("\n=== Product-wise Sales Total ===");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + " : " + totals[i]);
            }
        }
    }
}
