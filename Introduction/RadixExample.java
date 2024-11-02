import java.util.Scanner;

public class RadixExample {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        scanner.useRadix(2);

        int x=scanner.nextInt();


        System.out.println(x);
    }
}
