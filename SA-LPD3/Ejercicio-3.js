/*

Bryan Alejandro Noh Hernandez - Ejercicio 3

Crear un programa en Javascript que realice lo siguiente:
    ○ Debe solicitar al usuario un número por prompt o por input y guardarlo.
    ○ Debe calcular el factorial del número recibido.
    ○ Debe imprimir el resultado por consola o por el DOM.
    ○ Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un
    mensaje de error y volver a solicitar el dato.
● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
    ○ Entrada:
        ■ 5
    ○ Salida:
        ■ 120.
*/

let number;

// Solicitar número y validar que sea un número válido
while (true)
{
    number = prompt("Ingrese un número:");
    if (isNaN(number))
    {
        console.log("Error: debe ingresar un número válido.");
    }
    else
    {
        break;
    }
}

// Calcular factorial
let factorial = 1;
for (let i = 2; i <= number; i++)
{
    factorial *= i;
}

// Imprimir resultado
console.log(`El factorial de ${number} es ${factorial}.`);