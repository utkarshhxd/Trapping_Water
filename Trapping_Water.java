import java.util.*;

public class Trapping_Water {

    public static int trappedwater(int height[]) {

        //for left max
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i =1; i<height.length; i+){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //for right max 
        int rightMax[] = new int[height.length];
        
    }
}