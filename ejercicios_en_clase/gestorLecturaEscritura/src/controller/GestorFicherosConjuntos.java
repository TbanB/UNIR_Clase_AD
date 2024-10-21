package controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicherosConjuntos {

    public void cifrado(String path) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;

        System.out.println("Introduce el mensaje que quieres guardar:");
        String mensaje = scanner.nextLine();

        System.out.println("Introduce la fase de cifrado");
        int fase = scanner.nextInt();
        try {
            fileWriter =  new FileWriter(file, false);
            for (int i = 0; i < mensaje.length(); i ++) {
                char letra = mensaje.charAt(i);
                int codigo = (int)letra;
                fileWriter.write(String.valueOf(codigo*fase) + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void descifrado(String path) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la fase de descifrado: ");

        int fase = scanner.nextInt();

        File file = new File(path);
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = null;
            while ((lectura = bufferedReader.readLine()) != null) {
                // System.out.println(lectura);
                int codigo = Integer.parseInt(lectura);
                System.out.println((char)(codigo/fase));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
