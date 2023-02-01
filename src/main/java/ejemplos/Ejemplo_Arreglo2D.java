package ejemplos;

import java.util.Iterator;

public class Ejemplo_Arreglo2D {

	public static void main(String[] args) {
		int arr[][] = {{2 , 7 , 9 }, {3 , 6 , 1}, {7 , 4 , 5}};
		//System.out.println(arr[1][2]);
		
		for (int i = 0; i <3; i++ ) {
			for (int j = 0; j <3; j++ ) {
					System.out.print(arr[i][j] + " ");//"PRINT" en la misma linea
				}
			
			System.out.println();
			}
			
		}
	}


