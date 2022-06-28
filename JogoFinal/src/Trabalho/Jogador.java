package Trabalho;

public class Jogador {//------verifica a possibilidade de jogada--------
	
	Tabuleiro jogo = new Tabuleiro();
	
	public boolean Valida(String posicao) {
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				if(jogo.tabuleiro[linha][coluna].equals(posicao))
					return true;
			}
		}
		return false;
	}//----------------------------------------------------------------
}
