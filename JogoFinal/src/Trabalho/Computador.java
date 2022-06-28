package Trabalho;

public class Computador {

	//---------------------------------------------------------------------
		//faz sorteio numerico para selecionar a jogada do computador
	
		public String pc() {
			Novo sorteio = new Novo();
			String valorString = String.valueOf(sorteio.nextInt(9)+1);
		return valorString;
		}	
}
