package org.example;

public class Water extends Component {
    public Water(String name, int power, String weight) {
        super(name, power, weight);
    }

    public Water(String weight) {

        this("Вода", 5, weight);
    }
}