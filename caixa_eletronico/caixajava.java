import java.util.*; 

public class caixajava {
	public static void main(String[] args) {  
	
		Scanner sc = new Scanner(System.in); 
		sc.useLocale(Locale.US);
		
		System.out.println("Caixa Eletronico em JAVA");

		int tentativas = 3;
		double saldo = 999.12;
		
		while (tentativas > 0) {
			
			System.out.print("\nInforme seu nome: ");  
			String nome = sc.nextLine();
			
			System.out.print("\nInforme sua senha: ");  
			int senha = sc.nextInt();  
			
			if (senha == 1234) { 
			
				System.out.print(nome + ", escolha uma das opcoes: \n1. Saldo\n2. Saque\n3. Deposito\n4. Sair");
				try {
					
					System.out.print("\nEscolha uma opcao: ");
						
					int opcao = sc.nextInt(); 	
					if (opcao == 1) { 
						System.out.print("\nSeu saldo � de: R$ " + saldo);
						break;
						
					
					} else if (opcao == 2) { 
						System.out.print("\nSeu saldo e de: R$" + saldo);
						
						System.out.print("\nInforme o valor para retirada: ");
						double retirada = sc.nextDouble();
						
						if (retirada < saldo || retirada == saldo){
							saldo = saldo - retirada;
							
							System.out.print("Saque realizado com sucesso\nO novo saldo na sua conta e de: " + saldo);
							break;
							
						} else if (retirada > saldo){

							System.out.print("\nNao ha saldo suficiente na conta.");
							break;

						} else {

							System.out.print("\nSua conta nao foi movimentada.");
							break;
						}
						
					} else if (opcao == 3) { 
						System.out.print("\nPor favor, informe o valor para deposito: ");
						double deposito = sc.nextDouble(); 

						saldo = saldo + deposito;
						
						System.out.print("Deposito realizado com sucesso\nSeu novo saldo � de " + saldo);
						break;
						
					} else if (opcao == 4) {
						System.out.print("\nObrigado por utilizar o nosso Banco");
						System.exit(0);
						
						
					} else {
						System.out.print("\nOpcao invalida\nTente Novamente. ");
					}
				
				} catch(Exception e) {
					
				  System.out.print("Houve um erro. Por favor, escolha uma opcao entre 1, 2, 3 e 4");
				  System.out.print("Erro: " + e);
				}
				
			} else {
				System.out.print("Senha invalida\n");
				tentativas -= 1;
					
				if (tentativas > 0){
					System.out.print("\nVoce possui "+ tentativas +" tentativa(s)");
				} else {
					System.out.print("\nSeu acesso foi bloqueado.");
					sc.close();
				}
			}
		}
			
			System.out.print("\nObrigado por utilizar o nosso Banco");
			sc.close();

		}
	}	
	
/* H� alguns erros no c�digo que impedem a execu��o ou n�o informam os valores corretos ao usu�rio. � hora de peg�-los. 

1. Quando o usu�rio informar que um valor para saque seja igual ao valor do saldo em conta, n�o � poss�vel sacar. Qual o erro e como corrigir?

2. Ao usu�rio informar que um valor para dep�sito o c�digo n�o est� funcionando corretamente. Qual o erro e como corrigir?

3. Quando houver um saque, � necess�rio informar "Saque realizado com sucesso". 

4. Quando houver um dep�sito, � necess�rio informar "Saque realizado com sucesso". 

5. Altere o c�digo para incluir o nome do usu�rio no come�o da intera��o (antes mesmo de solicitar a senha). A Mensagem de despedida deve conter o nome do usu�rio. */