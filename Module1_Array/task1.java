// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] n= {2,3,4,5,6,7}; // D & I (static)
        // index
        System.out.println(n[1]);
        System.out.println(n[2]);
        
        //
        System.out.println(n.length);
        
        //
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
        }
        
        int[] n1= new int[] {20,30,40,50,60,70};
        for(int i=0; i<n1.length; i++){
            System.out.println(n1[i]);
        }
        
        // 3
        int[] n3= new int[10];
        
        n3[0]=100;
        n3[1]=200;
        for(int i=0; i<n3.length; i++){
            System.out.println(n3[i]);
        }
        
        
        
    }
}
