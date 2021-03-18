
package Intergers;

public class NumIntergers {
      public void integers(){
        int c;
        for (c=1;c<=5;c++){
            System.out.println(c);
        }
        System.out.println("-------------------------");
    }
    
    public void Reverseorder(){
        int d;
        for (d=5;d>=0;d--){
            System.out.println("Print number in a reverse order:"+d);
        }
    }
    public void Leader(){
        int a;
        System.out.println("Hi, I'm Brenden Aguilar");
          System.out.println("Leader in IPT2");
            System.out.println("This is our simple program");
        
    }
    public void Opay(){
        int b;
        System.out.println("End of our Program! THANKS..");
    }
    public static void main(String[] args) {
        NumIntergers objint = new NumIntergers();
        
        objint.Leader();
        objint.integers();
        objint.Reverseorder();
   
        
        System.out.println("Task i complete!");
        objint.Opay();
    }
    
}
