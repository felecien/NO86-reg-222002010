class alfred{
    public static void main(String args[]) {
        alfred myobj=new Alice();
        myobj.show();
        myobj.dis();
        myobj.calc();
        myobj.add();
        myobj.interfacetest();
        
    }
}

class already{
    int g=5;
    int t=45;
    
    public void add(){
        int result=f+g;
        System.out.println(result);

    }
}
class Chris extends already{
    public static void dis(){
        System.out.println("This class is called Bruno"); // the output message
    }
}
class Bruno extends Chris{
    public static void calc(){
        int h=15;
        int j=30;
        int result=j-h;
        System.out.println(result);
    }
}

    interface mukandanga {
   void interfacetest();
} 

class alfred extends Bruno implements E{
    public  void show() {
        System.out.println(f+g);
        
    }
    
    public void interfacetest(){
    
    System.out.println("The interface method");
}
}
