package Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Inicio {
    private JButton buttonLogin;
    private JPanel panel1;
    private JButton CrearButton;
    private JTextField UserText;
    private JPasswordField passwordField1;

    public Inicio() {
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login correcto"); //nos saca un mensaje de todo OK
            }
        });
        UserText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                UserText.setText(""); // Borra el texto predeterminado cuando se hace clic en el campo
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField1.setText("");
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (passwordField1.getText().isEmpty()) {
                    passwordField1.setText("Password"); // restablece el texto predeterminado si no se ha ingresado ningún valor
                }

            }
        });
        UserText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (UserText.getText().isEmpty()) {
                    UserText.setText("Introduzca aqui su usuario"); // restablece el texto predeterminado si no se ha ingresado ningún valor
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LinkUPing");
        frame.setContentPane(new Inicio().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);//Asi nos sale centrada la ventana
        frame.setVisible(true);
    }

}
