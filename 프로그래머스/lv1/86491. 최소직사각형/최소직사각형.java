class Solution {
        public int solution(int[][] sizes) {

        int width = 0;
        int height = 0;

        for (int[] size : sizes) {

            int tempWidth = Math.max(size[0], size[1]);
            int tempHeight = Math.min(size[0], size[1]);

            if(tempWidth > width){
                width  = tempWidth;
            }

            if(tempHeight > height){
                height = tempHeight;
            }
        }

        return width * height;
    }

}