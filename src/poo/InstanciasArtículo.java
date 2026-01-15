
package poo;

public class InstanciasArtículo {

	public static void main(String[] args) {
		
		Artículo articulo1 = new Artículo("Pijama",10,8);
		Artículo articulo2 = new Artículo("Zapato",-20,4);
		
		mostrar(articulo1);
		mostrar(articulo2);
		
	}
	
	static void mostrar(Artículo articulo) {
		System.out.println("---------------------------------------------------------");
		System.out.println(articulo.nombre + " --- " + " Precio (WO/IVA) : " + articulo.precio + " IVA: " + articulo.IVA + "%" + " PVP: " + ((articulo.precio*articulo.IVA)/100 + articulo.precio));
		System.out.println("---------------------------------------------------------");
	}

}
