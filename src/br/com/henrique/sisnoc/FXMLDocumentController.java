/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.henrique.sisnoc;

import br.com.henrique.sisnoc.utilitarios.Alertas;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.bean.Usuarios;
import model.dao.UsuariosDao;

/**
 *
 * @author henrique.souza
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private JFXButton btnLogar;

    @FXML
    private JFXPasswordField txtSenha;

    @FXML
    private JFXTextField txtLogin;

    /* Avisos tela */
    private Alert aviso = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    private void btnLogar(ActionEvent event) {

        if (validaUsuario()) {
            Usuarios user = new Usuarios();
            user.setU_user(txtLogin.getText());
            user.setU_senha(txtSenha.getText());

            UsuariosDao Check = new UsuariosDao();
            
            if(Check.Buscar(user).isEmpty()){
                Alertas.geraAviso("Hum ... tem algo errado.", "Usuário ou senha inválidos");
            }else{
                
                try {
                    Parent telaMenu = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(telaMenu, 1180,600);
                    stage.setScene(scene);
                    stage.setTitle("SISNOC | Menu Principal");
                    stage.setResizable(false);
                    stage.show();
                } catch (Exception e) {
                    System.out.println(e);
                }
                
                
            }
           
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /* Validação Simples */
    public Boolean validaUsuario() {
        if (txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()) {
            Alertas.geraAviso("OPS!! Alguma coisa deu errado!", "Informe o usuário e senha");
            return false;
        } else {
            return true;
        }
    }

}
