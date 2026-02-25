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
    Monster jojo = new Jormungandr("jojo");

    System.out.println(jojo.kill());
    //Declare your new Type of Monster
    Jormungandr jaja = new Jormungandr("jaja");
    
    System.out.println(jaja.venom());

    //Bonus challenge: Add an instance field
    jaja.setFang(200);
    System.out.println(jaja.getFang());


    //In class stuff

    Skeleton johnny = new Skeleton();

    System.out.println(johnny);

    johnny = new Skeleton("Giant Johnny");

    System.out.println(johnny);
  }
}
