package Metodos2;

public class Qaudrilatero {
	
	public static void area(double lado) {
		
		System.out.println("A area do quadrado � : " + lado * lado);
		
	}
	
	
	public static void area(double lado1,double lado2) {
		
		System.out.println("A area do triangulo � : " + lado1 * lado2);
		
	}
	
	
	
	public static void area(double baseMaior,double baseMenor, double altura) {
		
		 System.out.println("�rea do trap�zio : " + ((baseMaior+baseMenor)*altura) / 2);
		
	}

	
    public static void area(float diagonal1, float diagonal2) {

        System.out.println("�rea do losango:" + (diagonal1 * diagonal2)/2);
    }
}
