/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadocumenteditor;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Dillon
 */
public class JavaDocumentEditor extends javax.swing.JFrame {

    /**
     * Creates new form JavaDocumentEditor
     */
    
    ArrayList<String> openText;
    backgrounddata.UndoData undoData;
    int tempIndex;
    
    public JavaDocumentEditor() {
        initComponents();
        openText = new ArrayList<>();
        undoData = new backgrounddata.UndoData();
        tempIndex = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        undoMenItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dillon's Text Editor");

        textArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textAreaCaretUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(textArea);

        jMenu1.setText("File");

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openMenuItem);

        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        undoMenItem.setText("Undo");
        undoMenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoMenItemActionPerformed(evt);
            }
        });
        jMenu2.add(undoMenItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        
        // Open the file
        menuitems.Open open = new menuitems.Open();
        menuitems.Save changeName = new menuitems.Save();
        
        // Open a file chooser dialog box to allow the user to select the document they wish
        // to open.
        openText = open.selectDocument();
        
        // Blank the text area to make sure that the contents of the document the user selected
        // don't get appended to the old data.
        StyledDocument doc = textArea.getStyledDocument();
        textArea.setText("");
        
        // Write the contents of the document to the text area.
        // After writing the contents of the file to the text pane, set the title
        // of the program to the file name.
        for(int i = openText.size() - 1; i >= 0; i--){
            try {
                doc.insertString(0, openText.get(i) + "\n", null);
                this.setTitle(open.fileName);
            } catch (BadLocationException ex) {
                Logger.getLogger(JavaDocumentEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        
        // Exit the program
        menuitems.Exit exit = new menuitems.Exit();
        exit.exitDocument();
        
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void textAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textAreaCaretUpdate
        
        // Each time the user types something in, the change is saved to a linked list.
        // This allows for the user to revert the text.
        undoData.newTextAdded(textArea.getText());
        
        // This is to keep track of where the revert is and how many elements are in the linked list.
        undoData.currentIndex++;
        
        if(!undoData.undoData.get(undoData.undoData.size() - 1).equals("") && undoData.undoData.size() > 0){
            tempIndex = undoData.currentIndex;
        }
        else{
            if(undoData.undoData.size() > 0){
                tempIndex = undoData.currentIndex - 1;
            }
        }
        
        //System.out.println(undoData.undoData.get(undoData.currentIndex));
        
    }//GEN-LAST:event_textAreaCaretUpdate

    private void undoMenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoMenItemActionPerformed
        
        // Still a work in progress...
        // I want the user to be able to undo changes they made to the text area.
        if(undoData.currentIndex == 0){
            textArea.setText("");
        }
        else if(undoData.currentIndex > 0){
//            undoData.currentIndex--;
            tempIndex = undoData.currentIndex - 1;
            textArea.setText(undoData.undoData.get(tempIndex));
        }
        
    }//GEN-LAST:event_undoMenItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        
        // Save the text to a specified file and file type. (Excel, text, comma separated)
        menuitems.Save save = new menuitems.Save();
        if(undoData.undoData.size() > 0){
            save.saveDocument(textArea.getText());
            
            // Set the title of the document to the file name. The file name was 
            // retreived by spliting the full path by each "\" and saving the last 
            // part of the split file path to the fileName variable.
            this.setTitle(save.fileName);
        }
        
    }//GEN-LAST:event_saveMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaDocumentEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaDocumentEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaDocumentEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaDocumentEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaDocumentEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextPane textArea;
    private javax.swing.JMenuItem undoMenItem;
    // End of variables declaration//GEN-END:variables
}
