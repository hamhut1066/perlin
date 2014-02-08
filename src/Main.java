/**
 * Created by aoeu on 2/8/14.
 */
import render.GLParser;

public class Main {
    public static void main(String args[]){
        //sample input for testing!
        float[][] graph = new float[64][64];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++){
                graph[i][j] = (float) Math.random()*2;
            }
        }
        //end sample input
        GLParser.plotGraph(graph);
    }
}
