package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lefrontend {
    public static void main(String[] args) {
        //como obtener una fecha del sistema
        LocalDate fecha = LocalDate.now(); //metodo estatico
        System.out.println(fecha);

        //como asignar una fecha en especifico
        LocalDate fecha2 = LocalDate.of(2023,2,24);
        System.out.println(fecha2);

        //encontrar la diferencia entre dos fechas
        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha,fecha2);
        System.out.println(diferenciaEntreFechas);





         }
}