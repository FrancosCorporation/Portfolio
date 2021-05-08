import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import javax.swing.JOptionPane;

public class teste extends javax.swing.JFrame {

    public teste() throws IOException {
        initComponents();
        jbEncerraServer.setEnabled(false);
    }

    public void iniciaServer() throws IOException {
        try {
            jbIniciaServer.setEnabled(false);
            jbEncerraServer.setEnabled(true);
            while (true) {
                cliente = serverSocket.accept();
                jlStatus.setText("Número de clientes conectados: " + conexoes);
                in = new DataInputStream(cliente.getInputStream());
                out = new DataOutputStream(cliente.getOutputStream());
                JOptionPane.showMessageDialog(null, "Um cliente se conectou!");
                conexoes++;
                jlStatus.setText("Número de clientes conectados: " + conectados.size());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente se conectou!");
        }
    }

    public void encerraServer() throws IOException {
        in.close();
        out.close();
        cliente.close();
        serverSocket.close();
        JOptionPane.showMessageDialog(null, "O servidor socketLab foi encerrado!");
    }

    @SuppressWarnings("unchecked")
    // &lt;editor-fold defaultstate="collapsed" desc="Generated Code"&gt;
    private void initComponents() {

        jbIniciaServer = new javax.swing.JButton();
        jbEncerraServer = new javax.swing.JButton();
        jbEnviaComando = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbIniciaServer.setText("Iniciar server");
        jbIniciaServer.setPreferredSize(new java.awt.Dimension(30, 30));
        jbIniciaServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciaServerActionPerformed(evt);
            }
        });

        jbEncerraServer.setText("Desligar server");
        jbEncerraServer.setPreferredSize(new java.awt.Dimension(30, 30));
        jbEncerraServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEncerraServerActionPerformed(evt);
            }
        });

        jbEnviaComando.setText("Enviar um comando");
        jbEnviaComando.setPreferredSize(new java.awt.Dimension(30, 30));
        jbEnviaComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviaComandoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlStatus.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlStatus)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlStatus)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbEnviaComando, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbIniciaServer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEncerraServer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbEncerraServer, jbIniciaServer});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIniciaServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEncerraServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jbEnviaComando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbEncerraServer, jbIniciaServer});

        pack();
    }// &lt;/editor-fold&gt;

    private void jbIniciaServerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new Thread(new Runnable() {

            public void run() {
                try {
                    iniciaServer();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível iniciar o servidor socketLab!");
                }
            }
        }).start();
    }                                         

    private void jbEncerraServerActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            encerraServer();
            jbIniciaServer.setEnabled(true);
            jbEncerraServer.setEnabled(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encerrar o servidor socketLab!");
        }
    }                                            

    private void jbEnviaComandoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            out.writeUTF("Desligar");
            System.out.println(cliente.getInetAddress());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao enviar o comando desligar!");
        }
    }                                          

    public static void main(String args[]) throws IOException {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new teste().setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir o sistema.");
                }
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEncerraServer;
    private javax.swing.JButton jbEnviaComando;
    private javax.swing.JButton jbIniciaServer;
    private javax.swing.JLabel jlStatus;
    // End of variables declaration
    ServerSocket serverSocket = new ServerSocket(5000);
    Socket cliente;
    DataInputStream in;
    DataOutputStream out;
    int conexoes = 0;
    @SuppressWarnings("UseOfObsoleteCollectionType")
    private Vector conectados;
}