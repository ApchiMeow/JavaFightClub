package Game;

public abstract class Character {

    private String name;
    private double hp;

    public Character(String name, double hp){
        setName(name);
        setHp(hp);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(double hp) {
        if(hp > 0) {
            this.hp = hp;
        } else {
            System.out.println("HP должно быть больше нуля");
        }
    }

    public double getHp() {
        return hp;
    }
    @Override
    public String toString(){
        return String.format("%s(%.0f)", getName(), getHp());
    }
}