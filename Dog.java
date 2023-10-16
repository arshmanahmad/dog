import java.util.Scanner;
class Dog{
    String name;
    String breed;
    
    Dog(){
        this.name = name;
        this.breed = breed;
    }
    Dog(String name, String breed){
        name = "Jackie";
        breed = "German Shepherd";
    }
    void setter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the dog:");
        name = input.nextLine();
        System.out.println("Enter breed of the dog:");
        breed = input.nextLine();
        System.out.println("The name of the dog is:"+ name);
        System.out.println("The breed of the dog is: "+ breed);
    }

}
class Demo1{
    public static void main(String []args){
        Dog d1 = new Dog();
        d1.setter();
    }
}