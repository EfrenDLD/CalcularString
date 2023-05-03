import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String texto = sc.nextLine();

        ManipuladorDeCadenas manipulador = new ManipuladorDeCadenas();
        int numMayusculas = manipulador.contarMayusculas(texto);
        int numMinusculas = manipulador.contarMinusculas(texto);

        System.out.println("La cadena tiene " + numMayusculas + " mayúsculas y " + numMinusculas + " minúsculas.");

        System.out.println("\nIngrese una letra para contar su frecuencia:");
        String letraStr = sc.nextLine();
        char letra = letraStr.charAt(0);
        int frecuencia = manipulador.contarLetra(texto, letra);

        System.out.println("La letra '" + letra + "' aparece " + frecuencia + " veces en la cadena.");

        System.out.println("\nIngrese el inicio del rango a extraer:");
        int inicio = sc.nextInt();
        System.out.println("Ingrese el fin del rango a extraer:");
        int fin = sc.nextInt();
        String subcadena = manipulador.extraerSubcadena(texto, inicio, fin);

        System.out.println("La subcadena extraída es: " + subcadena);

        String textoInvertido = manipulador.invertirCadena(texto);
        System.out.println("El texto invertido es: " + textoInvertido);
    }
}

