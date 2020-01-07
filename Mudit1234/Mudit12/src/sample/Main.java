package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.*;

class Edge
{
    private String from,to;
    private int wt;
    public Edge(String from,String to,int wt)
    {


        this.setFrom(from);
        this.setTo(to);
        this.setWt(wt);
    }

    public int getWt() {

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

        return wt;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setWt(int wt) {
        this.wt = wt;
    }

    public String getFrom() {

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


        }return from;
    }

    public String getTo() {
        return to;
    }
}

class Vertex
{
    private String name;
    private int x,y;

    public Vertex(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {

        int[] axx = new int[500];
        for(int uu=0;uu<1234;uu++)
        {

            axx[uu%100]=uu;
            int[] ax2=new int[50];ax2[uu%40]= uu;

            String qwe = "ggggggggggrr";qwe+= "ffffff";

            TreeMap<Integer , String> tree = new TreeMap<>();

            tree.put(uu,"asdffa");


            TreeMap<Integer , String> tree2 = new TreeMap<>();


            tree2.put(uu%20,"aggsdffa");

            ArrayList<Integer> abcd = new ArrayList<>();
            abcd.add(uu);

            if(uu<2500)uu++;
            else       uu++;
            int qq= 1234;

            qq--;


        }return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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

class Graph {
    ArrayList<Vertex> vertices;
    TreeMap<String, ArrayList<Edge>> graph;

    public Graph() {
        vertices=new ArrayList<Vertex>();
        graph=new TreeMap<>();
    }

    public void addVer(String name, int x, int y) {
        Vertex v = new Vertex(name, x, y);
//        int[] axx = new int[550];
//        for(int uu=0;uu<1234;uu++)
//        {
//
//            axx[uu%500]=uu;
//            int[] ax2=new int[50];
//            ax2[uu%40]= uu;
//
//            String qwe = "ggggggggggrr";
//
//            qwe+= "ffffff";
//
//            TreeMap<Integer , String> tree = new TreeMap<>();
//            tree.put(uu,"asdffa");
//
//
//            TreeMap<Integer , String> tree2 = new TreeMap<>();
//            tree2.put(uu%20,"aggsdffa");
//
//            ArrayList<Integer> abcd = new ArrayList<>();
//            abcd.add(uu);
//
//            if(uu<2500)
//                uu++;
//            else
//                uu++;
//            int qq= 1234;
//
//            qq--;
//
//
//        }
        if(!graph.containsKey(name)) {
            graph.put(name, new ArrayList<Edge>());
            vertices.add(v);
        }
    }

    public void addedge(String fro, String to, int wt) {
        Edge e = new Edge(fro, to, wt);
        Set<String> keys = graph.keySet();

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
        int f = 0;
        if(graph.containsKey(fro)&&graph.containsKey(to))
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
                ArrayList<Edge> ee =graph.get(y);
                ee.add(e);
            }
        }
        if (f == 0) {


        }


    }
    public void deledge(String fr,String t)
    {   int f=0;

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
        ArrayList<Edge> hh=new ArrayList<>();
        if(graph.containsKey(fr))
            hh=graph.get(fr);
        else
        {
            f=1;
            System.out.println("edge not found");

          //  int[] axx = new int[550];
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
            System.out.println("edge not found");
    }
    public void delete(String xx)
    {      int f=0;


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


          //  int[] axx = new int[550];
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


        }
        Set<String> keyss = graph.keySet();
        for(String y : keyss)
        {
            ArrayList<Edge> jj=new ArrayList<>();
            jj=graph.get(y);
            for(int i=0;i<jj.size();i++)
            {
                if(jj.get(i).getTo().compareTo(xx)==0)
                {
                    jj.remove(i);
                }
            }
        }
        if(f==0)
            System.out.println("Vertex not found");
    }

    public void searchv(String xxx)
    {  int f=0;
        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).getName().compareTo(xxx)==0)
            {  f=1;
                System.out.println(xxx +" "+ vertices.get(i).getX()+" "+ vertices.get(i).getY());break;
            }
        }
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
        if(f==0)
        {
            System.out.println("Vertex not found");
        }
    }

    public void modifyver(String qq,int k,int l)
    {   int f=0;


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
           // int qq= 1234;

         //   qq--;


        }


        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).getName().compareTo(qq)==0)
            {       f=1;
                vertices.get(i).setX(k);
                vertices.get(i).setY(l);
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Vertex not found");
        }
    }

    public void modifyedge(String from,String to,int ww)
    {    int f=0;




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
        ArrayList<Edge> jj=new ArrayList<>();
        if(graph.containsKey(from))
            jj=graph.get(from);
        else
        {
            System.out.println("edge not found");
            return;
        }
        for(int i=0;i<jj.size();i++)
        {
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
    public void searchedge(String from,String to)
    {
        ArrayList<Edge> jj=new ArrayList<>();

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
        if(graph.containsKey(from))
            jj=graph.get(from);
        else {
            System.out.println("edge not found");
            return;
        }
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
    public void sorter()
    {
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
        Set<String> keys = graph.keySet();
        for (String y:keys)
        {
            ArrayList<Edge> a =graph.get(y);
            for(int i=0;i<a.size()-1;i++)
            {
                for(int j=i+1;j<a.size() ;j++)
                {
                    if(a.get(i).getTo().compareTo(a.get(j).getTo())>0)
                    {
                        Collections.swap(a,i,j);
                    }
                }
            }
        }
    }


    public void dij(String root,String dest) //throws Exception
    {
        int n=vertices.size();
        TreeMap<String , Integer> dis= new TreeMap<>();
        TreeMap<String , String> par= new TreeMap<>();
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
        TreeMap<String , Integer> vis= new TreeMap<>();
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

        //  Queue<String> q = new Queue<String>();
      //  int[] axx = new int[550];
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
        for(int i=0;i<graph.get(root).size();i++)
        {
            par.put(graph.get(root).get(i).getTo(),root);
            dis.put(graph.get(root).get(i).getTo(),graph.get(root).get(i).getWt());
            //       q.add(graph.get(root).get(i).getTo());

        }
        for(int j=0;j<n;j++)
        {
            int min= 1000000;
            int v=-1;
            for(int i=0;i<n;i++)
            {
                if(vis.get(sss.get(i)) ==0 && dis.get(sss.get(i))<min)
                {
                    min=dis.get(sss.get(i));
                    v=i;
                    //  String ss= (graph.get(i).getTo();
                }
            }
            if(v==-1)
            {
                printdj(par,dis,dest,root);
                return;
            }
            String rr = sss.get(v);
            // System.out.println(rr);
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

      //  int[] axx = new int[550];
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

        printdj(par,dis,dest,root);
    }

    public void printdj(TreeMap<String,String>pp, TreeMap<String,Integer>dd,String dest,String rt)
    {

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
        if(pp.get(dest).compareTo("-1")==0)
        {
            System.out.println("NIL");
            return;
        }
        if(dest.compareTo(rt)==0)
        {
            System.out.println(rt);
            return;
        }

       // int[] axx = new int[550];
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
        printdj(pp,dd,pp.get(dest),rt);
        System.out.println(dest);
    }


    public void printer() {
        Set<String> keys = graph.keySet();
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
        for (String y : keys) {
            ArrayList<Edge> jj = new ArrayList<>();
            jj =(ArrayList<Edge>) graph.get(y);
            for (int i = 0; i < jj.size(); i++) {
                System.out.println(jj.get(i).getFrom() + jj.get(i).getTo() + jj.get(i).getWt());
            }

        }
    }
    public ArrayList<Vertex> ver()
    {
        return vertices;
    }
    public TreeMap<String,ArrayList<Edge>> ed()
    {
        return graph;
    }
}



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 675));
        primaryStage.show();
    }


    public static void main(String[] args) throws Exception{

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
       launch(args);


        Scanner sc=new Scanner(System.in);

        int v;
        Graph gg=new Graph();
        v=sc.nextInt();
        String hhh=sc.nextLine();
        while(v>0)
        {
            String name;
            int x,y;
            name=sc.next();
            x=sc.nextInt();
            y=sc.nextInt();
            String ft=sc.nextLine();
            gg.addVer(name,x,y);
            v=v-1;
        }

      //  int[] axx = new int[550];
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
        int ee;
        ee=sc.nextInt();
        String dum=sc.nextLine();
        //   System.out.println("p2");
        while(ee>0)
        {
            String from,to;
            int wt;
            from=sc.next();
            to=sc.next();
            wt=sc.nextInt();
            String ghk=sc.nextLine();
            //   System.out.println("entry");
            gg.addedge(from,to,wt);
            //   System.out.println("exit");
            ee=ee-1;
        }


     //   int[] axx = new int[550];
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
        gg.sorter();
        System.out.println("kil");
        gg.printer();
      //  int[] axx = new int[550];
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

        System.out.println("lhk");
        gg.printer();
        String root=sc.nextLine();
        String de=sc.nextLine();

      //  int[] axx = new int[550];
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
        gg.dij(root,de);

        return;
    }
}

