

public class Trapping_Water {

    public static int trappedwater(int height[]) {

        // left max
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // right max
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop for water levels
        int trappedwater = 0;

        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // water trapped
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;

    }

    public static void main(String[] args) {

        // sample input {0,1,0,2,1,0,1,3,2,1,2,1}

        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedwater(height));
    }
}

// sample output = 4
