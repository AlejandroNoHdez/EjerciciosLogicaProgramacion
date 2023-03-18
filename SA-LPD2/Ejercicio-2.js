/*

Bryan Alejandro Noh Hernandez - Ejercicio 2

Crear un programa en Javascript que realice lo siguiente:
    ○ Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
    ○ Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
    ○ Debe imprimir ambos resultados por consola o por el DOM.
    ○ Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar
    un mensaje de error y volver a solicitar los datos.
● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
    ○ Entrada:
        ■ 45.
    ○ Salida
        ■ Grados Kelvin: 318.15
        ■ Grados Fahrenheit: 113.
*/

function convertTemperature()
{
    let celsius = parseFloat(prompt("Ingresa la temperatura en grados Celsius:"));

    // Verificar si el input es un número
    if (isNaN(celsius))
    {
        alert("El valor ingresado no es un número válido.");
        convertTemperature(); // Volver a solicitar los datos
        return;
    }

    let fahrenheit = (celsius * 9 / 5) + 32;
    let kelvin = celsius + 273.15;

    console.log(`Grados Kelvin: ${kelvin}`);
    console.log(`Grados Fahrenheit: ${fahrenheit}`);
}

convertTemperature();