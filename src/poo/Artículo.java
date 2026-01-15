package poo;

public class Artículo {
	
	Artículo(String nombre, double precio, int cuantosQuedan) {
		
	if (!nombre.isBlank() ) {
		this.nombre = nombre;
	}
	
	if (precio > 0) {
		this.precio = precio;
	}
	
	if (cuantosQuedan >= 0) {
		this.cuantosQuedan = cuantosQuedan;
	}
}
	
	String nombre;
	double precio;
	final double IVA = 21;
	int cuantosQuedan;
	
}
