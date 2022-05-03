package atv002;

import java.util.Scanner; //import do Scanner

public class ex001 {

	@SuppressWarnings("resource") //suprimir ou ignorar avisos do compilador 
	public static void main(String[] args) {
		// Novo Scanner: "ler"
		
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		
		double notaum = 0; //Variavel da nota AC1
		
		double notadois = 0; //Variavel da nota AC2
		
		double notaag = 0; //Variavel da nota AG
		
		double notaaf = 0; //Variavel da nota AF
		
		double resultado = 0; //Resultado dos calculos das variaveis
		
		//Print principal
		do {
			if (notaum > 10 || notaum < 0) {
				System.out.print(" \n \" NOTA INVALIDA DIGITE NOTA ENTRE 0 a 10 \"");
			}
			System.out.print(" \n DIGITE SUA NOTA DA AC1: ");
			notaum = ler.nextDouble(); //scanner da pergunta
		} while ( notaum > 10 || notaum < 0);
		
		do {
			if (notadois > 10 || notadois < 0) {
				System.out.print(" \n \" NOTA INVALIDA DIGITE NOTA ENTRE 0 a 10 \"");
			}
			System.out.print(" \n DIGITE SUA NOTA DA AC2: ");
			notadois = ler.nextDouble(); //scanner da pergunta
		} while ( notadois > 10 || notadois < 0);
		 
		do {
			if (notaag > 10 || notaag < 0) {
				System.out.print(" \n \" NOTA INVALIDA DIGITE NOTA ENTRE 0 a 10 \"");
			}
			System.out.print(" \n DIGITE SUA NOTA DA AG: ");
			notaag = ler.nextDouble(); //scanner da pergunta
		} while ( notaag > 10 || notaag < 0);
		
		do {
			if (notaaf > 10 || notaaf < 0) {
				System.out.print(" \n \" NOTA INVALIDA DIGITE NOTA ENTRE 0 a 10 \"");
			}
			System.out.print(" \n DIGITE SUA NOTA DA AF: ");
			notaaf = ler.nextDouble(); //scanner da pergunta
		} while ( notaaf > 10 || notaaf < 0);
		
		//calculo
		
		notaum = notaum * 0.15;
		
		notadois = notadois * 0.3;
		
		notaag = notaag * 0.1;
		
		notaaf = notaaf * 0.45;
		
		resultado = notaum + notadois + notaag + notaaf;
		
		//if's
		
		if (resultado >= 5 ){
			System.out.printf(" \n| ALUNO APROVADO!\n| NOTA : %.2f ",resultado); // se a var. "pergunta = 1" um aviso será escrito no console.
		}
		else {
			System.out.printf(" \n| ALUNO REPROVADO! \n| NOTA : %.2f ",resultado); // se a var. "pergunta" for diferente de 1 acionara um aviso no console.
		}
}
}