import java.util.Scanner;

public class Main {
    //Build a scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt and store double amount
        System.out.println("Enter the amount of data: ");
        double amount = scanner.nextDouble();
        //Prompt and store String unit
        System.out.println("Enter the unit (Bytes, kilobytes, megabytes, gigabytes) ");
        String unit = scanner.nextLine();
        //Prompt and store download speed (in megabits
        System.out.println("Enter your download speed(In megabytes): ");
        int speed = scanner.nextInt();

        //Build a Data object with these three values
        Data data = new Data(amount, unit, speed);
        data.setAmount(amount);
        data.setUnit(unit);
        data.setSpeed(speed);
        //Print out the data Object with your toString();
        System.out.println(data);
    }

    }

