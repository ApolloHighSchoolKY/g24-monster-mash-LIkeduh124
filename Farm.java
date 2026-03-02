import java.util.ArrayList;

/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */


public class Farm {

    public static void main(String[] args){
        ArrayList<Animal> animalFarm = new ArrayList<Animal>();
        animalFarm.add(new Animal());
        animalFarm.add(new Animal("Caw caw"));
        animalFarm.add(new Cow());

        for (Animal cuz : animalFarm) 
        {
            System.out.println(cuz.speak());
            System.out.println(cuz.eat());

            //More common but more generic
            if(cuz instanceof Cow){
                System.out.println(((Cow)cuz).produceMilk(5));
            }

            //Less common but more specific
            if(cuz.getClass() == Cow.class){
                System.out.println("This is a cow");
            }
        }

        
    }


}