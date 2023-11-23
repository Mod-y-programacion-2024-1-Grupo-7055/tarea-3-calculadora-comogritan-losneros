import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;



/**
 *
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class Calculadora {
    static Compilador comp;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorDeSintaxisException {
<<<<<<< HEAD
       
        Scanner sc = new Scanner(System.in);
        boolean salir=false;
       
        while(!salir){
            
            System.out.println("Ingresa exit para salir o la operación que deseas realizar ( +,-,/,*,sqrt,sen,cos,tan)");
            String cadena = sc.nextLine();
           
            if(cadena.equals("exit")){
                salir=true;
=======
        Scanner sc= new Scanner(System.in);
        boolean salir=false;
        while(!salir){
            System.out.println("Ingresa la expresión a calcular o escribe 'exit' para salir ");
            String cadena = sc.nextLine();    
            if(cadena.equals("exit")){
                salir=true;
            
>>>>>>> 8fa0e85 (no c pq no jala)
            }else{
                comp= new Compilador();
                StringTokenizer lexemas = comp.analisisLexico(cadena);
                CompositeEA nodo = comp.arbolDeAnalisisSintactico(lexemas);
                System.out.println(nodo);
                System.out.println(nodo.evalua());
            }
<<<<<<< HEAD
        }
        sc.close();  
=======

        }
        sc.close();
        
>>>>>>> 8fa0e85 (no c pq no jala)
    }
}