
/*Juego de Gato
Juego que consiste en que cada jugador tomara un turno alternado con el otro y colorocara en cada turno
una ficha en una posicion del tablero que se encuentre en ese momento desocupada. El juego terminara
cuando un jugador alinee 3 de sus fichas de forma horizontal, vertical o diagonal, o que ya no existan
mas posiciones vacias */
//Perez Garcia Cesar Manuel
//Lopez Garay Ivan Jared


import java.util.Scanner;//Importar clase Scanner
public class Gatito {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Varible de tipo Scanner
		int turno=0;//Variable para contar los turnos
		boolean continuar=true;
		char[][] tablero=new char[3][3];//Se crea el tablero de 3x3

		for(int i=0; i<tablero.length; i++)
			for(int j=0; j<tablero.length; j++) {
				tablero[i][j]=' ';//Se inicia el tablero con todos los espacios vacios
			}

		System.out.println("-------------");//Se imprime el tablero
		for(int i=0; i<3; i++) {
			System.out.print("| ");
			for(int j=0; j<3; j++) {
				System.out.print(tablero[i][j]+" | ");
			}
			System.out.println("\n-------------");
		}
		do {
			System.out.println("Jugador 1 ingrese un numero de fila(1-3):");//Se pide al primer jugador que elija la posicion de la fila en el que pondra la ficha
			int fila=sc.nextInt()-1;
			while(fila<0 || fila>2) {//Validacion para que el numero de fila este entre 1 y 3
				System.out.println("Numero invalido, intente de nuevo.");
				System.out.println("");
				System.out.println("Jugador 1 ingrese denuevo un numero de fila(1-3):");
				fila=sc.nextInt()-1;
			}
			System.out.println("Jugador 1 ingrese un numero de columna(1-3):");//Se pide al primer jugador que elija la posicion de la columna en el que pondra la ficha
			int columna=sc.nextInt()-1;
			while(columna<0 || columna>2) { //Validacion para que el numero de columna este entre 1 y 3
				System.out.println("Numero invalido, intente de nuevo.");
				System.out.println("");
				System.out.println("Jugador 1 ingrese denuevo un numero de columna(1-3):");
				columna=sc.nextInt()-1;
			}
			char jugador='X';//variable que representa la ficha de los jugadores
			while(tablero[fila][columna]=='X' || tablero[fila][columna]=='O') {//Validacion para que no se pueda colocar una ficha en un lugar ocupado
				System.out.println("Espacio ocupado, intente de nuevo.");
				System.out.println("");
				System.out.println("Jugador 1 ingrese denuevo un numero de fila(1-3):");//Se pide de nuevo las posiciones de las fichas
				fila=sc.nextInt()-1;
				while(fila<0 || fila>2) {//Validacion para que el numero de fila este entre 1 y 3
					System.out.println("Numero invalido, intente de nuevo.");
					System.out.println("");
					System.out.println("Jugador 1 ingrese denuevo un numero de fila(1-3):");
					fila=sc.nextInt()-1;
				}
				System.out.println("Jugador 1 ingrese denuevo un numero de columna(1-3):");
				columna=sc.nextInt()-1;
				while(columna<0 || columna>2) { //Validacion para que el numero de columna este entre 1 y 3
					System.out.println("Numero invalido, intente de nuevo.");
					System.out.println("");
					System.out.println("Jugador 1 ingrese denuevo un numero de columna(1-3):");
					columna=sc.nextInt()-1;
				}
			}
			tablero[fila][columna]=jugador;//Se coloca la ficha en la posicion que se indico
			turno++;//Se aumenta el contador de turnos
			for(int i=0; i<tablero.length; i++) {//Se vuelve a imprimir el tablero, pero ahora con la ficha colocada
				for(int j=0; j<tablero.length; j++) {
					System.out.println("-------------");
					for(i=0; i<3; i++) {
						System.out.print("| ");
						for(j=0; j<3; j++) {
							System.out.print(tablero[i][j]+" | ");
						}
						System.out.println("\n-------------");
					}

				}
			}
			System.out.println("Ficha colocada en el espacio: ("+(fila+1)+","+(columna+1)+")");//Se imprime la posicion en la que se coloco la ficha
			if(tablero[0][0]=='X' && tablero[0][1]=='X' && tablero[0][2]=='X' ||
			        tablero[1][0]=='X' && tablero[1][1]=='X' && tablero[1][2]=='X' ||
			        tablero[2][0]=='X' && tablero[2][1]=='X' && tablero[2][2]=='X')
			{
				System.out.println("El jugador 1 gano!");
				System.out.println("Gano de forma horizontal");
				continuar=false;
			}
			if(tablero[0][0]=='X' && tablero[1][0]=='X' && tablero[2][0]=='X' ||
			        tablero[0][1]=='X' && tablero[1][1]=='X' && tablero[2][1]=='X' ||
			        tablero[0][2]=='X' && tablero[1][2]=='X' && tablero[2][2]=='X')
			{
				System.out.println("El jugador 1 gano!");
				System.out.println("Gano de forma vertical");
				continuar=false;
			}
			if(tablero[0][0]=='X' && tablero[1][1]=='X' && tablero[2][2]=='X' ||
			        tablero[0][2]=='X' && tablero[1][1]=='X' && tablero[2][0]=='X') {
				System.out.println("El jugador 1 gano!");//Se verifica si el jugador 1 gano
				System.out.println("Gano de forma diagonal");
				continuar=false;
			}
			else
			{
				if(turno==9) {//Se verifica si ya se han jugado 9 turnos, lo que significa que el tablero esta lleno y el juego termina en empate
					System.out.println("Empate!");
					continuar=false;
				}
			}
			if(continuar)//Si el juego no se termino, empieza el turno del segundo jugador
			{
				System.out.println("Jugador 2 ingrese un numero de fila(1-3):");//Se pide al segundo jugador que elija la posicion de la fila en el que pondra la ficha
				fila=sc.nextInt()-1;
				while(fila<0 || fila>2) {//Validacion para que el numero de fila este entre 1 y 3
					System.out.println("Numero invalido, intentelo de nuevo.");
					System.out.println("");
					System.out.println("Jugador 2 ingrese denuevo un numero de fila(1-3):");
					fila=sc.nextInt()-1;
				}
				System.out.println("Jugador 2 ingrese un numero de columna(1-3):");//Se pide al segundo jugador que elija la posicion de la columna en el que pondra la ficha
				columna=sc.nextInt()-1;
				while(columna<0 || columna>2) { //Validacion para que el numero de columna este entre 1 y 3
					System.out.println("Numero invalido, intente de nuevo.");
					System.out.println("");
					System.out.println("Jugador 2 ingrese denuevo un numero de columna(1-3):");
					columna=sc.nextInt()-1;
				}
				while(tablero[fila][columna]=='X' || tablero[fila][columna]=='O') {//Validacion para que no se pueda colocar una ficha en un lugar ocupado
					System.out.println("Espacio ocupado, intente de nuevo.");
					System.out.println("");
					System.out.println("Jugador 2 ingrese denuevo un numero de fila(1-3):");//Se pide de nuevo las posiciones de las fichas
					fila=sc.nextInt()-1;
					while(fila<0 || fila>2) {//Validacion para que el numero de fila este entre 1 y 3
						System.out.println("Numero invalido, intentelo de nuevo.");
						System.out.println("");
						System.out.println("Jugador 2 ingrese denuevo un numero de fila(1-3):");
						fila=sc.nextInt()-1;
					}
					System.out.println("Jugador 2 ingrese denuevo un numero de columna(1-3):");
					columna=sc.nextInt()-1;
					while(columna<0 || columna>2) { //Validacion para que el numero de columna este entre 1 y 3
						System.out.println("Numero invalido, intente de nuevo.");
						System.out.println("");
						System.out.println("Jugador 2 ingrese denuevo un numero de columna(1-3):");
						columna=sc.nextInt()-1;
					}
				}
				jugador='O';//Se cambia la variable para representar la ficha del segundo jugador
				tablero[fila][columna]=jugador;//Se coloca la ficha del segundo jugador en a la posicion que se indico
				for(int i=0; i<tablero.length; i++) {//Se vuelve a imprimir el tablero, pero ahora con la ficha del segundo jugador colocada
					for(int j=0; j<tablero.length; j++) {
						System.out.println("-------------");
						for(i=0; i<3; i++) {
							System.out.print("| ");
							for(j=0; j<3; j++) {
								System.out.print(tablero[i][j]+" | ");
							}
							System.out.println("\n-------------");
						}

					}
				}
				System.out.println("Ficha colocada en el espacio: ("+(fila+1)+","+(columna+1)+")");//Se indica la posicion en la que se coloco la ficha
				if(tablero[0][0]=='O' && tablero[0][1]=='O' && tablero[0][2]=='O' ||
				   tablero[1][0]=='O' && tablero[1][1]=='O' && tablero[1][2]=='O' ||
				   tablero[2][0]=='O' && tablero[2][1]=='O' && tablero[2][2]=='O')
				{
					System.out.println("El jugador 2 gano!");
					System.out.println("Gano de forma horizontal");
					continuar=false;
				}
				if(tablero[0][0]=='O' && tablero[1][0]=='O' && tablero[2][0]=='O' ||
				   tablero[0][1]=='O' && tablero[1][1]=='O' && tablero[2][1]=='O' ||
				   tablero[0][2]=='O' && tablero[1][2]=='O' && tablero[2][2]=='O')
				{
					System.out.println("El jugador 2 gano!");
					System.out.println("Gano de forma vertical");
					continuar=false;
				}
				if(tablero[0][0]=='O' && tablero[1][1]=='O' && tablero[2][2]=='O' ||
				   tablero[0][2]=='O' && tablero[1][1]=='O' && tablero[2][0]=='O') {
					System.out.println("El jugador 2 gano!");//Se verifica si el jugador 2 gano
					System.out.println("Gano de forma diagonal");
					continuar=false;
				}
			}
			turno++;
			//Si el juego no se ha terminado, el ciclo se repite
		} while(continuar);
		System.out.println("Gracias por jugar");
	}
}
