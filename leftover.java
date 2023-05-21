import java.util.Scanner;

class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int pizzaSlices = input.nextInt();
        int people = input.nextInt();
        int leftovers = pizzaSlices%people;

        System.out.print(leftovers);
		
	}
}