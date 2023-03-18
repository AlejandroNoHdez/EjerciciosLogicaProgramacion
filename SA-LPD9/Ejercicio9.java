/*

Bryan Alejandro Noh Hernandez - Ejercicio 9

Crear un programa en Java que realice lo siguiente:
    ○ Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
    ○ Utiliza un objeto HashMap para almacenar los pares de palabras.
    ○ Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
    ○ Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
    ○ Entradas:
        ■ gato
    ○ Salida:
        ■ cat
    ○ Siempre y cuando la palabra se encuentre en el diccionario

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear diccionario
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("computadora", "computer");
        diccionario.put("libro", "book");
        diccionario.put("juego", "game");
        diccionario.put("arbol", "tree");
        diccionario.put("ciudad", "city");
        diccionario.put("mañana", "morning");
        diccionario.put("noche", "night");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("banana", "banana");
        diccionario.put("zapato", "shoe");
        diccionario.put("flor", "flower");
        diccionario.put("nube", "cloud");
        diccionario.put("mar", "sea");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");

        // Pedir palabra en español
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra en español:");
        String palabra = scanner.nextLine().toLowerCase();

        scanner.close();

        // Buscar palabra en el diccionario
        if (diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            System.out.printf("La traducción de \"%s\" es \"%s\".%n", palabra, traduccion);
        } else {
            System.out.printf("La palabra \"%s\" no se encuentra en el diccionario.%n", palabra);
        }
    }

}
