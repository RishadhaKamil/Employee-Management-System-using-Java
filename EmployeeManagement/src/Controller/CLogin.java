
package Controller;

import Model.MLogin;


public class CLogin {
    public void loginCustomer(String uname,String upwd)
    {
        
        MLogin mc =new MLogin();
       mc.loginCustomer( uname, upwd);
    }
}
