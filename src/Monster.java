import java.util.ArrayList;

public class Monster implements ISaveable {
    private String type;
    private int health;
    private double force;

    public Monster(String type, int health, double force) {
        this.type = type;
        this.health = health;
        this.force = force;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", health=" + health +
                ", force=" + force +
                '}';


    }


    @Override
    public ArrayList<String> save() {
        ArrayList<String> data = new ArrayList<String>();
        data.add(this.type);
        data.add(Integer.toString(this.health));
        data.add(Double.toString(this.force));

        return data;

    }

    @Override
    public void load(ArrayList<String> data) {
        this.type = data.get(0);
        this.health = Integer.parseInt(data.get(1));
        this.force = Double.parseDouble(data.get(2));

    }
}
