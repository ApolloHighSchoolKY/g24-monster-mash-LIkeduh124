public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); //NOT ALLOWED
    //Because Monster has a modified construction but not
    //a default constructor, Monster does not INHERIT a
    //defaul constructor

    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.print(sally);

    System.out.print(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a Monster of our new Type
    //Declare your new Type of Monster
    //Bonus challenge: Add an instance field
  }
}
