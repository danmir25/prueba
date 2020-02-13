package notasalumno;
/* Programa notas alumno
 * Version 1.1*/
public class NotasAlumno {
	
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

}
