package render;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created by aoeu on 2/8/14.
 * Parses the input 2d array, this is the only accessible class
 */
//this class needs to render the content onto a screen, setting appropriate colors according to height
    //render a column at a time, because that would be awesome!
public abstract class GLParser {
    public static void plotGraph(float[][] graph){
        //put this into a seperate thread
        createDisplay();
       for(float[] col: graph) {
           for(float cell : col){
               System.out.print(cell+"|");
           }
           System.out.println();
       }
    }
    private static void createDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
        while (!Display.isCloseRequested()) {
            Display.update();
        }
        Display.destroy();
    }
}
