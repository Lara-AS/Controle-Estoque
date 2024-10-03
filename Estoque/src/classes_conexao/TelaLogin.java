package classes_conexao;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TelaLogin extends JFrame {
    private static final long serialVersionUID = 1L;

    public static String usuarioDigitado;
    public static String senhaDigitada;

    public TelaLogin() {
        // Configurações da tela de login
        setTitle("Tela de Login");
        setSize(562, 403);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout absoluto

        // Componentes da tela de Login
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblUsuario.setBounds(70, 85, 100, 25);
        getContentPane().add(lblUsuario);

        JTextField txtUsuario = new JTextField(10);
        txtUsuario.setBounds(180, 85, 200, 25);
        getContentPane().add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSenha.setBounds(70, 158, 100, 25);
        getContentPane().add(lblSenha);

        JPasswordField txtSenha = new JPasswordField(10);
        txtSenha.setBounds(180, 158, 200, 25);
        getContentPane().add(txtSenha);

        JButton btnLogin = new JButton("Entrar");
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnLogin.setBounds(204, 247, 141, 40);
        getContentPane().add(btnLogin);

        // Ação ao clicar no botão "Entrar"
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usuarioDigitado = txtUsuario.getText();
                senhaDigitada = new String(txtSenha.getPassword());

                // Validação simples de login
                if (usuarioDigitado.equals("admin") && senhaDigitada.equals("1234")) { // Exemplo de login válido
                    setVisible(false); // Fecha a tela de login
                    TelaPrincipal telaPrincipal = new TelaPrincipal(); // Chama a tela principal
                    telaPrincipal.setVisible(true); // Abre a tela principal
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Torna a tela de login visível
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }
}
