package Ex2;

import api.EdgeData;

public class NodeEdge implements EdgeData {
    private int src;
    private int dest;
    private double weight;
    private String info;
    private int tag;


    public NodeEdge(int Src, double Weight, int Dest){
        this.src = Src;
        this.weight = Weight;
        this. dest = Dest;
    }

    @Override
    public int getSrc() {
        return this.src;
    }

    @Override
    public int getDest() {
        return this.dest;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }
}
