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
        ArrayList<Animal> barn = new ArrayList<Animal>();

        for (Animal cuz : barn) 
        {
            System.out.println(cuz.speak());

            if(cuz.getAge()>10)
            {
                cuz.kill();
            }
        }
    }


}