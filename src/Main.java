import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double perimeterOne = 0;
        double perimeterTwo;
        double totalPerimeter;
        double areaRectangle;
        double opposite = 0;
        double adjacent;
        double hypotenuse;
        String trash = "";
        System.out.println("Enter the first perimeter of rectangle: ");

        if (in.hasNextDouble()) {
            perimeterOne = in.nextDouble();
            System.out.println("This is the first perimeter: " + perimeterOne);
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Not a correct value. Try again.");
        }

        System.out.println("Enter the second perimeter of rectangle: ");

        if (in.hasNextDouble()) {
            perimeterTwo = in.nextDouble();
            totalPerimeter = (perimeterOne * 2 + perimeterTwo * 2);
            areaRectangle = perimeterOne * perimeterTwo;
            System.out.println("The total perimeter of rectangle is: " + totalPerimeter);
            System.out.println("The area of rectangle is " + areaRectangle);
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Not a correct value. Try again.");
        }

        System.out.println("Enter the opposite side of rectangle: ");
        if (in.hasNextDouble()) {
            opposite = in.nextDouble();
            System.out.println("The opposite side of rectange is: " + opposite);
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Not a correct value. Try again.");
        }
        System.out.println("Enter the adjacent side of rectangle: ");

        if (in.hasNextDouble()) {
            adjacent = in.nextDouble();
            hypotenuse = Math.sqrt((opposite * opposite) + (adjacent * adjacent));
            System.out.println("The diagonial of the rectangle is: " + hypotenuse);
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Not a correct value. Try again.");

        }
    }
}