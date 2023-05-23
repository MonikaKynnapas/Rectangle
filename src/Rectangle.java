import java.util.Scanner;
import java.util.Random;

public class Rectangle {
    private final double sideA;
    private final double sideB;
    private final double perimeter;
    private final double area;
    public final double diagonal;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
        this.diagonal = calculateDiagonal();
    }

    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculateDiagonal() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public void displayInfo() {
        System.out.printf("Kui külg A on: %.2f, külg B on: %.2f, siis ümbermõõt on: %.2f, pindala on: %.2f, " +
                "ja diagonaal on: %.2f", sideA, sideB, perimeter, area, diagonal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double sideA = rand.nextInt(10) + 1;
        System.out.print("Sisesta külg B: ");
        double sideB = sc.nextDouble();
        Rectangle rectangle = new Rectangle(sideA, sideB);
        rectangle.displayInfo();
    }
}

