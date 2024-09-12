import java.io.File;
import java.io.IOException;

public class Primeiro {

	//Arquivo novo
	public static void main(String[] args) {
		//Tenta criar um arquivo se não existe
		//Caso existir, verifica se é diretorio ou pasta. 
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
		
		
	}

}
