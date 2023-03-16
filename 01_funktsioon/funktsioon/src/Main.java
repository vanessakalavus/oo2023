//funktsioon 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("sisesta arv: ");
        int num = reader.nextInt();

        paarisPaaritu(num);
    }


    private static void paarisPaaritu(int num) {
        String evenOdd = (num % 2 == 0) ? "paaris" : "paaritu";
        System.out.println("sisestatud arv " + num + " on " + evenOdd);
    }
}

