package poo;

public class InstanciasRectangulo {

	public static void main(String[] args) {
		Rectangulo rectángulo1 = new Rectangulo ();
		Rectangulo rectángulo2 = new Rectangulo ();
		int[] r1 = new int [2];
		int[] r2 = new int [2];
		
		rectángulo1.x1 = 0;
		rectángulo1.y1 = 0;
		rectángulo1.x2 = 5;
		rectángulo1.y2 = 5;
		
		rectángulo2.x1 = 7;
		rectángulo2.y1 = 9;
		rectángulo2.x2 = 2;
		rectángulo2.y2 = 3;
		
		r1[0] = rectángulo1.x1 > rectángulo1.x2 ? rectángulo1.x1 - rectángulo1.x2 : rectángulo1.x2 - rectángulo1.x1;
		r1[1] = rectángulo1.y1 > rectángulo1.y2 ? rectángulo1.y1 - rectángulo1.y2 : rectángulo1.y2 - rectángulo1.y1;

		r2[0] = rectángulo2.x1 > rectángulo2.x2 ? rectángulo2.x1 - rectángulo2.x2 : rectángulo2.x2 - rectángulo2.x1;
		r2[1] = rectángulo2.y1 > rectángulo2.y2 ? rectángulo2.y1 - rectángulo2.y2 : rectángulo2.y2 - rectángulo2.y1;
		
		System.out.println("PRIMER RECTÁNGULO");
		System.out.println("Las coordenadas son: (" + rectángulo1.x1 + "," + rectángulo1.y1 + ") " + " (" + rectángulo1.x2 + "," + rectángulo1.y2 + ")");
		System.out.println("Perímetro: " + (r1[0]*2 + r1[1]*2));
		System.out.println("Área: " + (r1[0]*r1[1]));

		System.out.println("====================");
		
		System.out.println("SEGUNDO RECTÁNGULO");
		System.out.println("Las coordenadas del segundo rectángulo son: (" + rectángulo2.x1 + "," + rectángulo2.y1 + ") " + " (" + rectángulo2.x2 + "," + rectángulo2.y2 + ")");
		System.out.println("Perímetro: " + (r2[0]*2 + r2[1]*2));
		System.out.println("Área: " + (r2[0]*r2[1]));

	}

}
