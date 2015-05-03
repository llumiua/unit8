/**
 * 
 */
package unit8.unit8;

/**
 * @author Luz
 *
 */
public class Profesor extends Persona{
	
	public Profesor(String nombre, String dni)
	{
		super(nombre,dni);
	}
	
	public boolean esProfesor()
	{
		return true;
	}

}
