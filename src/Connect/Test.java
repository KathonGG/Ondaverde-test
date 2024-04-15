
package Connect;

public class Test{
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
