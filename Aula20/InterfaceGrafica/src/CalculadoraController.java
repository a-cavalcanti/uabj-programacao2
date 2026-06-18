import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private TextField campoNumerador;

    @FXML
    private TextField campoDenominador;

    @FXML
    private Label labelResultado;

    @FXML
    void calcular(ActionEvent event) {
        try {
            int numerador = Integer.parseInt(campoNumerador.getText());
            int denominador = Integer.parseInt(campoDenominador.getText());
            int resultado = numerador / denominador;
            labelResultado.setText("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            labelResultado.setText("");
            mostrarErro(
                "Entrada inválida",
                "Os campos devem conter apenas números inteiros.\n\nExceção capturada: " + e.getClass().getSimpleName()
            );

        } catch (ArithmeticException e) {
            labelResultado.setText("");
            mostrarErro(
                "Erro matemático",
                "Não é possível dividir por zero.\n\nExceção capturada: " + e.getClass().getSimpleName()
            );
        }
    }

    private void mostrarErro(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
