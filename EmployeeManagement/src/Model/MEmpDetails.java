
package Model;

import java.sql.ResultSet;

public class MEmpDetails {
     public ResultSet getData(String en)
    {
        String query="select * from tblEmployee where name like '%"+en+"%' or email like '%"+en+"%'";
       ResultSet rs=MSelect.getData(query);
        return rs;
    }
}
