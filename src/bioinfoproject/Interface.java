/*
 * Kevin DeWire
 * CS 723 Bioinformatics
 * Reduced Representation of a Protein Structure
 */
package bioinfoproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class MyCustomFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        // Allow only directories, or files with ".txt" extension
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt") || file.getAbsolutePath().endsWith(".pdb") || file.getAbsolutePath().endsWith(".PDB");
    }
    @Override
    public String getDescription() {
        // This description will be displayed in the dialog,
        // hard-coded = ugly, should be done via I18N
        return "Text documents (*.txt) or PDB files (*.pdb)";
    }
}

public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        InputTextArea = new javax.swing.JTextArea();
        caExtract = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        bSheetCenter = new javax.swing.JButton();
        HelixCenter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        FileChooser.setDialogTitle("");
        FileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputTextArea.setEditable(false);
        InputTextArea.setColumns(40);
        InputTextArea.setRows(5);
        jScrollPane1.setViewportView(InputTextArea);

        caExtract.setText("Extract CA Atoms");
        caExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caExtractActionPerformed(evt);
            }
        });

        OutputTextArea.setEditable(false);
        OutputTextArea.setColumns(40);
        OutputTextArea.setRows(5);
        jScrollPane2.setViewportView(OutputTextArea);

        bSheetCenter.setText("Extract B-Sheet");
        bSheetCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSheetCenterActionPerformed(evt);
            }
        });

        HelixCenter.setText("Extract Helix");
        HelixCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelixCenterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Input File");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Output File");

        jMenu1.setText("File");

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caExtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSheetCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HelixCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HelixCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bSheetCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 212, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // This Section allows the user to pick the input file.
        int returnVal = FileChooser.showOpenDialog(this);
            if (returnVal == FileChooser.APPROVE_OPTION) {
                File InputFile = FileChooser.getSelectedFile();
                try {
                  // What to do with the file, e.g. display it in a TextArea
                  InputTextArea.read( new FileReader( InputFile.getAbsolutePath() ), null );
                } catch (IOException ex) {
                  System.
                          out.println("problem accessing file"+InputFile.getAbsolutePath());
                }
                Input = InputTextArea.getText().split("\n");
            } else {
                System.out.println("File access cancelled by user.");
            }
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void caExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caExtractActionPerformed
        // This section allows the user to set the file that the CA extraction will be saved.
        BufferedWriter writer;
        int returnVal = FileChooser.showSaveDialog(this);
            if (returnVal == FileChooser.APPROVE_OPTION) {
                File OutputFile = FileChooser.getSelectedFile();                
                DisableButtons();
                OutputTextArea.setText("");
                caExtraction();
                try {
                  writer = new BufferedWriter( new FileWriter( OutputFile.getAbsolutePath(), false ));
                  OutputTextArea.write( writer );
                  writer.close();
                } catch (IOException ex) {
                  System.
                          out.println("problem accessing file"+OutputFile.getAbsolutePath());
                }
            } else {
                System.out.println("File access cancelled by user.");
            }
            EnableButtons();
    }//GEN-LAST:event_caExtractActionPerformed

    private void bSheetCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSheetCenterActionPerformed
        // This secion allows the user to set the file that the B-Sheet Centerline will be saved
    }//GEN-LAST:event_bSheetCenterActionPerformed

    private void HelixCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelixCenterActionPerformed
        // This secion allows the user to set the file that the Helix Centerline will be saved
        BufferedWriter writer;
        int returnVal = FileChooser.showSaveDialog(this);
            if (returnVal == FileChooser.APPROVE_OPTION) {
                File OutputFile = FileChooser.getSelectedFile();                
                DisableButtons();
                OutputTextArea.setText("");
                HelixExtraction();
                try {
                  writer = new BufferedWriter( new FileWriter( OutputFile.getAbsolutePath(), false ));
                  OutputTextArea.write( writer );
                  writer.close();
                } catch (IOException ex) {
                  System.
                          out.println("problem accessing file"+OutputFile.getAbsolutePath());
                }
            } else {
                System.out.println("File access cancelled by user.");
            }
            EnableButtons();
    }//GEN-LAST:event_HelixCenterActionPerformed

    private void DisableButtons(){
        caExtract.setEnabled(false);
        HelixCenter.setEnabled(false);
        bSheetCenter.setEnabled(false);
    }
    
    private void EnableButtons(){
        caExtract.setEnabled(true);
        HelixCenter.setEnabled(true);
        bSheetCenter.setEnabled(true);
    }
    
    private void caExtraction(){
        for (int i=0; i<Input.length-1; i++){
            if ("ATOM  ".equals(RecordType(Input[i])) && " CA ".equals(AtomName(Input[i])) && "A".equals(ChainID(Input[i]))){               
                OutputTextArea.append(Input[i] + "\n");
            }
        }
        OutputTextArea.append("END   " + "\n");
    }
    
    private void HelixExtraction(){
        for (int i=0; i<Input.length-1; i++){
            if ("HELIX ".equals(RecordType(Input[i]))){
                String helixChainID = Input[i].substring(19, 20);                
                int initSeqNum;
                String initSeqNumStr = Input[i].substring(21,25).replace(" ","");
                initSeqNum = Integer.parseInt(initSeqNumStr);
                int endSeqNum;
                String endSeqNumStr = Input[i].substring(33,37).replace(" ","");
                endSeqNum = Integer.parseInt(endSeqNumStr);
                HelixCenter(helixChainID, initSeqNum, endSeqNum);
            }
        }
        OutputTextArea.append("END   " + "\n");
    }
    
    private void HelixCenter(String helixChainID, int initSeqNum, int endSeqNum){
        int j = 0;      // Used to track when average calculation takes place
        int k = 0;      // Tracks which record is currently being used
        double x;
        double y;
        double z;
        String chainID;
        int resSeq;
        int numRec = 4; // This can be changed to increase or decrease the number elements used in calculation.
        String[] record;
        record = new String [numRec];
        
        for (int i=0; i<Input.length-1; i++){
            if ("ATOM  ".equals(RecordType(Input[i]))){
                chainID = ChainID(Input[i]);
                if (chainID.equals(helixChainID)){
                    resSeq = ResSeq(Input[i]);
                    if (resSeq >= initSeqNum && resSeq <= endSeqNum){
                        if (" CA ".equals(AtomName(Input[i]))){
                            record[k] = Input[i];
                            j++;
                            k++;
                            if (j == numRec){
                                x = AvgX(record, numRec);
                                y = AvgY(record, numRec);
                                z = AvgZ(record, numRec);
                                Output(record[k-1], x, y, z);
                                j = j-1;
                                if (k == numRec || resSeq == endSeqNum){
                                    k = 0;
                                }                                
                                //for (int k=0; k<numRec; k++){
                                //    record[k] = "";
                                //}
                            }
                        }
                    }
                    if (resSeq > endSeqNum){
                        if (k > 0){
                            x = AvgX(record, numRec);
                            y = AvgY(record, numRec);
                            z = AvgZ(record, numRec);
                            Output(record[k], x, y, z);
                        }
                        break;
                    } 
                }

            }
        }
        OutputTextArea.append("TER   " + "\n");
    }
    
    private String RecordType(String record){
        String recordType = record.substring(0,6);
        return recordType;
    }
    
    private String AtomName(String record){
        String atomName = record.substring(12,16);
        return atomName;
    }    
    
    private String ChainID(String record){
        String chainID = record.substring(21, 22);
        return chainID;
    }
    
    private int ResSeq(String record){
        int resSeq;
        String resSeqStr = record.substring(22, 26).replace(" ", "");
        resSeq = Integer.parseInt(resSeqStr);
        return resSeq;
    }
    
    private double AvgX(String[] record, int numRec){
        double avgX = 0;
        int j = numRec;
        for (int i=0; i < numRec; i++){
            if(record[i].isEmpty()){
                j = j-1;
            }
            else{
                avgX = avgX + XCoord(record[i]);
            }
        }
        avgX = avgX/j;
        return avgX;
    }
    
    private double AvgY(String[] record, int numRec){
        double avgY = 0;
        int j = numRec;
        for (int i=0; i < numRec; i++){
            if(record[i].isEmpty()){
                j = j-1;
            }
            else{
                avgY = avgY + YCoord(record[i]);
            }
        }
        avgY = avgY/j;
        return avgY;
    }
    
    private double AvgZ(String[] record, int numRec){
        double avgZ = 0;
        int j = numRec;
        for (int i=0; i < numRec; i++){
            if(record[i].isEmpty()){
                j = j-1;
            }
            else{
                avgZ = avgZ + ZCoord(record[i]);
            }
        }
        avgZ = avgZ/j;
        return avgZ;
    }
        
    private double XCoord(String record){
        double xCoord;
        String xCoordStr = record.substring(30, 38).replace(" ", "");
        xCoord = Double.parseDouble(xCoordStr);
        return xCoord;
    }
    
    private double YCoord(String record){
        double yCoord;
        String yCoordStr = record.substring(38, 46).replace(" ", "");
        yCoord = Double.parseDouble(yCoordStr);
        return yCoord;
    }
    
    private double ZCoord(String record){
        double zCoord;
        String zCoordStr = record.substring(46, 54).replace(" ", "");
        zCoord = Double.parseDouble(zCoordStr);
        return zCoord;
    }
    
    private void Output(String record, double x, double y, double z){
        String xCoord;
        xCoord = String.format("%8.3f",x);
        String yCoord;
        yCoord = String.format("%8.3f",y);
        String zCoord;
        zCoord = String.format("%8.3f",z);
        StringBuilder newRecord = new StringBuilder(record);
        newRecord.replace(12, 16, "  S ");
        newRecord.replace(17, 20, "   ");
        newRecord.replace(30, 38, xCoord);
        newRecord.replace(38, 46, yCoord);
        newRecord.replace(46, 54, zCoord);
        OutputTextArea.append(newRecord + "\n");
    }    
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton HelixCenter;
    private javax.swing.JTextArea InputTextArea;
    private javax.swing.JMenuItem Open;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JButton bSheetCenter;
    private javax.swing.JButton caExtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    // Global Variables
    public String[] Input;
}
