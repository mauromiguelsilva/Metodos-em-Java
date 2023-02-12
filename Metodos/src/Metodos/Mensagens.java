package Metodos;

public class Mensagens {
	
	public static void obterMensagem(int hora) {
		
		switch (hora) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		
		mensagemBomDia();
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		
		mensagemBoatarde();
		
		break;
		
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 00:
		case 01:
		case 02:
		 mensagemBoaNoite();	
		 break;
		
		default:
			System.out.println("Hora Invalida");
			
			break;
		 
		}
	}

public static void mensagemBomDia() {
	
	System.out.println("Bom Dia");
	
}		
		
public static void mensagemBoatarde() {
	
	System.out.println("Boa Tarde");
	
}		


public static void mensagemBoaNoite() {
	
	System.out.println("Boa Noite");
	
}
	
	}

