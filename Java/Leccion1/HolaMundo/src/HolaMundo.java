
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

 /*Scanner entrada = new Scanner(System.in);//Objeto entrada
       System.out.println("Ingrese su nombre:");
   var nombre = entrada.nextLine();//Next line acepta un ingreso de string
       System.out.println("Ingrese su apellido:");
   var apellido = entrada.nextLine();
       System.out.println("Nombre = " + nombre+ " " + "Apellido="+ apellido);
   byte numEnteroByte = (byte) 128;//Lo obligamos a pasar de un numero entero a un byte, a riesgo d eperder presición
       System.out.println("numEnteroByte: " + numEnteroByte);
       System.out.println("Valor minimo del byte: "+ Byte.MIN_VALUE);
       System.out.println("Valor maximo del byte: "+ Byte.MAX_VALUE);
   char miVariableChar = '$';
   System.out.println("miVariableChar = " + miVariableChar);
   
   char varCaracter = '\u0024';//Código de unicode
   System.out.println("varCaracter = " + varCaracter);
   
   char varCaracter2 = 36;//código decimal
   System.out.println("varCaracter2 = " + varCaracter2);
   
   char varCaracter3 = 044;//Código octal
   System.out.println("varCaracter3 = " + varCaracter3);
   
   var varCaracter4 = (char)045;//Código octal. Aclaro char para que no lo tome como int
   System.out.println("varCaracter4 = " + varCaracter4);
   
   int varCaracter5 = '$';
   System.out.println("varCaracter5 = " + varCaracter5);//Muestra el código decimal*/
 /*boolean varBool = false;
   System.out.println("varBool = " + varBool);
   
   //Estructura if
   
   if(varBool){ //es lo mismo que if (varBool == true) si la variable es booleana
       System.out.println("varBool es true");
   }else{
       System.out.println("varBol es falsa");
   }
   
   var edad = 30;
   var adulto = edad>=18;
   
   if(adulto){
       System.out.println("Es mayor de edad");
   }else{
       System.out.println("Es menor de edad");
   }
        //Conversion de tipos
        var edad = Integer.parseInt("20"); //clase Integer. llama al méttodo parse int. Convierde de string a entero
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");//Ingresa string convierte a double
        System.out.println("valorPI = " + valorPI);
        
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(entrada.nextLine());//convierte en int el string ingresado
        System.out.println("edad = " + edad);*/
       
       /* var entrada = new Scanner(System.in);
  
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "Holi".charAt(3);//Entre parentesis, la posicion del caracter que quierpo ver en char
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Ingrese un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        
        
       /* var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA>=10 && valorA<= 10;
        
        if(respuesta)
            System.out.println("Esta dentro del rango establecido");
        else
            System.out.println("NO esta dentro del rango establecido");
        
        var vacaciones = false;
        var diaLibre = false;
        if(vacaciones||diaLibre)
            System.out.println("Papa puede asistir al juego de su hijo");
        else
            System.out.println("Papa no puede asistir al juego de su hijo");*/
       /*var resultadoT = (5>8)? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);*/
       
       var x = 5;
       var y = 10;
       var z = ++x + y--;
       
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
         
    }
    

}
