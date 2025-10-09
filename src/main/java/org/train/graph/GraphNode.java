package org.train.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #133 - Clone Graph
 * Link: <a href="https://leetcode.com/problems/clone-graph/">...</a>
 */
public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {
        val = 0;
        neighbors = new ArrayList<GraphNode>();
    }

    public GraphNode(int _val) {
        val = _val;
        neighbors = new ArrayList<GraphNode>();
    }

    public GraphNode(int _val, ArrayList<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
