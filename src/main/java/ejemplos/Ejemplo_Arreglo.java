package ejemplos;

import java.util.Iterator;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2;
		
		byte byteArray[];
		boolean booleanArray[];
		
		//declarando y array de string
		String[] arr;
		
		//asignar memoria para 5 posiciones
		arr = new String[5];
		
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";

		//System.out.println("Elemento en el indice 3: " + arr[3]);
		
		for (int i = 0; i < arr.length; i++) { // .length es una funcion de java que nos regresa la longtud del arreglo
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
			
			
		}
	}

}
