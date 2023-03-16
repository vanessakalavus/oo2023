import java.awt.event.ItemEvent;
import java.util.*;

public class Main {

    // fori
    // sout
    public static void main(String[] args) {
        Random rand = new Random();
        Math.random();

        System.out.println("Hello world!");
//        String sonaline = "Sõnaline muutuja";
//        char taheline = 's'; // üks täht
//        double komakohaga = 4213.2312312;
//        float komakohaga2 = 313.123213F;
//        boolean kahendV22rtus = true; // 0 ja 1       2    "y"   "n"
//        byte pisikeNumber = 100;
//        short lyhikeNumber = 312;
//        long pikkNumber = 31312321312L;

        Scanner scanner = new Scanner(System.in);
// scannerit luuaksealati nii , tehakse uus muutuja tüüp scanner nimega scanner


        World world = new World(10, 5);

        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width,world.height);
        Orc  orc = new Orc(world.width,world.height);

        item sword = new item(10,1,"Mõõk", world.width, world.height);
        item hammer = new item(5,3,"Haamer", world.width, world.height);
        item stick= new item(1,10,"Puupulk", world.width, world.height);

        //Import! java.util.list
        List<item> items = new ArrayList<>(Arrays.asList(sword, hammer, stick));

        //item[] items1 = {sword, hammer, stick};


            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol, items);
        String input = scanner.nextLine();
//        for (; !input.equals("end"); )
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol, items);
            System.out.println();
            for ( item i :items ) {
                if (i.xCoordinate == player.xCoordinaate && i.yCoordinate == player.yCoordinaate){
                    player.item = i;
                    System.out.println("Korjasid eseme:" + player.item.name);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }


}