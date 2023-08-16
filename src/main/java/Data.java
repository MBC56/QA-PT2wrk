public class Data {
    double amount;
    String unit;
    int downloadSpeed;

    public Data(double amount, String unit, int downloadSpeed) {
        this.amount = amount;
        this.unit = unit;
        this.downloadSpeed = downloadSpeed;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public int getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public void setDownloadSpeed(int downloadSpeed){
        this.downloadSpeed = downloadSpeed;
    }

    public double convertToMegabytes(){
        switch(this.unit) {
            case "bytes":
                return this.amount / 1048576;
            case "kilobytes":
                return this.amount / 1024;
            case "megabytes":
                return amount;
            case "gigabytes":
                return this.amount * 1024;
            default:
                throw new IllegalArgumentException();
        }
    }

    public double calculateDownloadTime(){
        return (convertToMegabytes() * 8) / this.downloadSpeed;
    }

    public String getFormattedDownloadTime(){
        int minutes = (int)calculateDownloadTime() / 60;
        int seconds = (int)calculateDownloadTime() % 60;
        return minutes + " minutes " + seconds + " seconds";
    }

    @Override
    public String toString(){
        return "Data: " + this.amount + " " + this.unit + "\nDownload Time: " + getFormattedDownloadTime();
    }
}