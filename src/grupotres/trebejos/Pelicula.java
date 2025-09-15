package grupotres.trebejos;

import java.util.Scanner;

public class Pelicula {

	private String titulo;
	private int duración; // lo pongo como int por que especifica en minutos!!!!
	private int clasificacion; // int entonces hay que poner un + cadavez q queremos mostrar
	private double precio; // double para poder ganar centimillos...
	private int id; // único para cada película.

	/**
	 * @param pelicula     string
	 * @param duración     int
	 * @param clasificacion string
	 * @param precio       double
	 * @param id           int
	 */
	public Pelicula(String titulo, int duración, int clasificacion, double precio, int id) {
		super();
		this.titulo = titulo;
		this.duración = duración;
		this.clasificacion = clasificacion;
		this.precio = precio;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setPelicula(String titulo) {
		this.titulo = titulo;
	}

	public int getDuración() {
		return duración;
	}

	public void setDuración(int duración) {
		this.duración = duración;
	}

	public int getClasificacion() {
		return clasificacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void Precio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	// METODOS
	public static Pelicula[] crearPelicula() {
		Pelicula peli1 = new Pelicula("Dragon BaLL", 110, 18 , 8.50, 01);
		Pelicula peli2 = new Pelicula("El regreso de los Saian", 115, 0 , 8.55, 02);
		Pelicula[] peliculas = { peli1, peli2 };
		return peliculas;

	}

	public void mostrarPelicula() {

		System.out.println("\nTitulo:\t" + titulo + "\nClasificación:\t+" + clasificacion + "\nDuración:\t"
				+ this.duración + "\nPrecio:\t\t" + this.precio + "\nIdentificador:\t" + this.id);

	}
	
	public static void elegirPelicula(Usuario usuario) {
		Pelicula[] peliculas = crearPelicula();
		System.out.println("Que pelicula quieres ver?\n\tPORFAVOR ESCRIBE EL ID DE LA PELICULA"  );
		Scanner scan = new Scanner(System.in);
		int peliElegido = scan.nextInt();
		int i=0;
		int j=1;
		int peliCantidad = crearPelicula().length;
		for (Pelicula pelicula : peliculas) {
				if(peliElegido == j) {
					if(usuario.getEdad() == crearPelicula()[i].getClasificacion() ) {
					System.out.println("Has elegido la pelicula " + crearPelicula()[i].getTitulo());
					} else {
						System.err.println("Eres demasiado joven para esta pelicula");
						
					}
					
				}
				i++;
				j++;
		}
//		while (i< peliCantidad) {
//			if(peliElegido) {
//				if(peliElegido == j) {
//					System.out.println("Has elegido la pelicula " + crearPelicula()[i].getTitulo());
//				}
//			}
//			
//
//			i++;
//			j++;
//		}
	}

}
