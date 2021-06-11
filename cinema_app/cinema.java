package gabs;

import java.util.*;


public class cinema
{
	public static void main(String[] args) {
		int SalaAlphaA = 23;
		int SalaAlphaB = 23;
		int SalaAlphaC = 23;
		int SalaAlphaD = 23;
		int SalaAlphaE = 23;
		int SalaAlphaF = 23;
		int AlphaD = 12;
		int SalaAlpha = SalaAlphaA + SalaAlphaB + SalaAlphaC + SalaAlphaD + SalaAlphaE + SalaAlphaF + AlphaD;
		int SalaBetaA = 24;
		int SalaBetaB = 24;
		int SalaBetaC = 24;
		int SalaBetaD = 24;
		int SalaBetaE = 24;
		int BetaD = 6;
		int SalaBeta = SalaBetaA + SalaBetaB + SalaBetaC + SalaBetaD + SalaBetaE + BetaD;
		String Alpha = "As Branquela";
		String Beta = "A chegada";
		boolean continuar = true;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("SACI - Sistema Automatizado de Compra de Ingresso\n Primeiro nos diga o seu nome!");
		String nome = sc.nextLine();
		while (continuar) {
			System.out.println(nome
					+ ", em nossa programação estamos com dois filmes: \n 1.'As branquelas'\n 2.'A chegada' \nQual deles você gostaria de assistir? ");


			int opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println(
						"\nLegal, nós temos a sala Alpha para atende-lo.\nAgora preciso saber quantos ingressos você irá comprar.");
				int numberING = sc.nextInt();
				System.out.println(
						"\nBoa escolha!\nMe diga agora em qual fileira você deseja comprar \n( A ):"+SalaAlphaA + "\n( B ):" + SalaAlphaB +"\n( C ):"+SalaAlphaC+"\n( D ):" + SalaAlphaD +"\n( E ):" +SalaAlphaE+"\n(PcD):"+AlphaD +". \nTenha em mente que se você for deficiente temos um assento especial para você, para isso escreva 'PcD' ");
				String fileira = sc.next();
				int disponiveis = SalaAlpha;

				switch (fileira) {
				case "A","a":
					if (numberING > SalaAlphaA) {
						System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;

					} else {
						SalaAlphaA = SalaAlphaA - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + SalaAlphaA
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = (SalaAlpha - numberING);
						break;
					}
				case "B","b":
					if (numberING > SalaAlphaB) {
						System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;
					} else {
						SalaAlphaB = SalaAlphaB - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + SalaAlphaB
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = (SalaAlpha - numberING);
						break;
					}
				case "C","c":
					if (numberING > SalaAlphaC) {
						System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;
					} else {
						SalaAlphaC = SalaAlphaC - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + SalaAlphaC
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = SalaAlpha - numberING;
						break;
					}
				case "D","d":
					if (numberING > SalaAlphaD) {
						System.out.println("Poxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;
					} else {
						SalaAlphaD = SalaAlphaD - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + SalaAlphaD
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = (SalaAlpha - numberING);
						break;
					}
				case "E","e":
					if (numberING > SalaAlphaE) {
						System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;
					} else {
						SalaAlphaE = SalaAlphaE - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + SalaAlphaE
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = (SalaAlpha - numberING);
						break;
					}
				case "F","f":
					if (numberING > SalaAlphaF) {
						System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;
					} else {
						SalaAlphaF = SalaAlphaF - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + SalaAlphaF
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = (SalaAlpha - numberING);
						break;
					}
				case "pcd","PCD","PcD","Pcd":
					if (numberING > AlphaD) {
						System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
						break;
					} else {
						AlphaD = AlphaD - numberING;
						System.out.println("\nBaita fileira bacana, agora teremos " + AlphaD
								+ " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
						SalaAlpha = (SalaAlpha - numberING);
						break;
					}
				default:
					System.out.println("\nPutz, fileira não encontrada. Comece dnv!");
					break;

				}
				System.out.println(
						"Deseja continuar?\n digite 'true' para continuar \n'false' para encerrar atendimento");
				continuar = sc.nextBoolean();
				if (continuar == false) {
					System.out.println("Obrigado por comprar conosco!");
					System.exit(0);

				}

			} else if (opcao == 2) {
          if (opcao == 2) {
          System.out.println(
              "Legal, nós temos a sala Beta para atende-lo.\nAgora preciso saber quantos ingressos você irá comprar.");
          int numberING = sc.nextInt();
			System.out.println(
				"\nBoa escolha!\nMe diga agora em qual fileira você deseja comprar \n( A ):"+SalaBetaA + "\n( B ):" + SalaBetaB +"\n( C ):"+SalaBetaC+"\n( D ):" + SalaBetaD +"\n( E ):" +SalaBetaE+"\n(PcD):"+BetaD +". \nTenha em mente que se você for deficiente temos um assento especial para você, para isso escreva 'PcD' ");
          String fileira = sc.next();
          int disponiveis = SalaBeta;
  
          switch (fileira) {
          case "A","a":
            if (numberING > SalaBetaA) {
              System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
              break;
  
            } else {
              SalaBetaA = SalaBetaA - numberING;
              System.out.println("\nBaita fileira bacana, agora teremos " + SalaBetaA
                  + " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
              SalaBeta = (SalaBetaA - numberING);
              break;
            }
          case "B","b":
            if (numberING > SalaBetaB) {
              System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
              break;
            } else {
              SalaBetaB = SalaBetaB - numberING;
              System.out.println("\nBaita fileira bacana, agora teremos " + SalaBetaB
                  + " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
              SalaBeta = (SalaBetaB - numberING);
              break;
            }
          case "C","c":
            if (numberING > SalaBetaC) {
              System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
              break;
            } else {
              SalaBetaC = SalaBetaC - numberING;
              System.out.println("\nBaita fileira bacana, agora teremos " + SalaBetaC
                  + " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
              SalaBeta = SalaBeta - numberING;
              break;
            }
          case "D","d":
            if (numberING > SalaBetaD) {
              System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
              break;
            } else {
              SalaBetaD = SalaBetaD - numberING;
              System.out.println("\nBaita fileira bacana, agora teremos " + SalaBetaD
                  + " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
              SalaBeta = (SalaBeta - numberING);
              break;
            }
          case "E","e":
            if (numberING > SalaBetaE) {
              System.out.println("\nPoxa mano, você quer mais ingressos do que essa fileira oferece!");
              break;
            } else {
              SalaBetaE = SalaBetaE - numberING;
              System.out.println("Baita fileira bacana, agora teremos " + SalaBetaE
                  + " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
              SalaBeta = (SalaBeta - numberING);
              break;
            }
          case "pcd","PCD","PcD","Pcd":
            if (numberING > BetaD) {
              System.out.println("Poxa mano, você quer mais ingressos do que essa fileira oferece!");
              break;
            } else {
              BetaD = BetaD - numberING;
              System.out.println("\nBaita fileira bacana, agora teremos " + BetaD
                  + " cadeiras disponiveis nessa fileira\n , seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme");
              SalaBeta = (SalaBeta - numberING);
              break;
            }
          default:
            System.out.println("Putz, fileira não encontrada. Comece dnv!");
            break;
  
          }
          System.out.println(
              "Deseja continuar?\n digite 'true' para continuar \n'false' para encerrar atendimento");
          continuar = sc.nextBoolean();
          if (continuar == false) {
            System.out.println("Obrigado por comprar conosco!");
            System.exit(0);
  
          }
  
        }
      }
		}
	}
}
// Jailson é dono de um cinema com duas salas.

// A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F)
// com mais 12 assentos para pessoas com deficiência.
// A sala Beta possui 120 lugares divididos em 5 fileiras (A, B, C, D, E) com
// mais 6 lugares para pessoas com deficiência.

// Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala
// Beta de "A Chegada".

// Construa um programa em que uma pessoa compre um ingresso para qualquer uma
// das salas e possa escolher a fileira em que vai sentar.

// O programa deve perguntar, em algum momento, o nome do usuário.

// Uma vez que o assento seja escolhido, é necessário que o programa exiba
// quantos lugares ainda estão disponíveis no total e também em quais fileiras.

// É importante que o comprador possa escolher a quantidade de ingressos que
// quer comprar e que ele não possa comprar mais ingressos do que a fileira
// tenha disponível.

// Ao final, o programa deve exibir a mensagem "[COMPRADOR], seus ingressos
// foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom
// filme.".
