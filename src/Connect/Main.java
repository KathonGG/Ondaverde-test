
package Connect;

public class Main{
    public static void main (String[] args) {
        
        try{
            
            ConnectFactory a = new ConnectFactory();
            a.getConnection();
            System.out.println("Conectato com Sucesso");
            
        } catch (Exception e) {
            System.out.println("Programa não conectato");
        }
    }
}
