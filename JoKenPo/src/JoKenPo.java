import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
	//aqui coloca-se as variáveis
			static int usuario;
			static int computador;
			
	//Deve-se criar um jogo de jokenpo
	//O usuario irá jogar contra o computador
	//deve-se lembrar que o jokenpo conta com as jogadas: PEDRA, PAPEL e TESOURA
	//O programa deve ser capaz de escanear a jogada/escolha do usuário e como saida deve aparecer a escolha do computador
	//e seu respectivo resultado : ex: Usuário Ganhou, Computador Ganhou, empate.
	
	/*Nota: aqui, o desenvolvedor pode usar diferentes métodos e lógicas para chegar ao solicitado pelo exercício,
	 * Pode usar laços de repetição de diversas formas, para facilitar, podemos indicar de inicio o uso da biblioteca 
	 * Randon, mas fica a critério do avaliador.
	 * */
	
	//Abaixo um exemplo prático de construção do jogo
	
	public static void main(String [] args) {
		//vou montar a logica utilizando conta matemaica para obter o resultado do jogo, segue a logica abaixo:
		
		/* Lógica:
		 * 1-Pedra / 2 - Papel / 3 - Tesoura
		 * Empate: O resultado de ambos dará 0 , ou seja se o usuário colocar 1 e o computador colocar 1, 
		 * o resultado será 0 e assim por diante.
		 * Usuário - Computador = Resultado
		 *    1    -     2      = -1 Computador Ganhou
		 *    1    -     3      = -2 Usuário Ganhou
		 *    2    -     1      =  1 Usuário Ganhou
		 *    2    -     3      = -1 Computador Ganhou
		 *    3    -     1      =  2 Computador Ganhou
		 *    3    -     2      =  1 Usuário Ganhou
		 */
		
		boolean entrada = false;
		
		System.out.println("---------------------------------");
		System.out.println("SEJA BEM-VINDO AO JOKENPO DA CI&T");
		System.out.println("POR FAVOR, ESCOLHA AS SEGUINTES OPÇÕES:");
		System.out.println("1-Pedra ou 2-Papel ou 3-Tesoura: ");
		escolhaUsuario();
		escolhaComputador();
		logica();
		System.out.println("---------------------------------");
		
	}
	
	public static void escolhaUsuario() {
		Scanner leitor = new Scanner(System.in); //necessario para "ler" o imput do usuario
		usuario = leitor.nextInt(); //usuario escolhe
		
		
		while (usuario != 1 & usuario != 2 & usuario != 3) {
			System.out.println("Opcao invalida.");
			System.out.println("POR FAVOR, ESCOLHA AS SEGUINTES OPÇÕES:");
			System.out.println("1-Pedra ou 2-Papel ou 3-Tesoura: ");
			usuario = leitor.nextInt(); //usuario escolhe
		}
	}
	
	public static void escolhaComputador() {
		Random randon = new Random(); //necessario para aleatorizar a escolha do computador
		computador = randon.nextInt(3) + 1; //computador escolhe, sabemos que o computador começa a contagem a partir do 0
		//então para nosso calculo dar certo, pedimos para que ele pare antes do 3 e somamos +1 dessa forma o numero virá
		//de 1 a 3;
		
		//precisamos saber qual a jogada do computador
		
				switch(computador) {
				case 1:
					System.out.println("Computador: Pedra");
					break;
				case 2:
					System.out.println("Computador: Papel");
					break;
				case 3:
					System.out.println("Computador: Tesoura");
					break;
				}
	}
	
	public static void logica() {
		//logica 
		if((usuario-computador) == -2 ||(usuario-computador) == 1) {
			System.out.println("Usuario Ganhou!");
		}else if ((usuario-computador) == -1 ||(usuario-computador) == 2){
			System.out.println("Computador Ganhou!");
		}else {
			System.out.println("Empatou!");
		}
	}
	 
}
