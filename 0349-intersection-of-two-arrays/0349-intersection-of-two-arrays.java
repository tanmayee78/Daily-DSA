class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        Set<Integer> ans = new HashSet<>();

        if (n1 <= n2) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    if (nums1[i] == nums2[j]) {
                        ans.add(nums1[i]);
                        break; 
                    }
                }
            }
        } else {
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < n1; j++) {
                    if (nums2[i] == nums1[j]) {
                        ans.add(nums2[i]);
                        break;
                    }
                }
            }
        }

        
        int[] res = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            res[i++] = num;
        }

        return res;
    }
}