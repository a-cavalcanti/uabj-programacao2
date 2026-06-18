import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();

        if (usuario.equals("anderson") && senha.equals("123456")) {
            mostrarPopup(Alert.AlertType.INFORMATION, "Login bem-sucedido", "Bem-vindo, " + usuario + "!");
        } else {
            mostrarPopup(Alert.AlertType.ERROR, "Erro no login", "Usuário ou senha inválidos.");
        }
    }

    private void mostrarPopup(Alert.AlertType tipo, String titulo, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

}
