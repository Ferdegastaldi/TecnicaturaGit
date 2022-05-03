
import java.util.Scanner;

public class HolaMundo {
   public static void main(String[] args) {
   /*System.out.println("Hola Mundo!");
   
   int miVariable = 10;//No puedo redeclarar la misma variable No puedo utilizar esta variable fuera de este metodo
   System.out.println("El valor de miVariable es: " + miVariable);
   miVariable = 5; //Para reutilizarla, simplemente lo vuelvo a llamar
   System.out.println(miVariable);
   String miVariableCadena = "Buenas gente";
   System.out.println(miVariableCadena);
   //sout + tab copmpleta el system out de una
       System.out.println("miVariableCadena = " + miVariableCadena);
   //soutv + tab
   var miVariable2 = 3;
   
   System.out.println(miVariableCadena + miVariable2);//Si es amiguo, toma el tipo de variable del de la izquierda y concatena como cadena o como numeros
   */
   
   Scanner entrada = new Scanner(System.in);//Objeto entrada
       System.out.println("Ingrese su nombre:");
   var nombre = entrada.nextLine();//Next line acepta un iongreso de string
       System.out.println("Ingrese su apellido:");
   var apellido = entrada.nextLine();
       System.out.println("Nombre = " + nombre+ " " + "Aapellido="+ apellido);
}
   
 
}
