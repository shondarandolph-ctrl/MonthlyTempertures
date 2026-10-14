import java.util.Scanner;

public class MonthlyTempertures{
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June",
        "July","August","September","October","November","December"};
        double[] temperatures = {40,43,52,62,70,78,82,80,74,63,52,43};
        Scanner input = new Scanner(System.in);
        System.out.println("MonthlyTemperatures");
        System.out.println("--------------------");
        System.out.print("Enter a month (1-12):");
        int monthNumber = input.nextInt();
        if(monthNumber >= 1 && monthNumber <=12){
            int index = monthNumber - 1;
            System.out.println("Month: " + months[index]);
            System.out.println("Temperature:" + temperatures[index]);
        }
        else{
            System.out.println("Invalid month. Enter a number from 1 to 12.");
        }
        input.close();
    }
}