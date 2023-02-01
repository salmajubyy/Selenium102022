package ejemplos;

public class Ejemplo_Demos {

	public static void main(String[] args) {
		Ejemplo_Demo_Vehiculo minivan = new Ejemplo_Demo_Vehiculo();
		int rango;
		
		//Asignar los valores a los campos minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango " + rango + " Kilometros");

		Ejemplo_Demo_Vehiculo carro = new Ejemplo_Demo_Vehiculo();
		carro.pasajeros = 4;
		
		System.out.println("El carro puede llevar " + carro.pasajeros + " pasajeros");
		
	}

}
