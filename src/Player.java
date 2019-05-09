import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int health;
    private double force;
    private int level;

    public Player(String name, int health, double force, int level) {
        this.name = name;
        this.health = health;
        this.force = force;
        this.level = level;

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", level=" + level +
                '}';
    }

    @Override
    public ArrayList<String> save() {
        ArrayList<String> data = new ArrayList<String>();
        data.add(this.name);
        data.add(Integer.toString(this.health));
        data.add(Double.toString(this.force));
        data.add(Integer.toString(this.level));

        return data;

    }

    @Override
    public void load(ArrayList<String> data) {
        this.name = data.get(0);
        this.health = Integer.parseInt(data.get(1));
        this.force = Double.parseDouble(data.get(2));
        this.level = Integer.parseInt((data.get(3)));

    }
}
