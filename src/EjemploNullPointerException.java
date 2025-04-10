public class EjemploNullPointerException {
    public static void main(String[] args) {
        String nombre = null;
        System.out.println("Longitud del nombre: " + nombre.length()); // Excepción aquí
    }
}
