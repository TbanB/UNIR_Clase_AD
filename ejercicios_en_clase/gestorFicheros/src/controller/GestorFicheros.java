package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicheros {

    public void lecturaTextoPlano(String path) {
        File file = new File(path);
        FileReader fileReader = null;

        if (file.exists() && file.isFile()) {
            try {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException e) {
                System.out.println("Fallo de lectura");
                System.out.println(e.getMessage());
            } finally {
                try {
                    assert fileReader != null;
                    fileReader.close();
                } catch (IOException | NullPointerException exception) {
                    System.out.println("Error en el cerrado del flujo");
                    System.out.println(exception);
                }
            }
        }
    }
}
