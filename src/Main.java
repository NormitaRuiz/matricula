import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import matricula.alumnos.Alumno;
import matricula.cursos.Curso;

public class Main {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		
		List<Curso> listCursos;
		System.out.println("Matricula para serie 100");
		System.out.println("----------------------------------------");
		
		System.out.println("Ingrese la cantidad de vacantes");
		int vacantes  = scanner1.nextInt();
		if (vacantes>0 && vacantes<50) {
			List<Alumno> listAlumnos = new ArrayList<Alumno>();

			for (int i = 0; i < vacantes; i++) {
				Scanner scanner = new Scanner(System.in);
				listCursos = new ArrayList<Curso>()	;
				Alumno alumno = new Alumno();
				System.out.println("ingrese nombre : ");
				String nombre  = scanner.nextLine();
				alumno.setNombre(nombre);
				System.out.println("ingrese codigo : ");
				String codigo  = scanner.nextLine();
				alumno.setCodigoEstudiamte(codigo);
				System.out.println("Cantidad de curso a matricularse : ");
				int cantidadCurso  = scanner.nextInt();
				for (int j = 0; j < cantidadCurso; j++) {
					Scanner scanner2 = new Scanner(System.in);
					Curso curso = new Curso();
					System.out.println("ingrese codigo curso ["+(j+1)+"] : ");
					String codigoCuro  = scanner2.nextLine();
					curso.setCodigo(codigoCuro);
					System.out.println("ingrese credito  curso ["+(j+1)+"]: ");
					String credito  = scanner2.nextLine();
					curso.setCreditos(credito);
					System.out.println("ingrese nombre   curso ["+(j+1)+"]: ");
					String nombreCurso  = scanner2.nextLine();
						curso.setNombre(nombreCurso);
					System.out.println("ingrese semestre   curso ["+(j+1)+"]: ");
					String semestre  = scanner2.nextLine();
					curso.setSemestre(semestre);
					
					listCursos.add(curso);
					
				}
				
				alumno.setListCursos(listCursos);
	
				listAlumnos.add(alumno);
				
			}
			
			for (Alumno alumno : listAlumnos) {
				alumno.cantidadDeCursos();
				alumno.imprimirCursos();
			}
			
			
			
			
		}
		
		
	}

}
