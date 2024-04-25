package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menuLogIn extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public menuLogIn() {
        setTitle("Inicio de Sesión");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar imagen de fondo
                ImageIcon image = new ImageIcon("background.jpg"); // Ruta de la imagen
                g.drawImage(image.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null); // Desactivar el diseño por defecto

        JLabel usernameLabel = new JLabel("Nombre de usuario:");
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(50, 30, 150, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(200, 30, 150, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(50, 70, 150, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 70, 150, 25);
        panel.add(passwordField);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(150, 120, 150, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Aquí puedes agregar la lógica de autenticación
                // Por ahora, simplemente mostraremos los datos ingresados
                JOptionPane.showMessageDialog(menuLogIn.this,
                        "Usuario: " + username + "\nContraseña: " + password);
            }
        });
        panel.add(loginButton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new menuLogIn();
            }
        });
    }
}
