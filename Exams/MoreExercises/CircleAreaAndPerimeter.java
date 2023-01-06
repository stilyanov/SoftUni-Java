package MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        //Лице = π * r * r
        //Периметър = 2 * π * r
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);
    }
}
