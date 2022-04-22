import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int companyAmount = scan.nextInt();
        int[][] information = new int[2][companyAmount];
        for (int i = 0; i < information.length; i++) {
            for (int j = 0; j < information[i].length; j++) {
                information[i][j] = scan.nextInt();
            }
        }
        int maxTax = information[0][0] * information[1][0];
        int company = 0;
        for (int j = 1; j < information[0].length; j++) {
            if (information[0][j] * information[1][j] > maxTax) {
                maxTax = information[0][j] * information[1][j];
                company = j;
            }
        }
        System.out.print(company + 1);
    }
}

