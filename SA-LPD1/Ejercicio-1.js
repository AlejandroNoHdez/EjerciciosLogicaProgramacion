/*

Bryan Alejandro Noh Hernandez - Ejercicio 1

Crear un programa en Javascript que realice lo siguiente:
    ○ Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
    ○ Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
    ○ Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
    ○ Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM
    diciendo que los números son iguales.

● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
○ Entradas:
    ■ 4, 4, 2.
○ Salida:
    ■ 4, 4, 2.
    ■ 2, 4, 4.

*/


// Solicitar los 3 números al usuario
let num1 = parseInt(prompt("Ingrese el primer número:"));
let num2 = parseInt(prompt("Ingrese el segundo número:"));
let num3 = parseInt(prompt("Ingrese el tercer número:"));

let mayor, centro, menor;

// Identificar si los números son iguales
if (num1 === num2 && num2 === num3)
{
    console.log("Los números son iguales");
}
else
{
    // Identificar el número mayor
    if (num1 > num2 && num1 > num3)
    {
        mayor = num1;
        if (num2 > num3)
        {
            centro = num2;
            menor = num3;
        }
        else
        {
            centro = num3;
            menor = num2;
        }
    }
    else if (num2 > num1 && num2 > num3)
    {
        mayor = num2;
        if (num1 > num3)
        {
            centro = num1;
            menor = num3;
        }
        else
        {
            centro = num3;
            menor = num1;
        }
    }
    else
    {
        mayor = num3;
        if (num1 > num2)
        {
            centro = num1;
            menor = num2;
        }
        else
        {
            centro = num2;
            menor = num1;
        }
    }

    // Imprimir los números por consola
    console.log(`Números ingresados: ${num1}, ${num2}, ${num3}`);
    console.log(`Números ordenados de mayor a menor: ${mayor}, ${centro}, ${menor}`);
    console.log(`Números ordenados de menor a mayor: ${menor}, ${centro}, ${mayor}`);
}