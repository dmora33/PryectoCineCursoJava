package grupotres.trebejos;

import java.util.Scanner;

public class SalaDeCine {

	// atributos

	String separador = "\n-----------------------------";
	private String codigoSala;
	private int capacidadSala = 25;
	private Pelicula peliculaSala;
	// cambio a boolean para que las butacas solo tengan valor true ocupado o libre
	// false, único tamaño [5][5]
	private boolean butacas[][] = new boolean[5][5]; // valores false libre , true ocupado

	// CONSTRUTOR

	// añadimos n de buracas a comprar numeroButacas y comparamos para que solo haga
	// el bucle el número de entrdas concreto.

	public SalaDeCine(String codigoSala, Pelicula peliculaSala) {
		super();
		this.codigoSala = codigoSala;
		this.peliculaSala = peliculaSala;
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

	// METODOS

	public void comprarButaca(int numeroEntradaDeseado, int edad, int clasificacion) {

		int contadorEntradas = 0;

//comprobar que el numero de but que queremos comprar no es mayor a las disponibles.
		if (numeroEntradaDeseado <= capacidadSala && contadorEntradas <= numeroEntradaDeseado
				
				&& edad >= clasificacion) {
			
			// entonces podemos cambiar el estado de las butacas
			
			for (int i = 0; i < butacas.length; i++) {
				
				// fatal por acabar el bucle
				for (int j = 0; j < butacas[i].length; j++) {
					if (!butacas[i][j] && numeroEntradaDeseado > contadorEntradas) {
						
						butacas[i][j] = true;
						capacidadSala--;
						
						contadorEntradas++;
//						System.out.println("comprado una entrada");
						// TODO: FALTA POR ACABAR
					}
				}
			}
		}
	}

	public static SalaDeCine[] crearSala() {
		SalaDeCine sala1 = new SalaDeCine("A", Pelicula.crearPelicula()[0]);
		SalaDeCine sala2 = new SalaDeCine("B", Pelicula.crearPelicula()[1]);
		SalaDeCine sala3 = new SalaDeCine("C", Pelicula.crearPelicula()[0]);
		SalaDeCine[] salas = { sala1, sala2, sala3 };

	//	sala1.comprarButaca(5); // Para que inicie la sala 1 con butacas ya ocupadas
		return salas;
	}

	public static int pedirCantidadEntradas() {
		// TODO: FALTA COMPROBRACIONES DE ENTRADA SI EL MAXIMO DE LA SALA ES 25 NO PUEDE
		// PEDIR MAS !!!!
		System.out.println("Cuanto entradas quieres vas a querer para la pelicula:");
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		int numeroEntradaDeseado = scan.nextInt();
		return numeroEntradaDeseado;
	}

	public void verSalasDisponibles(int numeroEntradaDeseado) {

		int entradasDisponibles = getCapacidadSala();
		if (entradasDisponibles > numeroEntradaDeseado) {

			System.out.println(separador);
			System.out.println("\n\nSALA: " + this.getCodigoSala() + "\nCapacidad:" + this.getCapacidadSala());

			this.getPeliculaSala().mostrarPelicula();
			System.out.println(separador);

//						

		}

	}

	public void verTodasLasSalas() {
		System.out.println(separador);
		System.out.println("\n\nSALA: " + this.getCodigoSala() + "\nCapacidad:" + this.getCapacidadSala());

		this.getPeliculaSala().mostrarPelicula();
		System.out.println(separador);
	}

}
