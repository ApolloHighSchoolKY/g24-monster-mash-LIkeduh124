public class Jormungandr extends Monster {

    private int fangCount;

    public Jormungandr(String name){
        super(name);
        fangCount = 0;
    }

    public void setFang(int count){
        fangCount = count;
    }

    public String getFang(){
        return getName() + " has " + fangCount + " fangs.";
    }

    public String kill(){
        return getName() + " devoured the earth. The end has come";
    }

    public String venom(){
        return getName() + " dripped more venom into Loki's eyes";
    }
}
