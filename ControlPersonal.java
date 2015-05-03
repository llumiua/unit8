/**
 * 
 */
package unit8.unit8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.lang.System.out;

/**
 * @author Luz Feliciano Sanjuan
 *
 */
public class ControlPersonal{

	private static ArrayList<Persona> personas;
	
	
	private ControlPersonal()
	{
		
	}
	
	public static void main(String[] args)
	{
		Asignatura as1 = new Asignatura("Programacion", 9);
		Asignatura as2 = new Asignatura("Entornos", 6);

		Asignatura as3 = new Asignatura("Sistemas", 5);
		Asignatura as4 = new Asignatura("Lenguaje de marcas", 4);

		Asignatura as5 = new Asignatura("Bases de datos", 5);

		
		Profesor pr1 = new Profesor("Nacho", "111A");
		Profesor pr2 = new Profesor("Rosa", "222B");
		Profesor pr3 = new Profesor("Juan", "333C");
		
		Alumno al1 = new Alumno("Pepe", "444D");
		Alumno al2 = new Alumno("Luz", "555E");
		Alumno al3 = new Alumno("Ana", "666F");
		Alumno al4 = new Alumno("Jose", "777L");
		
		
		
		pr1.anyadirAsignatura(as1);
		pr2.anyadirAsignatura(as2);
		pr3.anyadirAsignatura(as3);
		pr1.anyadirAsignatura(as4);
		
		al1.anyadirAsignatura(as1);
		al1.anyadirAsignatura(as2);
		al2.anyadirAsignatura(as2);
		al2.anyadirAsignatura(as1);
		al2.anyadirAsignatura(as3);
		al3.anyadirAsignatura(as3);
		al3.anyadirAsignatura(as1);
		al4.anyadirAsignatura(as3);
		al4.anyadirAsignatura(as2);
		al1.anyadirAsignatura(as4);
		
		anyadirPersona(pr1);
		anyadirPersona(pr2);
		anyadirPersona(pr3);
		anyadirPersona(al1);
		anyadirPersona(al2);
		anyadirPersona(al3);
		anyadirPersona(al4);
		
		
		ControlPersonal cp1 = new ControlPersonal();
		
		cp1.mostrarListado();

	}
	
	public static void anyadirPersona(Persona p)
	{
		personas.add(p);
	}
	
	public void ordenarPorDni()
	{
		Collections.sort(personas, new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2){
					return p1.getDni().compareTo(p2.getDni());
			}
		});
		
		for(int i = 0; i < personas.size(); i++)
			out.println("Nombre: "+ personas.get(i).getNombre() + "- Dni: " + personas.get(i).getDni());
	}
	
	public void ordenarPorOrdenAlfabetico()
	{
		Collections.sort(personas, new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2){
					return p1.getNombre().compareTo(p2.getNombre());
			}
		});
		
		for(int i = 0; i < personas.size(); i++)
			out.println("Nombre: " + personas.get(i).getNombre()  + "- Dni: " + personas.get(i).getDni());
	}
	
	public void mostrarListado()
	{
		ControlPersonal cp = new ControlPersonal();
		cp.ordenarPorOrdenAlfabetico();
		for(int i = 0; i < personas.size(); i++)
		{
			Persona p;
			p = personas.get(i);
			if(p.esProfesor() == false)
			{
				p.mostrarListadoAsignaturasNota();
				p.ordenarPorAsignatura();
				p.ordenarPorNota();
			}
			else
			{
				cp.ordenarPorDni();
				p.ordenarPorNota();
			}
		}
	}
	
	
	
	
	
}
