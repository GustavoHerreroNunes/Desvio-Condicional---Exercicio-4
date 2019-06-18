package Exercicios;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		float N1 = Float.parseFloat(JOptionPane.showInputDialog("Primeiro de tudo, insira sua 1º nota:"));
		float N2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a 2° nota:"));
		float N3 = Float.parseFloat(JOptionPane.showInputDialog("Agora, insira a 3° nota:"));
		float N4 = Float.parseFloat(JOptionPane.showInputDialog("Agora, insira a 4° nota:"));
		float MD = (N1 + N2 + N3 + N4)/4;
		if(MD <3)JOptionPane.showMessageDialog(null, "O aluno foi RETIDO");
		else if(MD >= 6)JOptionPane.showMessageDialog(null, "Aluno APROVADO");
		else JOptionPane.showMessageDialog(null, "Aluno em EXAME");

	}

}
