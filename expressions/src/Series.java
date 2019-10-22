class Series extends Console {

	public static void main(String[] args) {
		new Series().exec();
	}
	
	final int MAX = 10;

	void exec() {
		for (int i = 0; i < MAX; i++) {
			write(i + " - " + getTerm(i));
		}
		writeln();

		write('a');
		write('b');
		write('c');
		write('\r');
		write('x');

	}   
	
	int getTerm(int number) {
//		return number; // en orden
//		return number + 1; // en orden del 1 al 10
//		return (MAX-1) - number; // en orden inverso del 0 al 9
//		return number % 3; // serie de 0,1,2
//		return number * 2; // de 2 en 2
//		return (number + 1) * MAX; // la tabla del 10
		return ((MAX - number - 1) / (MAX / 2)) * number + (number / (MAX / 2)) * (MAX - number - 1);
	}

}
