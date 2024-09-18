import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Classe para Ler Tabuada
public class LerTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para ler a tabuada: ");
        
        int numero = scanner.nextInt();
        String nomeArquivo = "tabuada_" + numero + ".txt";
        
        File arq = new File(nomeArquivo);
        if(!arq.exists()) {
        	System.out.println("Atenção, arquivo não existe!");
        } else {

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
        } finally {
            scanner.close();
        }
        
        } //Fim else
    }
}
