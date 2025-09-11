package grupotres.trebejos;

public class Usuario {

	private String nombre;
	private int edad;
	private double saldo;
	
	
	
	//CONSTRUCTOR
	
	public Usuario(String nombre, int edad, double saldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.saldo= saldo;
	}



	//GET&SET
	
	public String getNombre() {
		return nombre;
	}



//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	

	//METODOS 
	
	public void muestraUsuario() {
		System.out.println("NOMBRE: " + nombre + "\nEDAD: " + edad + "\nSaldo: " + saldo);
	}
	
}

