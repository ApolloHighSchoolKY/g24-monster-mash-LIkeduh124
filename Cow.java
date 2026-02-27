/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{

    private double milkProduced;

    public Cow()
    {
        super("Moo");
        milkProduced = 0;
    }

    public Cow(int age, boolean alive, String sound){
        super(sound);
        
    }

    public String speak(){
        return "The cow says " + super.speak();
    }

    public String toString(){
        if(super.isAlive()){
            return super.toString() + "\nMilk Produced: " + milkProduced;
        }

        return "The cow lived to be " + super.getAge() + " years old. RIP\n Milk produced: " + milkProduced;
    }

    public void eat()
    {
        super.eat();
        milkProduced++;
    }

}