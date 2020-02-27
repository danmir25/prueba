package notasalumno;
/* Programa notas alumno
 * Version 2.1.1*/
/*Programa para calcular la nota media de 10 alumnos*/
import java.util.Scanner;
public class NotasAlumno {
	Scanner stdin = new Scanner (System.in);

	 private static int alumnos;
	 int trabajos = 0;
	 double sumaExamenesClasicos=0;
	 double sumaExamenesTest=0;
	 double notaFinal=0;
	class Alumno{
		
	}    
              
	public float calcularExamenesClasicos() { // Aqui introduces las notas de los examenes clasicos
       float notaExamenesClasicos; 
       int examenesClasicos;
       System.out.println("EXAMENES CLASICOS");
         for(examenesClasicos=1;examenesClasicos<=3;examenesClasicos++) {
          	System.out.println("Introduce tu nota " + examenesClasicos + ":" );
          		notaExamenesClasicos=stdin.nextInt();
                        if(notaExamenesClasicos<0){
                            System.out.println("Nota no valida");
                                	System.exit(0);
                        }
                        if(notaExamenesClasicos>10){
                            System.out.println("Nota no valida");
		  		System.exit(0);
                        }
		  	if (notaExamenesClasicos>=0 && notaExamenesClasicos<=10) {
		  		System.out.println("Tu nota es de " + notaExamenesClasicos);

		  	}
                        sumaExamenesClasicos=sumaExamenesClasicos+notaExamenesClasicos;
                        System.out.println("Suma total de tus examenes clasicos " + sumaExamenesClasicos);
         }      
            return 0;
    }
	
	
	public void calcularExamenesTest(){ // Aqui se calcula las notas de los examenes test.
		int notaExamenesTest, aciertos, fallos, puntosPerdidos=0, examenesTest;
	    System.out.println("EXAMENES TIPO TEST");
		for(examenesTest=1;examenesTest<=2;examenesTest++) {
			System.out.println("Insterta tus aciertos: ");
				aciertos=stdin.nextInt();
			System.out.println("Inserta tus fallos: ");
				fallos=stdin.nextInt();
			if(fallos > 0) {
				puntosPerdidos = fallos/3;
				System.out.println("Has tenido fallos. Pierdes " + puntosPerdidos + " puntos");
			}else{
				System.out.println("No has tenido fallos");
			}
				System.out.println();
				notaExamenesTest=(aciertos-puntosPerdidos)/3;
				System.out.println("Tu nota en el examen es " + notaExamenesTest);
                        sumaExamenesTest=sumaExamenesTest + notaExamenesTest;
                        System.out.println("Suma total de tus examenes test " + sumaExamenesTest);
	}
		}
                
	
	
        public void presentarTrabajos(){//Para saber si has entregado todos los trabajos.
          
            System.out.println("Introduce tus trabajos entregados: ");
                     trabajos = stdin.nextInt();
			if (trabajos>=3){  //Calcula si lo has entragado todo.				   
                  System.out.println("Lo has entregado todo.");
                  
              } else { /*Si no has entragado todo te ponen la nota por defecto*/
            	  notaFinal = 3;
                  System.out.println("Has suspendido. Tu nota es de " + notaFinal);
                  
              }
        }
        
        
        public void retrasoTrabajos() { //Penalizacion si hay retraso en una entraga de un trabajo
        	int dias;
        	System.out.println("Insterta los dias de retraso: ");
        		dias=stdin.nextInt();
        	if(dias>5) {
        		System.out.println("Trabajo no entregado");
        	}else{
                 notaFinal = (sumaExamenesClasicos/3)*0.5 + (sumaExamenesTest/2)*0.5; 
        		notaFinal=notaFinal-(dias*0.1);
        		System.out.println("La nota final del alumno " + alumnos + " es " + notaFinal);
        	}
        }
        
        public static void main(String[] args) {
			// TODO code application logic here
        	NotasAlumno Alumno = new NotasAlumno();
                System.out.println("¡Bienvenido!");
         	for(alumnos = 1; alumnos <= 10; alumnos++){
         		System.out.println("ALUMNO " + alumnos);
        		Alumno.calcularExamenesClasicos();
        		Alumno.calcularExamenesTest();
        		Alumno.presentarTrabajos();
        		Alumno.retrasoTrabajos();
        	}

        }
}


------------------------
package notasAlumno;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class InterfazNotasAlumno extends Composite {
	private Table table;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public InterfazNotasAlumno(Composite parent, int style) {
		super(parent, style);
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(77, 99, 340, 140);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText("Nota 1");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText("Nota 2");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText("Nota 3");
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setText("Nota 4");
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setText("Nota 5");
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

