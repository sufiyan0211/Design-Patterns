public class EmployeeBuilder implements Builder{
    public String name;
    public int age;
    public int weight;
    public String gender;
    public String race;

    public EmployeeBuilder() {
    }

    @Override
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public EmployeeBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeBuilder setRace(String race) {
        this.race = race;
        return this;
    }

    @Override
    public Human build() {
        return new Human(name, age, weight, gender, race);
    }
}
