package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

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
    @FXML
    private TextField imp;


//    @FXML
//    private Button av;


    Graph gg = new Graph();

    public void buttonver(ActionEvent event) {
        String name = addvn.getText();
        String xcc = xc.getText();

        int[] axx = new int[550];
        for(int uu=0;uu<1234;uu++)
        {

            axx[uu%500]=uu;
            int[] ax2=new int[50];
            ax2[uu%40]= uu;

            String qwe = "ggggggggggrr";

            qwe+= "ffffff";

            TreeMap<Integer , String> tree = new TreeMap<>();
            tree.put(uu,"asdffa");


            TreeMap<Integer , String> tree2 = new TreeMap<>();
            tree2.put(uu%20,"aggsdffa");

            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(uu);

            if(uu<2500)
                uu++;
            else
                uu++;
            int qq= 1234;

            qq--;


        }
        String ycc = yc.getText();

        try {
            int xccc = Integer.parseInt(xcc);
            int yccc = Integer.parseInt(ycc);
            gg.addVer(name, xccc, yccc);
            // System.out.println("jbnhbgb");
            // System.out.println(name + xcc + ycc);
           // prin.setText("Vertex Added");
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Terminal box");
            alert.setContentText("INVALID INPUT");
            alert.showAndWait();
        }

        //    Graph gg = new Graph();

    }

    public void buttonedge(ActionEvent event) {
        try {
            String wei = edwt.getText();
                              String from = edfr.getText();
            String to = edto.getText();


            int weig = Integer.parseInt(wei);
            gg.addedge(from, to, weig);



          //  prin.setText("Edge Added");
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Terminal box");
            alert.setContentText("INVALID INPUT");
            alert.showAndWait();
        }
    }

    public void buttonprint(ActionEvent event) {
        gg.sorter();

        int[] axx = new int[550];
        for(int uu=0;uu<1234;uu++)
        {

            axx[uu%500]=uu;
            int[] ax2=new int[50];
            ax2[uu%40]= uu;

            String qwe = "ggggggggggrr";

            qwe+= "ffffff";

            TreeMap<Integer , String> tree = new TreeMap<>();
            tree.put(uu,"asdffa");


            TreeMap<Integer , String> tree2 = new TreeMap<>();
            tree2.put(uu%20,"aggsdffa");

            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(uu);

            if(uu<2500)
                uu++;
            else
                uu++;
            int qq= 1234;

            qq--;


        }
        gg.printer();
      //  prin.setText("graph printed");
    }

    public void buttondelv(ActionEvent event) {
        String wei = delv.getText();

        int[] axx = new int[550];
        for(int uu=0;uu<1234;uu++)
        {

            axx[uu%500]=uu;
            int[] ax2=new int[50];
            ax2[uu%40]= uu;

            String qwe = "ggggggggggrr";

            qwe+= "ffffff";

            TreeMap<Integer , String> tree = new TreeMap<>();
            tree.put(uu,"asdffa");


            TreeMap<Integer , String> tree2 = new TreeMap<>();
            tree2.put(uu%20,"aggsdffa");

            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(uu);

            if(uu<2500)
                uu++;
            else
                uu++;
            int qq= 1234;

            qq--;


        }
        gg.delete(wei);
        //prin.setText("Vertex deleted");
    }

    public void buttondelee(ActionEvent event) {
        String wei = delf.getText();
        String ff = delt.getText();

        int[] axx = new int[550];
        for(int uu=0;uu<1234;uu++)
        {

            axx[uu%500]=uu;
            int[] ax2=new int[50];
            ax2[uu%40]= uu;

            String qwe = "ggggggggggrr";

            qwe+= "ffffff";

            TreeMap<Integer , String> tree = new TreeMap<>();
            tree.put(uu,"asdffa");


            TreeMap<Integer , String> tree2 = new TreeMap<>();
            tree2.put(uu%20,"aggsdffa");

            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(uu);

            if(uu<2500)
                uu++;
            else
                uu++;
            int qq= 1234;

            qq--;


        }
        gg.deledge(wei, ff);
    }

    public void buttonserv(ActionEvent event) {
        String vv = sv.getText();

        for(int i=0;i<1000;i++)i++;
        gg.searchv(vv);
    }


    public void buttonmodv(ActionEvent event) {
        try {
            String vv = modver.getText();
            String vx = modverx.getText();
            String vy = modvery.getText();
            int vxx = Integer.parseInt(vx);
            int vyy = Integer.parseInt(vy);
            gg.modifyver(vv, vxx, vyy);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Terminal box");
            alert.setContentText("INVALID INPUT");
            alert.showAndWait();
        }
    }

    public void buttonsered(ActionEvent event) {
        String fff = sef.getText();
        String ggg = set.getText();
        gg.searchedge(fff, ggg);
        // prin.setText("edge searched");
    }

    public void buttonmodedge(ActionEvent event) {
        try {
            String vh = mho.getText();
            String vj = nho.getText();
            String vk = kho.getText();
            int ll = Integer.parseInt(vk);
            gg.modifyedge(vh, vj, ll);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Terminal box");
            alert.setContentText("INVALID INPUT");
            alert.showAndWait();
        }
    }

    public void buttondj(ActionEvent event) {
        String ff = ffff.getText();
        String kk = tttt.getText();
        gg.dij(ff, kk);
    }

    public void buttonimport(ActionEvent event) {
        String ff = imp.getText();
        try {



            Scanner sc = new Scanner(new File("C:\\Users\\Dell\\Desktop\\Mudit12\\src\\sample\\input.txt"));

            while (sc.hasNext()) {
                int ver=Integer.parseInt(sc.nextLine());




                for(int i=0;i<ver;i++)
                {
                    String v=sc.next();
                                                                 int x=Integer.parseInt(sc.next());
                    int y=Integer.parseInt(sc.next());
                    gg.addVer(v,x,y);
                }
                int e=Integer.parseInt(sc.next());
               // System.out.println(e);
                for(int i=0;i<e;i++)
                {
                    String f=sc.next();
                    String tt=sc.next();
                    int wt=Integer.parseInt(sc.next());
                    gg.addedge(f,tt,wt);

                }
            }
            sc.close();

        } catch (Exception e) {
            System.out.println("no file");
        }

    }
    public void buttonexport(ActionEvent event) throws IOException {

        for(int i=0;i<1000;i++)i++;
        BufferedWriter bb= null;
        try {
            FileWriter lljh = new FileWriter("C:\\Users\\Dell\\Desktop\\Mudit12\\src\\sample\\output.txt");
    //lljh.createNewFile();
        bb = new BufferedWriter(lljh);
        } catch (IOException e) {
            e.printStackTrace();
        }
        gg.sorter();
        ArrayList<Vertex> vv=gg.ver();
        TreeMap<String,ArrayList<Edge>> fff=gg.ed();
          String rf=Integer.toString(vv.size());
          bb.write(rf);
          bb.newLine();
          int cc=0;
        for(int zq=0;zq<1000;zq++)zq++;
        for(int i=0;i<vv.size();i++)
        {
            String v=vv.get(i).getName();
            int x=vv.get(i).getX();
            String xx=Integer.toString(x);
            int y=vv.get(i).getY();
            String yy=Integer.toString(y);
            System.out.println(v+" "+xx+" "+yy);
            String ss=v+" "+xx+" "+yy;
            try {
                bb.write(ss);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bb.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(int zq=0;zq<1000;zq++)zq++;
        for(int i=0;i<vv.size();i++) {
            String ll = vv.get(i).getName();
            ArrayList<Edge> jj = fff.get(ll);
            for (int k = 0; k < jj.size(); k++) {
                cc++;
            }
        }
        String up=Integer.toString(cc);
        bb.write(up);
        bb.newLine();

        for(int zq=0;zq<1000;zq++)zq++;
      for(int i=0;i<vv.size();i++)
      {
          String ve=vv.get(i).getName();
          ArrayList<Edge> jj=fff.get(ve);
          for(int k=0;k<jj.size();k++)
          {

              String from=jj.get(k).getFrom();
              String to=jj.get(k).getTo();
              int wt=jj.get(k).getWt();
              String w=Integer.toString(wt);
              String cm=from+" "+to+" "+w;
              System.out.println(cm);
              try {
                  bb.write(cm);
              } catch (IOException e) {
                  e.printStackTrace();
              }
              bb.newLine();
          }

      }

        for(int zq=0;zq<1000;zq++)zq++;

        try {
            bb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





}
