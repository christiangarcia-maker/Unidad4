package poo;

public class Artículo {
	
	String nombre;
	double precio;
	int iva;
	int cuantosQuedan;
	
	public Artículo(String nombre, double precio,int iva, int cuantosQuedan) {
		setNombre(nombre);
		setPrecio(precio);
		setIva(iva);
		setCuantosQuedan(cuantosQuedan);
}
	
	public void setNombre (String nombre) {
		if (!nombre.isBlank()) {
			this.nombre = nombre.trim();
		}
	}
	
	public void setPrecio (double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	public void setIva (int iva) {
		if (iva > 0 && iva < 100) {
			this.iva = iva;
		}

	}
	
	public void setCuantosQuedan (int cuantosQuedan) {
		if (cuantosQuedan > 0) {
			this.cuantosQuedan = cuantosQuedan;
		}

	}

}