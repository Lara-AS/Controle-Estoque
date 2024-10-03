package classes_conexao;

import javax.swing.*;  // Pacote para os componentes da GUI (JFrame, JButton, JLabel, etc.)
//import java.awt.*;     // Pacote para layouts e manipulação de gráficos
import java.awt.event.*;
import java.awt.Font;  // Pacote para manipulação de eventos (ActionListener)

public class Tela_cadastro extends JFrame {
    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField txtNome;
    private JTextField txtQuantidade;
    private JTextField txtValor;
    private JTextField txtDataEntrada;

    public Tela_cadastro() {
        setTitle("Cadastro de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 562, 403);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNome = new JLabel("Nome do Produto:");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNome.setBounds(34, 25, 143, 25);
        contentPane.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(190, 25, 200, 25);
        contentPane.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblQuantidade.setBounds(34, 87, 120, 25);
        contentPane.add(lblQuantidade);

        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(190, 87, 200, 25);
        contentPane.add(txtQuantidade);
        txtQuantidade.setColumns(10);

        JLabel lblValor = new JLabel("Valor:");
        lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblValor.setBounds(37, 146, 94, 25);
        contentPane.add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(190, 148, 200, 25);
        contentPane.add(txtValor);
        txtValor.setColumns(10);

        JLabel lblDataEntrada = new JLabel("Data de Entrada:");
        lblDataEntrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDataEntrada.setBounds(37, 212, 120, 25);
        contentPane.add(lblDataEntrada);

        txtDataEntrada = new JTextField();
        txtDataEntrada.setBounds(190, 214, 200, 25);
        contentPane.add(txtDataEntrada);
        txtDataEntrada.setColumns(10);

        JButton btnSalvar = new JButton("Cadastrar");
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalvar.setBounds(227, 264, 120, 43);
        contentPane.add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            }
        });

        setVisible(true); // Torna a janela visível
    }

    public static void main(String[] args) {
        new Tela_cadastro(); // Cria a tela de cadastro
    }
}
