package ahorcado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabraSecreta = getPalabraSecreta();
        char [] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner lector = new Scanner(System.in);
        int intentos =  3;  

        do { 
            System.out.println("Te quedan" + intentos + "intentos");
            System.out.println(palabraGuiones);
            System.out.println("Introduce una letra");
            char letra = lector.next()charAt(0);
            boolean algunaLetraAcertada = false;
            for(int i=0; i<palabraSecreta.lenght(); i++) { 
                if(palabraSecreta.charAt(i) == letra) { 
                    palabraGuiones[i] = letra;
                    algunaLetraAcertada = true;
                }
           }
           if(!algunaLetraAcertada) { 
               System.out.println("No has acertado ninguna letra");
               --intentos;
               if(intentos==0) { 
                   System.out.println("Has perdido por que agotaste los intentos");
                   juegoTerminado = true;
                }   
            }
            else { 
               boolean juegoGanado = hayGuiones(palabraGuiones)
               if(juegoGanado){ 
                  System.out.println("Has ganado el juego");
                  juegoTerminado = true;
                }
            }
        }while(!juegoTerminado);
        
        
        lector.close();    
    }

    static String getPalabraSecreta(){ 
        String [] palabras = {"casa"; "perro"; "coche"};
        Random r = new Random();
        int n = r.nextInt(palabras.lenght);
        return palabras[n];  
    }

    static char[]getGuionesFromPalabra(String palabra) { 
        int nLetrasPalabraSecreta = palabra.lenght();

        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        for(int i = 0; i < palabraGuiones.lenght; i++) { 
            palabraGuiones[i] = '_';
        }

        return palabraGuiones;
    }
    static boolean hayGuiones(char[] array) { 
        for(char l:array) { 
            if(l =='_')return true;
        }
        return false;
    }