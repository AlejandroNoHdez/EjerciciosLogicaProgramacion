/*

Bryan Alejandro Noh Hernandez - Ejercicio 5

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

// Función para generar un número aleatorio del 1 al 100
const generarNumeroAleatorio = () => Math.floor(Math.random() * 100) + 1;

// Función para validar si el número ingresado es válido
const validarNumero = (numero) =>
{
    if (isNaN(numero) || numero < 1 || numero > 100)
    {
        throw new Error('El número ingresado no es válido, por favor ingrese un número del 1 al 100');
    }
};

// Función para jugar a adivinar el número secreto
const jugarAdivinaNumero = () =>
{
    const numeroSecreto = generarNumeroAleatorio();
    const numerosIngresados = [];

    while (true)
    {
        let numeroIngresado = prompt('Ingrese un número del 1 al 100 para adivinar el número secreto');

        try
        {
            validarNumero(numeroIngresado);

            if (numeroIngresado == numeroSecreto)
            {
                console.log(`Felicidades, adivinaste el número secreto: ${numeroSecreto}`);
                console.log('Números ingresados antes de adivinar:', numerosIngresados);
                break;
            }
            else
            {
                numerosIngresados.push(numeroIngresado);
                console.log('Ups, el número secreto es incorrecto, vuelve a intentarlo.');
            }
        }
        catch (error)
        {
            console.log(error.message);
        }
    }
};

// Ejecutar la función para jugar a adivinar el número secreto
jugarAdivinaNumero();