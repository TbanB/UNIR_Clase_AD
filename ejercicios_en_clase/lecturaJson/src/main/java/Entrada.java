import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        File file = new File("src/main/java/resources/usuario.txt");

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer lecturaCompleta = new StringBuffer();
            String linea = null;

            while ((linea = bufferedReader.readLine()) != null) {
                lecturaCompleta.append(linea);
            }
            JSONObject usuario = new JSONObject(lecturaCompleta.toString());
            Object nombre = usuario.get("nombre");
            JSONArray clases = usuario.getJSONArray("clases");
            System.out.println(usuario);
            System.out.println(nombre);
            System.out.println(clases);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
