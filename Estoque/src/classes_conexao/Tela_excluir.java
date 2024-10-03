package classes_conexao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_excluir extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtIdProduto;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tela_excluir frame = new Tela_excluir();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Tela_excluir() {
        setTitle("Excluir Produto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblIdProduto = new JLabel("ID do Produto:");
        lblIdProduto.setBounds(10, 20, 120, 25);
        contentPane.add(lblIdProduto);

        txtIdProduto = new JTextField();
        txtIdProduto.setBounds(140, 20, 200, 25);
        contentPane.add(txtIdProduto);
        txtIdProduto.setColumns(10);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(140, 60, 100, 25);
        contentPane.add(btnExcluir);

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Produto excluído com ID: " + txtIdProduto.getText());
            }
        });
    }
}
