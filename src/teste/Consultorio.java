package teste;

import java.util.Scanner;
import filas.FilaString;

public class Consultorio {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		FilaString filaPacientes = new FilaString();
		int opcao = 0, rm;
		
		//Inicializando a fila
		filaPacientes.init();
		
		while(opcao != 0) {
			System.out.println(
						"0 - Encerrar atendimento."
					+ "\n1 - inserir paciente na fila."
					+ "\n2 - Atender paciente.");
		}
		
		input.close();
	}
}