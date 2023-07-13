
package Model;


public class MComplaints {
    public void lodgeComp(int id,String email,String complaint)
    {
        String query="Insert into tblComplaint (empid,email,complaint) VALUES('"+id+"','"+email+"','"+complaint+"')";
        String msg="Successfully lodged ypur complain";
        MInsertUpdateDelete.setData(query, msg);
    }
}
