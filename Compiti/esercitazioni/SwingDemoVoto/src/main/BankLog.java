package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class BankLog {

    public BankLog() {
        JFrame frame = new JFrame("Login Bancario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton loginButton = new JButton("Login");
        JButton signupButton = new JButton("Signup");
        JButton clearButton = new JButton("Clear");
        JButton accessButton = new JButton("Accedi");

        loginButton.addActionListener(
                e -> System.out.println("Login effettuato con: " + nameField.getText() + ", " + emailField.getText()));
        signupButton.addActionListener(
                e -> System.out.println("Registrazione con: " + nameField.getText() + ", " + emailField.getText()));
        clearButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
        });
        accessButton.addActionListener(
                e -> System.out.println("Accesso con: " + nameField.getText() + ", " + emailField.getText()));

        buttonPanel.add(loginButton);
        buttonPanel.add(signupButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(accessButton);

        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

}
