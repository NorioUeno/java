package crackingTheCodingInterview.treeAndGraph;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderBuild_4_7_2 {

  public static void main(String[] args) {
    System.out.println(ge1tNumberDependencies(10,3));
  }

//  Project[] findBuildOrder(String[] projects, String[][] dependencies) {
//    Graph graph = buildGraph(projects, dependencies);
//  }
//
//  Graph buildGraph(String[] projects, String[][] dependencies) {
//    Graph graph = new Graph();
//    for(String project : projects) {
//      graph.getOrCreateNode(project);
//    }
//
//    for(String[] dependency : dependencies) {
//      String first = dependensy[0]{
//    }
//
//  }

  int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
    for(Project project : projects) {
      if(project.getNumberDependencies() == 0) {
        order[offset] = project;
        offset++;
      }
    }
    return offset;
  }

  public class Graph{
    private ArrayList<Project> nodes = new ArrayList<Project>();
    private HashMap<String,Project> map = new HashMap<String, Project>();

    public Project getOrCreateNode(String name) {
      if(!map.containsKey(name)) {
        Project node = new Project(name);
        nodes.add(node);
        map.put(name, node);
      }
      return map.get(name);
    }

    public void addEdge(String startName, String endName) {
      Project start = getOrCreateNode(startName);
      Project end = getOrCreateNode(endName);
      start.addNeighbor(end);
    }

    public ArrayList<Project> getNode(){
      return nodes;
    }

  }

  public class Project {
    private ArrayList<Project> children = new ArrayList<Project>();
    private HashMap<String, Project> map = new HashMap<String, Project>();
    private String name;
    private int dependencies = 0;

    public Project(String n) {
      name = n;
    }
    public String getName() {
      return name;
    }
    public void incrementDependencies() {
      dependencies++;
    }
    public void decrementDependencies() {
      dependencies--;
    }

    public void addNeighbor(Project node) {
      if(!map.containsKey(node.getName())) {
        children.add(node);
        map.put(node.getName(), node);
        node.incrementDependencies();
      }
    }

    public int getNumberDependencies() {
      return dependencies;
    }
  }
  public static int ge1tNumberDependencies(int num, int i) {
//    return num | (1 << i);
    return 10 | 1111;
  }

}
