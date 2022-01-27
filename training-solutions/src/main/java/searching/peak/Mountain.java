package searching.peak;

import java.util.Arrays;

public class Mountain {

    private int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public int[] getHeights() {
        return heights;
    }

    public boolean searchPeak(Peak peak) {
        int height = Arrays.binarySearch(heights, peak.getHeight());
        return height >= 0;
    }
}
