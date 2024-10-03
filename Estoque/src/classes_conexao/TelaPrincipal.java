package classes_conexao;

import javax.swing.*;  // Pacote para os componentes da GUI (JFrame, JButton, JLabel, etc.)
import java.awt.*;     // Pacote para layouts e manipulação de gráficos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;

    public TelaPrincipal() {
        // Configurações da tela principal
        setTitle("Tela Principal");
        setSize(562, 403);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());



        // Cria o painel da tela principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout());
        JButton btnExcluir = new JButton("Excluir Produto");
        JButton btnAlterar = new JButton("Alterar Produto");

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui abre a tela de exclusão
                Tela_excluir telaExcluir = new Tela_excluir(); // Chama a tela de exclusão
                telaExcluir.setVisible(true); // Torna a tela de exclusão visível
                dispose(); // Fecha a tela principal
            }
        });

        btnAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui abre a tela de alteração (a ser criada)
                JOptionPane.showMessageDialog(null, "Tela de alteração não implementada.");
            }
        });
        
                // Botões da tela principal
                JButton btnCadastrar = new JButton("Cadastrar Produto");
                GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
                gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
                gbc_btnCadastrar.gridx = 0;
                gbc_btnCadastrar.gridy = 0;
                getContentPane().add(btnCadastrar, gbc_btnCadastrar);
                
                        // Ações dos botões
                        btnCadastrar.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Aqui abre a tela de cadastro
                                Tela_cadastro telaCadastro = new Tela_cadastro(); // Chama a tela de cadastro
                                telaCadastro.setVisible(true); // Torna a tela de cadastro visível
                                dispose(); // Fecha a tela principal
                            }
                        });
        panelPrincipal.add(btnExcluir);
        panelPrincipal.add(btnAlterar);

        // Adiciona o painel à janela principal
        GridBagConstraints gbc_panelPrincipal = new GridBagConstraints();
        gbc_panelPrincipal.gridx = 0;
        gbc_panelPrincipal.gridy = 1;
        getContentPane().add(panelPrincipal, gbc_panelPrincipal);
    }

    public static void main(String[] args) {
        new TelaPrincipal(); // Chama a tela principal
    }
}
