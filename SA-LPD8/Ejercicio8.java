/*

Bryan Alejandro Noh Hernandez - Ejercicio 8

Crear un programa en Java que realice lo siguiente:
    ○ Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
    ○ Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al
    final, de tal forma que no se pierda ningún número.
    ○ Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
    ○ Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice
    seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos
    vayan al principio del array.
● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
    ○ Entradas:
        
    ○ Salidas:
        ■ Array original mostrando la posición del array más el valor.
            ● 0 - 1
            ● 1 - 2
            ● 2 - 3
            ● 3 - 4
            ● 4 - 5
            ● 5 - 6
            ● 6 - 7
            ● 7 - 8
            ● 8 - 9
            ● 9 - 10
        ■ Array con los números primos en las primeras posiciones, mostrando la posición del array más el
        valor.
            ● 0 - 2
            ● 1 - 3
            ● 2 - 5
            ● 3 - 7
            ● 4 - 1
            ● 5 - 4
            ● 6 - 6
            ● 7 - 8
            ● 8 - 9
            ● 9 - 10
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] primos = new int[10];

        int numPrimos = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                primos[numPrimos] = numeros[i];
                numPrimos++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i])) {
                primos[numPrimos] = numeros[i];
                numPrimos++;
            }
        }

        System.out.println("\nArray original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

        System.out.println("\nArray con los números primos en las primeras posiciones:");
        for (int i = 0; i < primos.length; i++) {
            System.out.println(i + " - " + primos[i]);
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}