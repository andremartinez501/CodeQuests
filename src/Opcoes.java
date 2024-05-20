import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Opcoes extends javax.swing.JFrame {
    private Usuario usuario;
    
    /**
     * Creates new form Opcoes
     */
    public Opcoes() {
        initComponents();
        
        volumeSlider.addChangeListener(new ChangeListener(){
           @Override
           public void stateChanged(ChangeEvent e){
               JSlider source = (JSlider) e.getSource();
               if (!source.getValueIsAdjusting()){
                    float volume = ((float)(source.getValue()))/10;
                    Musica.mudarVolume(volume);
                   
               }
           }
        });
    }
    
    public void manterUsuario(Usuario usuario){
        this.usuario = usuario;
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
        regrasButton = new javax.swing.JButton();
        mudarNomeButton = new javax.swing.JButton();
        voltarOpcoesNomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        opcoesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opções");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        regrasButton.setBackground(new java.awt.Color(0, 204, 255));
        regrasButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        regrasButton.setForeground(new java.awt.Color(0, 0, 0));
        regrasButton.setText("Regras");
        regrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrasButtonActionPerformed(evt);
            }
        });

        mudarNomeButton.setBackground(new java.awt.Color(51, 204, 255));
        mudarNomeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mudarNomeButton.setForeground(new java.awt.Color(0, 0, 0));
        mudarNomeButton.setText("Mudar nome");
        mudarNomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarNomeButtonActionPerformed(evt);
            }
        });

        voltarOpcoesNomeButton.setBackground(new java.awt.Color(51, 204, 255));
        voltarOpcoesNomeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarOpcoesNomeButton.setForeground(new java.awt.Color(0, 0, 0));
        voltarOpcoesNomeButton.setText("Voltar");
        voltarOpcoesNomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarOpcoesNomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Volume da música");

        volumeSlider.setMajorTickSpacing(5);
        volumeSlider.setMaximum(10);
        volumeSlider.setMinorTickSpacing(1);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setSnapToTicks(true);

        opcoesLabel.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        opcoesLabel.setForeground(new java.awt.Color(0, 0, 0));
        opcoesLabel.setText("Opções");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mudarNomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(regrasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(voltarOpcoesNomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(opcoesLabel)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(opcoesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mudarNomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarOpcoesNomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrasButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Em cada rodada, um numero aleatório de 1 a 6 é sorteado e\n"
                                          + "depois é sorteada uma pergunta sobre Java, Python ou SQL.\n"
                                          + "Após responder, o número sorteado é somado com os pontos\n"
                                          + "da questão (+1 fácil, +2 média, +3 difícil) em caso de acerto\n"
                                          + "e o resultado é a quantidade de casas a andar. Ao chegar ao\n"
                                          + "final, o jogo se encerra e mostra seus pontos, calculados\n"
                                          + "com base no tempo (tempo restante x 2), e o ranking geral da\n"
                                          + "pontuação de todos os jogadores cadastrados.", 
                                          "Regras",
                                          JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_regrasButtonActionPerformed

    private void mudarNomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarNomeButtonActionPerformed
        TelaAtualizarUsuario telaUser = new TelaAtualizarUsuario();
        telaUser.manterUsuario(usuario);
        telaUser.setLocationRelativeTo(null);
        telaUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mudarNomeButtonActionPerformed

    private void voltarOpcoesNomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarOpcoesNomeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarOpcoesNomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mudarNomeButton;
    private javax.swing.JLabel opcoesLabel;
    private javax.swing.JButton regrasButton;
    private javax.swing.JButton voltarOpcoesNomeButton;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}