package Trabalho;

public class Tabuleiro {

	
	//-----------------------------------------------------------------------
	// Cria o tabuleiro e o endereço das casas para as jogadas 
	
	String[][] tabuleiro = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	
	public String Mostrar() {
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("  "+ tabuleiro[linha][coluna]);
			}
			System.out.println("\n");
		}
		return null;
	}//----------------------------------------------------------------------
	// verifica e registra as jogadas
	
	public void movimento(String posicao, String jogada) {
		if(posicao.equals("1"))
			tabuleiro[0][0] = jogada;
		else if(posicao.equals("2"))
			tabuleiro[0][1] = jogada;
		else if(posicao.equals("3"))
			tabuleiro[0][3] = jogada;
		else if(posicao.equals("4"))
			tabuleiro[1][0] = jogada;
		else if(posicao.equals("5"))
			tabuleiro[1][1] = jogada;
		else if(posicao.equals("6"))
			tabuleiro[1][2] = jogada;
		else if(posicao.equals("7"))
			tabuleiro[2][0] = jogada;
		else if(posicao.equals("8"))
			tabuleiro[2][1] = jogada;
		else if(posicao.equals("9"))
			tabuleiro[2][2] = jogada;
			
			
	}//----------------------------------------------------------
	//verifica o tabuleiro por meio de concatenação para definir o vencedor
	
	public String confere(int jogadas) {
		String[] velha = new String[0];
		String vencedor = "null";
		if(jogadas == 9) {
			vencedor = "EMPATE";
		}
		velha[0] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
		velha[1] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
		velha[2] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];
		
		velha[3] = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[1][0];
		velha[4] = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1];
		velha[5] = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];
		
		velha[6] = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
		velha[7] = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];
		
		for(int i=0; i<velha.length; i++) {
			if(velha[i].equals("XXX")) {
				vencedor = "jogador";
			}else if(velha[i].equals("OOO")) {
				vencedor = "Computador";
			}
		}
	return vencedor;
	}
}
