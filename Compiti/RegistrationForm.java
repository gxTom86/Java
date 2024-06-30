import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form di Registrazione");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Nome
        Label nameLabel = new Label("Nome:");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);

        // Cognome
        Label surnameLabel = new Label("Cognome:");
        GridPane.setConstraints(surnameLabel, 0, 1);
        TextField surnameInput = new TextField();
        GridPane.setConstraints(surnameInput, 1, 1);

        // Email
        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 2);
        TextField emailInput = new TextField();
        GridPane.setConstraints(emailInput, 1, 2);

        // Indirizzo
        Label addressLabel = new Label("Indirizzo:");
        GridPane.setConstraints(addressLabel, 0, 3);
        TextField addressInput = new TextField();
        GridPane.setConstraints(addressInput, 1, 3);

        // Password
        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 4);
        PasswordField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 4);

        // Conferma Password
        Label confirmPasswordLabel = new Label("Conferma Password:");
        GridPane.setConstraints(confirmPasswordLabel, 0, 5);
        PasswordField confirmPasswordInput = new PasswordField();
        GridPane.setConstraints(confirmPasswordInput, 1, 5);

        // Bottone di invio
        Button submitButton = new Button("Registra");
        GridPane.setConstraints(submitButton, 1, 6);

        grid.getChildren().addAll(nameLabel, nameInput, surnameLabel, surnameInput,
                emailLabel, emailInput, addressLabel, addressInput,
                passwordLabel, passwordInput, confirmPasswordLabel,
                confirmPasswordInput, submitButton);

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
