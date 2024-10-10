package classes_conexao;

import javax.swing.*;  
import java.awt.event.*;

public class Tela_excluir extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private JPanel contentPane;
    private JTextField txtIdProduto;

    public Tela_excluir() {
        setTitle("Excluir Produto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(562, 403);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null); //centraliza

        JLabel lblIdProduto = new JLabel("ID do Produto:");
        lblIdProduto.setBounds(60, 132, 120, 25);
        contentPane.add(lblIdProduto);

        txtIdProduto = new JTextField();
        txtIdProduto.setBounds(179, 132, 200, 25);
        contentPane.add(txtIdProduto);
        txtIdProduto.setColumns(10);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(225, 189, 100, 25);
        contentPane.add(btnExcluir);

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //lógica para excluir o produto
                System.out.println("ID: " + txtIdProduto.getText());
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
            }
        });

        setVisible(true); //janela visível
    }

    public static void main(String[] args) {
        new Tela_excluir(); //tela de exclusão
    }
}
