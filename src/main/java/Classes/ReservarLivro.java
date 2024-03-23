package Classes;

import ConnectionFactory.ConnectionFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ReservarLivro {

    public void reservar(JTable paramTableLivros, JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        Usuario usuario = new Usuario();
        String var = usuario.getCpf();
        String reservando = String.format("UPDATE tb_livrosA SET reservado=1, emprestado_para='Reservado para %s' WHERE id = ?;", var);
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(reservando);
            cs.setInt(1, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Reservado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Reservar Erro: " + e.toString());
        }
    }
    
    public void selecionarLivros(JTable paramTableLivros, JTextField paramId, JTextField paramReservado) {
        try {
            int linha = paramTableLivros.getSelectedRow();
            
            if (linha >= 0) {
                paramId.setText(paramTableLivros.getValueAt(linha, 0).toString());
                paramReservado.setText(paramTableLivros.getValueAt(linha, 4).toString());

            } else {
                JOptionPane.showMessageDialog(null, "Não selecionou o registro. Erro: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select Error: " + e.toString());
        }
        
    }
    
}
