public class inheritance2 {
    public static void main(String[] args) {
        A mywork= new A();
        mywork.find();
        mywork.display();
        mywork.calculate();
        mywork.interfacetest();
        mywork.show(); 
        
    }}
    class f{
        float side=3;
        
        public void find(){
        double area=side*side;
        System.out.println(area);
        }
    
    }
    class C extends f{
        public static void display(){
            System.out.println("the above number is area of square");
        }
    }
    class B extends C{
        public static void calculate(){
            int side=6;
            
            double perimeter=side*4;
            System.out.println("this is perimeter"+perimeter);
    
        }
    }
    interface E {
         void interfacetest();
    }
    class A extends B implements E{
        public  void show(){
            
        System.out.println(side*side);
        }
        public void interfacetest(){
    
    System.out.println("This is Interface's method");
    }
    }
    

