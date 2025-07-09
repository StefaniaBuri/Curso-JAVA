package local.data;

import java.util.Arrays;

/*  !! IMPORTANTE ¡¡ -> la clase String en Java es inmutable, lo que significa que cada vez que se aplica un método que modifica la cadena, se crea una nueva cadena en memoria y se devuelve. 
Si se requiere una manipulación frecuente de cadenas, se recomienda usar la clase StringBuilder o StringBuffer, que son clases mutables. 
 
*  MÉTODOS STRING: 
********* Métodos para obtener información de la cadena: ************
- length(): Devuelve la longitud de la cadena (el número de caracteres). 
- charAt(int index): Devuelve el carácter en la posición index especificada (la primera posición es 0). 
- indexOf(String str): Devuelve la posición de la primera ocurrencia de la subcadena str en la cadena. Si no se encuentra, devuelve -1. 
- lastIndexOf(String str): Devuelve la posición de la última ocurrencia de la subcadena str en la cadena. Si no se encuentra, devuelve -1. 

********* Métodos para modificar la cadena: *********
- substring(int beginIndex): Devuelve una nueva cadena que es una subcadena de la cadena original, comenzando desde beginIndex hasta el final. 
- substring(int beginIndex, int endIndex): Devuelve una nueva cadena que es una subcadena de la cadena original, comenzando desde beginIndex hasta endIndex (exclusivo). 
- concat(String str): Concatena la cadena str al final de la cadena actual, devolviendo una nueva cadena. 
- replace(char oldChar, char newChar): Devuelve una nueva cadena donde todas las ocurrencias de oldChar son reemplazadas por newChar. 
- toUpperCase(): Devuelve una nueva cadena con todos los caracteres en mayúsculas. 
- toLowerCase(): Devuelve una nueva cadena con todos los caracteres en minúsculas. 
- trim(): Elimina los espacios en blanco al principio y al final de la cadena. 

********* Métodos para comparar cadenas: *********
- equals(Object anObject): Compara la cadena con el objeto anObject y devuelve true si son iguales (case-sensitive). 
- equalsIgnoreCase(String anotherString): Compara la cadena con la cadena anotherString ignorando mayúsculas y minúsculas y devuelve true si son iguales. 
- compareTo(String other): Compara lexicográficamente las dos cadenas y devuelve un valor entero que indica la relación entre ellas. 


********* Otros métodos útiles: *********
- toCharArray(): Convierte la cadena en un array de caracteres. 
- split(String regex): Divide la cadena en un array de subcadenas, utilizando el delimitador especificado por la expresión regular regex. 
- startsWith(String prefix): Comprueba si la cadena comienza con el prefijo especificado. 
- endsWith(String suffix): Comprueba si la cadena termina con el sufijo especificado. 
- contains(CharSequence s): Comprueba si la cadena contiene la secuencia de caracteres especificada. 

********* StringBuilder / StringBuffer *********
StringBuilder como StringBuffer en Java se utilizan para crear cadenas mutables, pero la principal diferencia radica en su manejo de hilos. 
- StringBuffer es thread-safe (seguro para hilos) porque sus métodos están sincronizados, lo que significa que es adecuado para entornos multihilo. 
- StringBuilder, por otro lado, no es seguro para hilos y, por lo tanto, ofrece un mejor rendimiento en aplicaciones de un solo hilo. 

********* Métodos comunes para ambos: StringBuilder como StringBuffer *********
- append(String str): Agrega la cadena especificada al final de la secuencia actual. 
- insert(int offset, String str): Inserta la cadena en la posición especificada. 
- replace(int start, int end, String str): Reemplaza la porción de la cadena que comienza en la posición start (inclusive) y termina en la posición end (exclusive) con la cadena especificada. 
- delete(int start, int end): Elimina caracteres desde la posición "start" hasta la posición "end". 
- reverse(): Invierte el orden de los caracteres. 
- toString(): Convierte el objeto en un String. 

********* Métodos esenciales de StringBuffer *********
- length(): Devuelve la longitud actual del StringBuffer (el número de caracteres). 
- capacity(): Devuelve la capacidad actual del StringBuffer (el tamaño máximo de la cadena que puede almacenar sin reasignar memoria). 
- charAt(int index): Devuelve el carácter en la posición especificada. 
- setCharAt(int index, char ch): Reemplaza el carácter en la posición especificada con el carácter dado. 
- substring(int start) / substring(int start, int end): Devuelve una nueva cadena que contiene una subcadena del StringBuffer. 
- ensureCapacity(int minimumCapacity): Asegura que el StringBuffer tenga una capacidad mínima. Si la capacidad actual es menor, se incrementa. 
- trimToSize(): Reduce la capacidad del StringBuffer al tamaño actual de la cadena. 

 */

@SuppressWarnings("unused")
public class Text {

    //COMPLETAR CODIGO

    void useString() {
        String text = "Hello, World!";
        System.out.println(text);
        System.out.println("Length: " + text.length());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Substring (0,5): " + text.substring(0,5));
        System.out.println("Contains 'World': " + text.contains("World"));

        //Otros métodos de String
        // text.indexOf("World")); // Encuentra la posición de una subcadena
        System.out.println("Index of 'World': " + text.indexOf("World"));
        // text.lastIndexOf("o")); // Encuentra la última posición de un carácter
        System.out.println("Last index of 'o': " + text.lastIndexOf("o"));
        // text.replace("World", "Java"); // Reemplaza una subcadena
        System.out.println("Replace 'World' with 'Java': " + text.replace("World", "Java"));
        // text.startsWith("Hello")); // Verifica si comienza con una subcadena
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello"));
        // text.endsWith("!")); // Verifica si termina con una subcadena
        System.out.println("Ends with '!': " + text.endsWith("!"));
        // text.trim(); // Elimina espacios en blanco al inicio y al final
        System.out.println("Trimmed: '" + text.trim() + "'");
        // text.split(","); // Divide la cadena en un array de subcadenas
        System.out.println("Split by ',': " + Arrays.toString(text.split(",")));
        // text.toCharArray(); // Convierte la cadena en un array de caracteres
        System.out.println("To char array: " + Arrays.toString(text.toCharArray()));
        // text.charAt(0); // Obtiene el carácter en una posición específica
        System.out.println("Char at index 0: " + text.charAt(0));
        // text.isEmpty(); // Verifica si la cadena está vacía
        System.out.println("Is empty: " + text.isEmpty());
        // text.equals("Hello, World!"); // Compara con otra cadena
        System.out.println("Equals 'Hello, World!': " + text.equals("Hello, World!"));
        // text.equalsIgnoreCase("hello, world!"); // Compara ignorando mayúsculas y
        // minúsculas
        System.out.println("Equals ignore case 'hello, world!': " + text.equalsIgnoreCase("hello, world!"));
        // text.compareTo("Hello, World!"); // Compara lexicográficamente
        System.out.println("Compare to 'Hello, World!': " + text.compareTo("Hello, World!"));
        // text.compareToIgnoreCase("hello, world!"); // Compara lexicográficamente
        // ignorando mayúsculas y minúsculas
        System.out.println("Compare to ignore case 'hello, world!': " + text.compareToIgnoreCase("hello, world!"));
        // text.format("Formatted: %s", text); // Formatea la cadena
        System.out.println("Formatted: " + String.format("Formatted: %s", text));
        // text.intern(); // Interna la cadena (almacena en pool de cadenas)
        System.out.println("Interned: " + text.intern());
        // text.codePointAt(0); // Obtiene el punto de código Unicode en una posición
        // específica
        System.out.println("Code point at index 0: " + text.codePointAt(4));
        // text.toString(); // Convierte a String (aunque ya es
        System.out.println("To String: " + text.toString());
        // test.valueOf(text)); // Convierte a String (aunque ya es)
        System.out.println("Value of: " + String.valueOf(text));
    }

    void useStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        String text = "Hello";
        StringBuffer sbText = new StringBuffer(text);
        sbText.append(" - " + text);
        System.out.println(sbText);
        System.out.println("HashCode: " + sbText.hashCode());
        sbText.insert(7, "x");
        System.out.println(sbText);
        sbText.replace(6, 8, "x");
        System.out.println(sbText);
        sbText.delete(6, 7);
        System.out.println(sbText.toString());

        // Otros métodos de StringBuffer
        // sb.reverse(); // Invierte el contenido
        System.out.println(sb.reverse());
        // sb.capacity(); // Capacidad del buffer
        System.out.println("Capacity: " + sb.capacity());
        sb.ensureCapacity(50); // Asegura una capacidad mínima
        System.out.println("New Capacity: " + sb.capacity());
        sb.trimToSize(); // Ajusta la capacidad al tamaño actual
        System.out.println("Trimmed Capacity: " + sb.capacity());
        // sb.setLength(10); // Establece una nueva longitud
        // System.out.println("New Length: " + sb.length());
        // sb.charAt(0); // Obtiene el carácter en una posición específica
        System.out.println("Character at index 0: " + sb.charAt(0));
        // sb.indexOf("World"); // Encuentra la posición de una subcadena
        System.out.println("Index of 'World': " + sb.indexOf("World"));
        // sb.lastIndexOf("o"); // Encuentra la última posición de un carácter
        System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));
        // sb.toString(); // Convierte a String
        System.out.println("String representation: " + sb.toString());
    }

    void useStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb.toString());
        sb.insert(5, " Beautiful");
        System.out.println(sb.toString());
        sb.replace(0, 5, "Hi");
        System.out.println(sb.toString());
        sb.delete(0, 3);
        System.out.println(sb.toString());
        
        // Otros métodos de StringBuilder
        // sb.reverse(); // Invierte el contenido
        // System.out.println(sb.toString());
        // sb.capacity(); // Capacidad del buffer
        // System.out.println("Capacity: " + sb.capacity());
        // sb.ensureCapacity(50); // Asegura una capacidad mínima
        // System.out.println("New Capacity: " + sb.capacity());
        // sb.trimToSize(); // Ajusta la capacidad al tamaño actual
        // System.out.println("Trimmed Capacity: " + sb.capacity());
        // sb.setLength(10); // Establece una nueva longitud
        // System.out.println("New Length: " + sb.length());
        // sb.charAt(0); // Obtiene el carácter en una posición específica
        // System.out.println("Character at index 0: " + sb.charAt(0));
        // sb.indexOf("World"); // Encuentra la posición de una subcadena
        // System.out.println("Index of 'World': " + sb.indexOf("World"));
        // sb.lastIndexOf("o"); // Encuentra la última posición de un carácter
        // System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));
        // sb.toString(); // Convierte a String
        // System.out.println("String representation: " + sb.toString());
    }

    public static void main(String[] args) {
        Text text = new Text();
        //text.useString();
        text.useStringBuffer();

    }
}
