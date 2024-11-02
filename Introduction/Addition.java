import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int x,y;
        x=scanner.nextInt();
        y=scanner.nextInt();

        int z = x+y;
        System.out.println("sum of x and y is "+ z);
    }
}
