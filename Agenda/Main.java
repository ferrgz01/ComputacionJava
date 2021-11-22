import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opc;
        Scanner scanner = new Scanner(System.in);

        AdressBook agenda = new AdressBook();
        agenda.load();

        do{
            opc=menu();
            String a=null, b=null;

            switch (opc){
                case 1:
                    System.out.println("Cargando contactos...");
                    agenda.list();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Datos de contcto.");
                    System.out.print("Número: ");
                    a = scanner.nextLine();
                    System.out.print("Nombre: ");
                    b = scanner.nextLine();
                    agenda.create(a,b);
                    System.out.println("Se ha guardado el contacto \n");
                    break;

                case 3:
                    System.out.println("Número del contacto: ");
                    a = scanner.nextLine();

                        agenda.delete(a);

                    break;

                case 4:
                    System.out.println("Guardando agenda y saliendo...");
                    break;

                default:
                    System.out.println("Entrada no válida. Intente de nuevo.\n");
                    break;
            }
        } while (opc!=4);

        agenda.save();
    }

    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        System.out.println("Selecciona una opción:");
        System.out.println("1. Mostrar contactos de la agenda.");
        System.out.println("2. Crear nuevo contacto.");
        System.out.println("3. Eliminar un contacto.");
        System.out.println("4. Salir.");
        eleccion=scanner.nextInt();

        return eleccion;
    }
}
