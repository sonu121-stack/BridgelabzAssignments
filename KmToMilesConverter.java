import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        double km = sc.nextDouble();
         
        double miles = km * 0.621371;
        System.out.println(km + " km = " + miles + " miles");
    }
}
