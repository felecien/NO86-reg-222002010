class WhileLoop1{
    public static void main(String a[])
    {
        int n=1, sum=n;
 
        // Exit when n becomes greater than 4
        while (n<=13) {
            // summing up n
            sum = sum+n;
 
            // Increment the value of n for
            // next iteration
            n++;
        }
        System.out.println("Sum is equal to: " + sum);
    }
}