package com.td.kdtree;

import java.util.List;

public class KDTree {
    public KDNode root;

    //private List<Coordinate> sortedLongitude;
    //private List<Coordinate> sortedLatitude;
    public KDTree(List<Coordinate> coordinates) {
        root = buildTree(coordinates, 1);
    }

    private KDNode buildTree(List<Coordinate> coordinates, int depth) {
        if (coordinates.size() == 1) {
            return new KDNode(coordinates.get(0));
        }
        if (coordinates.size() == 0) {
            return null;
        }
        // Long
        if (depth % 2 == 1) {
            coordinates.sort((Coordinate x, Coordinate y) -> {
                if (x.longitude > y.longitude) return 1;
                else if (x.longitude == y.longitude) return 0;
                else return -1;
            });
        }
        // Lat
        else {
            coordinates.sort((Coordinate x, Coordinate y) -> {
                if (x.latitude > y.latitude) return 1;
                else if (x.latitude == y.latitude) return 0;
                else return -1;
            });
        }
        int mid = coordinates.size() / 2;
        KDNode node = new KDNode(coordinates.get(mid));
        List<Coordinate> left = coordinates.subList(0, mid);
        List<Coordinate> right = coordinates.subList(mid, coordinates.size());
        node.left = buildTree(left, depth + 1);
        node.right = buildTree(right, depth + 1);
        return node;
    }
}
