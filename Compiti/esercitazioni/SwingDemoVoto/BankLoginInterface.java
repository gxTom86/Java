/*
 * import javax.swing.*;
 * import java.awt.*;
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 * 
 * public class BankLoginInterface {
 * 
 * public static void main(String[] args) {
 * JFrame frame = new JFrame("Login Bancario");
 * 
 * frame.setSize(500, 500);
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.setLayout(new BorderLayout(5, 5));
 * 
 * // Pannello per gli input
 * JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
 * JLabel nameLabel = new JLabel("Nome:");
 * JTextField nameField = new JTextField();
 * JLabel emailLabel = new JLabel("Email:");
 * JTextField emailField = new JTextField();
 * 
 * inputPanel.add(nameLabel);
 * inputPanel.add(nameField);
 * 
 * inputPanel.add(emailLabel);
 * inputPanel.add(emailField);
 * 
 * // Pannello per i pulsanti
 * JPanel buttonPanel = new JPanel(new FlowLayout());
 * JButton loginButton = new JButton("Login");
 * JButton signupButton = new JButton("Signup");
 * JButton clearButton = new JButton("Clear");
 * JButton accessButton = new JButton("Accedi");
 * 
 * // Ascoltatori per i pulsanti
 * loginButton.addActionListener(new ActionListener() {
 * public void actionPerformed(ActionEvent e) {
 * // Logica per il login
 * System.out.println("Login Attempt: Nome=" + nameField.getText() + ", Email="
 * + emailField.getText());
 * }
 * });
 * 
 * signupButton.addActionListener(new ActionListener() {
 * public void actionPerformed(ActionEvent e) {
 * // Logica per la registrazione
 * System.out.println("Signup Attempt: Nome=" + nameField.getText() + ", Email="
 * + emailField.getText());
 * }
 * });
 * 
 * clearButton.addActionListener(new ActionListener() {
 * public void actionPerformed(ActionEvent e) {
 * // Pulisce i campi di testo
 * nameField.setText("");
 * emailField.setText("");
 * }
 * });
 * 
 * accessButton.addActionListener(new ActionListener() {
 * public void actionPerformed(ActionEvent e) {
 * // Logica per accedere alle funzionalità della banca
 * System.out.println("Access Attempt: Nome=" + nameField.getText() + ", Email="
 * + emailField.getText());
 * }
 * });
 * 
 * buttonPanel.add(loginButton);
 * buttonPanel.add(signupButton);
 * buttonPanel.add(clearButton);
 * buttonPanel.add(accessButton);
 * 
 * // Aggiungi pannelli al frame
 * frame.add(inputPanel, BorderLayout.CENTER);
 * frame.add(buttonPanel, BorderLayout.SOUTH);
 * 
 * // Mostra la finestra
 * frame.setVisible(true);
 * }
 * }
 */