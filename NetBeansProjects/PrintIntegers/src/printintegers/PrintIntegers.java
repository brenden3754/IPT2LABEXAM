
package printintegers;


public class PrintIntegers {
        public void integers(){
        int c;
        for (c=1;c<=10;c++){
            System.out.println(c);
        }
        System.out.println("-------------------------");
    }
    
    public void Reverseorder(){
        int d;
        for (d=10;d>=0;d--){
            System.out.println("Print number in a reverse order:"+d);
        }
    }
  
    public static void main(String[] args) {
        PrintIntegers objint = new PrintIntegers();
        
        objint.integers();
        objint.Reverseorder();
        
        System.out.println("Task i complete!");
    }
    
}
