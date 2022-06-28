package Trabalho;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Tabuleiro jogo = new Tabuleiro();
		Jogador Joga = new Jogador();
		Computador PC = new Computador();
		
		String posicao;
		int vez = 0, jogadas = 0;
		
		while(true) {//---------(modulo de jogadas do jogador)------------------
			
			System.out.println("::::jogo da velha::::");
			jogo.Mostrar();
			
			do {//estrutura de jogadas-----------------
				
				System.out.println("informe a posição da jogada: ");
				posicao = ler.next();
				while(!Joga.Valida(posicao)) {
					System.out.println("Jogada invalida, tente novamente: ");
					System.out.println("informe a posição da jogada: ");
					posicao = ler.next();
					vez = 0;
				}
				jogo .movimento(posicao, "X");;
				vez = 1;
			
			}while(vez ==0);//finaliza a jogada----------------
			
			jogadas++;
			vez = 0;
			jogo.Mostrar();
			if(!jogo.confere(jogadas).equals("null")) {
				break;
			}
			
			do {//estrutura de jogadas do computador-----------------
				
				System.out.println("computador realizando jogada ");
				posicao = PC.pc();
				while(!Joga.Valida(posicao)) {
					System.out.println("Jogada invalida, tentando novamente ");
					System.out.println("computador realizando jogada ");
					posicao = PC.pc();
					vez = 0;
				}
				jogo .movimento(posicao, "O");;
				vez = 1;
				
			}while(vez ==0);//finaliza a jogada----------------
			
			
			jogadas++;
			vez = 0;
			if(!jogo.confere(jogadas).equals("null")) {
				break;
			}
			
		}//-----------------------------------(fim while)-----------
		System.out.println("O "+jogo.confere(jogadas)+" venceu!");
		
	}

}


