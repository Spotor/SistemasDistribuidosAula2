package Trab2_Aula1;

import java.util.Random;


public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        Random r = new Random();
        new ClasseThread1((r.nextInt(4000)+1000), jLabelObj1, this).start();
        new ClasseThread1((r.nextInt(4000)+1000),jLabelObj2, this).start();
        new ClasseThread1((r.nextInt(4000)+1000),jLabelObj3, this).start();
        new ClasseThread1((r.nextInt(4000)+1000),jLabelObj4, this).start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelObj1 = new javax.swing.JLabel();
        jLabelObj2 = new javax.swing.JLabel();
        jLabelObj3 = new javax.swing.JLabel();
        jLabelObj4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movendo objetos - Thread ");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabelObj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trab2_Aula1/bola1.jpg"))); // NOI18N

        jLabelObj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trab2_Aula1/bola2.jpg"))); // NOI18N

        jLabelObj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trab2_Aula1/bola3.jpg"))); // NOI18N

        jLabelObj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trab2_Aula1/bola4.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelObj1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabelObj3)))
                .addContainerGap(509, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelObj2)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelObj4)
                        .addGap(157, 157, 157))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelObj1)
                .addGap(99, 99, 99)
                .addComponent(jLabelObj2)
                .addGap(93, 93, 93)
                .addComponent(jLabelObj3)
                .addGap(31, 31, 31)
                .addComponent(jLabelObj4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabelObj1;
    private static javax.swing.JLabel jLabelObj2;
    private javax.swing.JLabel jLabelObj3;
    private javax.swing.JLabel jLabelObj4;
    // End of variables declaration//GEN-END:variables
}
