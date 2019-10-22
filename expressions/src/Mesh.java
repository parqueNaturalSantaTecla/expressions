class Mesh extends Console {

	public static void main(String[] args) {
		new Mesh().exec();
	}

	final int MAX = 5;
	
	void exec() {
		write(" ");
		for (int j = 0; j < MAX; j++) {
			write(j % 10);
		}
		writeln();
		for (int i = 0; i < MAX; i++) {
			write(i % 10);
			for (int j = 0; j < MAX; j++) {
				if (condition(i, j)) {
					write("*");
				} else {
					write(" ");
				}
			}
			writeln();
		}
	}
	
	boolean condition(int row, int column) {
//		return true;
		return row%2==0;
		//		return row==0 && column==0; // punto en esquina superior izquierda
//		return row==3 && column==12; // punto particular
//		return row==MAX/2 && column==MAX/2; // punto central
//		return row==MAX/2; // fila
//		return column==MAX/2; // columna
//		return row==MAX/2 || column==MAX/2; // cruz centrada
//		return row==7 || column==12; // cruz descentrada
//		return row==0 || row==MAX-1 || column==0 || column==MAX-1; // marco externo
//		return row==1 || row==MAX-2 || column==1 || column==MAX-2; // marco interno	
//		return 5 <= row && row <= 10 && 5 <= column && column <= 10; // cuadro interno
//		return row - column == 0; // diagonal principal
//		return row + column == MAX - 1; // diagonal inversa
//		return row - column == 5; // paralela a diagonal principal
//		return row + column == 5; // paralela a diagonal inversa
//		return row - column == 0 || row + column == MAX - 1; // aspa
//		return row - column == 3 || row + column == MAX - 3; // aspa desplazada
//		return row == MAX / 2 || column == MAX / 2 || row - column == 0 || row + column == MAX - 1; // ikurri�a
//		return (row+column)%2==0; // alternos
//		return (row+column)%2==1; // alternos
	}
	
}
