package principal;

import controller.SomarController;
import java.io.IOException;
import java.net.MalformedURLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {


        //Atributos de tela
        stage.setTitle("Somar números");


        //Carregar arquivos da tela FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SomarView.fxml"));
        //Indica que está em memória
        Parent arquivoXML = loader.load();

        //Atribuir o arquivoXML para uma cena e uma Janela
        Scene somarCena = new Scene(arquivoXML);

        //Associa a cena ao palco
        stage.setScene(somarCena);


        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
