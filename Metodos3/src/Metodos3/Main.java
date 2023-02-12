package Metodos3;

public class Main {
	
	public static void main(String [] args) {
		
		double areaQuadrado = Quadrilatero.area(5);
		System.out.println("Area quadrado : " + areaQuadrado);
		
		double areaTriangulo = Quadrilatero.area(6, 7);
		System.out.println("Area triangulo : " + areaTriangulo);
		
		double areaTrapezio = Quadrilatero.area(5, 6, 7);
		System.out.println("Area trapezio : " + areaTrapezio);
		
	}

}
