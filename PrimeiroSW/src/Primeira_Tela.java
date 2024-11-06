
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Primeira_Tela {

	private JFrame frmMeuPrimeiroExemplo;
	private JLabel lblSauda;

	public static void main(String[] args) {
					Primeira_Tela window = new Primeira_Tela();
					window.frmMeuPrimeiroExemplo.setVisible(true);
	}

//Tela Criada
	public Primeira_Tela() {
		inicializarComponentes();
	}

//	Inicializa o conteúdo do frame.
	public void inicializarComponentes() {
		frmMeuPrimeiroExemplo = new JFrame();
		frmMeuPrimeiroExemplo.setTitle("Meu primeiro exemplo em Java Swing");
		frmMeuPrimeiroExemplo.setBounds(100, 100, 478, 289);
		frmMeuPrimeiroExemplo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMeuPrimeiroExemplo.getContentPane().setLayout(null);
		
		lblSauda = new JLabel("Olá Mundo!");
		lblSauda.setBounds(178, 53, 109, 14);
		lblSauda.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmMeuPrimeiroExemplo.getContentPane().add(lblSauda);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(352, 177, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMeuPrimeiroExemplo.setVisible(false);
			}
		});
		frmMeuPrimeiroExemplo.getContentPane().add(btnFechar);
		
		JButton btnTeste1 = new JButton("Teste1");
		btnTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bom dia amigos do I5 do IFSC Gaspar!!!");
			}
		});
		btnTeste1.setBounds(41, 177, 89, 23);
		frmMeuPrimeiroExemplo.getContentPane().add(btnTeste1);
		
		JButton btnTeste2 = new JButton("Teste2");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Você está gostando de programar?", 
						"Confirmação", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					JOptionPane.showMessageDialog(null, "Legal, programar é interessante!", 
							"Resposta SIM", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"Que pena, mesmo assim programar desenvolve o raciocínio lógico!", 
							"Resposta NAO", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnTeste2.setBounds(141, 177, 89, 23);
		frmMeuPrimeiroExemplo.getContentPane().add(btnTeste2);
		
		JButton btnTeste3 = new JButton("Teste3");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirDados();
				
			}
		});
		btnTeste3.setBounds(253, 177, 89, 23);
		frmMeuPrimeiroExemplo.getContentPane().add(btnTeste3);
	}
	
	private void inserirDados() {
		String nome = JOptionPane.showInputDialog(
				null, "Qual é o seu nome?","Entrada de nome",
				JOptionPane.QUESTION_MESSAGE
				);
		lblSauda.setText(nome);
		JOptionPane.showMessageDialog(null, "O nome digitado foi: " + nome);
	}
}
