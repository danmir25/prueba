package notasalumno;
/* Programa notas alumno
 * Version 1.4.2*/
import java.util.Scanner;
public class NotasAlumno {
	Scanner stdin = new Scanner (System.in);
 
	class Alumno{
		int alumno;
		int notaFinal=0;
	}    
        public void examenes(int notaFinal){ //Cada porcentaje de cada examen
     
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
             notaFinal = (int) (examen1*0.1 + examen2*0.2 + examen3*0.2 + examen4*0.25 + examen5*025);
             System.out.println(notaFinal);
        }
        
        
	public void calcularExamenesClasicos() { // Aqui introduces las notas de los examenes clasicos
          int notaExamenesClasicos=0;
          	System.out.println("Introduce tu nota: ");
          		notaExamenesClasicos=stdin.nextInt();
		  	if (notaExamenesClasicos<=10) {
		  		System.out.println("Tu nota es de " + notaExamenesClasicos);
		  	}else {
		  		System.out.println("Nota no valida");
		  		return;
		  	}
	  
    }
	
	
	public void calcularExamenesTest(){ // Aqui se calcula las notas de los examenes test.
		int notaExamenesTest=0, aciertos=0, fallos=0, puntosPerdidos=0;
			System.out.println("Insterta tus aciertos: ");
				aciertos=stdin.nextInt();
			System.out.println("Inserta tus fallos: ");
				fallos=stdin.nextInt();
			if(fallos > 0) {
				puntosPerdidos = fallos/3;
				System.out.println("Has tenido fallos. Pierdes " + puntosPerdidos);
			}else{
				System.out.println("No has tenido fallos");
			}
				System.out.println();
				notaExamenesTest=(aciertos-puntosPerdidos)/3;
				System.out.println("Tu nota en el examen es " + notaExamenesTest);
	}
	
	
        public void presentarTrabajos(int notaFinal){//Para saber si has entregado todos los trabajos.
            int trabajos = 0;
            System.out.println("Introduce tus trabajos entregados: ");
                     trabajos = stdin.nextInt();
			if (trabajos>=3){  //Calcula si lo has entragado todo.				   
                  System.out.println("Lo has entregado todo.");
                  
              } else { /*Si no has entragado todo te ponen la nota por defecto*/
            	  notaFinal = 3;
                  System.out.println("Has suspendido. Tu nota es de " + notaFinal);
                  System.exit(0);
              }
        }
        
        
        public void retrasoTrabajos() {
        	
        }
        
        public static void main(String[] args) {
        
			// TODO code application logic here
        	System.out.println();
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
