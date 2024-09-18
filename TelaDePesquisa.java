import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class TelaDePesquisa extends JFrame
{
    private final JLabel lblPesquisa;

    private final JLabel lblId;
    private final JTextField txtId;

    private final JLabel lblNome;
    private final JTextField txtNome;

    private final JLabel lblEmail;
    private final JTextField txtEmail;

    private final JButton btnPrimeiro;
    private final JButton btnAnterior;
    private final JButton btnProximo;
    private final JButton btnUltimo;
    private final JButton btnPesquisar;

    private final JLabel lblNotificacoes;

    public TelaDePesquisa()
    {
        super("Tela De Pesquisa");
        setLayout(new GridLayout(7, 1, 5, 5));

        JPanel linha_lblPesquisa = new JPanel(new GridLayout(1,2));

        lblPesquisa = new JLabel("Pesquisar", SwingConstants.CENTER);
        linha_lblPesquisa.add(lblPesquisa);

        
        linha_lblPesquisa.setLayout(new FlowLayout()); 
        btnPesquisar = new JButton("P");
        linha_lblPesquisa.add(btnPesquisar);
        
        add(linha_lblPesquisa);

        JPanel linha_lblId = new JPanel(new GridLayout(1,2));

        lblId = new JLabel("ID:", SwingConstants.RIGHT);
        linha_lblId.add(lblId);

        txtId = new JTextField(10);
        linha_lblId.add(txtId);

        add(linha_lblId);

        JPanel linha_lblNome = new JPanel(new GridLayout(1,2));

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        linha_lblNome.add(lblNome);

        txtNome = new JTextField(10);
        linha_lblNome.add(txtNome);

        add(linha_lblNome);

        JPanel linha_lblEmail = new JPanel(new GridLayout(1,2));
        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        linha_lblEmail.add(lblEmail);

        txtEmail = new JTextField(10);
        linha_lblEmail.add(txtEmail);

        add(linha_lblEmail);

        JPanel panelBotoes = new JPanel(new GridLayout(1,4));

        panelBotoes.setLayout(new FlowLayout()); 
        btnPrimeiro = new JButton("<<");
        panelBotoes.add(btnPrimeiro);

        btnAnterior = new JButton("<");
        panelBotoes.add(btnAnterior);

        btnProximo = new JButton(">");
        panelBotoes.add(btnProximo);

        btnUltimo = new JButton(">>");
        panelBotoes.add(btnUltimo);

        add(panelBotoes);

        JPanel linha_notificacoe = new JPanel(new GridLayout(1,1));

        lblNotificacoes = new JLabel("Notificaçã", SwingConstants.CENTER);
        linha_notificacoe.add(lblNotificacoes);

        add(linha_notificacoe);
        
        
        setSize(250, 300); 
        setVisible(true); 
    }

    private String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>"; 
    }

    public static void main(String[] args) {
        TelaDePesquisa appTelaDeCadastro = new TelaDePesquisa();
        appTelaDeCadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}