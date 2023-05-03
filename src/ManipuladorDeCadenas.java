public class ManipuladorDeCadenas{
    public int contarMayusculas(String texto){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (Character.isUpperCase(c)){
                contador++;
            }
        }
        return contador;
    }
    public int contarMinusculas(String texto){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (Character.isLowerCase(c)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarLetra(String texto, char letra){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == letra || Character.toLowerCase(c) == letra){
                contador++;
            }
        }
        return contador;
    }

    public String extraerSubcadena(String texto, int inicio, int fin){
        return texto.substring(inicio, fin);
    }

    public String invertirCadena(String texto){
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }
}