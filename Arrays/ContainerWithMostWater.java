
public class ContainerWithMostWater {

    public int maxArea(int[] h) {
        int i = 0;
        int j = h.length - 1;
        int area = 0;
        while (i <= j) {
            area = Math.max((j - i) * Math.min(h[i], h[j]), area);
            if (h[i] >= h[j])
                j--;
            else {
                i++;
            }
        }
        return area;
    }

}
