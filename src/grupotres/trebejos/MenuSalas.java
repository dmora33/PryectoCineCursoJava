
package grupotres.trebejos;

public class MenuSalas {

	public static void main(String[] args) {

		String separador = "-----------------------------";

		Cine cine = new Cine();
		

//TODO: tenemos que hacer un metodo para que los usuarios segun se creen se les sume contador al nomebre.
		Usuario usuario = Usuario.crearUsuario() ; //Crea el usuario
		usuario.muestraUsuario();//Muestra los datos del usuario creado

		
		SalaDeCine [] salas = SalaDeCine.crearSala();
		
		for (SalaDeCine salaDeCine : salas) {
			salaDeCine.verTodasLasSalas();	//Sale todas las salas que tiene el cine
		}
		
		int numeroEntradaDeseado = SalaDeCine.pedirCantidadEntradas();
		
		System.out.println("\nSalas disponibles con tu cantidad de personas:");
		
		for (SalaDeCine salaDeCine : salas) {
//			if(usuario.validarEdadClasificacion(usuario, salaDeCine.getPeliculaSala()) == true) { //solo si el usuario es mayor de lo que permite la pelicula le sale como opcion
				salaDeCine.verSalasDisponibles(numeroEntradaDeseado);
			}	//SOLO sale b y c pq no hay espacio disponible en sala a
//		}
		
		Pelicula.elegirPelicula(usuario);
		
		
	}

	// METODOS
//	public boolean validarEdadClasificacion(Usuario usuario, Pelicula pelicula) {
//		boolean puedeComprar;
//		if(usuario.getEdad() >= pelicula.getClasificaion()) {
//			puedeComprar = true; //true significa que puede comprar una pelicula por su edad
//		}
//		else {
//			puedeComprar = false;
//			System.err.println("Niñato crece"); //false es que la peli necesita un edad mayor al que tiene el usuario para comprar la pelicula
//		}
//		return puedeComprar;
//	}
	
}
