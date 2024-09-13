import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Primeiro {

	
	public static void main(String[] args) throws IOException {
		//Tenta criar um arquivo se não existe
		//Caso existir, verifica-se o objeto for diretorio ou pasta. 
		File f1 = new File("testes.txt");
		try {
			if (!f1.exists()) {
				f1.createNewFile();
				System.out.println("Arquivo novo criado!!!");

			} else if (f1.exists() && f1.isDirectory()) {
				System.out.println("Objeto existe, é um diretório!");
			} else if (f1.exists() && f1.isFile()) {
				System.out.println("Objeto existe, é um arquivo! " + f1.getName());
			}
			
//			System.out.println("Apagando!");
//			f.delete();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//A partir do diretório atual lista as pastas de arquivos
		File f2 = new File("./");
		if(f2.exists() && f2.isDirectory()) {
			File[] lista = f2.listFiles();
			for (File file: lista){
				if (file.isDirectory()){
					System.out.println("Diretório " + file.getName());
				} else {
					System.out.println("Arquivo " + file.getName());
				}
			}
		}
		
		//Abrir um arquivo criado e escrever nele
		File f3 = new File("teste3.txt");
		try {
		FileWriter fw = new FileWriter(f3, true);
//		fw.write(System.lineSeparator());
		fw.write("\r\nA turma I5 é bem legal!!!");
		System.out.println("Arquivo modificado");
		fw.close();
		} catch(IOException e) {
			System.out.println("Algum erro aconteceu!");
		}
		
		//Abrir um arquivo e ler seu conteúdo
		String caminhoDoArquivo = "C:\\Users\\Aluno\\git\\PDS1-I5-24-2\\teste3.txt";
		try {
			@SuppressWarnings("resource")
			BufferedReader leitor = 
					new BufferedReader(new FileReader(caminhoDoArquivo));
			System.out.println("Lendo arquivo...");
			String linha = "";
			while((linha = leitor.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
