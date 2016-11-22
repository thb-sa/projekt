
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;



public class GUI extends javax.swing.JFrame {

   
    public GUI() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        station_list = new javax.swing.JList<>();
        info = new javax.swing.JPanel();
        Label_ID = new javax.swing.JLabel();
        Station_ID = new javax.swing.JTextField();
        Label_Date = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        Label_Taregt = new javax.swing.JLabel();
        Taregt = new javax.swing.JTextField();
        Label_Actuel = new javax.swing.JLabel();
        Actuel = new javax.swing.JTextField();
        Label_variance = new javax.swing.JLabel();
        Variance = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        butten_variance = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Diagramme = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(station_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        info.setLayout(new java.awt.GridLayout(5, 2, 10, 20));

        Label_ID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_ID.setText("Station ID");
        Label_ID.setName("label_Station ID"); // NOI18N
        info.add(Label_ID);

        Station_ID.setAlignmentY(0.2F);
        Station_ID.setMinimumSize(new java.awt.Dimension(6, 10));
        info.add(Station_ID);

        Label_Date.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Date.setText("Date");
        Label_Date.setName("label_Date"); // NOI18N
        info.add(Label_Date);

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateKeyTyped(evt);
            }
        });
        info.add(date);

        Label_Taregt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Taregt.setText("Taregt");
        Label_Taregt.setName("label_taregt"); // NOI18N
        info.add(Label_Taregt);

        Taregt.setEnabled(false);
        info.add(Taregt);

        Label_Actuel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Actuel.setText("Actuel");
        Label_Actuel.setName("label_Actuel"); // NOI18N
        info.add(Label_Actuel);

        Actuel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActuelKeyTyped(evt);
            }
        });
        info.add(Actuel);

        Label_variance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_variance.setText("Variance");
        Label_variance.setName("label_Variance"); // NOI18N
        info.add(Label_variance);

        Variance.setEnabled(false);
        info.add(Variance);

        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setLabel("?");
        button1.setName("help"); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        butten_variance.setText("Variance");
        butten_variance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butten_varianceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenuLayout = new javax.swing.GroupLayout(contenu);
        contenu.setLayout(contenuLayout);
        contenuLayout.setHorizontalGroup(
            contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butten_variance)
                .addGap(120, 120, 120))
        );
        contenuLayout.setVerticalGroup(
            contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenuLayout.createSequentialGroup()
                .addGroup(contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(contenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenuLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(butten_variance)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Diagramme.setText("Diagramme");
        Diagramme.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                DiagrammeMenuSelected(evt);
            }
        });
        Diagramme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiagrammeMouseClicked(evt);
            }
        });
        Menu.add(Diagramme);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed

    }//GEN-LAST:event_dateActionPerformed

    private void dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyReleased
        String st=this.date.getText();
        if(st.length()==2 || st.length()==5)
        {
            date.setText(st+"/");
        }
    }//GEN-LAST:event_dateKeyReleased

    private void dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyTyped
        char c=evt.getKeyChar();
        String st=this.date.getText();
        if(!(Character.isDigit(c)) || c==KeyEvent.VK_DELETE || st.length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_dateKeyTyped

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        //  Geburtsdatum (nach dem Muster TT.MM.JJJJ ausfüllen):
        JOptionPane.showMessageDialog(null,"Date (nach dem Muster TT/MM/JJJJ ausfüllen");
    }//GEN-LAST:event_button1ActionPerformed

    private void butten_varianceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butten_varianceActionPerformed
   
    }//GEN-LAST:event_butten_varianceActionPerformed

    private void DiagrammeMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_DiagrammeMenuSelected

    }//GEN-LAST:event_DiagrammeMenuSelected

    private void DiagrammeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiagrammeMouseClicked
        try{
            DefaultCategoryDataset dateset = new DefaultCategoryDataset();
            dateset.setValue(5, "", "vorgestern");
            dateset.setValue(20, "", "Gestern");
            dateset.setValue(40, "", "Heute");
            JFreeChart chart=ChartFactory.createLineChart("", "Date", "Variance", dateset, PlotOrientation.VERTICAL, false, true,true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer=new BarRenderer();
            ChartFrame frame=new  ChartFrame("variance",chart);
            frame.setVisible(true);
            frame.setSize(400, 400);

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_DiagrammeMouseClicked

    private void ActuelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActuelKeyTyped
         char c=evt.getKeyChar(); 
        if(!(Character.isDigit(c)) || c==KeyEvent.VK_DELETE ){
            evt.consume();
        }
    }//GEN-LAST:event_ActuelKeyTyped

    public String getActuel() {
        return Actuel.getText();
    }

    public void setActuel(String Actuel) {
        this.Actuel.setText(Actuel);
    }

    public String getTaregt() {
        return Taregt.getText();
    }

    public void setTaregt(String Taregt) {
        this.Taregt.setText(Taregt);
    }

    public String getVariance() {
        return Variance.getText();
    }

    public void setVariance(String Variance) {
        this.Variance.setText(Variance);
    }

    public String getDate() {
        return date.getText();
    }

    public void setDate(String date) {
        this.date.setText(date);
    }
  public void setColerVariance(String Variance, Color color) {
        this.Variance.setText(Variance);
        this.Variance.setDisabledTextColor(color);
    }

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actuel;
    private javax.swing.JMenu Diagramme;
    private javax.swing.JLabel Label_Actuel;
    private javax.swing.JLabel Label_Date;
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_Taregt;
    private javax.swing.JLabel Label_variance;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JTextField Station_ID;
    private javax.swing.JTextField Taregt;
    private javax.swing.JTextField Variance;
    private javax.swing.JButton butten_variance;
    private java.awt.Button button1;
    private javax.swing.JPanel contenu;
    private javax.swing.JTextField date;
    private javax.swing.JPanel info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> station_list;
    // End of variables declaration//GEN-END:variables
}

