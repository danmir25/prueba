package notasalumno;
/* Programa notas alumno
 * Version 3.1*/
/*Programa para calcular la nota media de 10 alumnos*/
import java.util.Scanner;
public class NotasAlumno {
	Scanner stdin = new Scanner (System.in);

	 private static int alumnos;
	 double sumaExamenesClasicos=0;
	 double sumaExamenesTest=0;
	 double notaFinal=0;
	class Alumno{
		
	}    
              
	public float calcularExamenesClasicos() { // Aqui introduces las notas de los examenes clasicos
       double notaExamenesClasicos; 
       int examenesClasicos;
       System.out.println("EXAMENES CLASICOS");
         for(examenesClasicos=1;examenesClasicos<=3;examenesClasicos++) {
          	System.out.println("Introduce tu nota " + examenesClasicos + ":" );
          		notaExamenesClasicos=stdin.nextDouble();
                        if(notaExamenesClasicos<0){
                            System.out.println("Nota no valida");
                            	sumaExamenesClasicos=0;
                               return calcularExamenesClasicos();
                                
                        }
                        if(notaExamenesClasicos>10){
                            System.out.println("Nota no valida");
                            	sumaExamenesClasicos=0;
                            	return calcularExamenesClasicos();
                            	
                        }
		  	if (notaExamenesClasicos>=0 && notaExamenesClasicos<=10) {
		  		System.out.println("Tu nota es de " + notaExamenesClasicos);
		  			
		  	}
		  				sumaExamenesClasicos=sumaExamenesClasicos+notaExamenesClasicos;
                        System.out.println("Suma total de tus examenes clasicos " + sumaExamenesClasicos);
         }      
            return 0;
    }
	
	
	public float calcularExamenesTest(){ // Aqui se calcula las notas de los examenes test.
		double notaExamenesTest, puntosPerdidos=0;
		int aciertos, fallos, examenesTest, pregRestantes;
	    System.out.println("EXAMENES TIPO TEST");
		for(examenesTest=1;examenesTest<=2;examenesTest++) {
			System.out.println("EXAMEN TIPO TEST " + examenesTest);
			System.out.println("Insterta tus aciertos: ");
				aciertos=stdin.nextInt();
				if(aciertos>30||aciertos<0) {
					System.out.println("ERROR. Pon un numero entre 0 y 30");
						sumaExamenesTest=0;
						return calcularExamenesTest();
				}
			System.out.println("Inserta tus fallos: ");
				fallos=stdin.nextInt();
				pregRestantes=30-aciertos;
				if(fallos>pregRestantes) {
					System.out.println("ERROR. No hay tantas preguntas");
					aciertos=0;
					notaExamenesTest=0;
					return calcularExamenesTest();
				}
				if(fallos > 0) {
					puntosPerdidos = fallos/3;
					System.out.println("Has tenido fallos. Pierdes " + puntosPerdidos + " puntos");
				}else{
					System.out.println("No has tenido fallos");
				}
				System.out.println();
				notaExamenesTest=(aciertos-puntosPerdidos)/3;
					if(notaExamenesTest<0) {
						notaExamenesTest=0;
					}
				System.out.println("Tu nota en el examen es " + notaExamenesTest);
                        sumaExamenesTest=sumaExamenesTest + notaExamenesTest;
                        System.out.println("Suma total de tus examenes test " + sumaExamenesTest);
	}
		return 0;
		}
                
	
	
        public void presentarTrabajos(){//Para saber si has entregado todos los trabajos.
            int dias;
            int trabajos;
            int confirmacionTrabajos;
            for(trabajos=1;trabajos<=3;trabajos++){ //Te pregunta por los tres trabajos
            notaFinal = (sumaExamenesClasicos/3)*0.5 + (sumaExamenesTest/2)*0.5;
            System.out.println("Tu nota es: " + notaFinal);
        		 System.out.println("Introduce si has entregado el trabajo " + (trabajos) +" (Nº Positivo para si, 0 o negativo para no): ");
                 confirmacionTrabajos = stdin.nextInt();
              if (trabajos>0){  //Calcula si lo has entragado todo.				   
            	  System.out.println("Entregado.");
            	  System.out.println("Insterta los dias de retraso: ");
          			dias=stdin.nextInt();
          			if(dias>5) {
          				System.out.println("Trabajo no entregado");
          				notaFinal=3;
          				System.out.println("Has suspendido. Tu nota final es de " + notaFinal);
          				sumaExamenesClasicos=0;
            			sumaExamenesTest=0;
            			break;
          			}else{		
                		notaFinal=notaFinal-(dias*0.1);
                		System.out.println("La nota final actual del alumno " + alumnos + " es " + notaFinal);
          			}
              }else{
            	  System.out.println("No entregado");
      			  notaFinal=3;
            	  System.out.println("Tu nota es: " + notaFinal);
            	  sumaExamenesClasicos=0;
      			  sumaExamenesTest=0;
      			  break;
              }
              
        	}
        	System.out.println("La nota final del alumno " + alumnos + " es " + notaFinal);
			
    
        }
         
        
        
        public static void main(String[] args) {
			// TODO code application logic here
        	NotasAlumno Alumno = new NotasAlumno();
                System.out.println("Este es un programa para calcular las notas de 10 alumnos. Por favor, insterte las notas a continuación");
         	for(alumnos = 1; alumnos <= 10; alumnos++){
         		System.out.println("ALUMNO " + alumnos);
        		Alumno.calcularExamenesClasicos();
        		Alumno.calcularExamenesTest();
        		Alumno.presentarTrabajos();
        	}

        }
}
