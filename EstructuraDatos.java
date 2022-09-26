/**Vamos a crear los 14 programas dentro de un menu de seleccion de la tarea, comprendido por:
 * 1.- Bono o descuento por edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- convertir temperaturas
 * 4.- Numero de positivos y negativos
 * 5.- Tienda
 * 6.- Area y Perimetro
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujitos
 * 10.- Figura hueca
 * 11.- Patrones
 * 12.- Diamante
 * 13.- Calculadora
 * 14.- Salir
 */
 import java.util.Scanner;
 import java.util.*;
 import java.util.Scanner;
class EstructuraDatos {
    public static void main(String[] args){
        //objetos
        Scanner entrada = new Scanner(System.in);
        Scanner n1 =new Scanner(System.in);
        Scanner lector = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        //aqui van a ir las variables
        int opcion, numbinario;
        char letra;
        String binario = "";
        int edad, res, entrada = 200;
        double F,C;
        int num;
        int 1;
        int num = sc.nextInt();


        do{
            System.out.println("Bienvenido al programa de las tareas que son para el lunes a las 7 am wiii (n_n)/");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");
            System.out.println("3.- Conversiones de temperatura ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tienda ");
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujos de codigo ");
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");
            //obtener la respuesta del usuario
            opcion = entrada.nextInt();
            //menu
            switch(opcion){
                case 1:
                //descuento por edad 
                     system.out.println("Ingrese su edad");
                     edad = n1.nextInt();

                     if(edad >= 18)
                    {
                        System.out.println("Eres mayor de edad y tu descuento es del 25%");
                        res = (int) (entrada*0.25);
                        entrada = entrada-res;
                        system.out.println("La entrada com descuento es de: +entrada");
                        }
                        if(edad <=12 && edad >=6)
                        {
                        System.out.println("Eres menor de edad y tu descuento es del 50%");
                        res = (int) (entrada*0.50);
                        entrada = entrada-res;
                        System.out.println("La entrada con descuento es de:+entrada");
                        }
                        if(edad < 6)
                        {
                            System.out.println("Eres un niño y tu descuento es del 75%");
                            res = (int) (entrada*0.75);
                            entrada = entrada-res;
                            System.out.println("La entrada con descuento es de:+entrada");
                        }

                    break;
                case 2:
                    //convertir numero a binario
                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    //tenemos que saber si es positivo
                    if(numbinario > 0){
                        //realizar el algotimo con el mod 2 
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario ="0" + binario;
                            }else{
                                binario ="1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
                    break;
                case 3:
                //Conversion de temperatura
                System.out.println("Ingrese la cantidad de grados Celsius a convertir:");
                C= lector.nextDouble();
                F = 9/ 5.0 * C + 32;
                System.out.println(C+"Grados Celsius equivalen a "+F+" grados Fahrenheit.");
                    break;
                case 4:
                System.out.println("Ingrese el numero:");
                num=n.nextInt();
                if(num<0) {
                System.out.println("El numero es negativo");
                }
                else{
                System.out.println("El numero es positivo");
                }                
                    break;    
                case 5:
                    break;
                case 6:
                System.out.println("Ingrese datos del cuadrado");
                System.out.println("Ingrese el lado del cuadrado");
                1=entrada.nextInt();

                area= 1*1;
                perimetro= 4*1;

                System.out.println("Area = " + area);
                System.out.println("Perimetro = " + perimetro); 
                    break;
                case 7:
                    for(int n = 1; n<=10; n++){
                        System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                    }
                    break;
                case 8:
                        System.out.print("Ingrese un numero: ");
                        System.out.printf("El factorial de $d es %.0f\n", num, factorial(num));

                    public static double factorial(int n) {
                        double aux = 1;
                        for (int i = 2; i <= n; i++) {
                            aux *= i;
                        }
                        return aux;
                    } 
                    break;
                case 9:
                    break;
                case 10:
                    System.out.print("Por favor ingrese el tamaño del cuadrado: ");
                    int n = teclado.nextInt();
                    if(n >= 0 && n<=50) {
                        //Linea Superior
                        for (int i = 0; i < n; i++) {
                            System.out.print("*")
                        }
                        System.out.println();

                        //Centro de la forma
                        for(int i = 0; i < n-2; i++){
                        System.out.print("*");
                        for(int j = 0; j < n-2; j++){
                        }
                        System.out.println("*");
                        }

                        //Linea Inferior 
                        for (int i = 0; i < n; i++) {
                            System.out.print("*")
                        }
                    }else {
                        System.out.println("Error. El dato a ingresar de "
                        + "estar entre 0 y 50");
                    }
                    break;
                case 11:
                    break;
                case 12:
                public class Diamante{
                    public static void main(String args[]){
                        
                        for (int i = 1; i<=1 ; i++){
                            System.out.println("\t   *** ");//3
                            for(int j=1 ; j<= 1 ; j++){
                                System.out.println("\t  *****");//5
                                for(int y=1; y<=1; y++ ){
                                  System.out.println("\t *******");
                                  for( int a = 1; a<=1 ; a++){
                                    System.out.println("\t*********");
                                  }
                                  System.out.println("\t *******");   
                                }
                                System.out.println("\t  *****");
                            }
                            for(int x = 1; x <= 1 ; x++){
                                System.out.println("\t  *****");
                            }
                            System.out.println("\t   ***");
                            for(int z=1 ; z<=1; z++){
                                System.out.println("\t    *");
                            } 
                        }
                    }
                }
                    break;
                case 13: import java.util.Scanner;
                public class Calculadora {
                    static Scanner scanner = new Scanner(System.in);
                    public static void main(String[] args) {
                        int num1 = getInt();
                        int num2 = getInt();
                        char operation = getOperation();
                        int result = calc(num1,num2,operation);
                        System.out.println("El resultado de la operación: "+result);
                    }
                    public static int getInt(){
                        System.out.println("Introduzca un número:");
                        int num;
                        if(scanner.hasNextInt()){
                            num = scanner.nextInt();
                        } else {
                            System.out.println("Te has equivocado al introducir el número. Inténtalo de nuevo.");
                            scanner.next();//recursividad
                            num = getInt();
                        }
                        return num;
                    }
                    public static char getOperation(){
                        System.out.println("Introduzca la operación:");
                        char operation;
                        if(scanner.hasNext()){
                            operation = scanner.next().charAt(0);
                        } else {
                            System.out.println("Ha cometido un error al entrar en la operación. Inténtalo de nuevo.");
                            scanner.next();//recursividad
                            operation = getOperation();
                        }
                        return operation;
                    }
                    public static int calc(int num1, int num2, char operation){
                        int result;
                        switch (operation){
                            case '+':
                                result = num1+num2;
                                break;
                            case '-':
                                result = num1-num2;
                                break;
                            case '*':
                                result = num1*num2;
                                break;
                            case '/':
                                result = num1/num2;
                                break;
                            default:
                                System.out.println("La operación no se reconoce. Repite la entrada.");
                                result = calc(num1, num2, getOperation());//recursividad
                        }
                        return result;
                    }
                }
                
                    break;

                case 14:
                System.out.println("¿Deseas repetir la operacion?");
                System.out.println("1 Si");
                Ssytem.out.println("2 No");
                op2 = entrada.nextInt();

        while(op != 2);
        
                    break;                  
            }

            System.out.println("Deseas repetir el programa, escribe s para si");
            letra = entrada.next().charAt(0);



        }while(false);
        }while(letra == 's' || letra == 'S' );

    }


