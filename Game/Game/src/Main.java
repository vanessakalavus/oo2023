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


        int worldWidth = 10;
        int worldHeight = 5;

        int playerXCoordinaate = (int) getRandomCoordinate(worldWidth); // täisarvuline number
        int playerYCoordinaate =  (int) getRandomCoordinate(worldHeight);
        char playerSymbol = 'X';
        int dragonXCoordinaate = (int) getRandomCoordinate(worldWidth);
        int dragonYCoordinaate = (int) getRandomCoordinate(worldHeight);
        char dragonSymbol = 'D';
        int orcXCoordinaate = (int) getRandomCoordinate(worldWidth);
        int orcYCoordinaate = (int) getRandomCoordinate(worldHeight);
        char orcSymbol = 'O';


        // algväärtus   kuni   iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth-1) {
                    System.out.print("|");
                } else {
                    printCharacters(playerXCoordinaate, playerYCoordinaate, playerSymbol, dragonXCoordinaate, dragonYCoordinaate, dragonSymbol, orcXCoordinaate, orcYCoordinaate, orcSymbol, y, x);
                }
            }
        }
    }

    private static double getRandomCoordinate(int WorldDimension) {
        return (Math.random() * (WorldDimension- 2) + 1);
    }

    private static void printCharacters(int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                                        int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                                        int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, int y, int x) {
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