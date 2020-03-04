package notasalumno;
/* Programa notas alumno
 * Version 2.3*/
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
		int notaExamenesTest, aciertos, fallos, puntosPerdidos=0, examenesTest, pregRestantes;
	    System.out.println("EXAMENES TIPO TEST");
		for(examenesTest=1;examenesTest<=2;examenesTest++) {
			System.out.println("EXAMEN TIPO TEST " + examenesTest);
			System.out.println("Insterta tus aciertos: ");
				aciertos=stdin.nextInt();
				if(aciertos>30) {
					System.out.println("ERROR. No hay tantas preguntas");
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
				System.out.println("Tu nota en el examen es " + notaExamenesTest);
                        sumaExamenesTest=sumaExamenesTest + notaExamenesTest;
                        System.out.println("Suma total de tus examenes test " + sumaExamenesTest);
	}
		return 0;
		}
                
	
	
        public void presentarTrabajos(){//Para saber si has entregado todos los trabajos.
          
            System.out.println("Introduce tus trabajos entregados: ");
                     trabajos = stdin.nextInt();
			if (trabajos>=3){  //Calcula si lo has entragado todo.				   
                  System.out.println("Lo has entregado todo.");
                  notaFinal = (sumaExamenesClasicos/3)*0.5 + (sumaExamenesTest/2)*0.5;
                  System.out.println("Tu nota es: " + notaFinal);
              } else { /*Si no has entragado todo te ponen la nota por defecto*/
            	  notaFinal = 3;
                  System.out.println("Has suspendido. Tu nota es de " + notaFinal);
                  
              }
        }
        
        
        public void calcularRetrasoTrabajos() { //Penalizacion si hay retraso en una entraga de un trabajo
        	int dias;
        	System.out.println("Insterta los dias de retraso: ");
        		dias=stdin.nextInt();
        	if(dias>5) {
        		System.out.println("Trabajo no entregado");
        		notaFinal=3;
                System.out.println("Has suspendido. Tu nota final es de " + notaFinal);
        	}else{
        		notaFinal=notaFinal-(dias*0.1);
        		System.out.println("La nota final del alumno " + alumnos + " es " + notaFinal);
        			
        	}
        	sumaExamenesClasicos=0;
			sumaExamenesTest=0;
			notaFinal=0;
        }
        
        public static void main(String[] args) {
			// TODO code application logic here
        	NotasAlumno Alumno = new NotasAlumno();
                System.out.println("¡Bienvenido!");
                System.out.println("Este es un programa para calcular las notas de 10 alumnos. Por favor, insterte las notas a continuación");
         	for(alumnos = 1; alumnos <= 10; alumnos++){
         		System.out.println("ALUMNO " + alumnos);
        		Alumno.calcularExamenesClasicos();
        		Alumno.calcularExamenesTest();
        		Alumno.presentarTrabajos();
        		Alumno.calcularRetrasoTrabajos();
        	}

        }
}


------------------------
package notasalumno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
public class NotasalumnoIn {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasalumnoIn window = new NotasalumnoIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasalumnoIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 511, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Bienvenido Alumno");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Inserta tus notas correspondientes");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_2 = new JLabel("Examenes Clasicos");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Examenes Test");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_4 = new JLabel("Trabajos");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_5 = new JLabel("Examen 1");
		
		JLabel lblNewLabel_5_1 = new JLabel("Examen 2");
		
		JLabel lblNewLabel_5_2 = new JLabel("Examen 3");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5_3 = new JLabel("Examen 1 Test");
		
		JLabel lblNewLabel_5_4 = new JLabel("Examen 2 Test");
		
		JLabel lblNewLabel_6 = new JLabel("Aciertos");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Errores");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Trabajos entregados");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblNewLabel_9 = new JLabel("Dias de retraso");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblNewLabel_10 = new JLabel("NOTA FINAL");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_5_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_5_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(lblNewLabel_6)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_4, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_6, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_10)
						.addComponent(separator_1)
						.addComponent(separator_2))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(11)
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_5_3)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_5_4)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(52)
									.addComponent(lblNewLabel_6))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(lblNewLabel_8)))
					.addGap(18)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_10)
					.addGap(66))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
