/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08_Polymorphism;

/**
 *
 * @author TouhidulIslam
 */
public class MainMetod {
    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        Animals myPig = new Pig();
        Dog myDog = new Dog();
      
         
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.dogSound();
        //myDog.dogSound();
    }
}
