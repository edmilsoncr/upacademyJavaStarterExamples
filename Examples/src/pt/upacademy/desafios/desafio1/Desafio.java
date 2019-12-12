package pt.upacademy.desafios.desafio1;

public class Desafio {
	private int count;
	private int big3Count;
	private int big5Count;
	

	public Desafio(int i) {
		this.count = i;
	}

	public void run() {
		for (int i = 1; i <= count; i++) {
			if (i % 3 == 0) {
				big3Count++;
			}
			if (i % 5 == 0) {
				big5Count++;
			}
		}
	}

	public int getBig3Count() {
		return this.big3Count;
	}

	public int getBig5Count() {
		return this.big5Count;
	}

}
