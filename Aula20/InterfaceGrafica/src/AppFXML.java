import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppFXML extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        // modificar aqui o caminho para calculadora.fxml se quiser testar o conceito de exceções
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlloader.load();
        Scene tela = new Scene(root);
        arg0.setTitle("P2 - Interface Gráfica com JavaFX");
        arg0.setScene(tela);
        arg0.show();
    }
}
