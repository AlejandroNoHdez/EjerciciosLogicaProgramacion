/*

Bryan Alejandro Noh Hernandez - Ejercicio 4

Crear un programa en Javascript que realice lo siguiente:
    ○ Debe solicitar al usuario un número por prompt o por input y guardarlo.
    ○ Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8,
    debe mostrar 8 números de la serie de Fibonacci.
    ○ Debe imprimir el resultado por consola o por el DOM.
    ○ Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un
    mensaje de error y volver a solicitar el dato.
○ Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente:
    ○ Entrada:
        ■ 3
    ○ Salida:
        ■ 0, 1, 1.
    ○ Entrada:
        ■ 10
    ○ Salida:
        ■ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
*/

let num;

do
{
    num = prompt('Introduce un número:');
}
while (isNaN(num) || num === '');

const fib = [0, 1];
for (let i = 2; i < num; i++)
{
    fib[i] = fib[i - 1] + fib[i - 2];
}

console.log(fib.join(', '));