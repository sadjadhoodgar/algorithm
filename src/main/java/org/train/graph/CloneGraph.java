package org.train.graph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
  public GraphNode solution(GraphNode root) {
    if (root == null) {
      return null;
    }

    Map<GraphNode, GraphNode> visited = new HashMap<>();

    return dfs(visited, root);

  }

  private GraphNode dfs(Map<GraphNode, GraphNode> visited, GraphNode node) {
    if (visited.containsKey(node)) {
      return visited.get(node);
    }

    GraphNode clone = new GraphNode(node.val);
    visited.put(node, clone);

    for (GraphNode neighbor : node.neighbors) {
      clone.neighbors.add(dfs(visited, neighbor));
    }

    return clone;
  }
}
