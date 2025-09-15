package grupotres.trebejos;

import java.util.Scanner;

public class Usuario {

	private String nombre;
	private int edad;
	private double saldo;

	// CONSTRUCTOR

	public Usuario(String nombre, int edad, double saldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}

	public Usuario() {

	}

	// GET&SET

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getSaldo() {
		return saldo;
	}

//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	// METODOS

	public void muestraUsuario() {
		System.out.println("USUARIO:\n\tNombre:\t" + nombre + "\n\tEdad:\t" + edad + "\n\tSaldo:\t" + saldo);
	}

//	public void crearUsuario() {
//
//		Usuario usuario = new Usuario(this.nombre, this.edad, this.saldo);
//	}

	public static String pedirNombre() {
		System.out.println("Bien benido!\nVamos a pedirte tus datos personales;\n \nEscribe tu nónmbre:");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.next();
		// quitamos los espacios tanto de alante como de atras
		nombre = nombre.strip();
		return nombre;
	}

	public static int pedirEdad() {
		System.out.println("Escribre tu edad:");

		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);

		int edad = scan.nextInt();
		while (edad < 0 && edad > 120) {
			// TODO FALTA añadir que no meta caracteres solo numeros.
			System.err.println("edad no valida, vuelve a introduzirla");
			System.out.print("\nEscribre tu edad:");
			scan = new Scanner(System.in);
			edad = scan.nextInt();
		}

		return edad;
	}

	public static double pedirSaldo() {

		System.out.println("Cuanto saldo quieres vas a añadir a tu cuenta:");

		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		double saldo = scan.nextInt();
		while (saldo <= 0) {
			//   mientras saldo menor q cero... otra vez pedir
			
			System.out.println("nen saldo erroneo, porfavor introduce un saldo correcto");
			scan = new Scanner(System.in);
			saldo = scan.nextInt();
			// TODO por acabar

		}
		return saldo;

	}
	
	public boolean validarEdadClasificacion(Usuario usuario, Pelicula pelicula) {
		boolean puedeComprar;
		if(usuario.getEdad() >= pelicula.getClasificacion()) {
			puedeComprar = true; //true significa que puede comprar una pelicula por su edad
		}
		else {
			puedeComprar = false;
			System.err.println("Niñato crece"); //false es que la peli necesita un edad mayor al que tiene el usuario para comprar la pelicula
		}
		return puedeComprar;
	}

	public static Usuario crearUsuario() {
		Usuario usuario = new Usuario(pedirNombre(), pedirEdad(), pedirSaldo());
		System.out.println(usuario.getEdad());
		return usuario;
	}

}
