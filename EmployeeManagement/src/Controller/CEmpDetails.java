
package Controller;

import  Model.*;
import java.sql.ResultSet;


public class CEmpDetails {
    public ResultSet getData(String en)
    {
       
        MEmpDetails mc =new MEmpDetails();
        ResultSet rs=mc.getData(en);
        return  rs ;
        
    }
}
