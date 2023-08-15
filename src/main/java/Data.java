import java.text.DecimalFormat;

public class Data {
    //    Instance variables amount, unit, and downloadSpeed
    private static double amount;
    private static String unit;
    private static int speed;
    static double megabyteAmount;
    static double downloadTime;
    static double downloadTimeSeconds;
    static double downloadTimeMinutes;



    //    Constructor
    public Data(double amount, String unit, int speed) {
        setAmount(amount);
        setSpeed(speed);
        setUnit(unit);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        Data.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        Data.unit = unit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        Data.speed = speed;
    }
//    Class methods
    public static short convertToMegabytes() {

        switch (unit) {
            case "bytes" -> megabyteAmount = (amount / 1024) / 1024;
            case "kilobytes" -> megabyteAmount = amount * 1024;
            case "gigabytes" -> megabyteAmount = amount / 1024;
            case "megabytes" -> megabyteAmount = amount;
            default -> throw new IllegalArgumentException();
        }
        //
        return 0;
    }
    public static short calculateDownloadTime()  {
        convertToMegabytes();
        downloadTime = (megabyteAmount / speed) / 8;
        return 0;
    }
    public static short getFormattedDownloadTime(){
        downloadTimeSeconds = downloadTime % 60;
        downloadTimeMinutes = (downloadTime - downloadTimeSeconds) / 60;

        DecimalFormat format = new DecimalFormat("#");


        return 0;
    }


//    toString using Class methods
    public String toString(){
        convertToMegabytes();
        calculateDownloadTime();
        getFormattedDownloadTime();
            return "Data" + amount + "" + unit +
                    "Your download time is: " + downloadTime;
    }
}
