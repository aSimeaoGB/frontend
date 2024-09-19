//importação das bibliotecas
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDePesquisa extends JFrame // classe que herda o JFrame
{
    public static JLabel lblPesquisa;
    public static JTextField txtPesquisa;

    public static JLabel lblId;
    public static JTextField txtId;

    public static JLabel lblNome;
    public static JTextField txtNome;

    public static JLabel lblEmail;
    public static JTextField txtEmail;

    public static JButton btnPesquisar;
    public static JButton btnPrimeiro;
    public static JButton btnAnterior;
    public static JButton btnProximo;
    public static JButton btnUltimo;

    public static JLabel lblNotificacoes;

    public static int tamanhoInputs = 20;
    public static String txtUsuario = "";

    public TelaDePesquisa() // contrutor
    {
        super("Tela de Pesquisa");
        setLayout(new GridLayout(7,1,5,5));

        JPanel linha_lblPesquisa = new JPanel(new GridLayout(1, 2));

        lblPesquisa = new JLabel("Pesquisa:", SwingConstants.CENTER);
        linha_lblPesquisa.add(lblPesquisa);

        btnPesquisar = new JButton("🔍");
        btnPesquisar.setToolTipText("Pesquisar");
        linha_lblPesquisa.add(btnPesquisar);

        add(linha_lblPesquisa);// adiciona ao construtor, extremamente necessario, se não não ira aparecer

        JPanel linha_inputPesquisa = new JPanel(new GridLayout(1, 2));
        txtPesquisa = new JTextField(tamanhoInputs);
        linha_inputPesquisa.add(txtPesquisa);
        
        add(linha_inputPesquisa);// adiciona ao construtor

        JPanel linha_id = new JPanel(new GridLayout(1, 2));

        lblId = new JLabel("Id:", SwingConstants.RIGHT);
        linha_id.add(lblId);

        txtId = new JTextField(tamanhoInputs);
        txtId.setEnabled(false);
        linha_id.add(txtId);

        add(linha_id);// adiciona ao construtor

        JPanel linha_nome = new JPanel(new GridLayout(1, 2));

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        linha_nome.add(lblNome);

        txtNome = new JTextField(tamanhoInputs);
        txtNome.setEditable(false);
        linha_nome.add(txtNome);

        add(linha_nome);// adiciona ao construtor

        JPanel linha_email = new JPanel(new GridLayout(1, 2));

        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        linha_email.add(lblEmail);

        txtEmail = new JTextField(10);
        txtEmail.setEditable(false);
        linha_email.add(txtEmail);

        add(linha_email);// adiciona ao construtor

        JPanel panelBotoes = new JPanel(new GridLayout(1,4));

        panelBotoes.setLayout(new GridLayout()); 
        btnPrimeiro = new JButton("<<");
        panelBotoes.add(btnPrimeiro);

        btnAnterior = new JButton("<");
        panelBotoes.add(btnAnterior);

        btnProximo = new JButton(">");
        panelBotoes.add(btnProximo);

        btnUltimo = new JButton(">>");
        panelBotoes.add(btnUltimo);

        add(panelBotoes);// adiciona ao construtor

        JPanel linha_notificacoe = new JPanel(new GridLayout(1,1));

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER);
        linha_notificacoe.add(lblNotificacoes);

        add(linha_notificacoe); // adiciona ao construtor
        
        btnPesquisar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (txtPesquisa.getText().trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("Por favor, digite algo e tente novamente."));
                        txtPesquisa.requestFocus();
                        return;
                    }
                    NavegadorDeRegistro.pesquisar();
                }
            }
        );

        txtPesquisa.addKeyListener(
            new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                    if (txtPesquisa.getText().trim().equals(txtUsuario) == false){
                        btnPesquisar.setEnabled(true);
                    } else {
                        btnPesquisar.setEnabled(false);
                    }
                }
            }
        );

        setSize(250, 300); 
        setVisible(true); 
        txtPesquisa.requestFocus();
    }

    public static String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>"; 
    }

    public static void main(String[] args) {
        TelaDePesquisa appTelaDeCadastro = new TelaDePesquisa();
        appTelaDeCadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}