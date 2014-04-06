package com.td.kdtree;

public class KDNode {
    public Coordinate coordinate;
    public KDNode left;
    public KDNode right;

    public KDNode(Coordinate coordinate){
        this.coordinate = coordinate;
    }
}
