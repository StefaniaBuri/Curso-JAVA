public class Person {

    // Comentario de una línea -> ctrl + ç
    /*
     * Comentario de bloque -> mayus + alt + A
     */

    /*
     * Tipos numeros
     * byte = 1 byte -> -128 hasta 127 xq hay q incluir el signo.
     * short = 2 bytes
     * int = 4 bytes ---mas usado--
     * long = 8 bytes
     * float = decimales cortos 4 bytes
     * double = decimales largos 8 bytes ---mas usado---
     * boolean = true o false
     * 
     */

    public static void main(String[] args) {

        // Tipos primitivos
        byte age; // Declaración
        age = 22; // Asignación
        short year = 1991; // Inicialización = Declaración + Asignación
        int cityPopulation = 4_000_000;
        long countryPopulation = 40_000_000;
        float height = 1.78f; // 1.78F
        double weight = 65.7474;
        boolean isMarried = true;
        boolean hasPet = false;
        char type = 'A';

        // Objetos -> porque no tiene tamaño definido, son referenciados
        String name = "Pepe";

        System.out.println("Mi nombre es " + name);
        System.out.println("Mi edad es: " + age);
        System.out.println("Fecha: " + year);
        System.out.println("Población de mi ciudad: " + cityPopulation);
        System.out.println("Población de  mi país: " + countryPopulation);
        System.out.println("""
                Mi altura es: %s
                Peso: %s
                ¿Tienes mascota? %s
                ¿Estas casado? %s
                Tipo: %s
                    """.formatted(height, weight, hasPet, isMarried, type));
        System.out.println();
    }
}
