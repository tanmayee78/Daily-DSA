class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int[][] arr=new int[r][c];

        for(int i=0;i<r;i++){
            int k=0;
            for(int j=c-1; j>=0;j--){
                if(image[i][j]==1){
                    arr[i][k++]=0;
                }else{
                    arr[i][k++]=1;
                }

            }
        }
        return arr;
    }
}