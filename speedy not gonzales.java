import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double distance = input.nextDouble();
        double hours = input.nextDouble();
        double minutes = input.nextDouble();
        double seconds = input.nextDouble();
        double ms = distance / (hours * 3600 + minutes * 60 + seconds);
        double kpH = ms * 3.6;
        double mpH = ms * 2.237;

        System.out.format(" %.2f" ,ms);
        System.out.format(" %.2f" ,kpH);
        System.out.format(" %.2f" ,mpH);
    }
}