package pt.upacademy.desafios.desafio3;

public class Desafio {

	public static int points(String[] resultados) {
		int pontos = 0;
		for (String resultado : resultados) {
			int diferenca = Character.getNumericValue(resultado.charAt(0)) - Character.getNumericValue(resultado.charAt(2));
//			if (diferenca > 0) {
//				pontos+=3;
//			} else if (diferenca == 0) {
//				pontos++;
//			}
			
			pontos += diferenca > 0 ? 3 : diferenca == 0 ? 1 : 0;
		}
		return pontos;
	}
}
