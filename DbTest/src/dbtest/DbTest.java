/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

/**
 *
 * @author devopsdemo
 */
public class DbTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        DataBase db = DataBase.getObj();
        
        System.out.println(" db Connections " + db.getDbCon().isClosed());
        }
        catch(Exception e) {
            System.err.println("Error ");
        }
    }
    
}
