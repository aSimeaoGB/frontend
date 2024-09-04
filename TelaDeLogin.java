import java.awt.*;
import java.awt.event.*;
import java.beans.Statement;
import java.sql.*;

//import java.awt.event.*;
import javax.swing.*;

public class TelaDeLogin extends JFrame
{
    private final JLabel lblLogin;
    private final JTextField txtLogin;

    private final JLabel lblSenha;
    private final JPasswordField txtSenha;

    private final JButton btnEntrar;

    private final JLabel lblNotiifcacoes;

    public TelaDeLogin()
    {
        super("Tela de Login");
        setLayout(new FlowLayout());

        lblLogin = new JLabel("Login");
        add(lblLogin);

        txtLogin = new JTextField(10);
        add(txtLogin);

        lblSenha = new JLabel("Senha:");
        add(lblSenha);

        txtSenha = new JPasswordField(10);
        add(txtSenha);

        btnEntrar = new JButton("Entrar");
        add(btnEntrar);

        add(new JLabel("             "));
        lblNotiifcacoes = new JLabel("Notificações", SwingConstants.CENTER);
        add(lblNotiifcacoes);

        btnEntrar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActiveEvent event) {
                     try{
                    Connection conexao = MySQLConnector.conectar();
                    String strSqlLogin = "select * from `db_senac`.`tbl_senac` where `email` = '" + txtLogin.getPassword() + txtSenha.getPassword() + "';";
                    Statement stmSqlLogin = conexao.createStatement();
                    ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
                    rstSqlLogin.next();
                    stmSqlLogin.close();
                    lblNotiifcacoes.setText("Conectado com sucesso!!!");
                    }catch (Exception e) {
                        lblNotiifcacoes.setText("Não foi possivel encontrar o login e/ou senha digitados/informados! Por favor, verigique e tente novamente. Veja o erro:" + e);
                    }

                }
            }
        );
        setSize(150, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        TelaDeLogin appTelaDeLogin = new TelaDeLogin();
        appTelaDeLogin.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}