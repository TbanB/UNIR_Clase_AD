import controller.GestorFicherosConjuntos;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        GestorFicherosConjuntos gestorFicherosConjuntos = new GestorFicherosConjuntos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué quieres hacer: 1. cifrar; 2. descifrar");
        int action = scanner.nextInt();

        if (action == 1) {
            gestorFicherosConjuntos.cifrado("src/resources/ficheros/cifrado.txt");
        } else if (action == 2) {
            gestorFicherosConjuntos.descifrado("src/resources/ficheros/cifrado.txt");
        }
    }
}
