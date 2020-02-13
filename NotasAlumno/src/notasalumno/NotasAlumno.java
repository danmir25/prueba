package notasalumno;
/* Programa notas alumno
 * Version 1.2*/
import java.util.Scanner;
public class NotasAlumno {
	Scanner stdin = new Scanner (System.in);
	class Alumno{
		int alumno;
		int examen1;
		int examen2;
		int examen3;
		int examen4;
		int examen5;
		int respuestas;
		int aciertos;
		int fallos;
	}
        public void examenes(){
     
            System.out.println("Inserta la nota del primer examen: ");
                    int examen1 =stdin.nextInt();
            System.out.println("Inserta la nota del segundo examen: ");
                    int examen2 =stdin.nextInt();
             System.out.println("Inserta la nota del tercer examen: ");
                    int examen3 =stdin.nextInt();
             System.out.println("Inserta la nota del cuarto examen: ");
                    int examen4 =stdin.nextInt();
             System.out.println("Inserta la nota del quinto examen: ");
                    int examen5 =stdin.nextInt();
             int notaFinal = (int) (examen1*0.1 + examen2*0.2 + examen3*0.2 + examen4*0.25 + examen5*025);
             System.out.println(notaFinal);
        }
        
	public void examenesClasicos() { /* Aqui introduces las notas de los examenes clasicos*/
      int notaExamenesClasicos=0;
	  for(int alumno = 1;alumno<=10;alumno++){ 
		  if (notaExamenesClasicos<=10) {
			  System.out.println("Tu nota es de " + notaExamenesClasicos);
		  }else {
			  System.out.println("Nota no valida");
			  return;
		}
	  }
    }
	public void examenesTest(){
		int notaExamenesTest=0;
		
	}
        public static void main(String[] args) {
        // TODO code application logic here
    }

}
