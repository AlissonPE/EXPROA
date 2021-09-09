package BeepSaude;
import java.util.*;


public class agendaVacina
{
	public static void main(String[] args) {
		//enfermeiros disponiveis
		int enfAlisson = 31;
		int enfBianca = 31;
		int enfCarol = 31;
		int enfDaniel = 31;
		int enfEvelina = 31;
		int enfPref = 12;
		//soma das quantidades de enfermeiros
		int enf = enfAlisson + enfBianca + enfCarol + enfDaniel + enfEvelina + enfPref;
		//vacinas de hepatite
		int hepA = 31;
		int hepB = 31;
		int hepC = 31;
		int hepD = 31;
		int hepE = 31;
		int hepPref = 5;
		//ativando o continuar para abrir o while
		boolean continuar = true;
		
		//scanner utilizado para receber dados pelo terminal, new scanner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("\n\n\nSAVA - Sistema Automatizado de Compra de Vacinas e Agendamentos\n Primeiro nos diga o seu nome!");
		String nome = sc.nextLine();
		
		//iniciamos o while para que o loop aconteça quantas vezes o usuario desejar
		while (continuar) {
			System.out.println("\n\n"+nome
					+ ", \n Seja bem vindo, primeiro digite o número do que voce precisa \n 1.'Agendamento de EXAMES'\n 2.'Agendamento de VACINAS' \n");

			
			int opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println(
						"\nLegal, nós temos as melhores pessoas para te atender \n Agora preciso saber quantas vezes no mes você precisará de nossos colaboradores");
				int numberING = sc.nextInt();
				System.out.println(
						"\n Perfeito! \n Você tem alguma preferência? Escolha quem irá te atender, por favor, escolha a letra correspondente e conforme a disponibilidade \n( A:lisson ):"+enfAlisson + "\n( B:ianca ): " + enfBianca +"\n( C:arol ):  "+enfCarol+"\n( D:aniel ): " + enfDaniel +"\n( E:velina ):" +enfEvelina+"\n(PcD):"+enfPref +" \n Tenha em mente que se você for PCD temos um colaborador pensado especialmente para você, para isso escreva 'PcD'. \n Temos  ("+enf+")  datas disponiveis");
				String fileira = sc.next();

				String erro = ("Poxa, esse colaborador não tem expediente disponível...");
				String enc1 = (" datas disponiveis desse colaborador\n , seu agendamento foi feito. Aproveite a nova experiência e tenha um ótimo dia!");


				//aqui iniciamos um switch case com base no que o usuario digitou, ao invés de usar if e else, com switch case o código fica de fácil entendimento
				switch (fileira) {
				case "A","a":
					if (numberING > enfAlisson) {
						System.out.println(erro);
						break;

					} else {
						enfAlisson -= numberING;
						System.out.println("\nBoa escolha, agora teremos " + enfAlisson + enc1);
						enf -= numberING;
						break;
					}
				case "B","b":
					if (numberING > enfBianca) {
						System.out.println(erro);
						break;
					} else {
						enfBianca -= numberING;
						System.out.println("\nBoa escolha, agora teremos " + enfBianca + enc1);
						enf -= numberING;
						break;
					}
				case "C","c":
					if (numberING > enfCarol) {
						System.out.println(erro);
						break;
					} else {
						enfCarol -= numberING;
						System.out.println("\nBoa escolha, agora teremos  " + enfCarol + enc1);
						enf -= numberING;
						break;
					}
				case "D","d":
					if (numberING > enfDaniel) {
						System.out.println("Poxa, esse colaborador não tem expediente disponível...");
						break;
					} else {
						enfDaniel = enfDaniel - numberING;
						System.out.println("\nBoa escolha, agora teremos  " + enfDaniel + enc1);
						enf -= numberING;
						break;
					}
				case "E","e":
					if (numberING > enfEvelina) {
						System.out.println(erro);
						break;
					} else {
						enfEvelina -= numberING;
						System.out.println("\nBoa escolha, agora teremos  " + enfEvelina + enc1);
						enf -= numberING;                                                                                           
						break;
					}
				case "F","f":
					if (numberING > enfPref) {
						System.out.println(erro);
						break;
					} else {
						enfPref -= numberING;
						System.out.println("\nBoa escolha, agora teremos  " + enfPref + enc1);
						enf -= numberING;
						break;
					}
				case "pcd","PCD","PcD","Pcd":
					if (numberING > enfPref) {
						System.out.println(erro);
						break;
					} else {
						enfPref -= numberING;
						System.out.println("\nBoa escolha, agora teremos  " + enfPref + enc1);
						enf -= numberING;
						break;
					}

				default:
					System.out.println("\nPutz, colaborador não encontrado. Comece dnv!");
					break;

				}
				System.out.println(
						"Deseja continuar?\n digite 'true' para continuar \n'false' para encerrar atendimento");
				continuar = sc.nextBoolean();
				if (continuar == false) {
					System.out.println("Obrigado por comprar e agendar conosco!");
					System.exit(0);

				}

			} else if (opcao == 2) {
				
				String erro2 = ("\nPoxa, infelizmente não temos a quantia necessária");
				String encerra = (" vacinas disponiveis \n , sua vacina foi comprada com sucesso. Aproveite a comodidade e passe mais tempo com quem realmente importa!");
			
				System.out.println("Legal, nós temos varias vacinas para hepatite disponíveis.\n Agora preciso saber quantas você irá comprar.");
          		int numberING = sc.nextInt();
				System.out.println("\nBoa!\nMe diga agora para qual hepatite você deseja comprar uma vacina\n( A ):"+hepA + "\n( B ):" + hepB +"\n( C ):"+hepC+"\n( D ):" + hepD +"\n( E ):" +hepE+"\n(PcD):"+hepPref +". \nTenha em mente que se você for PCD temos reservado especialmente para você, para isso escreva 'PcD' ");
          		String fileira = sc.next();
  
          switch (fileira) {
          case "A","a":
            if (numberING > hepA) {
              System.out.println(erro2);
              break;
  
            } else {
              hepA -= numberING;
              System.out.println("\nÓtima escolha! Agora teremos " + hepA + encerra);
              break;
            }
          case "B","b":
            if (numberING > hepB) {
              System.out.println(erro2);
              break;
            } else {
              hepB = hepB - numberING;
              System.out.println("\nÓtima escolha! Agora teremos " + hepB + encerra);
              break;
            }
          case "C","c":
            if (numberING > hepC) {
              System.out.println(erro2);
              break;
            } else {
              hepC = hepC - numberING;
              System.out.println("\n\nÓtima escolha! Agora teremos " + hepC + encerra);
              break;
            }
          case "D","d":
            if (numberING > hepD) {
              System.out.println(erro2);
              break;
            } else {
              hepD = hepD - numberING;
              System.out.println("\n\nÓtima escolha! Agora teremos " + hepD + encerra);
              break;
            }
          case "E","e":
            if (numberING > hepE) {
              System.out.println(erro2);
              break;
            } else {
              hepE = hepE - numberING;
              System.out.println("\nÓtima escolha! Agora teremos " + hepE + encerra);
              break;
            }
          case "pcd","PCD","PcD","Pcd":
            if (numberING > hepPref) {
              System.out.println("Poxa, infelizmente não temos a quantia necessária");
              break;
            } else {
              hepPref = hepPref - numberING;
              System.out.println("\n\nÓtima escolha! Agora teremos " + hepPref + encerra);
              break;
            }
          default:
            System.out.println("Eita, vacina não encontrada. Comece denovo!");
            break;
  
          }
          System.out.println(
              "Deseja continuar?\n digite 'true' para continuar comprando e agendando conosco \n ou digite 'false' para encerrar atendimento");
          continuar = sc.nextBoolean();
          if (continuar == false) {
            System.out.println("Obrigado por comprar conosco!");
            System.exit(0);
  
          }
  
        }
      }
		}
	}

