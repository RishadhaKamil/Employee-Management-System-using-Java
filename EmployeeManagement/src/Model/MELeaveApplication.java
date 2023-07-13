
package Model;

public class MELeaveApplication {
     public void checkApp(int id,String mydob,String mydob2,String reason)
     {
        String query="INSERT INTO tblLeave(empid,leavefrom,leaveto,reason)VALUES('"+id+"','"+mydob+"','"+mydob2+"','"+reason+"')";
        String msg="Successfully applied for Leave";
        MInsertUpdateDelete.setData(query, msg);
    }
}
