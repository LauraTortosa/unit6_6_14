import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        String palabra;
        String intento;

        do {
            System.out.print("Escribe una palabra: ");
            palabra = new Scanner(System.in).next();
        } while (palabra.isEmpty());

        String anagrama = creaAnagrama(palabra);
        System.out.print("Anagrama: " + anagrama);
        do {
            System.out.print("¿Qué palabra es?");
            intento = new Scanner(System.in).next();
        } while (!palabra.equals(intento));
        System.out.println("Correcto!");
    }
    static String creaAnagrama(String palabra) {
        char anagrama[] = palabra.toCharArray(); //convierte cadena en tabla

        for (int cadena = 0; cadena < anagrama.length; cadena++) {
            int i = (int)(Math.random() * anagrama.length);
            int j = (int)(Math.random()* anagrama.length);
            char aux = anagrama[i];
            anagrama[i] =anagrama[j];
            anagrama[j] = aux;
        }
        return String.valueOf(anagrama);
    }
}
