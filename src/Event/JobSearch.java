package Event;

import Event.listener.impl.Subscriber;
import Event.publisher.impl.HeadHunter;

public class JobSearch {
    public static void main(String[] args) {
        HeadHunter hh = new HeadHunter();
        hh.addVacancy("Middle Developer");
        hh.addVacancy("Senior Developer");

        hh.add(new Subscriber("Oleg"));
        hh.add(new Subscriber("Alex"));
//        hh.add(new Subscriber("Tanya"));

        hh.addVacancy("Junior Developer");

        hh.removeVacancy("Junior Developer");
    }
}
