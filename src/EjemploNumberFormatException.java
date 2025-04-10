public class EjemploNumberFormatException {
    public static void main(String[] args) {
        String texto = "abc123";
        int numero = Integer.parseInt(texto); // Excepción aquí
        System.out.println("Número convertido: " + numero);
    }
}
