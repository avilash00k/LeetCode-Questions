class Solution {
    public int maxArea(int[] height) {
        int maxw=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int curw=ht*width;
            maxw=Math.max(curw, maxw);
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return maxw;
    }
}