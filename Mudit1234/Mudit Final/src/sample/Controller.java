package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.animation.TranslateTransition;
import javafx.application.Application;

import    javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import    javafx.scene.paint.Color;
import    javafx.scene.shape.Circle;




import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import     javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.*;
public class Controller {
    @FXML
    private TextField addvn;
    @FXML
    private TextField xc;
    @FXML
    private TextField yc;
    @FXML
    private TextField edwt;
    @FXML
    private TextField edfr;



    @FXML
    private TextField edto;
    @FXML
    private TextField delv;


    @FXML
    private TextField delf;
    @FXML



    private TextField delt;
    @FXML
    private TextField sv;
    @FXML
    private TextField modver;
    @FXML


    private TextField modverx;
    @FXML
    private TextField modvery;


    @FXML
    private TextField sef;
    @FXML
    private TextField set;
    @FXML



    private TextField mho;
    @FXML
    private TextField nho;


    @FXML
    private TextField kho;
    @FXML
    private Label prin;
    @FXML
    private TextField ffff;


    @FXML
    private TextField tttt;


//    @FXML
//    private Button av;


    Graph gg = new Graph();
    public void buttonver(ActionEvent event)
    {
        String name = addvn.getText();
        String xcc = xc.getText();
        String ycc = yc.getText();

        try {
            int xccc = Integer.parseInt(xcc);
            int yccc = Integer.parseInt(ycc);
            gg.addVer(name,xccc,yccc);
            // System.out.println("jbnhbgb");
            // System.out.println(name + xcc + ycc);
            prin.setText("Vertex Added");
        }


        catch(Exception e)
        {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Terminal box");
            alert.setContentText("INVALID INPUT");
            alert.showAndWait();
        }

        //    Graph gg = new Graph();

    }

    public void buttonedge(ActionEvent event)
    {
        try {
            for(int i=0;i<1000000;i++) i++;
            String wei = edwt.getText();
            String from = edfr.getText();
            String to = edto.getText();
            int weig = Integer.parseInt(wei);
            // int yccc=Integer.parseInt(ycc);

            gg.addedge(from, to, weig);
            //    System.out.println("edgebgb");
            //   System.out.println(from + to + weig);
            prin.setText("Edge Added");
        }
        catch(Exception e)
        {
            for(int i=0;i<100000;i++) i++;
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Terminal box");
            alert.setContentText("INVALID INPUT");
            alert.showAndWait();
        }
    }

    public void buttonprint(ActionEvent event)
    {
        gg.sorter();

        for(int i=0;i<100000;i++) i++;
        gg.printer();
        prin.setText("graph printed");
    }



    public void buttondelv(ActionEvent event)
    {
        String wei = delv.getText();
        gg.delete(wei);
        //prin.setText("Vertex deleted");
    }

    public void buttondelee(ActionEvent event)
    {
        String wei = delf.getText();
        String ff=delt.getText();
        gg.deledge(wei,ff);
        // prin.setText("edge deleted");
    }

    public void buttonserv(ActionEvent event)
    {
        String vv=sv.getText();
        gg.searchv(vv);
        //  prin.setText("Vertex found");
    }



    public void buttonmodv(ActionEvent event)
    {      try {
        String vv = modver.getText();
        String vx = modverx.getText();
        String vy = modvery.getText();
        int vxx = Integer.parseInt(vx);
        int vyy = Integer.parseInt(vy);
        gg.modifyver(vv, vxx, vyy);
        // prin.setText("Vertex modified");
    }
    catch(Exception e)
    {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Terminal box");
        alert.setContentText("INVALID INPUT");
        alert.showAndWait();
    }
    }

    public void buttonsered(ActionEvent event)
    {
        String fff=sef.getText();
        String ggg=set.getText();
        gg.searchedge(fff,ggg);
        // prin.setText("edge searched");
    }

    public void buttonmodedge(ActionEvent event)
    {   try {
        String vh = mho.getText();
        String vj = nho.getText();
        String vk = kho.getText();
        int ll = Integer.parseInt(vk);
        gg.modifyedge(vh, vj, ll);
        //   prin.setText("edge modified");
    }
    catch(Exception e)
    {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Terminal box");
        alert.setContentText("INVALID INPUT");
        alert.showAndWait();
    }
    }
    public void buttondj(ActionEvent event)
    {
        String ff=ffff.getText();
        String kk=tttt.getText();
        gg.dij(ff,kk);
    }

}
