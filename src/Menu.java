package trabajoUnidad6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
	// Array de Alumnos
	private Alumno[] listaAlumnosArray = new Alumno[3];

	// ArrayList de Alumnos
	private List<Alumno> listaAlumnosArrayList = new ArrayList<Alumno>();

	// Scanner
	private Scanner sc = new Scanner(System.in);

	// Usamos la configuración de USA para puntos y comas
	public Menu() {
		sc.useLocale(java.util.Locale.US);
	}

	// Metodo para agregar alumnos al arraysList
	public void agregarAlumnoArrayList(Alumno a) {
		listaAlumnosArrayList.add(a);
	}

	// Metodo para buscar alumnos en el arrayList
	public Alumno buscarAlumno(String alu) {
		// Usamos un bucle for-each para recorrer la lista
		for (Alumno alum : listaAlumnosArrayList) {
			// Comparamos el alumno del array con el pasado como parametro
			if (alum.getNombre().equalsIgnoreCase(alu)) {
				System.out.println("**********El alumno " + alu + " ha sido encontrado**********\nSus datos:\nNombre: "
						+ alum.getNombre() + "\nEdad: " + alum.getEdad() + "\nNota Media: " + alum.getNotaMedia());
				return alum;
			}

		}
		System.out.println("Alumno no encontrado");
		return null;

	}

	// Pantalla de inicio del programa
	public void pantallaPrincipal() {
		boolean salirDelPrograma = false;

		System.out.println("----------BIENVENIDO AL GESTOR DE ALUMNOS----------\n");
		while (!salirDelPrograma) {
			try {
				int opcionElegidaDeArrays;
				// Opciones para trabajar con array o arrayList
				do {
					System.out.println(
							"[1]-Trabajar con Arrays\n[2]-Trabajar con ArraysList\n[3]-Salir del Programa\n\nMarque su elección: ");
					opcionElegidaDeArrays = sc.nextInt();
					sc.nextLine();
				} while (opcionElegidaDeArrays < 1 || opcionElegidaDeArrays > 3);

				if (opcionElegidaDeArrays == 1) {
					menuDeArrays();
					// salirDelPrograma = true;
				} else if (opcionElegidaDeArrays == 2) {
					menuArrayList();

				} else if (opcionElegidaDeArrays == 3) {
					System.out.println("**********HASTA LUEGO**********");
					salirDelPrograma = true;
				}

			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un número válido");
				sc.nextLine();
			}
		}
		// Al cerrar el programa cerramos el Scanner
		sc.close();

	}

	// Menu de array
	public void menuDeArrays() {
		boolean salir = false;

		while (!salir) {
			try {
				int opcionElegidaArray;

				do {
					System.out.println(
							"\n**********Eligio trabajar con Arrays**********\nPuede agregar un máximo de 3 Alumnos\n");
					System.out.println(
							"[1]-Agregar a estudiante\n[2]-Ver todos los estudiantes almacenados\n[3]-Volver al menu principal\n");
					opcionElegidaArray = sc.nextInt();
					sc.nextLine();
				} while (opcionElegidaArray < 1 || opcionElegidaArray > 3);

				switch (opcionElegidaArray) {
				case 1:
					boolean insertado = false;

					for (int i = 0; i < listaAlumnosArray.length; i++) {
						if (listaAlumnosArray[i] == null) {
							System.out.println("Ingrese nombre del Alumno\n");
							String nombre = sc.nextLine();

							System.out.println("Ingrese edad del Alumno");
							int edad = sc.nextInt();
							sc.nextLine();

							System.out.println("Ingrese nota media del Alumno");
							double notaMedia = sc.nextDouble();
							sc.nextLine();

							listaAlumnosArray[i] = new Alumno(nombre, edad, notaMedia);
							System.out.println("El Alumno " + nombre + " ha sido agregado correctamente\n");

							insertado = true;
							break;
						}

					}
					if (!insertado) {
						System.out.println("No se pudo agregar el Alumno, lista llena\n");
						break;
					}
					break;

				case 2:
					System.out.println("Lista de todos los estudiantes\n");
					for (Alumno alu : listaAlumnosArray) {
						if (alu != null) {
							System.out.println("***********************");
							System.out.println(alu);
							System.out.println("***********************\n");
						}

					}
					break;

				case 3:
					salir = true;

					break;

				}

				// Manejo de excepciones
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un número válido\n\n");
				sc.nextLine();
			}

		}

	}

	// Menu de arrayList
	public void menuArrayList() {
		boolean salir = false;

		while (!salir) {
			try {
				int opcionElegidaDeArraysList;
				
				do {
					System.out.println("\n**********Eligio trabajar con ArraysList**********\n");
					System.out.println(
							"[1]-Agregar a estudiante\n[2]-Ver todos los estudiantes almacenados\n[3]-Eliminar a un estudiante\n"
									+ "[4]-Buscar estudiante\n[5]-Volver al menu principal\n");
					opcionElegidaDeArraysList = sc.nextInt();
					sc.nextLine();
				} while(opcionElegidaDeArraysList < 1 || opcionElegidaDeArraysList > 5);
				

				switch (opcionElegidaDeArraysList) {
				case 1:

					System.out.println("Ingrese nombre del Alumno\n");
					String nombre = sc.nextLine();

					System.out.println("Ingrese edad del Alumno");
					int edad = sc.nextInt();
					sc.nextLine();

					System.out.println("Ingrese nota media del Alumno");
					double notaMedia = sc.nextDouble();
					sc.nextLine();

					agregarAlumnoArrayList(new Alumno(nombre, edad, notaMedia));

					break;

				case 2:
					System.out.println("Lista de todos los estudiantes\n");

					if (listaAlumnosArrayList.isEmpty()) {
						System.out.println("La lista esta vacia");

					} else {
						for (Alumno alu : listaAlumnosArrayList) {
							System.out.println(alu);
						}
					}
					break;

				case 3:
					System.out.println("Ingrese nombre del Alumno que desea eliminar\n");
					String nombreAEliminar = sc.nextLine();

					boolean eliminado = false;
					Iterator<Alumno> it = listaAlumnosArrayList.iterator();

					while (it.hasNext()) {
						Alumno alumnoActual = it.next();
						if (alumnoActual.getNombre().equalsIgnoreCase(nombreAEliminar)) {
							it.remove();
							eliminado = true;
						}

					}

					if (eliminado) {
						System.out.println("El Alumno " + nombreAEliminar + " ha sido eliminado");

					} else {
						System.out.println("El Alumno " + nombreAEliminar + " no existe en nuestra base de datos");
					}

					break;

				case 4:
					System.out.println("Ingrese nombre del Alumno que desea buscar\n");
					String nombreAlumnoABuscar = sc.nextLine();

					buscarAlumno(nombreAlumnoABuscar);

					break;

				case 5:
					salir = true;
					break;

				}

				// Manejo de excepciones
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un número válido\n\n");
				sc.nextLine();
			}
		}
	}

}
