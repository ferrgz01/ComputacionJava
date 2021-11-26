import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


 interface AnonClass {
    public void anonMethod();
}

interface Ordenar {
     List <String> ordenamiento (List nombres);
}

 class Acomodo {
    static List <String> ord(List nombres){
        Collections.sort(nombres);
        return nombres;
    }

}


public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("María");
        nombres.add("Angeles");
        nombres.add("Brandon");
        nombres.add("Casimiro");
        nombres.add("Jimena");
        nombres.add("Ernesto");
        nombres.add("Daniel");
        nombres.add("Jorge");
        nombres.add("Camila");
        nombres.add("Alex");


        //Clase anónima
        AnonClass anon = new AnonClass() {
            public void anonMethod() {
                Collections.sort(nombres);

            }

        };
        anon.anonMethod();

        System.out.println("\nOrden alfabético con clase anónima: ");
        for (String elemento : nombres) {
            System.out.println(elemento);
        }

        //Expresión lambda
        Ordenar alf = (nombres1) -> {
            Collections.sort(nombres1);
            return nombres1;
        };

        alf.ordenamiento(nombres);
        System.out.println("\nOrden alfabético con lambda: ");
        for (String elemento1 : nombres) {
            System.out.println(elemento1);

        }

        //Método de referencia
        Ordenar clasificar = Acomodo::ord;

        clasificar.ordenamiento(nombres);
        System.out.println("\nOrden alfabético con método de referencia: ");
        for (String elemento2 : nombres) {
            System.out.println(elemento2);

        }

    }
}



