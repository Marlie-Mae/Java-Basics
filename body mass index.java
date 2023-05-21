import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float weight = input.nextFloat();
        float height = input.nextFloat();
        float BMI = 703 * (weight / (height*height));

        System.out.format("%.1f" ,BMI);
    }
}