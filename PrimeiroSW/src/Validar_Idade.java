import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Validar_Idade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblResposta;

	//Metodo Main
	public static void main(String[] args) {
					Validar_Idade frame = new Validar_Idade();
					frame.setVisible(true);
	}

	//Cria o frame
	public Validar_Idade() {
		setTitle("Validador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(86, 71, 46, 14);
		getContentPane().add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(86, 117, 46, 14);
		getContentPane().add(lblIdade);

		txtNome = new JTextField();
		txtNome.setBounds(148, 68, 148, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(149, 114, 54, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		lblResposta = new JLabel(" ");
		lblResposta.setBounds(52, 226, 349, 14);
		getContentPane().add(lblResposta);

		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chama o método para mostrar o resultado da validação
				mostrarResultado();
			}
		});
		btnValidar.setBounds(170, 174, 89, 23);
		getContentPane().add(btnValidar);

	}

	private void mostrarResultado() {
		String nome = txtNome.getText();
		String idadeStr = txtIdade.getText();

		if (nome.isEmpty()) {
			lblResposta.setText("Por favor, insira o nome");
			return;
		}

		try {
			int idade = Integer.parseInt(idadeStr);
			
			if(idade < 0 ) {
				lblResposta.setText("Por favor, digite uma idade positiva!");
				return;
			}
			
			String mensagem = "Nome: " + nome + ", Idade: " + idade;

			if (idade < 18) {
				mensagem += " (Menor de idade)";
			} else {
				mensagem += " (Maior de idade)";
			}

			lblResposta.setText(mensagem);
		} catch (NumberFormatException ex) {
			lblResposta.setText("Por favor, insira uma idade válida!");
		}
		
	}

}
