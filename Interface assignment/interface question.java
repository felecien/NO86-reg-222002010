interface ange{  //interface name
    void vol();  
    static int cube(int y){return y*y*y;}  //declaration of codes
    }  
    class volume implements ange{  
    public void vol(){System.out.println("volume of cube");}  
    }  
      //print out
    class TestInterfaceStatic{  //class name
    public static void main(String args[]){  
    ange d=new volume();  
    d.vol();  
    System.out.println(ange.cube(3));  
    }}   
    //defoult 27

