/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuitems;

import javax.swing.JFileChooser;

/**
 *
 * @author Dillon
 */
public class Save {
    
    public void saveDocument(){
        
        final JFileChooser SaveAs = new JFileChooser();
        SaveAs.setApproveButtonText("Save");
        int actionDialog = SaveAs.showOpenDialog(null);

        
    }
    
}
