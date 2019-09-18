import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lommeregner calc = new Lommeregner();
        Scanner input = new Scanner(System.in);
        System.out.println("---Calculator---");
        System.out.println("Type in 2 separate number numbers to run the addition method on:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("The sum of "+x+" and "+y+" = "+calc.sum(x,y));
        System.out.println("Now lets try the division method. Type in 2 separate number numbers to run the division method on (Pls dont type 0):");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+" divided by "+b+" = "+calc.div(a,b));
        System.out.println("Lastly lets try the power method, first type the base number, second the exponent:");
        int i = input.nextInt();
        int j = input.nextInt();
        System.out.println(i+" to the power of "+j+" = "+calc.weird(i,j));
    }
}
