import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AdressBook {
    final static String direccion = "src/Archivos/contactos.csv";
    HashMap<String, String> contactos = new HashMap<>();

    public void load() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(direccion));

            String line = null;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");
                String numero = parts[0].trim();
                String nombre = parts[1].trim();

                if (!numero.equals("") && !nombre.equals(""))
                    contactos.put(numero, nombre);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("IOException catched while closing: " + e.getMessage());
                }
            }
        }
    }

    public void save(){
        BufferedWriter bw = null;

        try{
            bw = new BufferedWriter(new FileWriter(direccion));

            for (Map.Entry<String, String> entry : contactos.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String output = String.format(key +"," +value);
                bw.write(output+"\n");
            }
        } catch (IOException e){
            System.out.println("IOException catched while reading: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("IOException catched while closing: " + e.getMessage());
            }
        }
    }

    public void list(){
        for (Map.Entry<String, String> entry : contactos.entrySet()) {
            System.out.println("{" +entry.getKey() + "} : {" + entry.getValue() +"}");
        }
    }

    public void create(String numero, String nombre){
        contactos.put(numero,nombre);
    }

    public void delete(String numero) {


        contactos.remove(numero);
        System.out.println("Se ha borrado el contacto\n");
    }
}