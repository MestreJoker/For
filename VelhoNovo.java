package For;

import java.util.Scanner;

public class VelhoNovo {

	public static void main(String[] args) {
		int i, anoAtual, anoNasc, idade, velho=1, novo=1;
		Scanner leia = new Scanner (System.in);
		
		for(i=1; i<=10; i++) {
			System.out.println("Informe o ano atual");
			anoAtual = leia.nextInt();
			
			System.out.println("Informe seu ano de nascimento");
			anoNasc  = leia.nextInt();
			
			idade = anoAtual-anoNasc;
			
			System.out.println("Sua idade é: "+idade);
			
			if(idade>velho) {
				velho = idade;
			}
			else {
				novo = idade;
			}
		}
		System.out.println("O mais velho tem "+velho+" anos");
		System.out.println("O mais novo tem "+novo+" anos");
	}

}
