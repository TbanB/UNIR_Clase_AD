import java.io.File;

public class EntradaRecursiva {
    public static void main(String[] args) {
        File directorio = new File("src/resources/directorio/");
        getFilesList(directorio, directorio.getName());
    }

    private static void getFilesList(File directorio, String currentLocation) {
        if (directorio.exists() && directorio.isDirectory()) {
            File[] ficheros = directorio.listFiles();
            if (ficheros != null) {
                for (File fichero : ficheros) {
                    String ficheroName = currentLocation + "/" + fichero.getName();
                    if (fichero.isDirectory()) {
                        getFilesList(fichero, ficheroName);
                    } else {
                        createMessage(ficheroName);
                    }
                }
            } else {
                createMessage("** El directorio no tiene ficheros");
            }
        } else {
            createMessage("El directorio no existe");
        }
    }

    private static void createMessage(String message) {
        System.out.println(message);
    }
}
