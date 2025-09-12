
package grupotres.trebejos;

public class MenuSalas {

	public static void main(String[] args) {

		String separador = "-----------------------------";

		Cine cine = new Cine();
//
//		Pelicula peli1 = new Pelicula("Dragon BaLL", 110, "+16", 8.50, 01);
//		Pelicula peli2 = new Pelicula("El regreso de los Saian", 115, "+16", 8.55, 01);
//		Pelicula[] peliculas = { peli1, peli2 };

//		Usuario usuario1 = new Usuario("Dani", 13, 20);
//
//		Usuario usuario2 = new Usuario("Juan", 20, 100);
//		Usuario usuario3 = new Usuario("Elia", 40, 100);
//		
//		
//		Usuario[] usuarios = { usuario1, usuario2, usuario3 };
		

		

		Usuario usuario = Usuario.crearUsuario() ; //Crea el usuario
		usuario.muestraUsuario();	
		//Muestra los datos del usuario creado

		
		SalaDeCine [] salas = SalaDeCine.crearSala();
		
		for (SalaDeCine salaDeCine : salas) {
			salaDeCine.verTodasLasSalas();	//Sale todas las salas que tiene el cine
		}
		
		int numeroEntradaDeseado = SalaDeCine.pedirCantidadEntradas();
		
		System.out.println("\nSalas disponibles con tu cantidad de personas:");
		for (SalaDeCine salaDeCine : salas) {
			salaDeCine.verSalasDisponibles(numeroEntradaDeseado);	//SOLO sale b y c pq no hay espacio disponible en sala a
		}
		
		

	}

	// METODOS
	
	
}
