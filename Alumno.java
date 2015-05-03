/**
 * 
 */
package unit8.unit8;

/**
 * @author Luz Feliciano Sanjuan
 *
 */
public class Alumno extends Persona{

	public Alumno(String nombre, String dni){
		super(nombre, dni);
	}
	
	public boolean esProfesor()
	{
		return false;
	}

}
