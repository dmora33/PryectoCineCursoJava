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

	// GET&SET

	public String getNombre() {
		return nombre;
	}

//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	// METODOS

	public void muestraUsuario() {
		System.out.println("NOMBRE: " + nombre + "\nEDAD: " + edad + "\nSaldo: " + saldo);
	}

	public Usuario inicioUsuario() {
		System.out.println("Bien benido!\nVamos a pedirte tus datos personales;\n \nEscribe tu nónmbre:");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.next();
		
		// primero empezamos con las validaciones de los datos NOMBRE
		nombre= nombre.strip();
		System.out.println("Escribre tu edad:");
		scan = new Scanner(System.in);
		int edad = scan.nextInt();
		while ( edad<0 && edad>120) {
			// TODO FALTA añadir que no meta caracteres solo numeros.
			System.err.println("edad no valida, vuelve a introduzirla");
			System.out.print("\nEscribre tu edad:");
			scan = new Scanner(System.in);
			edad = scan.nextInt();
		}
		System.out.println("Cuanto saldo quieres vas a añadir a tu cuenta:");
		scan = new Scanner(System.in);
		int saldo = scan.nextInt();
		if (saldo=<0) { 
			// TODO por acabar
			
			
		}
		Usuario usuario = new Usuario(nombre, edad, saldo);
		
		System.out.println("Dime tu nombre;");
		
		 
	}
}
