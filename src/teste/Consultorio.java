package teste;

import java.util.Scanner;
import filas.FilaString;

public class Consultorio {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		FilaString filaPacientes = new FilaString();
		int opcao = -1;
		
		//Inicializando a fila
		filaPacientes.init();
		
		while(opcao != 0) {
			System.out.println(
						"0 - Encerrar atendimento."
					+ "\n1 - inserir paciente na fila."
					+ "\n2 - Atender paciente.");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 0:
					//Encerra se a fila estiver vazia
					if(filaPacientes.isEmpty())
						System.out.println("Encerrando o atendimento!");
					else {
						System.out.println("Ainda ha pacientes aguardando atendimento");
						opcao = -1;
					}
					break;
					
				case 1:
					//insere nome do paciente que entra na fila
					input.nextLine();
					//O enter causa erro na aplicação.
					
					System.out.print("\nNome do paciente: ");
					String nome = input.next();
					filaPacientes.enqueue(nome);
					break;
					
				case 2:
					//Retira o proximo paciente a ser atendido da fila
					if(filaPacientes.isEmpty())
						System.out.println("Não ha pacientes na fila.");
					else
						System.out.println("Proximo paciente a ser atendido: " + filaPacientes.dequeue());
					break;
					
				default:
					System.out.println("Opção inválida.");
			}
		}
		
		input.close();
	}
}