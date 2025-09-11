package grupotres.trebejos;

public class SalaDeCine {
	
	// atributos
	private String codigo;
	private int capacidad;
	private Pelicula pelicula;
	// cambio  a boolean para que las butacas solo tengan valor ocupado o libre, único tamaño [5][5]
	private boolean butacas[][]=new boolean[5][5];
		
	
	//  CONSTRUTOR

	
	public SalaDeCine(String codigo, Pelicula pelicula) {
		super();
		this.codigo = codigo;
		this.capacidad = capacidad;
		this.pelicula = pelicula;
		this.butacas = butacas;
	}
	//	get and set
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}


	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}


	public boolean[][] getButacas() {
		return butacas;
	}


	public void setButacas(boolean[][] butacas) {
		this.butacas = butacas;
	} 
	
	
	
	

	

}
