
package grupotres.trebejos;

public class MenuSalas {

	public static void main(String[] args) {

		String separador = "-----------------------------";

		Cine cine = new Cine();

		Pelicula peli1 = new Pelicula("Dragon BaLL", 110, "+16", 8.50, 01);
		Pelicula peli2 = new Pelicula("El regreso de los Saian", 115, "+16", 8.55, 01);
		Pelicula[] peliculas = { peli1, peli2 };

		Usuario usuario1 = new Usuario("Dani", 13, 20);

		Usuario usuario2 = new Usuario("Juan", 20, 100);
		Usuario usuario3 = new Usuario("Elia", 40, 100);
		Usuario[] usuarios = { usuario1, usuario2, usuario3 };

		SalaDeCine sala1 = new SalaDeCine("A", peli2);
		SalaDeCine sala2 = new SalaDeCine("B", peli1);
		SalaDeCine sala3 = new SalaDeCine("C", peli2);
		SalaDeCine[] salas = { sala1, sala2, sala3 };

		sala1.comprarButaca(4);
		
		for (SalaDeCine sala : salas) {
			System.out.println(separador);
			System.out.println("\n\nSALA: " + sala.getCodigoSala() + "\nCapacidad:" + sala.getCapacidadSala());

			sala.getPeliculaSala().mostrarPelicula();
			System.out.println(separador);
//			for (Pelicula pelicula : peliculas) {
//				pelicula.mostrarPelicula();
//				
//				
//			}
		}

	}

	// METODOS

}
