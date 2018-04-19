/*
   Classe responsável por fazer os alertas(Janelas de diálogo); 
 */
package br.com.henrique.sisnoc.utilitarios;

import javafx.scene.control.Alert;


public class Alertas {
    
    private static final Alert aviso = new Alert(Alert.AlertType.WARNING);
    private static final Alert erro = new Alert(Alert.AlertType.ERROR);
    private static final Alert informação = new Alert(Alert.AlertType.INFORMATION);
    
    
    public static void geraAviso(String textHeader,String textContent){
            aviso.setTitle("SISNOC | Informa:");
            aviso.setHeaderText(textHeader);
            aviso.setContentText(textContent);
            aviso.show();
    }
    
    public static void geraErro(String textHeader, String txtContent){
            erro.setTitle("SISNOC | Informa:");
            erro.setHeaderText(textHeader);
            erro.setContentText(txtContent);
            erro.show();
    }
    
    public static void geraInformacao(String textHeader, String txtContent){
            informação.setTitle("SISNOC | Informa:");
            informação.setHeaderText(textHeader);
            informação.setContentText(txtContent);
            informação.show();
    }
    
}
