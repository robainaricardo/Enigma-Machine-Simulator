/*
Classe que implementa a interface(GUI) do painel de plugs
*/
package simuladorenigma;


public class PainelPlugs extends javax.swing.JFrame {

    int cabo11 = 1, cabo12 = 1, cabo21 = 1, cabo22 = 1, cabo31 = 1, cabo32 = 1, cabo41 = 1, cabo42 = 1, cabo51 = 1, cabo52 = 1, cabo61 = 1, cabo62 = 1, cabo71 = 1, cabo72 = 1, cabo81 = 1, cabo82 = 1;

    public int getCabo11() {
        return cabo11;
    }

    public int getCabo12() {
        return cabo12;
    }

    public int getCabo21() {
        return cabo21;
    }

    public int getCabo22() {
        return cabo22;
    }

    public int getCabo31() {
        return cabo31;
    }

    public int getCabo32() {
        return cabo32;
    }

    public int getCabo41() {
        return cabo41;
    }

    public int getCabo42() {
        return cabo42;
    }

    public int getCabo51() {
        return cabo51;
    }

    public int getCabo52() {
        return cabo52;
    }

    public int getCabo61() {
        return cabo61;
    }

    public int getCabo62() {
        return cabo62;
    }

    public int getCabo71() {
        return cabo71;
    }

    public int getCabo72() {
        return cabo72;
    }

    public int getCabo81() {
        return cabo81;
    }

    public int getCabo82() {
        return cabo82;
    }
    
    
    
    public PainelPlugs() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parafuso3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lCabo2 = new javax.swing.JLabel();
        lCabo3 = new javax.swing.JLabel();
        lCabo4 = new javax.swing.JLabel();
        lCabo5 = new javax.swing.JLabel();
        lCabo6 = new javax.swing.JLabel();
        lCabo7 = new javax.swing.JLabel();
        box42 = new javax.swing.JComboBox();
        box82 = new javax.swing.JComboBox();
        box81 = new javax.swing.JComboBox();
        box21 = new javax.swing.JComboBox();
        box22 = new javax.swing.JComboBox();
        box61 = new javax.swing.JComboBox();
        box62 = new javax.swing.JComboBox();
        box72 = new javax.swing.JComboBox();
        box71 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        box11 = new javax.swing.JComboBox();
        box12 = new javax.swing.JComboBox();
        box52 = new javax.swing.JComboBox();
        box51 = new javax.swing.JComboBox();
        box31 = new javax.swing.JComboBox();
        box32 = new javax.swing.JComboBox();
        box41 = new javax.swing.JComboBox();
        lCabo = new javax.swing.JLabel();
        lCabo1 = new javax.swing.JLabel();
        parafuso = new javax.swing.JLabel();
        parafuso1 = new javax.swing.JLabel();
        parafuso2 = new javax.swing.JLabel();
        parafuso4 = new javax.swing.JLabel();
        parafuso5 = new javax.swing.JLabel();
        parafuso6 = new javax.swing.JLabel();

        parafuso3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        setTitle("Painel de Plugs");
        setBackground(new java.awt.Color(108, 106, 105));
        setForeground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(108, 106, 105));
        jPanel1.setToolTipText("Painel de PLugs");

        lCabo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        lCabo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        lCabo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        lCabo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        lCabo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        lCabo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        box42.setBackground(new java.awt.Color(204, 204, 204));
        box42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box42.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box42ActionPerformed(evt);
            }
        });

        box82.setBackground(new java.awt.Color(204, 204, 204));
        box82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box82.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box82ActionPerformed(evt);
            }
        });

        box81.setBackground(new java.awt.Color(204, 204, 204));
        box81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box81.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box81ActionPerformed(evt);
            }
        });

        box21.setBackground(new java.awt.Color(204, 204, 204));
        box21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box21ActionPerformed(evt);
            }
        });

        box22.setBackground(new java.awt.Color(204, 204, 204));
        box22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box22.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box22ActionPerformed(evt);
            }
        });

        box61.setBackground(new java.awt.Color(204, 204, 204));
        box61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box61.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box61ActionPerformed(evt);
            }
        });

        box62.setBackground(new java.awt.Color(204, 204, 204));
        box62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box62.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box62ActionPerformed(evt);
            }
        });

        box72.setBackground(new java.awt.Color(204, 204, 204));
        box72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box72.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box72ActionPerformed(evt);
            }
        });

        box71.setBackground(new java.awt.Color(204, 204, 204));
        box71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box71.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box71ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Concluido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        box11.setBackground(new java.awt.Color(204, 204, 204));
        box11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box11ActionPerformed(evt);
            }
        });

        box12.setBackground(new java.awt.Color(204, 204, 204));
        box12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box12ActionPerformed(evt);
            }
        });

        box52.setBackground(new java.awt.Color(204, 204, 204));
        box52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box52.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box52ActionPerformed(evt);
            }
        });

        box51.setBackground(new java.awt.Color(204, 204, 204));
        box51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box51.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box51ActionPerformed(evt);
            }
        });

        box31.setBackground(new java.awt.Color(204, 204, 204));
        box31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box31.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box31ActionPerformed(evt);
            }
        });

        box32.setBackground(new java.awt.Color(204, 204, 204));
        box32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box32.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box32ActionPerformed(evt);
            }
        });

        box41.setBackground(new java.awt.Color(204, 204, 204));
        box41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box41.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        box41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box41ActionPerformed(evt);
            }
        });

        lCabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        lCabo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/cabo.png"))); // NOI18N

        parafuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parafuso2)
                    .addComponent(parafuso1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(box41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCabo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lCabo2)
                                        .addComponent(lCabo3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(box32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(box22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(box11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lCabo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(box51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lCabo5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lCabo7)
                                            .addComponent(lCabo6)))
                                    .addComponent(lCabo4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parafuso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parafuso4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parafuso6)
                    .addComponent(parafuso5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(parafuso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(parafuso2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(parafuso5)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(box51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(lCabo4)))
                                    .addComponent(box11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lCabo1)
                                    .addComponent(box12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(box22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(box21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(box32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(box31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(box42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(box41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lCabo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lCabo3)
                                                .addGap(18, 18, 18)
                                                .addComponent(lCabo2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(box61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(box71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(box81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lCabo5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lCabo6))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(box62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(box72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lCabo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(box82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(parafuso6)
                                    .addComponent(jButton1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(parafuso)
                        .addGap(217, 217, 217)
                        .addComponent(parafuso4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box11ActionPerformed

    private void box12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box12ActionPerformed

    private void box52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box52ActionPerformed

    private void box51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box51ActionPerformed

    private void box31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box31ActionPerformed

    private void box32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box32ActionPerformed

    private void box41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box41ActionPerformed

    private void box42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box42ActionPerformed

    private void box82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box82ActionPerformed

    private void box81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box81ActionPerformed

    private void box21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box21ActionPerformed

    private void box22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box22ActionPerformed

    private void box61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box61ActionPerformed

    private void box62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box62ActionPerformed

    private void box72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box72ActionPerformed

    private void box71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box71ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cabo11 = (box11.getSelectedIndex() + 1);
        cabo12 = (box12.getSelectedIndex() + 1);
        cabo21 = (box21.getSelectedIndex() + 1);
        cabo22 = (box22.getSelectedIndex() + 1);
        cabo31 = (box31.getSelectedIndex() + 1);
        cabo32 = (box32.getSelectedIndex() + 1);
        cabo41 = (box41.getSelectedIndex() + 1);
        cabo42 = (box42.getSelectedIndex() + 1);
        cabo51 = (box51.getSelectedIndex() + 1);
        cabo52 = (box52.getSelectedIndex() + 1);
        cabo61 = (box61.getSelectedIndex() + 1);
        cabo62 = (box62.getSelectedIndex() + 1);
        cabo71 = (box71.getSelectedIndex() + 1);
        cabo72 = (box72.getSelectedIndex() + 1);
        cabo81 = (box81.getSelectedIndex() + 1);
        cabo82 = (box82.getSelectedIndex() + 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    
    //o + 1 é deivo a primeira posição do box retornar 0;
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cabo11 = (box11.getSelectedIndex() + 1);
        cabo12 = (box12.getSelectedIndex() + 1);
        cabo21 = (box21.getSelectedIndex() + 1);
        cabo22 = (box22.getSelectedIndex() + 1);
        cabo31 = (box31.getSelectedIndex() + 1);
        cabo32 = (box32.getSelectedIndex() + 1);
        cabo41 = (box41.getSelectedIndex() + 1);
        cabo42 = (box42.getSelectedIndex() + 1);
        cabo51 = (box51.getSelectedIndex() + 1);
        cabo52 = (box52.getSelectedIndex() + 1);
        cabo61 = (box61.getSelectedIndex() + 1);
        cabo62 = (box62.getSelectedIndex() + 1);
        cabo71 = (box71.getSelectedIndex() + 1);
        cabo72 = (box72.getSelectedIndex() + 1);
        cabo81 = (box81.getSelectedIndex() + 1);
        cabo82 = (box82.getSelectedIndex() + 1);
    }//GEN-LAST:event_formWindowClosing

    
    
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
            java.util.logging.Logger.getLogger(PainelPlugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPlugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPlugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPlugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPlugs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box11;
    private javax.swing.JComboBox box12;
    private javax.swing.JComboBox box21;
    private javax.swing.JComboBox box22;
    private javax.swing.JComboBox box31;
    private javax.swing.JComboBox box32;
    private javax.swing.JComboBox box41;
    private javax.swing.JComboBox box42;
    private javax.swing.JComboBox box51;
    private javax.swing.JComboBox box52;
    private javax.swing.JComboBox box61;
    private javax.swing.JComboBox box62;
    private javax.swing.JComboBox box71;
    private javax.swing.JComboBox box72;
    private javax.swing.JComboBox box81;
    private javax.swing.JComboBox box82;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCabo;
    private javax.swing.JLabel lCabo1;
    private javax.swing.JLabel lCabo2;
    private javax.swing.JLabel lCabo3;
    private javax.swing.JLabel lCabo4;
    private javax.swing.JLabel lCabo5;
    private javax.swing.JLabel lCabo6;
    private javax.swing.JLabel lCabo7;
    private javax.swing.JLabel parafuso;
    private javax.swing.JLabel parafuso1;
    private javax.swing.JLabel parafuso2;
    private javax.swing.JLabel parafuso3;
    private javax.swing.JLabel parafuso4;
    private javax.swing.JLabel parafuso5;
    private javax.swing.JLabel parafuso6;
    // End of variables declaration//GEN-END:variables
}
