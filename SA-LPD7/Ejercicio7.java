/*

Bryan Alejandro Noh Hernandez - Ejercicio 7

Crear un programa en Java que realice lo siguiente:
    ○ Debe solicitar al usuario un día de la semana (de lunes a viernes).
    ○ Debe solicitar al usuario una hora (horas y minutos).
    ○ Debe calcular cuantos minutos faltan para el fin de semana. Se considera que el fin de semana comienza el
    viernes a las 15:00 hrs.
    ○ Debe mostrar el resultado por consola.
    ○ Debe ser capaz de identificar si los datos de entrada son válidos (día de la semana válido, hora válida,
    minutos válidos), en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
    ○ Entradas: Lunes, 14:30 hrs
        ■ lunes
        ■ 14
        ■ 30
    ○ Salida:
        ■ Faltan 5730 minutos para el fin de semana.
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir día de la semana
        DayOfWeek diaSemana = null;

        while (diaSemana == null) {
            System.out.print("Ingresa un día de la semana (lunes a viernes): ");
            String diaSemanaString = scanner.nextLine().toLowerCase();

            try {
                diaSemana = DayOfWeek.valueOf(diaSemanaString.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: día de la semana inválido.");
            }
        }

        // Pedir hora
        LocalTime hora = null;

        while (hora == null) {
            System.out.print("Ingresa una hora (formato HH:mm): ");
            String horaString = scanner.nextLine();

            try {
                hora = LocalTime.parse(horaString);
            } catch (DateTimeParseException e) {
                System.out.println("Error: hora inválida.");
            }
        }

        scanner.close();

        // Calcular minutos restantes para el fin de semana
        LocalDateTime ahora = LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.nextOrSame(diaSemana)), hora);
        LocalDateTime inicioFinDeSemana = ahora.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
                .with(LocalTime.of(15, 0));

        long minutosRestantes = ahora.until(inicioFinDeSemana, ChronoUnit.MINUTES);

        // Mostrar resultado
        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
    }
}
