/*
    Classe que contem a interface da Simulação da codificação (criptpgrafia ou decriptografia), ou seja,
mostra o caminho da informação e suas modificações pelo trajeto.
    Utiliza o metodo Converter() da classe Converter, para mostrar a letra correspondente na interface.
    OBS: na maquina o dado era tratodo por números. 
*/
package simuladorenigma;


public class Simulacao extends javax.swing.JFrame {
    Converter conv = new Converter();
    
    public void iniciar(int e, int s, int ro11,int ro12,int ro21, int ro22, int ro31, int ro32, int an11,int an12, int an21, int an22, int an31,int an32, int p1,int p2,int rf1,int rf2){
        
        char en = conv.Converter(e);
        entrada.setText(""+en);
        
        char sn = conv.Converter(s);
        saida.setText(""+sn);
        
        char p1n = conv.Converter(p1);
        pp1.setText(""+p1n);
        
        char p2n = conv.Converter(p2);
        pp2.setText(""+p2n);
        
        char ro11n = conv.Converter(ro11);
        r11.setText(""+ro11n);
        
        char ro12n = conv.Converter(ro12);
        r12.setText(""+ro12n);
        
        char ro21n = conv.Converter(ro21);
        r21.setText(""+ro21n);
        
        char ro22n = conv.Converter(ro22);
        r22.setText(""+ro22n);
        
        char ro31n = conv.Converter(ro31);
        r31.setText(""+ro31n);
        
        char ro32n = conv.Converter(ro32);
        r32.setText(""+ro32n);
        
        char an11n = conv.Converter(an11);
        a11.setText(""+an11n);
        
        char an12n = conv.Converter(an12);
        a12.setText(""+an12n);
        
        char an21n = conv.Converter(an21);
        a21.setText(""+an21n);
        
        char an22n = conv.Converter(an22);
        a22.setText(""+an22n);
        
        char an31n = conv.Converter(an31);
        a31.setText(""+an31n);
        
        char an32n = conv.Converter(an32);
        a32.setText(""+an32n);
        
        char rf1n = conv.Converter(rf1);
        refletor1.setText(""+rf1n);
        
        char rf2n = conv.Converter(rf2);
        refletor2.setText(""+rf2n);
    }
    
    public Simulacao() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField19 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        entrada = new javax.swing.JLabel();
        saida = new javax.swing.JLabel();
        pp1 = new javax.swing.JLabel();
        r11 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        a21 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        a31 = new javax.swing.JLabel();
        refletor1 = new javax.swing.JLabel();
        refletor2 = new javax.swing.JLabel();
        a32 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        a22 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        pp2 = new javax.swing.JLabel();
        setaRefletor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        setaDireita = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        SetaEsquerda = new javax.swing.JLabel();
        SetaEsquerda1 = new javax.swing.JLabel();
        SetaEsquerda2 = new javax.swing.JLabel();
        SetaEsquerda3 = new javax.swing.JLabel();
        SetaEsquerda4 = new javax.swing.JLabel();
        parafuso = new javax.swing.JLabel();
        parafuso1 = new javax.swing.JLabel();
        parafuso2 = new javax.swing.JLabel();
        parafuso3 = new javax.swing.JLabel();
        parafuso4 = new javax.swing.JLabel();
        parafuso5 = new javax.swing.JLabel();
        parafuso6 = new javax.swing.JLabel();
        parafuso7 = new javax.swing.JLabel();
        parafuso8 = new javax.swing.JLabel();

        jTextField19.setText("jTextField19");

        jLabel27.setText("jLabel27");

        setTitle("Simulacao Criptografia");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(108, 106, 105));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Painel de PLugs");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teclado");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saida");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rotor1");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Anel 1");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rotor 2");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Anel 2");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rotor 3");

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Anel 3");

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Refletor");

        entrada.setBackground(new java.awt.Color(204, 204, 204));
        entrada.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        entrada.setForeground(new java.awt.Color(255, 255, 255));
        entrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        entrada.setPreferredSize(new java.awt.Dimension(60, 60));

        saida.setBackground(new java.awt.Color(255, 255, 255));
        saida.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        saida.setForeground(new java.awt.Color(255, 255, 255));
        saida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        saida.setPreferredSize(new java.awt.Dimension(60, 60));

        pp1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        pp1.setForeground(new java.awt.Color(255, 255, 255));
        pp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pp1.setPreferredSize(new java.awt.Dimension(40, 40));

        r11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        r11.setForeground(new java.awt.Color(255, 255, 255));
        r11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        r11.setPreferredSize(new java.awt.Dimension(40, 40));

        a11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        a11.setForeground(new java.awt.Color(255, 255, 255));
        a11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a11.setPreferredSize(new java.awt.Dimension(40, 40));

        r21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        r21.setForeground(new java.awt.Color(255, 255, 255));
        r21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        r21.setPreferredSize(new java.awt.Dimension(40, 40));

        a21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        a21.setForeground(new java.awt.Color(255, 255, 255));
        a21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a21.setPreferredSize(new java.awt.Dimension(40, 40));

        r31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        r31.setForeground(new java.awt.Color(255, 255, 255));
        r31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        r31.setPreferredSize(new java.awt.Dimension(40, 40));

        a31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        a31.setForeground(new java.awt.Color(255, 255, 255));
        a31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a31.setPreferredSize(new java.awt.Dimension(40, 40));

        refletor1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        refletor1.setForeground(new java.awt.Color(255, 255, 255));
        refletor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refletor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        refletor1.setPreferredSize(new java.awt.Dimension(40, 40));

        refletor2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        refletor2.setForeground(new java.awt.Color(255, 255, 255));
        refletor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refletor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        refletor2.setPreferredSize(new java.awt.Dimension(40, 40));

        a32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        a32.setForeground(new java.awt.Color(255, 255, 255));
        a32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a32.setPreferredSize(new java.awt.Dimension(40, 40));

        r32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        r32.setForeground(new java.awt.Color(255, 255, 255));
        r32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        r32.setPreferredSize(new java.awt.Dimension(40, 40));

        a22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        a22.setForeground(new java.awt.Color(255, 255, 255));
        a22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a22.setPreferredSize(new java.awt.Dimension(40, 40));

        r22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        r22.setForeground(new java.awt.Color(255, 255, 255));
        r22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        r22.setPreferredSize(new java.awt.Dimension(40, 40));

        a12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        a12.setForeground(new java.awt.Color(255, 255, 255));
        a12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a12.setPreferredSize(new java.awt.Dimension(40, 40));

        r12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        r12.setForeground(new java.awt.Color(255, 255, 255));
        r12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        r12.setPreferredSize(new java.awt.Dimension(40, 40));

        pp2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        pp2.setForeground(new java.awt.Color(255, 255, 255));
        pp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pp2.setPreferredSize(new java.awt.Dimension(40, 40));

        setaRefletor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaRefletor.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorDireita.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorDireita.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorDireita.png"))); // NOI18N

        setaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorDireita.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorDireita.png"))); // NOI18N

        SetaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorEsquerda.png"))); // NOI18N

        SetaEsquerda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorEsquerda.png"))); // NOI18N

        SetaEsquerda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorEsquerda.png"))); // NOI18N

        SetaEsquerda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorEsquerda.png"))); // NOI18N

        SetaEsquerda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaSimuladorEsquerda.png"))); // NOI18N

        parafuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(parafuso1)
                        .addGap(200, 200, 200)
                        .addComponent(parafuso2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(setaRefletor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(parafuso)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(refletor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SetaEsquerda3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(refletor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(parafuso5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SetaEsquerda1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SetaEsquerda4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parafuso6)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(setaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(parafuso7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(SetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SetaEsquerda2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(11, 11, 11)
                        .addComponent(parafuso3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parafuso4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(parafuso8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addComponent(parafuso)
                    .addComponent(parafuso5)
                    .addComponent(parafuso6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(setaRefletor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(refletor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(refletor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SetaEsquerda3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(r31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SetaEsquerda1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(r21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SetaEsquerda4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(setaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(3, 3, 3)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SetaEsquerda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(pp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(SetaEsquerda2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parafuso1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parafuso8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parafuso7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(parafuso2)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(parafuso3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parafuso4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Simulacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SetaEsquerda;
    private javax.swing.JLabel SetaEsquerda1;
    private javax.swing.JLabel SetaEsquerda2;
    private javax.swing.JLabel SetaEsquerda3;
    private javax.swing.JLabel SetaEsquerda4;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a21;
    private javax.swing.JLabel a22;
    private javax.swing.JLabel a31;
    private javax.swing.JLabel a32;
    private javax.swing.JLabel entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JLabel parafuso;
    private javax.swing.JLabel parafuso1;
    private javax.swing.JLabel parafuso2;
    private javax.swing.JLabel parafuso3;
    private javax.swing.JLabel parafuso4;
    private javax.swing.JLabel parafuso5;
    private javax.swing.JLabel parafuso6;
    private javax.swing.JLabel parafuso7;
    private javax.swing.JLabel parafuso8;
    private javax.swing.JLabel pp1;
    private javax.swing.JLabel pp2;
    private javax.swing.JLabel r11;
    private javax.swing.JLabel r12;
    private javax.swing.JLabel r21;
    private javax.swing.JLabel r22;
    private javax.swing.JLabel r31;
    private javax.swing.JLabel r32;
    private javax.swing.JLabel refletor1;
    private javax.swing.JLabel refletor2;
    private javax.swing.JLabel saida;
    private javax.swing.JLabel setaDireita;
    private javax.swing.JLabel setaRefletor;
    // End of variables declaration//GEN-END:variables
}
