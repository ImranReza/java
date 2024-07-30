class MethodOverridingMain {
    public void display(){
        System.out.println("This is Parrent class");
    }

    public void display(int a){
        System.out.println("The value of a: " + a);
    }
}



public class MethodOverriding extends MethodOverridingMain{

    public void display(){
        System.out.println("This is Child class");
    }

    public void display(int a){
        System.out.println("The Value of a " + a);
    }


    public static void main(String[] args) {
        MethodOverridingMain m1 = new MethodOverridingMain();

        //it print the parrent class value
        m1.display();
        m1.display(11);


        //it print the child class value
        MethodOverriding r1 = new MethodOverriding();
        r1.display();
        r1.display(24);

    }
}



