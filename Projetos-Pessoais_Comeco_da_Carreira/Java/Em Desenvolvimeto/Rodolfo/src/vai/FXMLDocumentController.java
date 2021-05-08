/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vai;

import java.awt.Desktop;
import javafx.scene.image.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.control.ScrollPane;
import java.security.Key;
import java.util.Arrays;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import javax.crypto.Cipher;

/**
 *
 * @author MATHEUS
 */
public class FXMLDocumentController implements Initializable {
    String nome = FXMLDocumentController.getNome();   
    String flagName2;
    String flagPais2;
    
    //Adiciona excessoes ao socket
    //Define o ip e porta do servidor/cliente (PTP)
    //Cria o scoket que vai enviar e recebe a msg
    //INICIO    
    public FXMLDocumentController() throws IOException {
        try {
            this.conexao  = new Socket();
            conexao.connect(new InetSocketAddress("192.168.19.111", 8881), 2000);
            this.conexao2  = new Socket();
            conexao2.connect(new InetSocketAddress("192.168.19.111", 8882), 2000);
        } catch (IOException e){
            Stage popup = new Stage();
            popup.initStyle(StageStyle.TRANSPARENT);
            Parent popupLoader = FXMLLoader.load(getClass().getResource("FXMLServidorConectado.fxml"));      
            popup.initModality(Modality.WINDOW_MODAL);
            popup.setScene(new Scene(popupLoader));
            popup.showAndWait();
        }
    }

    Socket conexao;
    Socket conexao2;
    //FIM
    
    //Declara todos os objetos da interface     
    //INICIO
    @FXML
    private AnchorPane mainAnchorPane;
            
    @FXML
    private TextField entryMsg;  
       
    @FXML
    private VBox vboxMe;
    
    @FXML
    private VBox vboxStranger;   
    
    @FXML
    private ScrollPane scrollChat;
    //FIM
    
    //Configuracao da title bar, botoes de fachar e minimizar, logo clicavel    
    //INICIO
    double x, y;
    
    //Move a janela do app
    @FXML
    void draggedTopBar(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }
    //Move a janela do app
    @FXML
    void pressedTopBar(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }
    
    //Fecha o APP
    @FXML
    void closeStage(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }    
    
    //Minimiza o APP
    @FXML
    void minStage(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }   

    //Cria a label(box msg) que mostra a msg minha e do usuario
    //INICIO
    void createLabelMe(String msg){
        if(msg.length()<40){
            Label label = new Label(msg);
            label.getStyleClass().add("labelMe");
            label.setMinHeight(40);
            vboxMe.getChildren().add(label);

            Label labelStrangerInv = new Label(msg);
            labelStrangerInv.setMinHeight(40);
            labelStrangerInv.getStyleClass().add("labelStrangerInv");
            vboxStranger.getChildren().add(labelStrangerInv);
            scrollChat.vvalueProperty().bind(vboxMe.heightProperty());
        }
    }
    /*
    void createLabelStranger(String msg){
        Label labelStranger = new Label(msg);
        labelStranger.getStyleClass().add("labelStranger");
        vboxStranger.getChildren().add(labelStranger);

        //Cria a Label msgStranger Invisble
        Label labelMeInv = new Label(msg);
        labelMeInv.getStyleClass().add("labelStrangerInv");
        vboxMe.getChildren().add(labelMeInv);
        scrollChat.vvalueProperty().bind(labelStranger.heightProperty());
    }
    //FIM
    */
    void createLabelStranger(String msg){
        String flag = msg.substring(0, msg.indexOf("|",20)+1);
        String flagNome = flag.substring(flag.indexOf(":")+1, flag.indexOf("|", 5));
        flagName2=flagNome;
        String flagPais = flag.substring(flag.indexOf(":",10)+1, flag.indexOf("|", flagNome.length()+10));
        flagPais2=flagPais;
        String texto = msg.substring(flag.length(), msg.length());
        VBox vbox = new VBox();        
        vboxStranger.getChildren().add(vbox);  
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        hbox.setStyle(nome);
        hbox.setPadding(new Insets(0,0,5,0));
        vbox.getChildren().add(hbox);
        Image imgPais = new Image("/imagens-pais/"+flagPais+".png");
        
        ImageView imgP = new ImageView(imgPais);
        imgP.setFitWidth(48);
        imgP.setFitHeight(17);
        imgP.setPreserveRatio(true);
        imgP.setSmooth(true);
        imgP.setCache(true);
        
        Text nomeChat = new Text();        
        nomeChat.setText(" "+flagNome);
        nomeChat.getStyleClass().add("nomeStranger");
        Label labelStranger = new Label(texto);
        labelStranger.setMinHeight(40);
        labelStranger.getStyleClass().add("labelStranger"); 
        double tamanhoLabel = labelStranger.getHeight();
        vbox.prefHeight(tamanhoLabel);
        hbox.getChildren().add(imgP);
        hbox.getChildren().add(nomeChat);
        vbox.getChildren().add(labelStranger);

        //Cria a Label msgStranger Invisble
        VBox vbox2 = new VBox();
        vboxMe.getChildren().add(vbox2);
        Label labelMeInv = new Label(msg);
        labelMeInv.setMinHeight(40);
        labelMeInv.getStyleClass().add("labelStrangerInv");
        vbox2.getChildren().add(labelMeInv);
        scrollChat.vvalueProperty().bind(vbox.heightProperty());
    }
    
    //Cria a label do arquivo
    //INICIO
    void createLabelFileMe(String nameFile, String filePath) throws Exception {
        Image img = new Image("file:fileLabel.png");
        
        ImageView imgV = new ImageView(img);
        imgV.setFitWidth(37);
        imgV.setFitHeight(40);
        imgV.setPreserveRatio(true);
        imgV.setSmooth(true);
        imgV.setCache(true);
        
        Label labelFileMe = new Label(nameFile, imgV);
        labelFileMe.setMinHeight(60);
        labelFileMe.getStyleClass().add("labelFileMe");
        
        labelFileMe.setOnMouseClicked((MouseEvent e) -> {
            try {
                Desktop.getDesktop().open(new File(filePath));
            } catch (IOException ex) {}
        });
        
        vboxMe.getChildren().add(labelFileMe);
        
        Label labelFileStrangerInv = new Label(nameFile);
        labelFileStrangerInv.setMinHeight(60);
        labelFileStrangerInv.getStyleClass().add("labelFileMeInv");
        vboxStranger.getChildren().add(labelFileStrangerInv);
        scrollChat.vvalueProperty().bind(labelFileMe.heightProperty());
    }
    
    void createLabelFileStranger(String nameFile) throws Exception {
      
        VBox vbox = new VBox();        
        vboxStranger.getChildren().add(vbox);  
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        hbox.setStyle(nome);
        hbox.setPadding(new Insets(0,0,0,0));
        vbox.getChildren().add(hbox);
        Image imgPais = new Image("/imagens-pais/"+flagPais2+".png");
        ImageView imgP = new ImageView(imgPais);
        imgP.setFitWidth(48);
        imgP.setFitHeight(17);
        imgP.setPreserveRatio(true);
        imgP.setSmooth(true);
        imgP.setCache(true);
        
        Text nomeChat = new Text();        
        nomeChat.setText(" "+flagName2);
        nomeChat.getStyleClass().add("nomeStranger");
        
        Image img = new Image("file:fileLabel.png");
        ImageView imgV = new ImageView(img);
        imgV.setFitWidth(37);
        imgV.setFitHeight(40);
        imgV.setPreserveRatio(true);
        imgV.setSmooth(true);
        imgV.setCache(true);
        
        Label labelFileMe = new Label(nameFile, imgV);
        labelFileMe.setMinHeight(60);
        labelFileMe.getStyleClass().add("labelFileStranger");
        
        labelFileMe.setOnMouseClicked((MouseEvent e) -> {
            String myLocation = new File("").getAbsolutePath();
            try {
                Desktop.getDesktop().open(new File(myLocation+"\\"+nameFile));
            } catch (IOException ex) {}
        });
        
        vboxStranger.getChildren().add(labelFileMe);
        
        Label labelFileStrangerInv = new Label(nameFile);
        labelFileStrangerInv.setMinHeight(60);
        labelFileStrangerInv.getStyleClass().add("labelFileStrangerInv");        
        hbox.getChildren().add(imgP);
        hbox.getChildren().add(nomeChat);
        vboxMe.getChildren().add(labelFileStrangerInv);
        scrollChat.vvalueProperty().bind(labelFileMe.heightProperty());
    }
    //FIM
         
    //Pega a chave para criptografar e descriptografar
    //INICIO
    private Key getKey() throws Exception {
        Key key;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Chave.key"))) {
            key = (Key)in.readObject();
            return key;
        } catch (FileNotFoundException f) {
            return null;
        }        
    }        
    //FIM
    
    //Criptografa a msg e retorna o byte do mesmo
    //INICIO
    private byte[] cipherMsg(String msgDecifrada) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, getKey());
        byte[] bytesMsgDecifrada = msgDecifrada.getBytes("ISO-8859-1");
        byte[] byteMsgCifrada = cipher.doFinal(bytesMsgDecifrada);
        
        return byteMsgCifrada;        
    }
    //FIM

    private byte[] cipherFile(byte[] fileDecifrado) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, getKey());
        byte[] byteMsgCifrada = cipher.doFinal(fileDecifrado);
        
        return byteMsgCifrada;        
    }
    
    //Descriptografa a msg e retorna a string do mesmo
    //INICIO
    private byte[] decipherMsg(byte[] msgCifrada) throws Exception {
        
        Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        decipher.init(Cipher.DECRYPT_MODE, getKey());
        byte[] msgDecifrada = decipher.doFinal(msgCifrada);
        
        return msgDecifrada;
    }
    //FIM 
    
    private void networkSend(String msg) throws Exception {
        DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
        byte[] dadosMsgCifrada = cipherMsg(msg);
        saida.writeInt(dadosMsgCifrada.length);
        saida.write(dadosMsgCifrada);
    }
    
    private String networkReceive() throws Exception {
        DataInputStream entrada2 = new DataInputStream(conexao2.getInputStream());        
        int tamanho = entrada2.readInt();        
        byte[] dadosRecebidosCifrados = new byte[tamanho];
        entrada2.readFully(dadosRecebidosCifrados, 0, dadosRecebidosCifrados.length);

        byte[] dadosRecebidosDecifrados = decipherMsg(dadosRecebidosCifrados);
        String bytesString = new String(dadosRecebidosDecifrados, StandardCharsets.ISO_8859_1);
        
        if(bytesString.length()>7){
            if(bytesString.substring(1,5).equals("File")){  
                String fileFlag = bytesString.substring(0, bytesString.indexOf("/")+2);
                System.out.println(fileFlag);
                byte[] bytesFile = Arrays.copyOfRange(dadosRecebidosDecifrados, fileFlag.length(), dadosRecebidosDecifrados.length);

                String nameFile = fileFlag.substring(fileFlag.indexOf(":")+1, fileFlag.indexOf("/"));              
                System.out.println(nameFile);
                File file = new File(nameFile);

                try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
                    dos.write(bytesFile);
                }            

                return "|file|"+nameFile;

            }else{ 
                return bytesString;
            }
        }else{
            return bytesString;                        
        }
    }
    
    //Envia arquivo
    //INICIO
    @FXML
    void sendFiles(MouseEvent event) throws Exception {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FileChooser selectFile = new FileChooser();
        selectFile.setTitle("Selecione o arquivo");
        String pais = ipPais.getMyLocation();
        try{
            DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
            File localFile = selectFile.showOpenDialog(stage);
            String pathFile;
            String nameFile;
            byte[] flag;
            byte[] fileByte;
            try (DataInputStream dis = new DataInputStream(new FileInputStream(localFile))) {
                pathFile = localFile.getAbsolutePath();
                //Pega a extensao do arquivo enviado e monta a flag
                nameFile = localFile.getName();
                String mountFlag = "|File|TypeFile:"+nameFile+"/|";
                flag = mountFlag.getBytes();
                int lenFile = dis.available();
                fileByte = new byte[lenFile];
                dis.read(fileByte);
            }
            
            //Adiciona a flag antes dos bytes do arquivo
            byte[] fileByteFlag = new byte[flag.length+fileByte.length];
            System.arraycopy(flag, 0, fileByteFlag, 0, flag.length);
            System.arraycopy(fileByte, 0, fileByteFlag, flag.length, fileByte.length);
            System.out.println(fileByteFlag.length);
            createLabelFileMe(nameFile, pathFile);
            saida.writeInt(cipherFile(fileByteFlag).length);
            saida.write(cipherFile(fileByteFlag));
            //networkSend(cipherFile(fileByteFlag));

        } catch (Exception e) {}       
    }
    //FIM
    
    //Envia a msg
    //INICIO
    @FXML
    private void sendMsg() throws Exception {  
        try{      
            //Envia msg para o servidor
            //INICIO
            String msg = entryMsg.getText();
            String pais = ipPais.getMyLocation();
            if(msg.length()>0 && msg.length() < 37){            
                //Cria a label da msg
                createLabelMe(msg);

                String msgFlag = "|Nome:"+nome+"|"+"|Pais:"+pais+"|"+msg;
                //Apaga o entry
                entryMsg.setText("");    
                entryMsg.setPromptText("Digite aqui..."); 

                //Envia a msg
                networkSend(msgFlag);   
            }
            
            if(msg.length()>40){}
            //FIM 
        } catch (Exception e){System.out.println(e);}
    }
    //FIM
   
    //Recebe a msg
    //INICIO
    private void chatBox(){
        Service receiveMsg = new Service(){
            @Override
            protected Task<String> createTask(){
                return new Task<String>() {
                    @Override
                    protected String call() throws Exception {
                        //Recebe a msg descriptografada
                        return networkReceive();  
                    }
                };
            }
        };
        receiveMsg.setOnSucceeded(w -> {
            //Cria a label
            String msg = (String) receiveMsg.getValue();
            if(msg.length()>7){
                if(msg.substring(0, 6).equals("|file|")){                
                    try {                  
                        String fileName = msg.substring(6, msg.length());
                        createLabelFileStranger(fileName);
                    } catch (Exception ex) {}
                }else{
                    createLabelStranger(msg);
                }      
            }else{
                createLabelStranger(msg);
            }
            chatBox();
        });    
        receiveMsg.start();        
    }  
    //FIM
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        chatBox();
    }    
    
}