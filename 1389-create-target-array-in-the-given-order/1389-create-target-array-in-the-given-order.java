class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // int[] target = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i; j < index.length; j++){
        //         target[index[j]] = nums[i];
        //     }
        // }
        // return target;

        ArrayList<Integer> l= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i]=l.get(i);
        }
        return target;
    }
}