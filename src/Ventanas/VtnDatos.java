package Ventanas;

import Clases.ModeloConcurrente;
import Clases.ModeloSecuencial;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author jlopez
 */
public class VtnDatos extends javax.swing.JFrame {

    private boolean updating = false;
    
    int rowsMatrix1 = 0;
    int columnsMatrix1 = 0;
    int rowsMatriz2 = 0;
    int columnsMatrix2 = 0;
    int minimumValue = 0;
    int maximumValue = 0;
    int numberThreads = 0;
    
    int matrix1[][];
    int matrix2[][];
    int resultMatrixSequential[][];
    int resultMatrixConcurrent[][];
    
    boolean validData = false;
        
    public VtnDatos() {
        initComponents();
        documentListener();
        addValidKeys();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        lblMatrix1 = new javax.swing.JLabel();
        lblMatrix2 = new javax.swing.JLabel();
        lblRows1 = new javax.swing.JLabel();
        lblRows2 = new javax.swing.JLabel();
        lblColumns2 = new javax.swing.JLabel();
        lblColumns1 = new javax.swing.JLabel();
        lblMinimumValue = new javax.swing.JLabel();
        lblMaximumValue = new javax.swing.JLabel();
        lblNumThreads = new javax.swing.JLabel();
        txtNumThreads = new javax.swing.JTextField();
        txtRows2 = new javax.swing.JTextField();
        txtColumns2 = new javax.swing.JTextField();
        txtRows1 = new javax.swing.JTextField();
        txtColumns1 = new javax.swing.JTextField();
        txtMaximumValue = new javax.swing.JTextField();
        txtMinimumValue = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        lblTiempos = new javax.swing.JLabel();
        lblTiempoSecuencial = new javax.swing.JLabel();
        timeSequential = new javax.swing.JLabel();
        lblTiempoConcurrente = new javax.swing.JLabel();
        timeConcurrent = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));

        pnlLeft.setBackground(new java.awt.Color(207, 168, 221));

        lblMatrix1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblMatrix1.setText("MATRIZ 1");

        lblMatrix2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblMatrix2.setText("MATRIZ 2");

        lblRows1.setText("Filas matriz 1:");

        lblRows2.setText("Filas matriz 2:");

        lblColumns2.setText("Columnas matriz 2:");

        lblColumns1.setText("Columnas matriz 1:");

        lblMinimumValue.setText("Valor mínimo:");

        lblMaximumValue.setText("Valor máximo:");

        lblNumThreads.setText("Numero de hilos:");

        txtNumThreads.setToolTipText("");
        txtNumThreads.setPreferredSize(new java.awt.Dimension(65, 22));
        txtNumThreads.setSelectionColor(new java.awt.Color(102, 0, 153));

        txtRows2.setToolTipText("");
        txtRows2.setPreferredSize(new java.awt.Dimension(65, 22));
        txtRows2.setSelectionColor(new java.awt.Color(102, 0, 153));

        txtColumns2.setToolTipText("");
        txtColumns2.setPreferredSize(new java.awt.Dimension(65, 22));
        txtColumns2.setSelectionColor(new java.awt.Color(102, 0, 153));

        txtRows1.setMinimumSize(new java.awt.Dimension(65, 22));
        txtRows1.setSelectionColor(new java.awt.Color(102, 0, 153));

        txtColumns1.setToolTipText("");
        txtColumns1.setPreferredSize(new java.awt.Dimension(65, 22));
        txtColumns1.setSelectionColor(new java.awt.Color(102, 0, 153));

        txtMaximumValue.setToolTipText("");
        txtMaximumValue.setPreferredSize(new java.awt.Dimension(65, 22));
        txtMaximumValue.setSelectionColor(new java.awt.Color(102, 0, 153));

        txtMinimumValue.setToolTipText("");
        txtMinimumValue.setPreferredSize(new java.awt.Dimension(65, 22));
        txtMinimumValue.setSelectionColor(new java.awt.Color(102, 0, 153));

        btnStart.setText("INICIAR");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblMatrix1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMatrix2)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(lblRows1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColumns1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRows1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLeftLayout.createSequentialGroup()
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLeftLayout.createSequentialGroup()
                                .addComponent(lblMinimumValue)
                                .addGap(18, 18, 18)
                                .addComponent(txtMinimumValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblColumns1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLeftLayout.createSequentialGroup()
                                .addComponent(lblMaximumValue)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaximumValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addComponent(lblRows2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRows2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumThreads)
                            .addComponent(lblColumns2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumThreads, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColumns2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(btnStart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatrix2)
                    .addComponent(lblMatrix1))
                .addGap(18, 18, 18)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRows1)
                    .addComponent(lblRows2)
                    .addComponent(txtRows2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRows1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColumns1)
                    .addComponent(lblColumns2)
                    .addComponent(txtColumns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColumns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimumValue)
                    .addComponent(txtMinimumValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumThreads)
                    .addComponent(txtNumThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaximumValue)
                    .addComponent(txtMaximumValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(36, 36, 36))
        );

        lblTiempos.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblTiempos.setText("Tiempos de ejecución:");

        lblTiempoSecuencial.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblTiempoSecuencial.setText("Método Secuencial:");

        timeSequential.setText("...");

        lblTiempoConcurrente.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblTiempoConcurrente.setText("Método Concurrente:");

        timeConcurrent.setText("...");

        btnPrint.setText("IMPRIMIR");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeSequential)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTiempos)
                                .addComponent(lblTiempoSecuencial)
                                .addComponent(lblTiempoConcurrente)
                                .addComponent(timeConcurrent, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTiempos)
                .addGap(18, 18, 18)
                .addComponent(lblTiempoSecuencial)
                .addGap(12, 12, 12)
                .addComponent(timeSequential)
                .addGap(59, 59, 59)
                .addComponent(lblTiempoConcurrente)
                .addGap(12, 12, 12)
                .addComponent(timeConcurrent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //System.out.println("Se debieron settear las lbl de tiempo");
        //System.out.println(validData + "<- valor de validData antes de dataValidation();");
        
        dataValidation();
        
        //System.out.println(validData + "<- valor de validData despues de dataValidation();");
        
        
        if (validData == true){
            createMatrices();
            startMultiplication();
            //System.out.println("entro al if");
        }else{
            //System.out.println("entro al else -> " + validData);
            System.out.println("Invalid Data");
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try{
            System.out.println("Matriz 1");

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matriz 2");
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matriz Resultado Secuencial");
            for (int i = 0; i < resultMatrixSequential.length; i++) {
                for (int j = 0; j < resultMatrixSequential[0].length; j++) {
                    System.out.print(resultMatrixSequential[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matriz Resultado Concurrente");
            for (int i = 0; i < resultMatrixConcurrent.length; i++) {
                for (int j = 0; j < resultMatrixConcurrent[0].length; j++) {
                    System.out.print(resultMatrixConcurrent[i][j] + " ");
                }
                System.out.println();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Primero debes ingresar los datos.");
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    public void documentListener(){
        txtColumns1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!updating) {
                    updating = true;
                    txtRows2.setText(txtColumns1.getText());
                    updating = false;
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!updating) {
                    updating = true;
                    txtRows2.setText(txtColumns1.getText());
                    updating = false;
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });

        txtRows2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!updating) {
                    updating = true;
                    txtColumns1.setText(txtRows2.getText());
                    updating = false;
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!updating) {
                    updating = true;
                    txtColumns1.setText(txtRows2.getText());
                    updating = false;
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });  
    }
    
    public void addValidKeys(){
        txtRows1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtColumns1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtRows2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtColumns2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtMinimumValue.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == '-' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtMinimumValue.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == '-' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtMaximumValue.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == '-' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
        
        txtNumThreads.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignora el evento de teclado
                }
            }
            });
    }
    
    public void dataValidation(){
        //SwingUtilities.invokeLater(()->{
            //filas y columnas
            int rows1 = Integer.parseInt(txtRows1.getText());
            int columns1 = Integer.parseInt(txtColumns1.getText());
            int rows2 = Integer.parseInt(txtRows2.getText());
            int columns2 = Integer.parseInt(txtColumns2.getText());
            //otros datos
            int minValue = Integer.parseInt(txtMinimumValue.getText());
            int maxValue = Integer.parseInt(txtMaximumValue.getText());
            int numThreads = Integer.parseInt(txtNumThreads.getText());
            
            //validacion
            if(minValue > maxValue){
                txtMinimumValue.setText("");
                txtMaximumValue.setText("");
                validData = false;
            }else{
                validData = true;
            }
            
            if(numThreads > 30){
                txtNumThreads.setText("");
                validData = false;
            }else{
                validData = true;
            }
            /*
            if(rows1.isBlank() || Integer.parseInt(rows1) < 0){//agregar
                txtRows1.setText("");
                valid = false;
            }else{
                valid = true; 
            }
            if(!columns1.matches("^\\d*\\.?\\d+$") || Integer.parseInt(columns1) < 0){
                txtColumns1.setText("");
                valid = false;
            }else{
                valid = true; 
            }
            if(!rows2.matches("^\\d*\\.?\\d+$") || Integer.parseInt(rows2) < 0){
                txtRows2.setText("");
                valid = false;
            }else{
                valid = true; 
            }
            if(!columns2.matches("^\\d*\\.?\\d+$") || Integer.parseInt(columns2) < 0){
                txtColumns2.setText("");
                valid = false;
            }else{
                valid = true; 
            }
            if(!minValue.matches("^\\d*\\.?\\d+$")){
                txtMinimumValue.setText("");
                valid = false;
            }else{
                valid = true; 
            }
            if(!maxValue.matches("^\\d*\\.?\\d+$")){
                txtMaximumValue.setText("");
                valid = false;
            }else{
                valid = true; 
            }
            if(!numThreads.matches("^\\d*\\.?\\d+$") || Integer.parseInt(numThreads) < 0){
                txtNumThreads.setText("");
                valid = false;
            }else{
                valid = true; 
            }*/
            
            //if(valid == true){
            if(validData == true){
                rowsMatrix1 = rows1;
                columnsMatrix1 = columns1;
                rowsMatriz2 = rows2;
                columnsMatrix2 = columns2;
                minimumValue = minValue;
                maximumValue = maxValue;
                numberThreads = numThreads;
                
                matrix1 = new int [rowsMatrix1][columnsMatrix1];
                matrix2 = new int [rowsMatriz2][columnsMatrix2];
                resultMatrixSequential = new int [rowsMatrix1][columnsMatrix2];
                resultMatrixConcurrent = new int [rowsMatrix1][columnsMatrix2];
                
                System.out.println("ta bien");
            }else{
                JOptionPane.showMessageDialog(this, "Valores Inválidos");
            }
        //});
    }
    
    public void createMatrices(){
        Random random = new Random();
        //llenar matriz 1
        for(int i = 0; i < rowsMatrix1; i++){
            for (int j = 0; j < columnsMatrix1; j++) {
               matrix1[i][j] = random.nextInt(maximumValue - minimumValue + 1) + minimumValue;
            }
        }
        
        //llenar matriz 2
        for (int i = 0; i < rowsMatriz2; i++) {
            for (int j = 0; j < columnsMatrix2; j++) {
                matrix2[i][j] = random.nextInt(maximumValue - minimumValue + 1) + minimumValue;
            }
        }
    }
    
    public void startMultiplication(){
        ModeloSecuencial secuencial = new ModeloSecuencial(matrix1,matrix2,resultMatrixSequential);
        ModeloConcurrente concurrente = new ModeloConcurrente(matrix1,matrix2,resultMatrixConcurrent,numberThreads);
        

        long startSequential = System.nanoTime();
        secuencial.multiplicacionMatrices();
        long endSequential = System.nanoTime()- startSequential;
        timeSequential.setText(endSequential + " ns");
        
        long startConcurrent = System.nanoTime();
        concurrente.multiplicacion();
        long endConcurrent = System.nanoTime()- startConcurrent;
        timeConcurrent.setText(endConcurrent + " ns");
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
            java.util.logging.Logger.getLogger(VtnDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblColumns1;
    private javax.swing.JLabel lblColumns2;
    private javax.swing.JLabel lblMatrix1;
    private javax.swing.JLabel lblMatrix2;
    private javax.swing.JLabel lblMaximumValue;
    private javax.swing.JLabel lblMinimumValue;
    private javax.swing.JLabel lblNumThreads;
    private javax.swing.JLabel lblRows1;
    private javax.swing.JLabel lblRows2;
    private javax.swing.JLabel lblTiempoConcurrente;
    private javax.swing.JLabel lblTiempoSecuencial;
    private javax.swing.JLabel lblTiempos;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JLabel timeConcurrent;
    private javax.swing.JLabel timeSequential;
    private javax.swing.JTextField txtColumns1;
    private javax.swing.JTextField txtColumns2;
    private javax.swing.JTextField txtMaximumValue;
    private javax.swing.JTextField txtMinimumValue;
    private javax.swing.JTextField txtNumThreads;
    private javax.swing.JTextField txtRows1;
    private javax.swing.JTextField txtRows2;
    // End of variables declaration//GEN-END:variables
}
