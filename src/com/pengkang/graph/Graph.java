package pengkang.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 图的数据结构
 */
public class Graph {
    static int[][] edge;
    static List<String> vertex;
    static int numEdge;

    /**
     *
     * @param n 顶点个数
     */
    public Graph(int n){
        edge = new int[n][n];
        vertex = new ArrayList<>(n);
        numEdge = 0;

    }



    /**
     *
     * @param str 顶点
     */
    public void insertVertex(String str){
        vertex.add(str);
    }

    /**
     *
     * @param v1 顶点1
     * @param v2 顶点2
     * @param weight 权值
     */
    public void insertEgde(int v1, int v2, int weight){
        edge[v1][v2] = weight;
        edge[v2][v1] = weight;
        numEdge++;
    }

    public int getVertex(){
        return vertex.size();
    }

    public int getNumEdge(){
        return numEdge;
    }
    
    public int getWeigth(int v1, int v2){
        return edge[v1][v2];
    }

    /**
     * 遍历图
     */
    public void showGraph(){
        for (int[] temp : edge) {
            System.out.println(Arrays.toString(temp));
        }
    }



    public static void main(String[] args) {

        int n = 5;
        String Vertex[] = {"A", "B", "C", "D", "E"};

        //new
        Graph graph = new Graph(n);

        for (int i = 0; i < n; i++) {
            graph.insertVertex(Vertex[i]);
        }

        //
        graph.insertEgde(0, 1, 1);
        graph.insertEgde(0, 2, 1);
        graph.insertEgde(1, 2, 1);
        graph.insertEgde(1, 3, 1);
        graph.insertEgde(1, 4, 1);
        graph.showGraph();

    }


}


