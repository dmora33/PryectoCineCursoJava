package grupotres.trebejos;

public class SalaDeCine {

	// atributos
	private String codigoSala;
	private int capacidadSala = 25;
	private Pelicula peliculaSala;
	// cambio a boolean para que las butacas solo tengan valor true ocupado o libre
	// false, único tamaño [5][5]
	private boolean butacas[][] = new boolean[5][5]; // valores false libre , true ocupado

	// CONSTRUTOR

	// añadimos n de buracas a comprar numeroButacas y comparamos para que solo haga
	// el bucle el número de entrdas concreto.
	public void comprarButaca(int numeroButacas) {

		int contadorEntradas = numeroButacas;

//comprobar que el numero de but que queremos comprar no es mayor a las disponibles.
		if (numeroButacas <= capacidadSala && contadorEntradas <= numeroButacas) {
			// entonces podemos cambiar el estado de las butacas
			for (int i = 0; i < butacas.length; i++) {
				// fatal por acabar el bucle
				for (int j = 0; j < butacas[i].length; j++) {
					if (butacas[i][j]) {
						butacas[i][j] = true;
						capacidadSala--;
						contadorEntradas++;
						// TODO: FALTA POR ACABAR
					}
				}
			}
		}
	}

	public SalaDeCine(String codigoSala, int capacidadSala, Pelicula peliculaSala, boolean[][] butacas) {
		super();
		this.codigoSala = codigoSala;
		this.capacidadSala = capacidadSala;
		this.peliculaSala = peliculaSala;
		this.butacas = butacas;
	}

	public int getCapacidadSala() {
		return capacidadSala;
	}

	public void setCapacidadSala(int capacidadSala) {
		this.capacidadSala = capacidadSala;
	}

	public Pelicula getPeliculaSala() {
		return peliculaSala;
	}

	public void setPeliculaSala(Pelicula peliculaSala) {
		this.peliculaSala = peliculaSala;
	}

	public boolean[][] getButacas() {
		return butacas;
	}

	public void setButacas(boolean[][] butacas) {
		this.butacas = butacas;
	}

	public String getCodigoSala() {
		return codigoSala;
	}

}
