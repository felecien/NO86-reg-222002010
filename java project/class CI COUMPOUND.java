class CI {
    public static float multp(int p, int r, int t,int n){
        return(p * ((1+((r/100)/ n)) ^ (t * n)));
    }
    class interest{
        public static void main(String a[]){
            CI myCI= new CI();
            float result= myCI.multp(500000, 18, 3, 12);
            System.out.println("interest is: " +result);
        }
    }
    
 {
    
}
