/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobPortal;

/**
 *
 * @author ButcherL
 */
public class SearchResult extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public SearchResult() {
        initComponents();
        
        //Sets two needed labels, for data transfer, invisible to the user
        resultsSectorLable.setVisible(false);
        resultsJobDescriptionLable.setVisible(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultsBox1 = new javax.swing.JPanel();
        jobTitleLable = new javax.swing.JLabel();
        resultsJobTitleLable = new javax.swing.JLabel();
        resultsJobTypeLable = new javax.swing.JLabel();
        resultsSalaryLable = new javax.swing.JLabel();
        resultsApplyByDateLable = new javax.swing.JLabel();
        resultsCountryLable = new javax.swing.JLabel();
        viewJobDetails = new javax.swing.JButton();
        resultsJobDescriptionLable = new javax.swing.JLabel();
        resultsSectorLable = new javax.swing.JLabel();

        resultsBox1.setAutoscrolls(true);

        jobTitleLable.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jobTitleLable.setText("IT Industrial Placement ");

        resultsJobTitleLable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        resultsJobTitleLable.setText("Aldi ");

        resultsJobTypeLable.setText("Full Time ");

        resultsSalaryLable.setText("Salary : 18000 - 18500 $");

        resultsApplyByDateLable.setText("30 Apr 2018 ");

        resultsCountryLable.setText("Southampton ");

        viewJobDetails.setText("View ");
        viewJobDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJobDetailsActionPerformed(evt);
            }
        });

        resultsJobDescriptionLable.setText("Description");

        resultsSectorLable.setText("Sector");

        javax.swing.GroupLayout resultsBox1Layout = new javax.swing.GroupLayout(resultsBox1);
        resultsBox1.setLayout(resultsBox1Layout);
        resultsBox1Layout.setHorizontalGroup(
            resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsBox1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsBox1Layout.createSequentialGroup()
                        .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(resultsBox1Layout.createSequentialGroup()
                                    .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jobTitleLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resultsJobTitleLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18))
                                .addGroup(resultsBox1Layout.createSequentialGroup()
                                    .addComponent(resultsJobTypeLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(55, 55, 55)))
                            .addGroup(resultsBox1Layout.createSequentialGroup()
                                .addComponent(resultsApplyByDateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultsSalaryLable, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(resultsCountryLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultsBox1Layout.createSequentialGroup()
                        .addComponent(resultsSectorLable)
                        .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resultsBox1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                                .addComponent(viewJobDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(resultsBox1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultsJobDescriptionLable)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        resultsBox1Layout.setVerticalGroup(
            resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsBox1Layout.createSequentialGroup()
                .addComponent(jobTitleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsJobTitleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultsSalaryLable, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(resultsJobTypeLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultsCountryLable, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(resultsApplyByDateLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsBox1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(viewJobDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(resultsBox1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resultsBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultsSectorLable)
                            .addComponent(resultsJobDescriptionLable))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewJobDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJobDetailsActionPerformed
       
        // Getting data out of labels in search results section
       String Salary = resultsSalaryLable.getText();
       String Job_Title = jobTitleLable.getText();
       String Date = resultsApplyByDateLable.getText();
       String Job_Type = resultsJobTypeLable.getText();
       String Country = resultsCountryLable.getText();
       String Company_Name = resultsJobTitleLable.getText();
       String Sector = resultsSectorLable.getText();
       String jobDescription = resultsJobDescriptionLable.getText();
       
       // On button click, open new window with full description of a job
       new DownloadScreen(Job_Title, Company_Name, Job_Type, Sector, Salary, Country, 
       jobDescription, Date).setVisible(true);
       
       
       
    }//GEN-LAST:event_viewJobDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel jobTitleLable;
    protected javax.swing.JLabel resultsApplyByDateLable;
    protected javax.swing.JPanel resultsBox1;
    protected javax.swing.JLabel resultsCountryLable;
    protected javax.swing.JLabel resultsJobDescriptionLable;
    protected javax.swing.JLabel resultsJobTitleLable;
    protected javax.swing.JLabel resultsJobTypeLable;
    protected javax.swing.JLabel resultsSalaryLable;
    protected javax.swing.JLabel resultsSectorLable;
    protected javax.swing.JButton viewJobDetails;
    // End of variables declaration//GEN-END:variables
}
