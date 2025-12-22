// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student{
    String name;
    int age;
    
    void getName(){
        System.out.println(name);
    }
        void getAge(){
        System.out.println(age);
    }
}
class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        //UDT
        // int a =4;
        Student a= new Student();
        a.name="ashley";
        a.age=18;
        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
        a.getAge();
    }
}
