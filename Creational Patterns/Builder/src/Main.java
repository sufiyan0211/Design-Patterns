/**
 * @author sofiyan
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Sofiyan", 24, 85, "Male", "Asian");

        // Below line will give an error
//        Human human1 = new Human("Umair", 21, 78);

        // Below I have used Builder Design Pattern to convert
        // complex (i.e. Human) object into simple object by creating builder class (i.e. HumanBuilder)
        Human human1 = new HumanBuilder()
                .setName("Umair")
                .setAge(21)
                .setWeight(78)
                .build();


        Human human2 = new HumanBuilder()
                .setName("Karthick")
                .setAge(22)
                .setWeight(79)
                .setRace("Asian")
                .build();

        Human human3 = new EmployeeBuilder()
                .setName("Arjun")
                .setGender("Male")
                .build();
    }
}