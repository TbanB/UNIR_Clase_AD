import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        File directorio = new File("src/resources/directorio/");
        createMessage(directorio.getName());
        createMessage(String.valueOf(directorio.length()));
        createMessage(String.valueOf(directorio.isDirectory()));
        if (directorio.exists() && directorio.isDirectory()) {
            createMessageValue("El directorio existe: ", directorio.getName());
            File[] ficheros = directorio.listFiles();
            if (ficheros != null) {
                for (File fichero : ficheros) {
                    createMessage(fichero.getName());
                }
            } else {
                createMessage("El directorio no tiene ficheros");
            }
        } else {
            createMessage("El directorio no existe");
        }
    }

    private static void createMessage(String message) {
        System.out.println(message);
    }

    private static void createMessageValue(String message, String messageValue) {
        System.out.printf(message, messageValue);
    }
}
