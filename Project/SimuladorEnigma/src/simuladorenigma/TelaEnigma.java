/*
Clase que implementa a maquina e todas as suas funções.
*/

package simuladorenigma;


public class TelaEnigma extends javax.swing.JFrame {

    int pR1 = 1;
    int pR2 = 1;
    int pR3 = 1;
    int pA1 = 1;
    int pA2 = 1;
    int pA3 = 1;
    int cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82;
    int entrada;
    char saidaChar;
    Converter converter = new Converter();
    SetarAneis setar = new SetarAneis();
    PainelPlugs plug = new PainelPlugs();
    int luzAtual = 0;
    
       
    public int getpR1() {
        return pR1;
    }

    public int getpR2() {
        return pR2;
    }

    public void setpA1(int pA1) {
        this.pA1 = pA1;
    }

    public void setpA2(int pA2) {
        this.pA2 = pA2;
    }

    public void setpA3(int pA3) {
        this.pA3 = pA3;
    }

    public int getpR3() {
        return pR3;
    }
    
    
    public TelaEnigma() {
        initComponents();
    }
    
    public void ligaLuz(int a){
        switch(a){
            case 1:
                saida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLA.png")));      
            break;
            case 2:
                saida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLB.png")));
            break;
            case 3:
                saida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLC.png")));
            break;
            case 4:
                saida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLD.png")));
            break;
            case 5:
                saida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLE.png")));
            break;
            case 6:
                saida6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLF.png")));
            break;
            case 7:
                saida7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLG.png")));
            break;
            case 8:
                saida8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLH.png")));
            break;
            case 9:
                saida9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLI.png")));
            break;
            case 10:
                saida10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLJ.png")));
            break;
            case 11:
                saida11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLK.png")));
            break;
            case 12:
                saida12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLL.png")));
            break;
            case 13:
                saida13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLM.png")));
            break;
            case 14:
                saida14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLN.png")));
            break;
            case 15:
                saida15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLO.png")));
            break;
            case 16:
                saida16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLP.png")));
            break;
            case 17:
                saida17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLQ.png")));
            break;
            case 18:
                saida18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLR.png")));
            break;
            case 19:
                saida19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLS.png")));
            break;
            case 20:
                saida20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLT.png")));
            break;
            case 21:
                saida21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLU.png")));
            break;
            case 22:
                saida22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLV.png")));
            break;
            case 23:
                saida23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLW.png")));
            break;
            case 24:
                saida24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLX.png")));
            break;
            case 25:
                saida25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLY.png")));
            break;
            case 26:
                saida26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaLZ.png")));
            break;
        }
    }
    
    public void desligaLuz(int a){
        switch(a){
            case 1:
                saida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDA.png")));      
            break;
            case 2:
                saida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDB.png")));
            break;
            case 3:
                saida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDC.png")));
            break;
            case 4:
                saida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDD.png")));
            break;
            case 5:
                saida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDE.png")));
            break;
            case 6:
                saida6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDF.png")));
            break;
            case 7:
                saida7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDG.png")));
            break;
            case 8:
                saida8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDH.png")));
            break;
            case 9:
                saida9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDI.png")));
            break;
            case 10:
                saida10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDJ.png")));
            break;
            case 11:
                saida11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDK.png")));
            break;
            case 12:
                saida12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDL.png")));
            break;
            case 13:
                saida13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDM.png")));
            break;
            case 14:
                saida14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDN.png")));
            break;
            case 15:
                saida15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDO.png")));
            break;
            case 16:
                saida16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDP.png")));
            break;
            case 17:
                saida17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDQ.png")));
            break;
            case 18:
                saida18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDR.png")));
            break;
            case 19:
                saida19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDS.png")));
            break;
            case 20:
                saida20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDT.png")));
            break;
            case 21:
                saida21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDU.png")));
            break;
            case 22:
                saida22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDV.png")));
            break;
            case 23:
                saida23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDW.png")));
            break;
            case 24:
                saida24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDX.png")));
            break;
            case 25:
                saida25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDY.png")));
            break;
            case 26:
                saida26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDZ.png")));
            break;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parafuso8 = new javax.swing.JLabel();
        parafuso19 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        bQ = new javax.swing.JButton();
        bW = new javax.swing.JButton();
        bE = new javax.swing.JButton();
        bR = new javax.swing.JButton();
        bT = new javax.swing.JButton();
        bZ = new javax.swing.JButton();
        bU = new javax.swing.JButton();
        bI = new javax.swing.JButton();
        bO = new javax.swing.JButton();
        bA = new javax.swing.JButton();
        bS = new javax.swing.JButton();
        bD = new javax.swing.JButton();
        bF = new javax.swing.JButton();
        bG = new javax.swing.JButton();
        bH = new javax.swing.JButton();
        bJ = new javax.swing.JButton();
        bK = new javax.swing.JButton();
        bP = new javax.swing.JButton();
        bY = new javax.swing.JButton();
        bX = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bV = new javax.swing.JButton();
        bB = new javax.swing.JButton();
        bN = new javax.swing.JButton();
        bM = new javax.swing.JButton();
        bL = new javax.swing.JButton();
        lRotor1 = new javax.swing.JLabel();
        lRotor2 = new javax.swing.JLabel();
        lRotor3 = new javax.swing.JLabel();
        bMaisR2 = new javax.swing.JButton();
        bMaisR3 = new javax.swing.JButton();
        bMaisR1 = new javax.swing.JButton();
        bMenosR3 = new javax.swing.JButton();
        bMenosR2 = new javax.swing.JButton();
        bMenosR1 = new javax.swing.JButton();
        jLabelSimboloEnigma = new javax.swing.JLabel();
        saida17 = new javax.swing.JLabel();
        saida23 = new javax.swing.JLabel();
        saida5 = new javax.swing.JLabel();
        saida18 = new javax.swing.JLabel();
        saida20 = new javax.swing.JLabel();
        saida26 = new javax.swing.JLabel();
        saida21 = new javax.swing.JLabel();
        saida9 = new javax.swing.JLabel();
        saida15 = new javax.swing.JLabel();
        saida1 = new javax.swing.JLabel();
        saida19 = new javax.swing.JLabel();
        saida4 = new javax.swing.JLabel();
        saida6 = new javax.swing.JLabel();
        saida7 = new javax.swing.JLabel();
        saida8 = new javax.swing.JLabel();
        saida10 = new javax.swing.JLabel();
        saida11 = new javax.swing.JLabel();
        saida16 = new javax.swing.JLabel();
        saida25 = new javax.swing.JLabel();
        saida24 = new javax.swing.JLabel();
        saida3 = new javax.swing.JLabel();
        saida22 = new javax.swing.JLabel();
        saida2 = new javax.swing.JLabel();
        saida14 = new javax.swing.JLabel();
        saida13 = new javax.swing.JLabel();
        saida12 = new javax.swing.JLabel();
        bLigar = new javax.swing.JToggleButton();
        bAnel = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bSimulacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        parafuso = new javax.swing.JLabel();
        parafuso1 = new javax.swing.JLabel();
        parafuso2 = new javax.swing.JLabel();
        parafuso3 = new javax.swing.JLabel();
        parafuso4 = new javax.swing.JLabel();
        parafuso5 = new javax.swing.JLabel();
        parafuso7 = new javax.swing.JLabel();
        parafuso9 = new javax.swing.JLabel();
        argola = new javax.swing.JLabel();
        parafuso11 = new javax.swing.JLabel();
        parafuso16 = new javax.swing.JLabel();
        parafuso17 = new javax.swing.JLabel();
        parafuso20 = new javax.swing.JLabel();
        bPlugs = new javax.swing.JButton();
        parafuso10 = new javax.swing.JLabel();
        parafuso21 = new javax.swing.JLabel();
        parafuso22 = new javax.swing.JLabel();
        parafuso23 = new javax.swing.JLabel();
        parafuso24 = new javax.swing.JLabel();
        parafuso25 = new javax.swing.JLabel();

        parafuso8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador Enigma");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(108, 106, 105));
        jPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.setPreferredSize(new java.awt.Dimension(874, 798));

        bQ.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bQ.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bQ.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoQ.png"))); // NOI18N
        bQ.setBorder(null);
        bQ.setPreferredSize(new java.awt.Dimension(60, 60));
        bQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQActionPerformed(evt);
            }
        });

        bW.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bW.setFont(new java.awt.Font("Tunga", 1, 22)); // NOI18N
        bW.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoW.png"))); // NOI18N
        bW.setBorder(null);
        bW.setPreferredSize(new java.awt.Dimension(60, 60));
        bW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWActionPerformed(evt);
            }
        });

        bE.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bE.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bE.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoE.png"))); // NOI18N
        bE.setBorder(null);
        bE.setPreferredSize(new java.awt.Dimension(60, 60));
        bE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEActionPerformed(evt);
            }
        });

        bR.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bR.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bR.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoR.png"))); // NOI18N
        bR.setBorder(null);
        bR.setPreferredSize(new java.awt.Dimension(60, 60));
        bR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRActionPerformed(evt);
            }
        });

        bT.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bT.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bT.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoT.png"))); // NOI18N
        bT.setBorder(null);
        bT.setPreferredSize(new java.awt.Dimension(60, 60));
        bT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTActionPerformed(evt);
            }
        });

        bZ.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bZ.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bZ.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoZ.png"))); // NOI18N
        bZ.setBorder(null);
        bZ.setPreferredSize(new java.awt.Dimension(60, 60));
        bZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZActionPerformed(evt);
            }
        });

        bU.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bU.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bU.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoU.png"))); // NOI18N
        bU.setBorder(null);
        bU.setPreferredSize(new java.awt.Dimension(60, 60));
        bU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUActionPerformed(evt);
            }
        });

        bI.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bI.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bI.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoI.png"))); // NOI18N
        bI.setBorder(null);
        bI.setPreferredSize(new java.awt.Dimension(60, 60));
        bI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIActionPerformed(evt);
            }
        });

        bO.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bO.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bO.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoO.png"))); // NOI18N
        bO.setBorder(null);
        bO.setPreferredSize(new java.awt.Dimension(60, 60));
        bO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOActionPerformed(evt);
            }
        });

        bA.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bA.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bA.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoA.png"))); // NOI18N
        bA.setBorder(null);
        bA.setPreferredSize(new java.awt.Dimension(50, 50));
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
            }
        });

        bS.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bS.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bS.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoS.png"))); // NOI18N
        bS.setBorder(null);
        bS.setPreferredSize(new java.awt.Dimension(60, 60));
        bS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSActionPerformed(evt);
            }
        });

        bD.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bD.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bD.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoD.png"))); // NOI18N
        bD.setBorder(null);
        bD.setPreferredSize(new java.awt.Dimension(60, 60));
        bD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDActionPerformed(evt);
            }
        });

        bF.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bF.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bF.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoF.png"))); // NOI18N
        bF.setBorder(null);
        bF.setPreferredSize(new java.awt.Dimension(60, 60));
        bF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFActionPerformed(evt);
            }
        });

        bG.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bG.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bG.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoG.png"))); // NOI18N
        bG.setBorder(null);
        bG.setPreferredSize(new java.awt.Dimension(60, 60));
        bG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGActionPerformed(evt);
            }
        });

        bH.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bH.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bH.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoH.png"))); // NOI18N
        bH.setBorder(null);
        bH.setPreferredSize(new java.awt.Dimension(50, 50));
        bH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHActionPerformed(evt);
            }
        });

        bJ.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bJ.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bJ.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoJ.png"))); // NOI18N
        bJ.setBorder(null);
        bJ.setPreferredSize(new java.awt.Dimension(60, 60));
        bJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJActionPerformed(evt);
            }
        });

        bK.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bK.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bK.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoK.png"))); // NOI18N
        bK.setBorder(null);
        bK.setPreferredSize(new java.awt.Dimension(60, 60));
        bK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKActionPerformed(evt);
            }
        });

        bP.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bP.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bP.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoP.png"))); // NOI18N
        bP.setBorder(null);
        bP.setPreferredSize(new java.awt.Dimension(60, 60));
        bP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPActionPerformed(evt);
            }
        });

        bY.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bY.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bY.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoY.png"))); // NOI18N
        bY.setBorder(null);
        bY.setPreferredSize(new java.awt.Dimension(60, 60));
        bY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bYActionPerformed(evt);
            }
        });

        bX.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bX.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bX.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoX.png"))); // NOI18N
        bX.setBorder(null);
        bX.setPreferredSize(new java.awt.Dimension(60, 60));
        bX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXActionPerformed(evt);
            }
        });

        bC.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bC.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bC.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoC.png"))); // NOI18N
        bC.setBorder(null);
        bC.setPreferredSize(new java.awt.Dimension(60, 60));
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        bV.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bV.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bV.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoV.png"))); // NOI18N
        bV.setBorder(null);
        bV.setPreferredSize(new java.awt.Dimension(60, 60));
        bV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVActionPerformed(evt);
            }
        });

        bB.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bB.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bB.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoB.png"))); // NOI18N
        bB.setBorder(null);
        bB.setPreferredSize(new java.awt.Dimension(60, 60));
        bB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBActionPerformed(evt);
            }
        });

        bN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bN.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bN.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoN.png"))); // NOI18N
        bN.setBorder(null);
        bN.setPreferredSize(new java.awt.Dimension(60, 60));
        bN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNActionPerformed(evt);
            }
        });

        bM.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bM.setFont(new java.awt.Font("Tunga", 1, 23)); // NOI18N
        bM.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoM.png"))); // NOI18N
        bM.setBorder(null);
        bM.setPreferredSize(new java.awt.Dimension(60, 60));
        bM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMActionPerformed(evt);
            }
        });

        bL.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bL.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        bL.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoL.png"))); // NOI18N
        bL.setBorder(null);
        bL.setPreferredSize(new java.awt.Dimension(60, 60));
        bL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLActionPerformed(evt);
            }
        });

        lRotor1.setBackground(new java.awt.Color(255, 255, 255));
        lRotor1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lRotor1.setForeground(new java.awt.Color(255, 255, 255));
        lRotor1.setText("1");
        lRotor1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        lRotor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lRotor1.setPreferredSize(new java.awt.Dimension(15, 30));

        lRotor2.setBackground(new java.awt.Color(255, 255, 255));
        lRotor2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lRotor2.setForeground(new java.awt.Color(255, 255, 255));
        lRotor2.setText("1");
        lRotor2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        lRotor2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lRotor2.setPreferredSize(new java.awt.Dimension(15, 30));

        lRotor3.setBackground(new java.awt.Color(255, 255, 255));
        lRotor3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lRotor3.setForeground(new java.awt.Color(255, 255, 255));
        lRotor3.setText("1");
        lRotor3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        lRotor3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lRotor3.setPreferredSize(new java.awt.Dimension(15, 30));

        bMaisR2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisR2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaCima.png"))); // NOI18N
        bMaisR2.setBorder(null);
        bMaisR2.setPreferredSize(new java.awt.Dimension(32, 28));
        bMaisR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisR2ActionPerformed(evt);
            }
        });

        bMaisR3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisR3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaCima.png"))); // NOI18N
        bMaisR3.setBorder(null);
        bMaisR3.setPreferredSize(new java.awt.Dimension(32, 28));
        bMaisR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisR3ActionPerformed(evt);
            }
        });

        bMaisR1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisR1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaCima.png"))); // NOI18N
        bMaisR1.setBorder(null);
        bMaisR1.setPreferredSize(new java.awt.Dimension(32, 28));
        bMaisR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisR1ActionPerformed(evt);
            }
        });

        bMenosR3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosR3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaBaixo.png"))); // NOI18N
        bMenosR3.setBorder(null);
        bMenosR3.setPreferredSize(new java.awt.Dimension(32, 28));
        bMenosR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosR3ActionPerformed(evt);
            }
        });

        bMenosR2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosR2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaBaixo.png"))); // NOI18N
        bMenosR2.setBorder(null);
        bMenosR2.setPreferredSize(new java.awt.Dimension(32, 28));
        bMenosR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosR2ActionPerformed(evt);
            }
        });

        bMenosR1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosR1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaBaixo.png"))); // NOI18N
        bMenosR1.setBorder(null);
        bMenosR1.setPreferredSize(new java.awt.Dimension(32, 28));
        bMenosR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosR1ActionPerformed(evt);
            }
        });

        jLabelSimboloEnigma.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabelSimboloEnigma.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabelSimboloEnigma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/simboloEnigma.png"))); // NOI18N

        saida17.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida17.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDQ.png"))); // NOI18N

        saida23.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida23.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDW.png"))); // NOI18N

        saida5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida5.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDE.png"))); // NOI18N

        saida18.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida18.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDR.png"))); // NOI18N

        saida20.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida20.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDT.png"))); // NOI18N

        saida26.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida26.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDZ.png"))); // NOI18N

        saida21.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida21.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDU.png"))); // NOI18N

        saida9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida9.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDI.png"))); // NOI18N

        saida15.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida15.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDO.png"))); // NOI18N

        saida1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDA.png"))); // NOI18N

        saida19.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida19.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDS.png"))); // NOI18N

        saida4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDD.png"))); // NOI18N

        saida6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDF.png"))); // NOI18N

        saida7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDG.png"))); // NOI18N

        saida8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida8.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDH.png"))); // NOI18N

        saida10.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida10.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDJ.png"))); // NOI18N

        saida11.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida11.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDK.png"))); // NOI18N

        saida16.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida16.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDP.png"))); // NOI18N

        saida25.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida25.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDY.png"))); // NOI18N

        saida24.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida24.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDX.png"))); // NOI18N

        saida3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDC.png"))); // NOI18N

        saida22.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida22.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDV.png"))); // NOI18N

        saida2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDB.png"))); // NOI18N

        saida14.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida14.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDN.png"))); // NOI18N

        saida13.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida13.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDM.png"))); // NOI18N

        saida12.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saida12.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        saida12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saida12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/telaDL.png"))); // NOI18N

        bLigar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bLigar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bLigar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoLigar.png"))); // NOI18N
        bLigar.setBorder(null);
        bLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLigarActionPerformed(evt);
            }
        });

        bAnel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bAnel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bAnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/engrenagem.png"))); // NOI18N
        bAnel.setBorder(null);
        bAnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnelActionPerformed(evt);
            }
        });

        jLabel27.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel27.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/rotor.png"))); // NOI18N

        jLabel28.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel28.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/rotor.png"))); // NOI18N

        jLabel29.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel29.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/rotor.png"))); // NOI18N

        bSimulacao.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bSimulacao.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bSimulacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoSimulador.png"))); // NOI18N
        bSimulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimulacaoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/presinhaD.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/presinhaE.PNG"))); // NOI18N

        parafuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        argola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/argola.png"))); // NOI18N

        parafuso11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        bPlugs.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bPlugs.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bPlugs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/botaoPlug.png"))); // NOI18N
        bPlugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlugsActionPerformed(evt);
            }
        });

        parafuso10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(parafuso9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSimboloEnigma, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lRotor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMenosR1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMaisR1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lRotor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMaisR2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMenosR2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bMenosR3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lRotor3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMaisR3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAnel))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(parafuso5)))
                .addGap(27, 27, 27)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(bSimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPlugs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bLigar)
                        .addContainerGap())
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(argola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(parafuso21)
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parafuso10)
                                .addGap(84, 84, 84))))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parafuso25)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)
                            .addComponent(parafuso4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(saida1)
                            .addGap(18, 18, 18)
                            .addComponent(saida19)
                            .addGap(18, 18, 18)
                            .addComponent(saida4)
                            .addGap(18, 18, 18)
                            .addComponent(saida6)
                            .addGap(18, 18, 18)
                            .addComponent(saida7)
                            .addGap(18, 18, 18)
                            .addComponent(saida8)
                            .addGap(18, 18, 18)
                            .addComponent(saida10)
                            .addGap(18, 18, 18)
                            .addComponent(saida11)
                            .addGap(18, 18, 18)
                            .addComponent(parafuso2)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel1))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(parafuso)
                            .addGap(47, 47, 47)
                            .addComponent(saida17)
                            .addGap(18, 18, 18)
                            .addComponent(saida23)
                            .addGap(18, 18, 18)
                            .addComponent(saida5)
                            .addGap(18, 18, 18)
                            .addComponent(saida18)
                            .addGap(18, 18, 18)
                            .addComponent(saida20)
                            .addGap(18, 18, 18)
                            .addComponent(saida26)
                            .addGap(18, 18, 18)
                            .addComponent(saida21)
                            .addGap(18, 18, 18)
                            .addComponent(saida9)
                            .addGap(18, 18, 18)
                            .addComponent(saida15)))
                    .addComponent(parafuso22))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(parafuso20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parafuso23)
                        .addGap(80, 80, 80))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(parafuso16))
                                    .addComponent(parafuso7))
                                .addGap(47, 47, 47)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(saida16)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida25)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida24)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida3)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida22)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida2)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida14)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida13)
                                        .addGap(18, 18, 18)
                                        .addComponent(saida12))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addComponent(bQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addComponent(parafuso3)
                                                .addGap(18, 18, 18)
                                                .addComponent(bA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(parafuso1)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addComponent(bP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelLayout.createSequentialGroup()
                                                        .addComponent(bV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(bB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(bN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(bM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(bL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanelLayout.createSequentialGroup()
                                                        .addGap(22, 22, 22)
                                                        .addComponent(parafuso11)))))
                                        .addGap(42, 42, 42)
                                        .addComponent(parafuso24))))
                            .addComponent(parafuso17))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parafuso9)
                            .addComponent(jLabelSimboloEnigma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(parafuso)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(parafuso17))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(parafuso22))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(argola))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(parafuso21))
                            .addComponent(parafuso10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPlugs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bLigar)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(parafuso5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(bMaisR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lRotor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bMenosR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(bAnel))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(bMaisR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lRotor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMenosR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(bMaisR2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lRotor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMenosR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(saida15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saida21, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saida7)
                        .addComponent(saida6)
                        .addComponent(saida8)
                        .addComponent(saida10)
                        .addComponent(saida11)
                        .addComponent(saida19)
                        .addComponent(saida1)
                        .addComponent(saida4)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(parafuso4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(parafuso2))
                            .addGap(19, 19, 19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saida16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saida25)
                    .addComponent(saida24)
                    .addComponent(saida3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saida22)
                    .addComponent(saida14)
                    .addComponent(saida13)
                    .addComponent(saida12)
                    .addComponent(saida2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(parafuso7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parafuso20))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parafuso25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(parafuso1))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(parafuso3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(parafuso16)
                                    .addComponent(parafuso24))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parafuso11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parafuso23)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
       
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      

    }//GEN-LAST:event_formWindowClosed

    private void bPlugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlugsActionPerformed
        plug.setVisible(true);
    }//GEN-LAST:event_bPlugsActionPerformed

    private void bSimulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimulacaoActionPerformed
        Simulacao sim = new Simulacao();
        sim.iniciar(converter.getE(),converter.getExit(),converter.getR11(),converter.getR12(),converter.getR21(),converter.getR22(),converter.getR31(),converter.getR32(),converter.getA11(), converter.getA12(), converter.getA21(), converter.getA22(), converter.getA31(), converter.getA32(), converter.getPp1(), converter.getPp2(), converter.getRf1(), converter.getRf2());
        sim.setVisible(true);
    }//GEN-LAST:event_bSimulacaoActionPerformed

    private void bAnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnelActionPerformed
        setar.setVisible(true);
        setar.iniciarVariaveis(pR1, pR2, pR3);//para mostrar os valores dos rotores nos painel de aneis
    }//GEN-LAST:event_bAnelActionPerformed

    private void bLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLigarActionPerformed
        pA1 = setar.getPa1();
        pA2 = setar.getPa2();
        pA3 = setar.getPa3();
        cabo11 = plug.getCabo11();
        cabo12 = plug.getCabo12();
        cabo21 = plug.getCabo21();
        cabo22 = plug.getCabo22();
        cabo31 = plug.getCabo31();
        cabo32 = plug.getCabo32();
        cabo41 = plug.getCabo41();
        cabo42 = plug.getCabo42();
        cabo51 = plug.getCabo51();
        cabo52 = plug.getCabo52();
        cabo61 = plug.getCabo61();
        cabo62 = plug.getCabo62();
        cabo71 = plug.getCabo71();
        cabo72 = plug.getCabo72();
        cabo81 = plug.getCabo81();
        cabo82 = plug.getCabo82();
        System.out.printf(cabo11 + "-" + cabo12 + "\n" + cabo21 + cabo22 + "\n" + cabo31 + cabo32 + "\n" + cabo41 + cabo42 + "\n" + cabo51 + cabo52 + "\n" + cabo61 + cabo62 + "\n" + cabo71 + cabo72 + "\n" + cabo81 + cabo82);
    }//GEN-LAST:event_bLigarActionPerformed

    private void bMenosR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosR1ActionPerformed
        if( pR1 >= 2 )
        pR1--;
        else
        pR1 = 26;
        lRotor1.setText(""+pR1);
    }//GEN-LAST:event_bMenosR1ActionPerformed

    private void bMenosR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosR2ActionPerformed
        if( pR2 >= 2 )
        pR2--;
        else
        pR2 = 26;
        lRotor2.setText(""+pR2);
    }//GEN-LAST:event_bMenosR2ActionPerformed

    private void bMenosR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosR3ActionPerformed
        if( pR3 >= 2 )
        pR3--;
        else
        pR3 = 26;
        lRotor3.setText(""+pR3);
    }//GEN-LAST:event_bMenosR3ActionPerformed

    private void bMaisR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisR1ActionPerformed
        if(pR1 <= 25)
        pR1++;
        else
        pR1 = 1;
        lRotor1.setText(""+pR1);
    }//GEN-LAST:event_bMaisR1ActionPerformed

    private void bMaisR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisR3ActionPerformed
        if(pR3 <= 25)
        pR3++;
        else
        pR3 = 1;
        lRotor3.setText(""+pR3);
    }//GEN-LAST:event_bMaisR3ActionPerformed

    private void bMaisR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisR2ActionPerformed
        if(pR2 <= 25)
        pR2++;
        else
        pR2 = 1;
        lRotor2.setText(""+pR2);
    }//GEN-LAST:event_bMaisR2ActionPerformed

    private void bLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLActionPerformed
        entrada = 12;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bLActionPerformed

    private void bMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMActionPerformed
        entrada = 13;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bMActionPerformed

    private void bNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNActionPerformed
        entrada = 14;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bNActionPerformed

    private void bBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBActionPerformed
        entrada = 2;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bBActionPerformed

    private void bVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVActionPerformed
        entrada = 22;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bVActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        entrada = 3;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bCActionPerformed

    private void bXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXActionPerformed
        entrada = 24;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bXActionPerformed

    private void bYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bYActionPerformed
        entrada = 25;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bYActionPerformed

    private void bPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPActionPerformed
        entrada = 16;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bPActionPerformed

    private void bKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKActionPerformed
        entrada = 11;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bKActionPerformed

    private void bJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJActionPerformed
        entrada = 10;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bJActionPerformed

    private void bHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHActionPerformed
        entrada = 8;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bHActionPerformed

    private void bGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGActionPerformed
        entrada = 7;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bGActionPerformed

    private void bFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFActionPerformed
        entrada = 6;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bFActionPerformed

    private void bDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDActionPerformed
        entrada = 4;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bDActionPerformed

    private void bSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSActionPerformed
        entrada = 19;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bSActionPerformed

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
        entrada = 1;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bAActionPerformed

    private void bOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOActionPerformed
        entrada = 15;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bOActionPerformed

    private void bIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIActionPerformed
        entrada = 9;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bIActionPerformed

    private void bUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUActionPerformed
        entrada = 21;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bUActionPerformed

    private void bZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZActionPerformed
        entrada = 26;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bZActionPerformed

    private void bTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTActionPerformed
        entrada = 20;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bTActionPerformed

    private void bRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRActionPerformed
        entrada = 18;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bRActionPerformed

    private void bEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEActionPerformed
        entrada = 5;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bEActionPerformed

    private void bWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWActionPerformed
        entrada = 23;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bWActionPerformed

    private void bQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQActionPerformed
        entrada = 17;
        desligaLuz(luzAtual);
        luzAtual = converter.Encripta(entrada, pR1, pR2, pR3, pA1, pA2, pA3,cabo11, cabo12, cabo21, cabo22, cabo31, cabo32, cabo41, cabo42, cabo51, cabo52, cabo61, cabo62, cabo71, cabo72, cabo81, cabo82);
        ligaLuz(luzAtual);
    }//GEN-LAST:event_bQActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaEnigma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEnigma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEnigma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEnigma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEnigma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel argola;
    private javax.swing.JButton bA;
    private javax.swing.JButton bAnel;
    private javax.swing.JButton bB;
    private javax.swing.JButton bC;
    private javax.swing.JButton bD;
    private javax.swing.JButton bE;
    private javax.swing.JButton bF;
    private javax.swing.JButton bG;
    private javax.swing.JButton bH;
    private javax.swing.JButton bI;
    private javax.swing.JButton bJ;
    private javax.swing.JButton bK;
    private javax.swing.JButton bL;
    private javax.swing.JToggleButton bLigar;
    private javax.swing.JButton bM;
    private javax.swing.JButton bMaisR1;
    private javax.swing.JButton bMaisR2;
    private javax.swing.JButton bMaisR3;
    private javax.swing.JButton bMenosR1;
    private javax.swing.JButton bMenosR2;
    private javax.swing.JButton bMenosR3;
    private javax.swing.JButton bN;
    private javax.swing.JButton bO;
    private javax.swing.JButton bP;
    private javax.swing.JButton bPlugs;
    private javax.swing.JButton bQ;
    private javax.swing.JButton bR;
    private javax.swing.JButton bS;
    private javax.swing.JButton bSimulacao;
    private javax.swing.JButton bT;
    private javax.swing.JButton bU;
    private javax.swing.JButton bV;
    private javax.swing.JButton bW;
    private javax.swing.JButton bX;
    private javax.swing.JButton bY;
    private javax.swing.JButton bZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabelSimboloEnigma;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lRotor1;
    private javax.swing.JLabel lRotor2;
    private javax.swing.JLabel lRotor3;
    private javax.swing.JLabel parafuso;
    private javax.swing.JLabel parafuso1;
    private javax.swing.JLabel parafuso10;
    private javax.swing.JLabel parafuso11;
    private javax.swing.JLabel parafuso16;
    private javax.swing.JLabel parafuso17;
    private javax.swing.JLabel parafuso19;
    private javax.swing.JLabel parafuso2;
    private javax.swing.JLabel parafuso20;
    private javax.swing.JLabel parafuso21;
    private javax.swing.JLabel parafuso22;
    private javax.swing.JLabel parafuso23;
    private javax.swing.JLabel parafuso24;
    private javax.swing.JLabel parafuso25;
    private javax.swing.JLabel parafuso3;
    private javax.swing.JLabel parafuso4;
    private javax.swing.JLabel parafuso5;
    private javax.swing.JLabel parafuso7;
    private javax.swing.JLabel parafuso8;
    private javax.swing.JLabel parafuso9;
    private javax.swing.JLabel saida1;
    private javax.swing.JLabel saida10;
    private javax.swing.JLabel saida11;
    private javax.swing.JLabel saida12;
    private javax.swing.JLabel saida13;
    private javax.swing.JLabel saida14;
    private javax.swing.JLabel saida15;
    private javax.swing.JLabel saida16;
    private javax.swing.JLabel saida17;
    private javax.swing.JLabel saida18;
    private javax.swing.JLabel saida19;
    private javax.swing.JLabel saida2;
    private javax.swing.JLabel saida20;
    private javax.swing.JLabel saida21;
    private javax.swing.JLabel saida22;
    private javax.swing.JLabel saida23;
    private javax.swing.JLabel saida24;
    private javax.swing.JLabel saida25;
    private javax.swing.JLabel saida26;
    private javax.swing.JLabel saida3;
    private javax.swing.JLabel saida4;
    private javax.swing.JLabel saida5;
    private javax.swing.JLabel saida6;
    private javax.swing.JLabel saida7;
    private javax.swing.JLabel saida8;
    private javax.swing.JLabel saida9;
    // End of variables declaration//GEN-END:variables
}
