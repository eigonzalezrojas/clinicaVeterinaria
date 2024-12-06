import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JTextField txtRut;
    private JPasswordField txtPassword;
    private JButton btnIngresar;
    private SistemaVeterinaria sistema;

    public Login(SistemaVeterinaria sistema) {
        this.sistema = sistema;

        setTitle("Login Sistema Veterinaria");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("RUT:"));
        txtRut = new JTextField();
        add(txtRut);

        add(new JLabel("Contraseña:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(e -> validarIngreso());
        add(btnIngresar);
    }

    private void validarIngreso() {
        String rut = txtRut.getText();
        String password = new String(txtPassword.getPassword());

        if (sistema.validarLogin(rut, password)) {
            JOptionPane.showMessageDialog(this, "Ingreso exitoso");
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
        }
    }
}