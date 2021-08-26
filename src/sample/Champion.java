package sample;

public class Champion {
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    String name;
    String type;

    public Champion(String name, String type) {
        this.name = name;
        this.type = type;
    }

}
