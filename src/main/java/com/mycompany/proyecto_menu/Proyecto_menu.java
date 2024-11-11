package com.mycompany.proyecto_menu;
//Areglo unidimensional o vector para N datos tipo string
//

import java.util.Scanner;

public class Proyecto_menu {

    static void leerInfo(Scanner te, String n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("\nCadena de datos no." + (i + 1));
            System.out.println("Ingrese la cadena de texto:");
            n[i] = te.nextLine();
        }
    }

    static char menu(Scanner te) {
        char op;

        System.out.println("\na.- Registro de información\nb.- Mostrar información\nx.- Salir");
        op = te.nextLine().charAt(0);

        return op;
    }

    static void mostrarInfo(String n[]) { //Modificar esto por un "For each"
        for (int i = 0; i < n.length; i++) {
            System.out.println("\nDatos del alumno no." + (i + 1));
            System.out.printf("Nombre:%s", n[i]);
        }
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        //Ingresa variables aqui si es que hay
        char opc;
        boolean ind = false;

        System.out.println("Registre la cantidad de 'palabras' u 'oraciones' que desee procesar: ");
        int n = teclado.nextInt();

        String nombre[];

        nombre = new String[n];

        teclado.nextLine();

        do {
            opc = menu(teclado);

            switch (opc) {
                case 'a':
                    if (ind) {
                        System.out.println("\n Ya registro información...");
                        break;
                    }
                    leerInfo(teclado, nombre);

                    ind = true;

                    break;
                case 'b':
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }

                    mostrarInfo(nombre);
                    break;

                case 'c':
                    /* if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }

                    int h[];

                    int m;

                    h = new int[1];

                    m = totalMH(genero, h);

                    System.out.println("\nTotal mujeres: " + m + "\thombres: " + h[0]); */
                    break;

                case 'd':      // cali mas baja
                    /* if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }

                    System.out.println("\n La calif menor es: " + califbaja(calif));
                     */
                    break;

                case 'e':

                    // SE RECOMIENDA A LOS ALUMNOS COMO EJERCICIOS
                    // SOBRE ESTE MISMO EJEMPLO, GENERAR E IMPLEMENTAR
                    // MAS CASOS PARA APLICAR OTROS PROCESOS A LA 
                    // INFORMACIÓN DE LOS ALUMNOS COMO: UTILIZANDO FUNCIONES
                    // DEL PROGRAMADOR
                    // * Agregar un punto a la calificación de las mujeres
                    // * Cambiarle el sexo a los reprobados
                    // * Obtener y exhibir el promedio del grupo
                    // * Modificar un nombre, una calificación, etc.
                    // * Realizar búsquedas, obtener la calificación mas baja, etc.
                    // * Total de aprobados, total de reprobados, etc.
                    // * etc., etc., etc.
                    break;

                default:
                    System.out.println("Opción no implementada...");
                    break;

            }

        } while (opc != 'x' && opc != 'X');
    }
}
