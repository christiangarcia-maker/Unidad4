package poo;

public class InstanciasArtículo {

	public static void main(String[] args) {
		
		Artículo tarjeta = new Artículo();
		
		tarjeta.nombre = "Tarjeta LOL";
		tarjeta.precio = 10;
		tarjeta.cuantosQuedan = 4;
		
		double precioIva = ((tarjeta.precio*tarjeta.IVA)/100 + tarjeta.precio);
		
		System.out.println(tarjeta.nombre + " --- " + " Precio (WO/IVA) : " + tarjeta.precio + " IVA: " + tarjeta.IVA + "%" + " PVP: " + precioIva);
		
	}

}
