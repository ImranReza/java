public class MethodOverloading {
    //MethodOverloading show the same name method in different forms within a same class.
    public void display(){
        System.out.println("This is no parameter method");
    }

    public void display(int a){
        System.out.println("The value of a : " + a);
    }

    public void display(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.display();
        m.display(10);
        m.display("Imran",24);
    }
    
}
