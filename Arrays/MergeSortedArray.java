
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] a = new int[nums1.length];
        while (k != a.length && i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                a[k++] = nums1[i];
                i++;
            } else if (nums1[i] == nums2[j]) {
                a[k++] = nums1[i];
                i++;
            } else {
                a[k++] = nums2[j];
                j++;
            }
        }
        if (i == m && j != n && k != nums1.length) {
            while (j != n) {
                a[k++] = nums2[j++];
            }
        } else if (i != m && j == n && k != nums1.length) {
            {
                while (i != m) {
                    a[k++] = nums1[i++];
                }
            }
        }
        int e = 0;
        for (int p : a) {
            nums1[e++] = p;
        }
    }
}
