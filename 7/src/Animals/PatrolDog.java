package Animals;

/**
 * Created by Eterno on 05.06.2016.
 */
public class PatrolDog extends Pet {

    public void voice() {
        System.out.println("Ррррр");
    }

    public PatrolDog(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }
}
