import java.util.ArrayList;

public class HumanListBuilder {
    public ArrayList listOfHumans;

    public HumanListBuilder createList() {
        this.listOfHumans = new ArrayList();
        return this;
    }

    public HumanListBuilder addHuman(Human human) {
        this.addHuman(human);
        return this;
    }

    public HumanBuilder addHuman() {
        return new HumanBuilder(this);
    }

    public ArrayList getListOfHumans() {
        return listOfHumans;
    }


}
