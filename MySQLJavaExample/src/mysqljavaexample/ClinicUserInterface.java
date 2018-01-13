/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqljavaexample;

/**
 *
 * @author Dillon
 */
public class ClinicUserInterface extends javax.swing.JFrame {

    /**
     * Creates new form ClinicUserInterface
     */
    
    StringBuilder results;
    
    public ClinicUserInterface() {
        initComponents();
        this.setResizable(false);
        
        results = new StringBuilder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        queryList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MySQL Java Example");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        queryList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Show Employee Table", "Show Patient Table", "Show Has Table", "Show Insurance Table", "Show Diagnosis Table", "Show Medication Table", "Show Procedure Table", "Show Visits Table", "Show VistMed Table", "Show VisitPro Table", "Show what medications Robert Thomas takes", "Show what insurance each patient has" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        queryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                queryListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(queryList);

        resultsTA.setEditable(false);
        resultsTA.setColumns(20);
        resultsTA.setRows(5);
        jScrollPane1.setViewportView(resultsTA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 450, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Show Results of SQL Queries", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_queryListValueChanged

        SQLQueries query = new SQLQueries(queryList.getSelectedIndex());

        // Get the results of the query to allow for the results to be displayed
        results = query.gatherDataFromQuery(queryList.getSelectedIndex());

        // Determine which headers to use
        // Each of the query results need different headers
        switch(queryList.getSelectedIndex()){

            case 0:
            // Full Employee Table
            resultsTA.setText("EID\tFNAME\tLNAME\tSEX\tDOB\tJOB_TITLE\tSALARY\n");
            break;
            case 1:
            // Full Patient Table
            resultsTA.setText("PAT_ID\tFNAME\tLNAME\tSEX\tDOB\tPHONE_NUM\tPOLICY_NUM\n");
            break;
            case 2:
            // Full Has Table
            resultsTA.setText("INAME\tPOLICY_NUM\n");
            break;
            case 3:
            // Full Insurance Table
            resultsTA.setText("INAME\tCOPAY\tPERCENT_OF_PAY\tACCEPT\n");
            break;
            case 4:
            // Full Diagnosis Table
            resultsTA.setText("DIAG_NUM\tDIAGNOSIS\n");
            break;
            case 5:
            // Full Medication Table
            resultsTA.setText("MED_NUM\tMED_NAME\tCOST_PER_DOSAGE\n");
            break;
            case 6:
            // Full Procedures Table
            resultsTA.setText("PRO_NUM\tPRO_NAME\tPCOST\n");
            break;
            case 7:
            // Full Visits Table
            resultsTA.setText("VID\tVDATE\tVTIME\tEID\tPATIENT_ID\tDIAG_NUM\tTOTAL_COST\n");
            break;
            case 8:
            // Full VisitMed Table
            resultsTA.setText("VID\tMED_NUM\tDOSAGE\tDURATION\n");
            break;
            case 9:
            // Full VisitPro Table
            resultsTA.setText("VID\tPRO_NUM\n");
            break;
            case 10:
            // Custom query to show what medication's Robert Thomas is taking.
            resultsTA.setText("FNAME\tLNAME\tMED_NAME\tDOSAGE\tDURATION\n");
            break;
            case 11:
            // Custom query to show insurance information for each patient.
            resultsTA.setText("FNAME\tLNAME\tINAME\tCOPAY\tPERCENT_OF_PAY\n");
            break;
        }

        // Display the queried data
        resultsTA.append(results.toString());

    }//GEN-LAST:event_queryListValueChanged

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
            java.util.logging.Logger.getLogger(ClinicUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> queryList;
    private javax.swing.JTextArea resultsTA;
    // End of variables declaration//GEN-END:variables
}