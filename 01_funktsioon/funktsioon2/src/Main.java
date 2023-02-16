public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        prindiFortsykkel(5);

    }

    class forLoopDemo {
        public static void main(String args[])
        {
            // Writing a for loop
            // to print Hello World 5 times
            for (int i = 1; i <= 5; i++)
                System.out.println("Hello World");
        }
    }



    private static void prindiFortsykkel(int kordadeArv) {
        for (int i = 0; i < kordadeArv; i++){
            System.out.println(i);
    
        }
    }
}
