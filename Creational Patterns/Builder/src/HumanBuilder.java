/**
 * @author sofiyan
 */
public class HumanBuilder implements Builder {
    public String name;
    public int age;
    public int weight;
    public String gender;
    public String race;

    public HumanBuilder() {
    }

    @Override
    public HumanBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HumanBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public HumanBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public HumanBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public HumanBuilder setRace(String race) {
        this.race = race;
        return this;
    }

    @Override
    public Human build() {
        return new Human(name, age, weight, gender, race);
    }
}
