/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package joguinho;
/**
 *
 * @author 20201038060005
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.labelOutputNomeHeroi.setText(heroi1.getName());
        this.labelOutputNomeVilao.setText(v1.getName());
        
        this.progbarLifeStatusHeroi.setValue(heroi1.getVidaAtual());
        this.progbarLifeStatusHeroi.setMaximum(heroi1.getVidaMaxima());
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelCampoBatalha = new javax.swing.JPanel();
        panelHeroi = new javax.swing.JPanel();
        panelAcoesHeroi = new javax.swing.JPanel();
        btnHeroiAtacar = new javax.swing.JButton();
        btnHeroiRendicao = new javax.swing.JButton();
        labelTitleNomeHeroi = new javax.swing.JLabel();
        labelOutputNomeHeroi = new javax.swing.JLabel();
        progbarLifeStatusHeroi = new javax.swing.JProgressBar();
        labelHeroiDanoRecebido = new javax.swing.JLabel();
        panelVilao = new javax.swing.JPanel();
        panelAcoesVilao = new javax.swing.JPanel();
        labelVilaoAcao = new javax.swing.JLabel();
        labelTitleNomeVilao = new javax.swing.JLabel();
        labelOutputNomeVilao = new javax.swing.JLabel();
        progbarLifeStatusVilao = new javax.swing.JProgressBar();
        labelVilaoDanoRecebido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelStatusBatalha = new javax.swing.JLabel();
        labelStatusBatalhaMotivo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCampoBatalha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelHeroi.setBorder(javax.swing.BorderFactory.createTitledBorder("Heroi"));
        panelHeroi.setPreferredSize(new java.awt.Dimension(221, 281));

        panelAcoesHeroi.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        panelAcoesHeroi.setMaximumSize(new java.awt.Dimension(800, 32767));
        panelAcoesHeroi.setLayout(new java.awt.GridLayout(0, 2));

        btnHeroiAtacar.setText("Atacar");
        btnHeroiAtacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHeroiAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeroiAtacarActionPerformed(evt);
            }
        });
        panelAcoesHeroi.add(btnHeroiAtacar);

        btnHeroiRendicao.setText("Rendição");
        btnHeroiRendicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHeroiRendicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeroiRendicaoActionPerformed(evt);
            }
        });
        panelAcoesHeroi.add(btnHeroiRendicao);

        labelTitleNomeHeroi.setText("Nome:");

        labelOutputNomeHeroi.setText("______");

        progbarLifeStatusHeroi.setMaximum(heroi1.getVidaMaxima());
        progbarLifeStatusHeroi.setValue(heroi1.getVidaAtual());
        progbarLifeStatusHeroi.setString(heroi1.getVidaAtual()+"/"+heroi1.getVidaMaxima());
        progbarLifeStatusHeroi.setStringPainted(true);

        labelHeroiDanoRecebido.setText(" ");

        javax.swing.GroupLayout panelHeroiLayout = new javax.swing.GroupLayout(panelHeroi);
        panelHeroi.setLayout(panelHeroiLayout);
        panelHeroiLayout.setHorizontalGroup(
            panelHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAcoesHeroi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHeroiLayout.createSequentialGroup()
                .addGroup(panelHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeroiLayout.createSequentialGroup()
                        .addComponent(labelTitleNomeHeroi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelOutputNomeHeroi))
                    .addGroup(panelHeroiLayout.createSequentialGroup()
                        .addComponent(progbarLifeStatusHeroi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHeroiDanoRecebido)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        panelHeroiLayout.setVerticalGroup(
            panelHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeroiLayout.createSequentialGroup()
                .addGroup(panelHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitleNomeHeroi)
                    .addComponent(labelOutputNomeHeroi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progbarLifeStatusHeroi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHeroiDanoRecebido))
                .addGap(177, 177, 177)
                .addComponent(panelAcoesHeroi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVilao.setBorder(javax.swing.BorderFactory.createTitledBorder("Vilão"));
        panelVilao.setPreferredSize(new java.awt.Dimension(221, 278));

        panelAcoesVilao.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        panelAcoesVilao.setMaximumSize(new java.awt.Dimension(800, 32767));
        panelAcoesVilao.setMinimumSize(new java.awt.Dimension(142, 45));
        panelAcoesVilao.setLayout(new java.awt.GridLayout(0, 1));

        labelVilaoAcao.setText("(...)");
        panelAcoesVilao.add(labelVilaoAcao);

        labelTitleNomeVilao.setText("Nome:");

        labelOutputNomeVilao.setText("______");

        progbarLifeStatusVilao.setMaximum(v1.getVidaMaxima());
        progbarLifeStatusVilao.setValue(v1.getVidaAtual());
        progbarLifeStatusVilao.setString(v1.getVidaAtual()+"/"+v1.getVidaMaxima());
        progbarLifeStatusVilao.setStringPainted(true);

        labelVilaoDanoRecebido.setText(" ");

        javax.swing.GroupLayout panelVilaoLayout = new javax.swing.GroupLayout(panelVilao);
        panelVilao.setLayout(panelVilaoLayout);
        panelVilaoLayout.setHorizontalGroup(
            panelVilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAcoesVilao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelVilaoLayout.createSequentialGroup()
                .addGroup(panelVilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVilaoLayout.createSequentialGroup()
                        .addComponent(labelTitleNomeVilao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelOutputNomeVilao))
                    .addGroup(panelVilaoLayout.createSequentialGroup()
                        .addComponent(progbarLifeStatusVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelVilaoDanoRecebido)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        panelVilaoLayout.setVerticalGroup(
            panelVilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVilaoLayout.createSequentialGroup()
                .addGroup(panelVilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitleNomeVilao)
                    .addComponent(labelOutputNomeVilao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progbarLifeStatusVilao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVilaoDanoRecebido))
                .addGap(177, 177, 177)
                .addComponent(panelAcoesVilao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Status da Batalha"));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        labelStatusBatalha.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelStatusBatalha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusBatalha.setText("...");
        labelStatusBatalha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(labelStatusBatalha);

        labelStatusBatalhaMotivo.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labelStatusBatalhaMotivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatusBatalhaMotivo.setText(" ");
        jPanel2.add(labelStatusBatalhaMotivo);

        javax.swing.GroupLayout panelCampoBatalhaLayout = new javax.swing.GroupLayout(panelCampoBatalha);
        panelCampoBatalha.setLayout(panelCampoBatalhaLayout);
        panelCampoBatalhaLayout.setHorizontalGroup(
            panelCampoBatalhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoBatalhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCampoBatalhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCampoBatalhaLayout.createSequentialGroup()
                        .addComponent(panelHeroi, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelVilao, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCampoBatalhaLayout.setVerticalGroup(
            panelCampoBatalhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCampoBatalhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCampoBatalhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelHeroi, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(panelVilao, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCampoBatalha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCampoBatalha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHeroiAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeroiAtacarActionPerformed
        visibleOff(this.btnHeroiAtacar);
        visibleOff(this.btnHeroiRendicao);
        batalhaComeca();       
//        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        
    }//GEN-LAST:event_btnHeroiAtacarActionPerformed

    private void btnHeroiRendicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeroiRendicaoActionPerformed
        visibleOff(this.btnHeroiAtacar);
        visibleOff(this.btnHeroiRendicao);
        rendicao(heroi1);
    }//GEN-LAST:event_btnHeroiRendicaoActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
//    Personagens
    Vilao v1 = new Vilao( "Rei Malvado", 7, 5, 7, 200);

    Cavaleiro heroi1 = new Cavaleiro("Sr. Bondosus", 15, 4, 12, 200, 0.1);
    
//    Argumentos
    int aniquilacao = 1;
    int rendicao = 0;
    
//    Arqueiro heroi2 = new Arqueiro("Cog", 15, 3, 12, 200, 50);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHeroiAtacar;
    private javax.swing.JButton btnHeroiRendicao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHeroiDanoRecebido;
    private javax.swing.JLabel labelOutputNomeHeroi;
    private javax.swing.JLabel labelOutputNomeVilao;
    private javax.swing.JLabel labelStatusBatalha;
    private javax.swing.JLabel labelStatusBatalhaMotivo;
    private javax.swing.JLabel labelTitleNomeHeroi;
    private javax.swing.JLabel labelTitleNomeVilao;
    private javax.swing.JLabel labelVilaoAcao;
    private javax.swing.JLabel labelVilaoDanoRecebido;
    private javax.swing.JPanel panelAcoesHeroi;
    private javax.swing.JPanel panelAcoesVilao;
    private javax.swing.JPanel panelCampoBatalha;
    private javax.swing.JPanel panelHeroi;
    private javax.swing.JPanel panelVilao;
    private javax.swing.JProgressBar progbarLifeStatusHeroi;
    private javax.swing.JProgressBar progbarLifeStatusVilao;
    // End of variables declaration//GEN-END:variables
    
//    Funções para a batalha
    private void batalhaComeca(){
        if(heroi1.estaVivo() && v1.estaVivo()){
            batalhaAtacar(heroi1, v1);
//            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
            if(v1.estaVivo()){
                vilaoAtaca();
                batalhaAtacar(v1, heroi1);
//                try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
                if(!heroi1.estaVivo()){
                    batalhaTermina(aniquilacao);
                } else {
                    visibleOn(this.btnHeroiAtacar);
                    visibleOn(this.btnHeroiRendicao);
                }
            } else {
                batalhaTermina(aniquilacao);
            }
        } else {
            batalhaTermina(aniquilacao);
        }
    }
    
    private void batalhaTermina(int motivo) {
//        motivo:
//          0 = Rendição
//          1 = Aniquilação
        visibleOff(this.btnHeroiAtacar);
        visibleOff(this.btnHeroiRendicao);
        batalhaResultado(motivo);
    }
    
    private void visibleOn(javax.swing.JButton btn){
        btn.setVisible(true);
    }
    private void visibleOff(javax.swing.JButton btn){
        btn.setVisible(false);
    }
    
    private void batalhaAtacar(Personagem atacante, Personagem alvo){
        int dano = atacante.atacar(alvo);
        setLifeStatus(alvo, dano);
    }

    private void setLifeStatus(Personagem charter, int dano) {
        if(charter instanceof Vilao){
            this.progbarLifeStatusVilao.setValue(charter.getVidaAtual());
            this.progbarLifeStatusVilao.setString(charter.getVidaAtual()+"/"+charter.getVidaMaxima());
            if(dano<1){
                this.labelVilaoDanoRecebido.setText("Errou");
            }else{
                this.labelVilaoDanoRecebido.setText("-"+dano);
            }
        }else{
            this.progbarLifeStatusHeroi.setValue(charter.getVidaAtual());
            this.progbarLifeStatusHeroi.setString(charter.getVidaAtual()+"/"+charter.getVidaMaxima());
            if(dano<1){
                this.labelHeroiDanoRecebido.setText("Errou");
            }else{
                this.labelHeroiDanoRecebido.setText("-"+dano);
            }
        }
    }

    private void vilaoAtaca() {
        this.labelVilaoAcao.setText("Vilão Ataca!");
//        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        this.labelVilaoAcao.setText("(...)");
    }
    
    private void rendicao(Personagem charter){
        
//        if(charter instanceof Vilao){
            int retirarLife = charter.getVidaAtual();
            charter.setVidaAtual(0);
            setLifeStatus(charter, retirarLife);
            batalhaTermina(rendicao);
            
//        } else {
//            this.labelStatusBatalha.setText("O Vilão \""+v1.getName()+"\" Venceu!!!");
//        }
    }

    private void batalhaResultado(int motivo) {
        if(heroi1.estaVivo()&&!(v1.estaVivo())){
            this.labelStatusBatalha.setText("O HERÓI \""+heroi1.getName()+"\" VENCEU!!!");
        }else{
            this.labelStatusBatalha.setText("O VILÃO \""+v1.getName()+"\" VENCEU!!!");
        }

        switch (motivo){
            case 0 -> this.labelStatusBatalhaMotivo.setText("Vitória por Rendição");
            case 1 -> this.labelStatusBatalhaMotivo.setText("Vitória por Aniquilação");
        }
    }
}
