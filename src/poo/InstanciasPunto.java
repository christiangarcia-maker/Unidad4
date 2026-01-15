package poo;

public class InstanciasPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto(5,0);
		Punto punto2 = new Punto(10,10);
		Punto punto3 = new Punto(-3,7);
		
		System.out.println(punto1.x + " " + punto1.y);
		System.out.println(punto2.x + " " + punto2.y);
		System.out.println(punto3.x + " " + punto3.y);
		
		punto1.x += 4;
		punto1.y += 3;

		punto2.x -= 2;
		punto2.y /= 2;
		
		punto3.x += 4;
		punto3.y *= 2;
		
		System.out.println("Las coordenadas han cambiado");
		
		System.out.println(punto1.x + " " + punto1.y);
		System.out.println(punto2.x + " " + punto2.y);
		System.out.println(punto3.x + " " + punto3.y);
	}

}
