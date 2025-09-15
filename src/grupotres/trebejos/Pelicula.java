package grupotres.trebejos;

public class Pelicula {

	private String titulo;
	private int duración; // lo pongo como int por que especifica en minutos!!!!
	private String clasificaion; // string para no tener que estar añadiedo un + cadavez q queremos mostrar
	private double precio; // double para poder ganar centimillos...
	private int id; // único para cada película.

	/**
	 * @param pelicula     string
	 * @param duración     int
	 * @param clasificaion string
	 * @param precio       double
	 * @param id           int
	 */
	public Pelicula(String titulo, int duración, String clasificaion, double precio, int id) {
		super();
		this.titulo = titulo;
		this.duración = duración;
		this.clasificaion = clasificaion;
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

	public String getClasificaion() {
		return clasificaion;
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
		Pelicula peli1 = new Pelicula("Dragon BaLL", 110, "+18", 8.50, 01);
		Pelicula peli2 = new Pelicula("El regreso de los Saian", 115, "todas las edades", 8.55, 01);
		Pelicula[] peliculas = { peli1, peli2 };
		return peliculas;

	}

	public void mostrarPelicula() {

		System.out.println("\nTitulo:\t" + titulo + "\nClasificación:\t" + clasificaion + "\nDuración:\t"
				+ this.duración + "\nPrecio:\t\t" + this.precio + "\nIdentificador:\t" + this.id);

	}

}
