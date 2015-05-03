/**
 * 
 */
package unit8.unit8;

/**
 * @author Luz
 *
 */
public class Asignatura {
	String nombre;
	double nota;
	
	public Asignatura(String nombre, double nota)
	{
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public double getNota()
	{
		return nota;
	}
	
	public void SetNota(double nota)
	{
		this.nota = nota;
	}
}
