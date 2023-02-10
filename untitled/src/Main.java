public class Main {
    //fori ja
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int playerXCoordinaate = 3; //täisarvuline number
        int playerYCoordinaate = 3;
        int dragonXCoordinaate = 6;
        int dragonYCoordinaate = 2;
        int orcXCoordinaate = 5;
        int orcYCoordinaate = 1;



        //algväärtus kuni iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else  {
                    if (playerXCoordinaate == x && playerYCoordinaate == y) {
                        System.out.printf("X");
                    } else if (dragonXCoordinaate == x && orcYCoordinaate) {

                    } else if () {

                    } else  {
                        System.out.print(" ");
                    }
                }
            }
        }
    }