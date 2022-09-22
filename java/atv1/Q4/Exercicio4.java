package Q4;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int quantidadeDeShapes = sc.nextInt();
        ArrayList<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < quantidadeDeShapes; i++) {
            System.out.printf("Shape %d data: \n", i + 1);
            System.out.println("Rectangle or circle? Digite (c/r)");
            sc.nextLine();
            String tipoDoShape = sc.nextLine();
            Color color = Color.valueOf(sc.nextLine());

            if (tipoDoShape.equals("r")) {
                System.out.println("Choose width and height:");
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                Rectangle rect = new Rectangle(color, width, height);
                shapes.add(rect);
            } 
            else if (tipoDoShape.equals("c")) {
                System.out.println("Choose radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                shapes.add(circle);
            } 
            else {
                break;
            }
        }
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
        sc.close();
    }
}