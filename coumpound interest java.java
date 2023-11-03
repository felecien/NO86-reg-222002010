class CompoundI
{
    public double calcCI(double principal, double rate, double time, double number)
    {
        return principal*(Math.pow((1 + rate /number),number*time));
    }
}
public class  object {
    public static void main (String [] args){
        //create an instance of the CompoundInterest class

        CompoundI myCI = new CompoundI();
        double result = myCI.calcCI(500000, 0.18, 3, 12);
        System.out.println("The Result is :" + result);
    }
}
