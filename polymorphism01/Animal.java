package polymorphism.polymorphism01;

import java.util.Objects;

public class Animal {
    String animalName;
    public Animal(String animalName){
        this.animalName = animalName;
    }
    public void animalSound(){
        System.out.println("Roarr!");
        //this.animalName = "Tiger";
    }
    public void animalSound(String intensity){
        if(Objects.equals(intensity, "High")){
            //this.animalName = "Lion";
            System.out.println("Roarrrrrrrr!");
        }else if(Objects.equals(intensity, "Low")){
            //this.animalName = "Cat";
            System.out.println("Roar");
        }else{
            System.out.println("Cannot reproduce it properly");
        }
    }





}

/*define a class Animal that has:
        an instance variable animalName
        a constructor that instantiate animalName
        a method animalSound()
        achieve polymorphism by using method overloading on animalSound()
        if there are no parameters, animalSound() will be Roarr!
        if there is just 1 string param called intensity, animalSound() will be:
        Roarrrrrrrr! if intensity is high
        Roar if intensity is low
        Cannot reproduce it properly in other cases
        define a tester class where you create an Animal object and call the 2 versions of the method*/
