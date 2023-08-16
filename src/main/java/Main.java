import java.util.*;
public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(1024, "bytes", 100);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount data");
        data1.setAmount(Double.valueOf(input.nextLine()));

        System.out.println("Enter the unit");
        data1.setUnit(input.nextLine());

        System.out.println("Enter the download speed (in megabits)");
        data1.setDownloadSpeed(Integer.valueOf(input.nextLine()));
    }
}
