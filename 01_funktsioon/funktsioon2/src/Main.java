public class Main {
/* See programm arvutab arvude keskmine  */
    public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, 45.6, -20.34, 33.0 };
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }

        double keskmine = sum / numArray.length;
        System.out.format("Nende arvude keskmine on: %.2f", keskmine);
    }
}
