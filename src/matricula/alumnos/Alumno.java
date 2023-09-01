package matricula.alumnos;

import java.util.Iterator;
import java.util.List;

import matricula.cursos.Curso;

public class Alumno {
	private String codigoEstudiamte;
	private String nombre;
	private String apellido;
	private String serie;
	private List<Curso> listCursos;
	
	public String getCodigoEstudiamte() {
		return codigoEstudiamte;
	}
	public void setCodigoEstudiamte(String codigoEstudiamte) {
		this.codigoEstudiamte = codigoEstudiamte;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public List<Curso> getListCursos() {
		return listCursos;
	}
	public void setListCursos(List<Curso> listCursos) {
		this.listCursos = listCursos;
	}
	
	
	public void cantidadDeCursos() {
		System.out.println("La cantidad de curso del alumno "+nombre+"  es :::"+listCursos.size());
	}
	
	public void imprimirCursos() {
		System.out.println("--------------LISTADO DE CURSOS---------------------------");
		for (Curso curso : listCursos) {
			System.out.println("codigo : "+curso.getCodigo()+"/ nombre : "+curso.getNombre());
		}
	}
	
	
	
}
