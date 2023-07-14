import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, k;
        System.out.print("Üssü alınacak sayı: ");
        n = scan.nextInt();

        System.out.print("Üs olacak sayı:");
        k = scan.nextInt();

        //3^4 = 3 * 3 * 3 * 3

        int total = 1;
        int i = 1;

        while (i <= k) {
            total *= n;  //üsse alınacak sayıyı n kere çarpmış oluyoruz
            i++;
        }
        System.out.println("Sonuç: " + total);


        //FOR İLE ÜSLÜ SAYI YAZIMI

        Scanner scanner = new Scanner(System.in);

        int a, b;
        System.out.print("Üssü alınacak sayı: ");
        a = scanner.nextInt();

        System.out.print("Üs olacak sayı: ");
        b = scanner.nextInt();

        int total1 = 1;

        for (int i1 = 1; i1 <= b; i1++) {
            total1 *= a;
        }
        System.out.println("Sonuç: " + total1);
        
    }
}
