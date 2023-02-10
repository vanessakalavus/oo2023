public class Main {

    // fori
    // sout
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        String sonaline = "Sõnaline muutuja";
//        char taheline = 's'; // üks täht
//        double komakohaga = 4213.2312312;
//        float komakohaga2 = 313.123213F;
//        boolean kahendV22rtus = true; // 0 ja 1       2    "y"   "n"
//        byte pisikeNumber = 100;
//        short lyhikeNumber = 312;
//        long pikkNumber = 31312321312L;


        int playerXCoordinaate = (int) (Math.random()*8+1); // täisarvuline number
        int playerYCoordinaate =  (int) (Math.random()*3+1);
        char playerSymbol = "X";
        int dragonXCoordinaate = (int) (Math.random()*8+1);
        int dragonYCoordinaate = (int) (Math.random()*3+1);
        char dragonSymbol = 'D';
        int orcXCoordinaate = (int) (Math.random()*8+1);
        int orcYCoordinaate = (int) (Math.random()*3+1);
        char orcSymbol = 'O';


        // algväärtus   kuni   iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if (playerXCoordinaate == x && playerYCoordinaate == y) {
                        System.out.print(playerSymbol);
                    } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
                        System.out.print(dragonSymbol);
                    } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
                        System.out.print(orcSymbol);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}