package Pratica5;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class questao2 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		int opcao;
		int i = 0,j;
		 
		ArrayList<String> agenda = new ArrayList();
		
		do
	     {
		
			String menu= JOptionPane.showInputDialog("1 - Cadastrar\n"
					+ "2 - Excluir\n"
					+ "3 - Pesquisar\n"
					+ "4 - Sair");
			
		     opcao = Integer.parseInt(menu);
			
			
			switch (opcao) {
				case 1:
					String nome= JOptionPane.showInputDialog("Digite o Nome: ");
					String telefone= JOptionPane.showInputDialog("Digite o Telefone: ");
					String instagram= JOptionPane.showInputDialog("Digite o Instragam: ");
					
					agenda.add(nome+";"+telefone+";"+instagram);
					
					JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso");
	                break;
	                
				case 2: 
					String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
					
					int sizeArray = agenda.size();
			
	                
					for (int index = 0; index <= sizeArray; index++) {
						boolean condi =  agenda.get(index).contains(nomeexcluir);
						
						if (condi == true) {
							agenda.remove(index);
						} else if(index == sizeArray - 1 && condi == false) {
							JOptionPane.showMessageDialog(null, "Item nao encontrado");
						}
					}
					
					 JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
	                 break;
	                 
				case 3: 
					String pesquisar= JOptionPane.showInputDialog("Digite o Nome: ");
					
					int size = agenda.size();
					
					for (int index = 0; index <= size; index++) {
						boolean condi =  agenda.get(index).contains(pesquisar);
						
						if (condi == true) {
							JOptionPane.showMessageDialog(null, agenda.get(index));
						} else if(index == size - 1 && condi == false) {
							JOptionPane.showMessageDialog(null, "Item nao encontrado");
						}
					}
					break;
					
				case 4:
	                break;
					
				default:
	                JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
					
			}
	     } while (i!=4);
	}

}
