/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howfastcanyoutype;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Dillon
 */
public class AddingDataToExcel {
    
    public void addDataToExcel(ArrayList<UserInfo> userData) throws IOException, WriteException{
        
        WritableWorkbook wb = Workbook.createWorkbook(new File("userInfo.xls"));
        WritableSheet sheet = wb.createSheet("User Data", 0);
        
        for(int i = 0; i < userData.size(); i++){
            
            Label idiomTitle = new Label(0,0,"Idiom");
            Label totalTimeTitle = new Label(1,0,"Total time (in seconds)");
            
            Label idiom = new Label(0,i + 1, userData.get(i).getIdiom());
            Label totalTime = new Label(1, i + 1, "" + userData.get(i).getTotalTime());
            
            sheet.addCell(idiomTitle);
            sheet.addCell(totalTimeTitle);
            sheet.addCell(idiom);
            sheet.addCell(totalTime);
            
        }
        wb.write();
        wb.close();
        
    }
    
}
