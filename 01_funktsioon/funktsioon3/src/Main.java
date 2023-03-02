import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        /* See programm arvutab kolme õppeaine keskmise hinde
         */
        int marks[] = new int[3];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<3; i++) {
            System.out.print("sisesta õppeaine punktid"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //arvutame keskmise
        avg = total/3;
        System.out.print("Sinu kolme õppeaine keskmine hinne on: ");
        if(avg>=89)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<89)
        {
            System.out.print("B");
        }
        else if(avg>=69 && avg<80)
        {
            System.out.print("C");
        }
        else if(avg>=60 && avg<50)
        {
            System.out.print("E");
        }
        else
        {
            System.out.print("f");
        }
    }
}