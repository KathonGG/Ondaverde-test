package ondaverde;
 
import Panels.LoginPanel;
import Panels.RegisterPanel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class OndaVerde {

   public static void main(String[] args) {

        javax.swing.JFrame frame = new javax.swing.JFrame("Onda Verde");

        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        
        LoginPanel LoginPanel = new Panels.LoginPanel();
        RegisterPanel RegisterPanel = new Panels.RegisterPanel();
        
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(LoginPanel, "login");
        cardPanel.add(RegisterPanel, "register");
        
        frame.add(cardPanel);
        
        LoginPanel.addGoToRegisterButtonActionListener((ActionEvent e) -> {
        {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.next(cardPanel);
        }
        });
        
        RegisterPanel.addGoToLoginButtonActionListener((ActionEvent e) -> {
        {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.next(cardPanel);
        }
        });
        
        LoginPanel.addLoginCancelButtonActionListener ((ActionEvent e) -> {
        {
              
                System.exit(0);
            
        }
        });
        
        RegisterPanel.addRegisterCancelButtonActionListener ((ActionEvent e) -> {
        {
              
                System.exit(0);
            
        }
        });
        
       
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        frame.pack();
        JTextField textField = new JTextField("Fixed Text Field");
        textField.setBounds(50,50,200,30);
        frame.setSize(625, 500);
        
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
}


