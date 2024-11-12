package com.mycompany.proyecto_menu;
//Areglo unidimensional o vector para N datos tipo string

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

                System.out.println("\na.- Registro de información\nb.- Mostrar información\nc.- Contador de letras por cada oracion");
                System.out.println("d.- Buscar dato en el arreglo\ne.- Calcular cual es la palabra mas larga y cual es la mas corta del arreglo");
                System.out.println("f.- Holas\nx.- Salir");
                op = te.nextLine().charAt(0);

                return op;
            }

         static void mostrarInfo(String[] palabraS) {
             int i = 1; 
                for (String palabra : palabraS) { 
                       System.out.println("\nPalabra u Oracion no." + i);
                       System.out.printf("Palabra:\t %s\n", palabra);
                       i++; 
    }
}

         static void contarLongitudes(String[] palabraS) {
                System.out.println("\nLongitud de cada palabra registrada:");
                int i = 1; // Usamos un contador externo para mostrar el número del alumno
                for (String palabra : palabraS) {
                    if (palabra != null && !palabra.isEmpty()) {
                        System.out.println("\nCadena no." + i + " ('" + palabra + "') tiene una longitud de: " + palabra.length() + " Letras." );
                    }  
                    i++; 
                }
            }

        static void buscarPalabraParcial(Scanner te, String[] palabras) {
                System.out.println("\nIngrese la letra o palabra que desea buscar:");
                String fragmento = te.nextLine();

                boolean encontrada = false;

                for (String palabra : palabras) {
                    if (palabra != null && palabra.toLowerCase().contains(fragmento.toLowerCase())) {
                        System.out.println("Palabra o letra encontrada:\t '" + palabra + "'");
                        encontrada = true;
                    }
                }

                if (!encontrada) {
                    System.out.println("No se la letra o palabra:\t '" + fragmento + "'\t en el arreglo.");
                }
            }
        
        static void mostrarMaxMinLongitud(String[] palabras) {
                if (palabras == null || palabras.length == 0) {
                    System.out.println("El arreglo está vacío, no hay datos para analizar.");
                    return;
                }

                String palabraMax = palabras[0];
                String palabraMin = palabras[0];

                for (String palabra : palabras) {
                    if (palabra != null) {
                        if (palabra.length() > palabraMax.length()) {
                            palabraMax = palabra;
                        }
                        if (palabra.length() < palabraMin.length()) {
                            palabraMin = palabra;
                        }
                    }
                }

                System.out.println("\nLa palabra con mayor longitud es: '" + palabraMax + "' con " + palabraMax.length() + " caracteres.");
                System.out.println("La palabra con menor longitud es: '" + palabraMin + "' con " + palabraMin.length() + " caracteres.");
            }

        static void mostrarInfoMayusculas(String[] palabras) {
                int i = 1;
                System.out.println("\nPalabras registradas en MAYUSCULAS:");
                for (String palabra : palabras) {
                    if (palabra != null && !palabra.isEmpty()) {
                        System.out.println("Palabra u Oración no." + i + ":\t" + palabra.toUpperCase());
                    } else {
                        System.out.println("Palabra u Oración no." + i + ":\t[Vacía]");
                    }
                    i++;
                }
            }

        static void mostrarInfoMinusculas(String[] palabras) {
                int i = 1;
                System.out.println("\nPalabras registradas en minúsculas:");
                for (String palabra : palabras) {
                    if (palabra != null && !palabra.isEmpty()) {
                        System.out.println("Palabra u Oración no." + i + ":\t" + palabra.toLowerCase());
                    } else {
                        System.out.println("Palabra u Oración no." + i + ":\t[Vacía]");
                    }
                    i++;
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

        String[] palabra;

        palabra = new String[n];

        teclado.nextLine();

        do {
            opc = menu(teclado);

          switch (opc) {
                case 'a':                   //Registrar informacion 
                    if (ind) {
                        System.out.println("\n Ya registro información...");
                        break;
                    }
                    leerInfo(teclado, palabra);
                    ind = true;
                    break;
                    
                case 'b':                               //Mostramos las palabras o los datos registrados
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    mostrarInfo(palabra);
                    break;

                case 'c':                                   //Este caso nos dice de cuantas letras se componen las palabras que dimos a 
                     if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }               //guardar en la variable 'palabras'
                    contarLongitudes(palabra);
                    break;

                    case 'd':                                        // Buscar un dato con una letra o palabra
                     if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                     buscarPalabraParcial(teclado, palabra);
                    break;  
                    
                case 'e':
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    mostrarMaxMinLongitud(palabra);
                    break;
                    
                    case 'f':
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    mostrarInfoMayusculas(palabra);
                    break;
                    
                    case 'g':
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    mostrarInfoMinusculas(palabra);
                    break;
                    
                    case 'h':
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    //
                    break;
                    
                    case 'i':
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    //
                    break;
                    
                default:
                    System.out.println("Opción no implementada...");
                    break;

            }

        } while (opc != 'x' && opc != 'X');
    }
}
