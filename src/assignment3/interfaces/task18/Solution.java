package assignment3.interfaces.task18;

import java.util.ArrayList;
import java.util.List;

public class Solution {
        public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Repka", "Repku"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Babka", "Babku"));
        plot.add(new Person("Granddaughter", "Granddaughter"));

        RepkaStory.tell(plot);
    }
}
