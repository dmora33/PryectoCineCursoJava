package grupotres.trebejos;

public class SalaDeCine {
	
	// atributos
	private String codigo;
	private int capacidad=25;
	private Pelicula pelicula;
	// cambio  a boolean para que las butacas solo tengan valor ocupado o libre, único tamaño [5][5]
	private boolean butacas[][]=new boolean[5][5];
		
	
	//  CONSTRUTOR


	public SalaDeCine(String codigo,Pelicula pelicula) {
		super();
		this.codigo = codigo;
		
		this.pelicula = pelicula;
		
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
	
	
	// añadimos n de buracas a comprar numeroButacas
	public void comprarButaca(int numeroButacas) {
		int contadorcompras=0;//FIXME: comprobar que numeroButacas no es superior a las butacas libres.
		for (int i = 0; i < butacas.length; i++) {
			
			for (int j=0; j< butacas[i].length; j++) {
				if (butacas[i][j]) {
					butacas[i][j]=true;
					
				}
			}
		}
	}
	
	

	

}
