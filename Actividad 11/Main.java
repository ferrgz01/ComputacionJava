import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int opc;
        boolean fin=true;

        Scanner scanner =new Scanner(System.in);

        while (fin!=false){
            System.out.println("Seleccione una figura: ");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo equilátero");
            System.out.println("3. Cuadrado");
            System.out.println("4. Fin");
            opc=scanner.nextInt();

            switch (opc){

                case 1:
                    System.out.println("Radio: ");
                    Circle circle = new Circle(scanner.nextDouble());
                    System.out.println("Área del cículo: "+circle.getArea());
                    System.out.println("Perímetro del círculo: "+circle.getPerimeter()+"\n");

                    break;

                case 2:
                    System.out.println("Lado: ");
                    Triangle triangle = new Triangle (scanner.nextDouble());
                    System.out.println("Área del triángulo: "+triangle.getArea());
                    System.out.println("Perímetro del triángulo: "+triangle.getPerimeter()+"\n");

                    break;

                case 3:
                    System.out.println("Lado: ");
                    Square square = new Square(scanner.nextDouble());
                    System.out.println("Área del cuadrado: "+square.getArea());
                    System.out.println("Perímetro del cuadrado: "+square.getPerimeter() +"\n");

                    break;

                case 4:
                    fin=false;

                    break;

                default:
                    System.out.println("Seleccione un número del menú \n");

            }




        }
    }
}
