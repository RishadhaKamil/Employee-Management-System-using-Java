
package Controller;

import Model.*;
public class CComplaints1 {
       public void lodgeComp(int id,String email,String complaint)
    {
        MComplaints msc =new MComplaints();
        msc.lodgeComp(id,email,complaint);
    }
}
