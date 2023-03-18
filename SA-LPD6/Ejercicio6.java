/*

Bryan Alejandro Noh Hernandez - Ejercicio 6

Crear un programa en Javascript que realice lo siguiente:
    ○ Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será
    del 1 al 100.
    ○ Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el
    número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
    ○ Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo:
    “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números
    introducidos antes de adivinar el número secreto.
    ○ El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que
    debe ser del 1 al 100.
    ○ Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un
    mensaje de error y volver a solicitar el dato.
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Texto al revés: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}