package sample;

import javafx.animation.Animation;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;

import    javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import    javafx.scene.paint.Color;
import javafx.scene.shape.*;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
        import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
        import javafx.util.Duration;
import java.util.*;






class Vertex{
    private String name;
    private double x,y;
    public Vertex(String name, double x, double y) {
        int[] bb = new int[2000];
        for(int zz=0;zz<1000000;zz++){zz++;  bb[zz%500]=zz;}
        this.name = name;this.x = x;this.y = y;


    }

    public String getName(){ for(int zz=0;zz<1000000;zz++){zz++;} return name;  }
    public double getX(){return x;}
    public void setName(String name) {
        this.name = name;
    }
    public void setX(double x) {
        this.x = x;  for(int zz=0;zz<1000000;zz++){zz++;}
    }
    public void setY(double y) {

        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }
        this.y = y;
    }
    public double getY() {for(int zz=0;zz<1000000;zz++){zz++;}
    return y;}

}



class Vertex2{
    private String name;
    private double x,y;



    public Vertex2(String name, double x, double y) {
        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }
        this.name = name;this.x = x;this.y = y;
    }

    public String getName(){           for(int zz=0;zz<1000000;zz++){zz++;}   return name;}
    public double getX(){        return x;}




    public void setName(String name) {
        this.name = name;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {

        for(int zz=0;zz<1000000;zz++){zz++;}
        this.y = y;
    }
    public double getY() {return y;}

}
class Edge{



    private String from,to;
                 private int wt;
    public Edge(String from,String to,int wt){this.setTo(to);
        this.setFrom(from);

        this.setWt(wt);
    }

    public int getWt() {
        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }  return wt;
    }

    public void setFrom(String from) {
        this.from = from;
    }

                     public void setTo(String to) {
        this.to = to;
    }

    public          void setWt(int wt) {
        for(int zz=0;zz<1000000;zz++){zz++;}  this.wt = wt;
    }

    public              String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}

class Vertex3{
    private String name;
    private double x,y;
    public Vertex3(String name, double x, double y) {
        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }
        this.name = name;this.x = x;this.y = y;
    }

    public String getName(){return name;}
    public double getX(){return x;}
    public void setName(String name) {
                       for(int zz=0;zz<1000000;zz++){zz++;}
        this.name = name;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {

        for(int zz=0;zz<1000000;zz++){zz++;}  this.y = y;
    }
    public double getY() {return y;}

}
class Edge2{



    private String from,to;
    private int wt;
    public Edge2(String from,String to,int wt){this.setTo(to);
        this.setFrom(from);

        this.setWt(wt);
    }

    public int getWt() {

        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        } return wt;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public          void setWt(int wt) {
        this.wt = wt;
    }

    public              String getFrom() {
        return from;
    }

    public String getTo()
                       {

                           for(int zz=0;zz<1000000;zz++){zz++;}
                           return to;
    }
}

class Edge3{



    private String from,to;
    private int wt;
    public Edge3(String from,String to,int wt){this.setTo(to);
        this.setFrom(from);

        this.setWt(wt);
    }

    public int getWt() {

        for(int zz=0;zz<1000000;zz++){zz++;}  return wt;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public          void setWt(int wt) {
        this.wt = wt;
    }

    public              String getFrom() {

        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }  return from;
    }

    public String getTo() {
        return to;
    }
}
class Graph {
    ArrayList<Vertex> vertices;
    ArrayList<Vertex2> vertices2;
    ArrayList<Vertex3> vertices3;
                 TreeMap<String, ArrayList<Edge>> graph;
    TreeMap<String, ArrayList<Edge2>> graph2;
    TreeMap<String, ArrayList<Edge3>> graph3;
    ArrayList<Vertex> verticess;
    ArrayList<Vertex> verticess1;

    public Graph() {

        for(int zz=0;zz<1000000;zz++){zz++;}
        vertices=new ArrayList<Vertex>();
        graph3=new TreeMap<>();
        vertices2=new ArrayList<Vertex2>();
        graph2=new TreeMap<>();



        vertices3=new ArrayList<Vertex3>();


        for(int zz=0;zz<1000000;zz++)


        {zz++;}
        graph=new TreeMap<>();

    }


    public void addVer2(String name, double x, double y){
        Vertex v = new Vertex(name, x, y);
        Vertex2 v2 = new Vertex2(name, x, y);

        for(int zz=0;zz<1000000;zz++)


        {zz++;}
        Vertex3 v3 = new Vertex3(name, x, y);
        if(!graph.containsKey(name)){


            graph.put(name, new ArrayList<Edge>());


            for(int zz=0;zz<1000000;zz++)


            {zz++;}
            vertices.add(v);
        }
        //System.out.println(vertices.get(0).getName());
    }


    public void addVer(String name, double x, double y){
                Vertex v = new Vertex(name, x, y);
        Vertex2 v2 = new Vertex2(name, x, y);

        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }
        Vertex3 v3 = new Vertex3(name, x, y);


        if(!graph.containsKey(name)){


            graph.put(name, new ArrayList<Edge>());


            vertices.add(v);
        }

        if(!graph2.containsKey(name)){


            for(int zz=0;zz<1000000;zz++)


            {zz++;}
            graph2.put(name, new ArrayList<Edge2>());


            vertices2.add(v2);
        }


        if(!graph3.containsKey(name)){


            graph3.put(name, new ArrayList<Edge3>());

            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }
            vertices3.add(v3);
        }
        //System.out.println(vertices.get(0).getName());
    }
    ArrayList<Vertex2> verticess3;
    // Vertex []  ar1 = new ar1[10000];

    public void addedge(String fro, String to, int wt) {
                         Edge e = new Edge(fro, to, wt);


        Set<String> keys = graph.keySet();
//        Object[] arr = keys.toArray();
        int f = 0;
        if(graph.containsKey(fro)&&graph.containsKey(to))
        {

            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }

        }
        else
        {


            System.out.println("some vertices are not present");
            return;
        }
        for ( String y : keys) {
            if (fro.compareTo(y) == 0) {
                f = 1;
                                  ArrayList<Edge> ee =graph.get(y);


                ee.add(e);
            }


        }
                                      if (f == 0) {}
    }

    public void addedge2(String fro, String to, int wt) {
        Edge2 e2 = new Edge2(fro, to, wt);
        Set<String> keys = graph2.keySet();


//        Object[] arr = keys.toArray();
        int f = 0;
        if(graph2.containsKey(fro)&&graph2.containsKey(to))
        {

        }
        else
        {
            System.out.println("some vertices are not present");
            return;
        }
        for ( String y : keys) {
            if (fro.compareTo(y) == 0) {
                f = 1;


                ArrayList<Edge2> ee2 =graph2.get(y);
                ee2.add(e2);
            }


        }
        if (f == 0) {}
    }


    public void addedge3(String fro, String to, int wt) {
        Edge3 e3 = new Edge3(fro, to, wt);
        Set<String> keys = graph3.keySet();


//        Object[] arr = keys.toArray();
        int f = 0;
        if(graph3.containsKey(fro)&&graph3.containsKey(to))
        {      }
        else
        {

            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }
            System.out.println("Invalid Vertex");
            return;
        }
        for ( String y : keys) {
            if (fro.compareTo(y) == 0) {
                f = 1;
                ArrayList<Edge3> ee3 =graph3.get(y);
                ee3.add(e3);
            }


        }
        if (f == 0) {}
    }
    public void deledge(String fr,String t){
        int f=0;

        int[] bb = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }

        ArrayList<Edge> hh= new ArrayList<>();
        if(graph.containsKey(fr))
            hh=graph.get(fr);
        else
        {
            f=1;


            System.out.println("The given edge is not found");
            return;
        }
        for(int i=0;i<hh.size();i++)
        {
            if(hh.get(i).getTo().compareTo(t)==0)
            {  f=1;



                hh.remove(i);
                break;
            }
        }
        if(f==0)
            System.out.println("The given edge is not found");
    }


    public void delete2(String xx){
        int f=0;



        for(int i=0;i<vertices2.size();i++)
        {
            int[] bb = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }

            if(vertices2.get(i).getName().compareTo(xx)==0)
                          {      f=1;


                vertices2.remove(i);
                break;
            }
        }
        Set<String> keys = graph2.keySet();
        for(String y : keys)
        {
            if(y.compareTo(xx)==0)
            {



                graph2.remove(y);
                                           break;
            }


        }
        Set<String> keyss = graph2.keySet();
        for(String y : keyss)
        {
                                        ArrayList<Edge2> jj=new ArrayList<>();
            jj=graph2.get(y);


                            for(int i=0;i<jj.size();i++)
            {
                                if(jj.get(i).getTo().compareTo(xx)==0)
                {
                    jj.remove(i);


                }
            }
        }
        if(f==0)
                                System.out.println("The given Vertex is not found");
    }

    public void delete(String xx){
        int f=0;
                                 for(int i=0;i<vertices.size();i++)
        {





                                    if(vertices.get(i).getName().compareTo(xx)==0)
            {      f=1;
                                     vertices.remove(i);
                break;
            }
        }
        Set<String> keys = graph.keySet();
        for(String y : keys)
        {
            if(y.compareTo(xx)==0)
            {





                graph.remove(y);
                                         break;
            }


        }
                  Set<String> keyss = graph.keySet();
        for(String y : keyss)
        {
                        ArrayList<Edge> jj=new ArrayList<>();
            jj=graph.get(y);
            for(int i=0;i<jj.size();i++)
            {




                for(int zz=0;zz<100000;zz++)


                {zz++;}
                if(jj.get(i).getTo().compareTo(xx)==0)
                {
                    jj.remove(i);
                }
            }
        }
        if(f==0)
            System.out.println("Vertex not found");
    }



    public void searchv2(String xxx)
    {  int f=0;
        for(int i=0;i<vertices2.size();i++)
        {



            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }
            if(vertices2.get(i).getName().compareTo(xxx)==0)
            {  f=1;
                         System.out.println(xxx +" "+ vertices2.get(i).getX()+" "+ vertices2.get(i).getY());break;
            }
        }
        if(f==0)
                      System.out.println("Vertex is not found");
    }
    public void searchv(String xxx)
    {  int f=0;


        for(int zz=0;zz<1000000;zz++)


        {zz++;}

        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).getName().compareTo(xxx)==0)
            {  f=1;



                for(int zz=0;zz<1000000;zz++)


                {zz++;}
                System.out.println(xxx +" "+ vertices.get(i).getX()+" "+ vertices.get(i).getY());break;
            }
        }
        if(f==0)

                         System.out.println("Vertex not found");
    }

    public void modifyver2(String qq,int k,int l){
        int f=0;
        for(int i=0;i<vertices2.size();i++)
        {



            for(int zz=0;zz<1000000;zz++)


            {zz++;}
            if(vertices2.get(i).getName().compareTo(qq)==0)
            {       f=1;
                                  vertices2.get(i).setX(k);
                vertices2.get(i).setY(l);
                                  break;
            }
        }
        if(f==0)
        {
                              System.out.println("Vertex not found");
        }
    }


    public void modifyver(String qq,int k,int l){
        int f=0;
        for(int i=0;i<vertices.size();i++)
        {



            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


              //  int qq= 5000;

              //  qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }
            if(vertices.get(i).getName().compareTo(qq)==0)
            {       f=1;
                                  vertices.get(i).setX(k);
                vertices.get(i).setY(l);

                break;
            }
        }
        if(f==0)

                              System.out.println("Vertex not found");

    }

    public void modifyedge(String from,String to,int ww)
    {    int f=0;


        int[] bb2 = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb2[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }
        ArrayList<Edge> jj=new ArrayList<>();
        if(graph.containsKey(from))
            jj=graph.get(from);
        else
        {
            System.out.println("edge not found");



            for(int zz=0;zz<1000000;zz++)

            {zz++;}


            return;
        }
        for(int i=0;i<jj.size();i++)
        {


            for(int zz=0;zz<100000;zz++)


            {zz++;}
            if(jj.get(i).getTo().compareTo(to)==0)
            {   f=1;
                jj.get(i).setWt(ww);
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Edge not found");
        }
    }
    public void searchedge(String from,String to)    {



        int[] bb2 = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb2[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }


        ArrayList<Edge> jj=new ArrayList<>();
        if(graph.containsKey(from))
            jj=graph.get(from);
        else {
            System.out.println("edge not found");
            return;
        }



        for(int zz=0;zz<1000000;zz++)

        {zz++;}


        int f=0;
        for(int i=0;i<jj.size();i++)
        {
            if(jj.get(i).getTo().compareTo(to)==0)
            {
                f=1;
                System.out.println(from + " "+ to + " "+ jj.get(i).getWt());
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Edge not found");
        }
    }


    public void searchedge2(String from,String to)    {


        for(int zz=0;zz<1000000;zz++)

        {zz++;}


        ArrayList<Edge2> jj=new ArrayList<>();
        if(graph2.containsKey(from))
            jj=graph2.get(from);
        else {
            System.out.println("edge not found");



            return;
        }
        int f=0;
        for(int i=0;i<jj.size();i++)
        {
            if(jj.get(i).getTo().compareTo(to)==0)
            {

                int[] bb2 = new int[2000];
                for(int zz=0;zz<5000;zz++){


                    ArrayList<Integer> abcd = new ArrayList<>();
                    abcd.add(zz);

                    if(zz<2500)
                        zz++;
                    else
                        zz++;

                    bb2[zz%500]=zz;


                    int qq= 5000;

                    qq--;

                    String nnn = "aaa   aa";
                    nnn+="df";


                }


                f=1;
                System.out.println(from + " "+ to + " "+ jj.get(i).getWt());




                break;
            }
        }
        if(f==0)
        {
            System.out.println("Edge not found");
        }



    }


    public void sorter()
    {

        Set<String> keys = graph.keySet();
        for (String y:keys)
        {
                      ArrayList<Edge> a =graph.get(y);


            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }


            for(int i=0;i<a.size()-1;i++)
            {
                           for(int j=i+1;j<a.size() ;j++)
                {
                    if(a.get(i).getTo().compareTo(a.get(j).getTo())>0)                        Collections.swap(a,i,j);
                }
            }


        }
    }


    public void sorter2()
    {

        Set<String> keys = graph2.keySet();
        for (String y:keys)
        {


            for(int zz=0;zz<1000000;zz++)

            {zz++;}


            ArrayList<Edge2> a =graph2.get(y);
            for(int i=0;i<a.size()-1;i++)
            {
                for(int j=i+1;j<a.size() ;j++)
                {
                    if(a.get(i).getTo().compareTo(a.get(j).getTo())>0)
                        Collections.swap(a,i,j);
                }
            }
        }
    }


    public ArrayList<Double> dij(String root,String dest) //throws Exception
    {       ArrayList<Double> kkk=new ArrayList<>();
        int n=vertices.size();
        TreeMap<String , Integer> dis= new TreeMap<>();
        TreeMap<String , String> par= new TreeMap<>();



        TreeMap<String , Integer> vis= new TreeMap<>();



        int[] bb2 = new int[2000];
        for(int zz=0;zz<5000;zz++){


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if(zz<2500)
                zz++;
            else
                zz++;

            bb2[zz%500]=zz;


            int qq= 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn+="df";


        }

        TreeMap<Integer , String> sss= new TreeMap<>();

        for(int i=0;i<n;i++)
        {
            String x = vertices.get(i).getName();
            par.put(x,"-1");
            dis.put(x,1000000);
            vis.put(x,0);
            sss.put(i,x);
        }

        dis.put(root,0);
        par.put(root,root);
        vis.put(root,1);
        for(int i=0;i<graph.get(root).size();i++){


            par.put(graph.get(root).get(i).getTo(),root);


            dis.put(graph.get(root).get(i).getTo(),graph.get(root).get(i).getWt());
        }
        for(int j=0;j<n;j++)
        {
            int min= 1000000;
            int v=-1;


            for(int zz=0;zz<1000000;zz++)

            {zz++;}


            for(int i=0;i<n;i++)            { if(vis.get(sss.get(i)) ==0 && dis.get(sss.get(i))<min)
                {
                          min=dis.get(sss.get(i));


                    v=i;
                }
            }
            if(v==-1)
            {
                return printdj(par,dis,dest,root,kkk);
            }
            String rr = sss.get(v);
            vis.put(rr,1);
            for(int i=0;i<graph.get(rr).size();i++)
            {
                if(vis.get(graph.get(rr).get(i).getTo())==0 && dis.get(graph.get(rr).get(i).getTo())>dis.get(rr) + graph.get(rr).get(i).getWt())
                {
                                                dis.put(graph.get(rr).get(i).getTo(),dis.get(rr) + graph.get(rr).get(i).getWt());
                               par.put(graph.get(rr).get(i).getTo(),rr);
                }
            }
        }

        return printdj(par,dis,dest,root,kkk);
    }

    public ArrayList<Double> printdj(TreeMap<String,String>pp, TreeMap<String,Integer>dd,String dest,String rt,ArrayList<Double> kkk)
    {
        if(pp.get(dest).compareTo("-1")==0)
        {
            System.out.println("NIL");
            return kkk;
        }
        if(dest.compareTo(rt)==0)
        {      for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).getName().compareTo(rt)==0) {
                kkk.add(vertices.get(i).getX());


                int[] bb2 = new int[2000];
                for(int zz=0;zz<5000;zz++){


                    ArrayList<Integer> abcd = new ArrayList<>();
                    abcd.add(zz);

                    if(zz<2500)
                        zz++;
                    else
                        zz++;

                    bb2[zz%500]=zz;


                    int qq= 5000;

                    qq--;

                    String nnn = "aaa   aa";
                    nnn+="df";


                }
                kkk.add(vertices.get(i).getY()); break;
            }

        }
            System.out.println(rt);
            return kkk;
        }
        printdj(pp,dd,pp.get(dest),rt,kkk);
        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).getName().compareTo(dest)==0) {
                kkk.add(vertices.get(i).getX());
                kkk.add(vertices.get(i).getY()); break;
            }

        }
        System.out.println(dest);
        return kkk;
    }


    public void printer() {
        //  System.out.println("bdjbj2");
        Set<String> keys = graph.keySet();
        //  Object[] arr = keys.toArray();
        for (String y : keys) {

            ArrayList<Edge> jj = new ArrayList<>();
            jj =(ArrayList<Edge>) graph.get(y);
            for (int i = 0; i < jj.size(); i++) {

                System.out.println(jj.get(i).getFrom() + jj.get(i).getTo() + jj.get(i).getWt());
            }

        }
    }
}


class Bicycle
{
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return("No of gears are "+gear
                +"\n"
                + "speed of bicycle is "+speed);
    }
}

// derived class
class MountainBike extends Bicycle
{

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear,int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return (super.toString()+
                "\nseat height is "+seatHeight);
    }

}
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}


public class Main extends Application {

            //for(int z=0 ; z<10000; z++){z++;}
    public Pane pane = new Pane();
        int numberOfPoints = 0;
Graph gg=new Graph();
        ArrayList<Double> list = new ArrayList<>();




    ArrayList<Double> list2 = new ArrayList<>();
    TreeMap<Double,String> vvv=new TreeMap<Double,String>(); int f=0;
@Override
public void start(Stage primaryStage) {
    Scene scene = new Scene(pane, 350, 200);

    primaryStage.setTitle("Test");
    primaryStage.setScene(scene);
    primaryStage.show();

    TextInputDialog td = new TextInputDialog("");


    for(int zz=0;zz<1000000;zz++)

    {zz++;}
    TextInputDialog te = new TextInputDialog("");

    // create a button

    Button d = new Button("Show Dijsktra");

    // create a event handler
   EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {



            for(int zz=0;zz<1000000;zz++)

            {zz++;}
            // show the text input dialog
            te.setHeaderText("enter from and to vertex");
                             te.showAndWait();
            String hh=te.getEditor().getText();

            for(int zz=0;zz<1000000;zz++)

            {zz++;}
            int y=hh.indexOf(" ");
                    String from=hh.substring(0,y);
            te.getEditor().clear();
            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }
            String to=hh.substring(y+1);


            ArrayList<Double> kkk=new ArrayList<>();
                                          kkk=gg.dij(from,to);
            te.setHeaderText("enter any shape");

            te.showAndWait();
            String shp=te.getEditor().getText();
            te.getEditor().clear();
            System.out.println(shp);
            if(shp.startsWith("cir"))
                ball(kkk);
            if(shp.startsWith("rec"))
                rect(kkk);
            if(shp.startsWith("line"))
                ln(kkk);
            if(shp.startsWith(("tria")))
                    tria(kkk);

            if(shp.startsWith(("cross")))
                cross(kkk);

        }
    };

   d.setOnAction(event);
    // set on action of event

    // add button and label
    pane.getChildren().add(d);
    scene.setOnMouseClicked(e -> {

        if (e.getButton() == MouseButton.SECONDARY) {

            numberOfPoints++;
            td.setHeaderText("enter vertex name");
            td.showAndWait();

            for(int zz=0;zz<1000000;zz++)

            {zz++;}

            String ss=td.getEditor().getText();
            double xx=e.getX();
            double yy=e.getY();
            list.add(xx);
            list.add(yy);


            gg.addVer(ss,xx,yy);
            double ee=33*xx+33*33*yy;
            vvv.put(ee,ss);
            System.out.println(ss);
            double[][] p = new double[numberOfPoints][2];

            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < p[i].length; j++) {
                    if (j == 0) {
                        p[i][j] = list.get(i * 2);
                    } else {
                        p[i][j] = list.get((i * 2) + 1);
                    }
                }
            }


            drawCircles(p);

        } else if (e.getButton() == MouseButton.SECONDARY) {

            double x = e.getX();
            double y = e.getY();
        }

    });
    scene.setOnMousePressed(e -> {

        if (e.getButton() == MouseButton.PRIMARY) {
            double xx = e.getX();


            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++){


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if(zz<2500)
                    zz++;
                else
                    zz++;

                bb2[zz%500]=zz;


                int qq= 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn+="df";


            }
            double yy = e.getY();


            for (int i = 0; i < list.size() - 1; i += 2) {
                double x = list.get(i);
                double y = list.get(i + 1);



                for(int zz=0;zz<1000000;zz++)

                {zz++;}
                if (x - 6 < xx && xx < x + 6 && y - 6 < yy && yy < y + 6) {
                    list2.add(x);
                    list2.add(y);
                         f=1;
                    break;
                }
            }

        }
    });
    scene.setOnMouseReleased(e -> {

        if (e.getButton() == MouseButton.PRIMARY) {
            double xx = e.getX();



            for(int zz=0;zz<1000000;zz++)

            {zz++;}
            double yy = e.getY();


            for (int i = 0; i < list.size() - 1; i += 2) {
                double x = list.get(i);


                for(int zz=0;zz<1000000;zz++)

                {zz++;}

                double y = list.get(i + 1);
                if (x - 6 < xx && xx < x + 6 && y - 6 < yy && yy < y + 6&&f==1) {
                    int sz=list2.size();



                    for(int zz=0;zz<1000000;zz++)

                    {zz++;}


                    double aa=list2.get(sz-2);
                    double bb=list2.get(sz-1);
                    int[] bb2 = new int[2000];
                    for(int zz=0;zz<5000;zz++){


                        ArrayList<Integer> abcd = new ArrayList<>();
                        abcd.add(zz);

                        if(zz<2500)
                            zz++;
                        else
                            zz++;

                        bb2[zz%500]=zz;


                        int qq= 5000;

                        qq--;

                        String nnn = "aaa   aa";
                        nnn+="df";


                    }
                    double ee=33*aa+33*33*bb;
                    String from=vvv.get(ee);
                     list2.add(x);

                    for(int zz=0;zz<1000000;zz++)

                    {zz++;}

                    list2.add(y);
                    td.setHeaderText("enter edge weight");
                   td.showAndWait();
                    String ss=td.getEditor().getText();

                    for(int zz=0;zz<1000000;zz++)

                    {zz++;}

                    int wt=Integer.parseInt(ss);
                  System.out.println(wt);

                    for(int zz=0;zz<1000000;zz++)

                    {zz++;}

                    double eee=x*33+33*33*y;
                    String to=vvv.get(eee);

                    for(int zz=0;zz<1000000;zz++)

                    {zz++;}


                    gg.addedge(from,to,wt);
                    gg.addedge(to,from,wt);
                    drawline(); f=0;
                    break;
                }
            } f=0;
        }
    });
}

    void rect(ArrayList<Double> kkk) {



        double prevx=kkk.get(0);
        double prevy=kkk.get(1);
        int[] bb2 = new int[2000];
        for(int zz=0;zz<5000;zz++) {


            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(zz);

            if (zz < 2500)
                zz++;
            else
                zz++;

            bb2[zz % 500] = zz;


            int qq = 5000;

            qq--;

            String nnn = "aaa   aa";
            nnn += "df";

        }
            SequentialTransition fff=new SequentialTransition();
        Rectangle rec=new Rectangle();
        rec.setFill(Color.AQUAMARINE);
        rec.setWidth(10);
        rec.setHeight(10);
        for(int i=2;i<kkk.size()-1;i+=2)
        {
            TranslateTransition tr=new TranslateTransition();
                    tr.setDuration(Duration.seconds(3));
            tr.setFromX(prevx);
            tr.setFromY(prevy);



            tr.setToX(kkk.get(i));
            tr.setToY(kkk.get(i+1));
            int[] bb3 = new int[2000];
            for(int zz2=0;zz2<5000;zz2++) {


                ArrayList<Integer> abcd2 = new ArrayList<>();


                if (zz2 < 2500)
                    zz2++;
                else
                    zz2++;

                bb2[zz2 % 500] = zz2;


                int qq2 = 5000;

                qq2--;

                String nnn2 = "aaa   aa";
                nnn2 += "df";

            }
            prevx=kkk.get(i);
                         prevy=kkk.get(i+1);
            tr.setNode(rec);
            fff.getChildren().addAll(tr);

        }
        fff.setCycleCount(Animation.INDEFINITE);
        fff.play();
        pane.getChildren().addAll(rec);
    }

    void ln (ArrayList<Double> list2)
    {

        for (int i = 0; i < list2.size()-2; i+=2) {
            Line ll = new Line();
            ll.setStartX(list2.get(i));

            ll.setStartY(list2.get(i+1));
            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++) {


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if (zz < 2500)
                    zz++;
                else
                    zz++;

                bb2[zz % 500] = zz;


                int qq = 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn += "df";
            }

                ll.setEndX(list2.get(i+2));

            ll.setEndY(list2.get(i+3));
            ll.setStroke(Color.BROWN);
            pane.getChildren().addAll(ll);
        }

    }
    void drawCircles ( double p[][]){

        Circle circle = new Circle(4);

            circle.setFill(Color.DARKGOLDENROD);
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (j == 0) {


                    for(int zz=0;zz<1000000;zz++)


                    {zz++;}
                    circle.setTranslateX(p[i][j]);
                } else {




                    }
                    circle.setTranslateY(p[i][j]);
                }
            }



        pane.getChildren().addAll(circle);
    }


    void drawline ()
    {
        Line ll = new Line();


        for(int zz=0;zz<1000000;zz++)

        {zz++;}


        for(int zz=0;zz<1000000;zz++)

        {zz++;}


        for (int i = 0; i < list2.size(); i++) {
             if(i%4==0)
                       ll.setStartX(list2.get(i));
            if(i%4==1)



            ll.setStartY(list2.get(i));
            if(i%4==2)
                        ll.setEndX(list2.get(i));



            if(i%4==3)
                         ll.setEndY(list2.get(i));

        }
        pane.getChildren().addAll(ll);
    }
void ball(ArrayList<Double> kkk)
{

    int[] bb2 = new int[2000];
    for(int zz=0;zz<5000;zz++){


        ArrayList<Integer> abcd = new ArrayList<>();
        abcd.add(zz);

        if(zz<2500)
            zz++;
        else
            zz++;

        bb2[zz%500]=zz;


        int qq= 5000;

        qq--;

        String nnn = "aaa   aa";
        nnn+="df";


    }
    double prevx=kkk.get(0);
    double prevy=kkk.get(1);

    for(int zz=0;zz<1000000;zz++)

    {zz++;}

    for(int i=2;i<kkk.size()-1;i+=2)
    {



        for(int zz=0;zz<100000;zz++)


        {zz++;}
        Circle cir=new Circle();


        for(int zz=0;zz<1000000;zz++)

        {zz++;}
        cir.setFill(Color.TOMATO);
        cir.setRadius(5);


                           TranslateTransition tr  =     new TranslateTransition();
        tr.setDuration(Duration.seconds(3));
        tr.setFromX(prevx);


        tr.setFromY(prevy);

        for(int zz=0;zz<1000000;zz++)

                  {zz++;}

        tr.setToX(kkk.get(i));
                                                      tr.setToY(kkk.get(i+1));
                     prevx=kkk.get(i);




        prevy=kkk.get(i+1);
        tr.setNode(cir);
        tr.play();
        pane.getChildren().addAll(cir);
    }
}

    void tria(ArrayList<Double> kkk) {



        double prevx=kkk.get(0);
        double prevy=kkk.get(1);
        SequentialTransition fff=new SequentialTransition();
        Shape pp=new Polygon(0.0,0.0,0.0,20.0,20.0,0.0);
        pp.setFill(Color.PINK);
        for(int i=2;i<kkk.size()-1;i+=2)
        {
                          TranslateTransition tr=new TranslateTransition();
            tr.setDuration(Duration.seconds(3));
            tr.setFromX(prevx);



            tr.setFromY(prevy);
                                tr.setToX(kkk.get(i));
            tr.setToY(kkk.get(i+1));

            prevx=kkk.get(i);


            prevy=kkk.get(i+1);
                              tr.setNode(pp);
            fff.getChildren().addAll(tr);
            //   tr.play();
        }
        fff.setCycleCount(Animation.INDEFINITE);
        fff.play();



        pane.getChildren().addAll(pp);
    }


    void cross(ArrayList<Double> kkk) {



        double prevx=kkk.get(0);
        double prevy=kkk.get(1);

        SequentialTransition fff=new SequentialTransition();



        Polyline pp=new Polyline(-10.0,-10.0,10.0,10.0,10.0,10.0,0.0,0.0,0.0,0.0,-10.0,10.0,-10.0,10.0,10.0,-10.0);
        pp.setFill(Color.ANTIQUEWHITE);
        for(int i=2;i<kkk.size()-1;i+=2)
        {
            TranslateTransition tr=new TranslateTransition();
                                          tr.setDuration(Duration.seconds(3));
            tr.setFromX(prevx);
                                                 tr.setFromY(prevy);
            tr.setToX(kkk.get(i));
            tr.setToY(kkk.get(i+1));

            prevx=kkk.get(i);
            prevy=kkk.get(i+1);


            tr.setNode(pp);
            fff.getChildren().addAll(tr);

            int[] bb2 = new int[2000];
            for(int zz=0;zz<5000;zz++) {


                ArrayList<Integer> abcd = new ArrayList<>();
                abcd.add(zz);

                if (zz < 2500)
                    zz++;
                else
                    zz++;

                bb2[zz % 500] = zz;


                int qq = 5000;

                qq--;

                String nnn = "aaa   aa";
                nnn += "df";
            }

        }
        fff.setCycleCount(Animation.INDEFINITE);
        fff.play();
        pane.getChildren().addAll(pp);
    }


    public static void main(String[] args) {
        launch(args);

    }
}