public class Main {
    public static void main(String[] args) {

        Info info = new Info("Mac","16gb","Mac");
        Arvuti arvuti1 = new Arvuti(info, "1000");
        arvuti1.suurendaMkasumus();

        Arvuti arvuti2 = new Arvuti(new Info("Windows","8gb","Windows"))
        arvuti2.panedollaritesse();
    }

}