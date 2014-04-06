package com.td.kdtree;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Coordinate> coordinates = new ArrayList<Coordinate>();
        coordinates.add(new Coordinate(1, 1, "a"));
        coordinates.add(new Coordinate(2, 3, "b"));
        coordinates.add(new Coordinate(3, 2, "c"));
        coordinates.add(new Coordinate(4, 3, "d"));
        coordinates.add(new Coordinate(7, 12, "e"));
        coordinates.add(new Coordinate(10, 7, "f"));
        coordinates.add(new Coordinate(11, 7, "g"));
        KDTree tree = new KDTree(coordinates);
        System.out.println(tree.root.coordinate.name);
    }
}
