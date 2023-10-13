/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop32;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author tania
 */
public class POOP32 {
    public static void main(String[] args) {
        Hashtable<String, Calendar> agenda = new Hashtable<>();

        // Agrega registros a la agenda
        agregarRegistro(agenda, "Tania", 2004, Calendar.MAY, 15);
        agregarRegistro(agenda, "Miriam", 2004, Calendar.APRIL, 20);
        agregarRegistro(agenda, "Fer", 2004, Calendar.JULY, 10);
        agregarRegistro(agenda, "Darinka", 2004, Calendar.OCTOBER, 5);
        agregarRegistro(agenda, "Abundis", 2004, Calendar.JANUARY, 25);

        // Imprime todos los registros en la agenda
        for (String nombre : agenda.keySet()) {
            Calendar cumpleanos = agenda.get(nombre);
            System.out.println("Nombre: " + nombre);
            System.out.println("Cumpleaños: " + cumpleanos.get(Calendar.DAY_OF_MONTH) + "/"
                    + (cumpleanos.get(Calendar.MONTH) + 1) + "/" + cumpleanos.get(Calendar.YEAR));
            System.out.println();
        }
    }

    private static void agregarRegistro(Hashtable<String, Calendar> agenda, String nombre, int anio, int mes, int dia) {
        Calendar fechaCumpleanos = new GregorianCalendar(anio, mes, dia);
        agenda.put(nombre, fechaCumpleanos);
    }
}

