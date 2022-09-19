/*
 * @author NeuenMartinez
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío.
 */
package POOej11;

import java.util.Date;
import java.util.Scanner;

public class POOej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("Dia:");
        int dia = leer.nextInt();
        System.out.println("Mes:");
        int mes = leer.nextInt();
        System.out.println("Año:");
        int año = leer.nextInt();
        Date fecha = new Date(año - 1900,mes -1,dia);
        System.out.println("La fecha de nacimiento es: " + fecha);
        Date fechaActual = new Date();
        int años = (fechaActual.getYear() - fecha.getYear());
        System.out.println("La persona tiene: " + años + " años" );
        
    }

}
