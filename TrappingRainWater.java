class Solution {
    public int trap(int[] height) {

          int lm=height[0];
        int rm=height[height.length-1];
        int l=0,r=height.length-1;
        int sum=0;
       while(l<r){
           if(lm>rm){
               sum+=rm-height[r];
               r=r-1;
               if(height[r]>rm){
                   rm=height[r];
               }
           }if(lm<=rm){
              sum+=lm-height[l];
               l=l+1;
               if(height[l]>lm){
                   lm=height[l];
               }
           }
       }
       return sum;
        
    }
}
