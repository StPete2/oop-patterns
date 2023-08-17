package Event.publisher.impl;

import Event.listener.Listener;
import Event.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Publisher {
    private List<String> vacancies;
    private List<Listener> listeners;

    public HeadHunter() {
        this.vacancies = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    @Override
    public void add(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void remove(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notify(List<Listener> listeners) {
        for (Listener listener: listeners){
            listener.handleEvent(vacancies);
        }
    }
    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        notify(listeners);
    }

    public void removeVacancy(String vacancy){
        vacancies.remove(vacancy);
        notify(listeners);
    }
}
