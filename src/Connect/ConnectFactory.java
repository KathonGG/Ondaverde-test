
        
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
public class ConnectFactory {

    public Connection getConnection() {
            try{
           
            return DriverManager.getConnection("127.0.0.1:3306/projeto_ondaverde20241", "root", "Cursa#25#");

            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null,"Erro de Conexão");
                return null;
            }
        }
    }