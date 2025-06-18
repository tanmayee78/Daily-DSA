class Solution {
    public boolean checkIfExist(int[] arr) {
        //Brute Force
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //             if(i != j && arr[i] == 2 * arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Binary Search
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int target = 2 * arr[i];
            int start = 0, end = arr.length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] == target && mid != i){
                    return true;
                }else if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}