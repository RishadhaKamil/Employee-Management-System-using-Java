
package Model;

import java.sql.ResultSet;


public class MGenerateSalary {
    
     public ResultSet getData(int id)
    {
        String query="Select email,basicsalary from tblEmployee where empid='"+id+"'";
       ResultSet rs=MSelect.getData(query);
        return rs;
    }
     
     public void setData(double bs,String mydob,double allowances,double etf,double epf,double other,double fs,int eid)
    {
        String query="INSERT INTO tblSalary2(basicsalary,dateissue,allowances,etf,epf,other,finalsalary,empid)VALUES('"+bs+"','"+mydob+"','"+allowances+"','"+etf+"','"+epf+"','"+other+"','"+fs+"','"+eid+"')";
        String msg="Successfully inserted the salary";
        MInsertUpdateDelete.setData(query, msg);
    }
}
