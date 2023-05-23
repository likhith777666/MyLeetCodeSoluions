class Solution {
    public boolean squareIsWhite(String s) {
        String arr[]=s.split("");
         
         int b=Integer.parseInt(arr[1]);
        
         char a= arr[0].charAt(0);
        int c=(int)a;
        if(c%2==0&&b%2==0||c%2!=0&&b%2!=0){
            return false;

        }else{
            return true;
        }

        
    }
}
