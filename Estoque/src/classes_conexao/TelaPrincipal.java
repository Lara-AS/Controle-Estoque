package classes_conexao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;

    public TelaPrincipal() {
        setTitle("Tela Principal");
        setSize(562, 403);
        setLocationRelativeTo(null); //centraliza

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());



        // painel da t.principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout());
        JButton btnExcluir = new JButton("Excluir Produto");
        JButton btnAlterar = new JButton("Alterar Produto");

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tela_excluir telaExcluir = new Tela_excluir(); //t.de exclusão
                telaExcluir.setVisible(true); //t.exclusão visível
                dispose(); //fecha a tela principal
            }
        });
        
                
                JButton btnCadastrar = new JButton("Cadastrar Produto");
                GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
                gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
                gbc_btnCadastrar.gridx = 0;
                gbc_btnCadastrar.gridy = 0;
                getContentPane().add(btnCadastrar, gbc_btnCadastrar);
                
                        //acoes
                        btnCadastrar.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Aqui abre a tela de cadastro
                                Tela_cadastro telaCadastro = new Tela_cadastro();
                                telaCadastro.setVisible(true); //t.cadastro visível
                                dispose(); // Fecha a tela principal
                            }
                        });
        panelPrincipal.add(btnExcluir);
        panelPrincipal.add(btnAlterar);

        //add o painel na janela principal
        GridBagConstraints gbc_panelPrincipal = new GridBagConstraints();
        gbc_panelPrincipal.gridx = 0;
        gbc_panelPrincipal.gridy = 1;
        getContentPane().add(panelPrincipal, gbc_panelPrincipal);
    }

    public static void main(String[] args) {
        new TelaPrincipal(); // Chama a tela principal
    }
}
