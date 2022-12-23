package Ejercicio_tema_4;

public class Switch {

	public static void main(String[] args) {
		var estacion = "Verano";
				switch(estacion) {
				case  "Verano":
					System.out.println("Es Verano");
					break;
				case "Otoño":
						System.out.println("Es Otoño");
						break;
				case "Invierno":
					System.out.println("Es Invierno");
					break;
				case "Primavera":
					System.out.println("Es Primavera");
				default:
						System.out.println("No es ninguna estacion");
				}

	}

}
