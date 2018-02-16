package mvcschool.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Luis
 */
public class Model extends Observable {

    // Observers list to implement Observer/Observable pattern.
    private List<Observer> observers;
    // Data.
    private List<Student> students;
    private List<Group> groups;

    /**
     * ***CONSTRUCTORS***
     */
    public Model() {
        this.observers = new LinkedList<Observer>();
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // methods to implement Observer/Observable pattern.
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(Object o) {
        for (Observer obs : observers) {
            obs.update(this, o);
        }
    }

    // Methods to manage data.
    public void listGroup() {
        //TODO
    }

    public void addGroup(Group group) {
        //TODO
    }

    public void modifyGroup(String code) {
        //TODO
    }
    
    public void searchGroupByCode(String code){
        //TODO
    }

    public void removeGroup(String id) {
        //TODO
    }

    public void listStudents() {
        //TODO
    }

    public void addStudents(Student student) {
        //TODO
    }

    public void modifyStudents(String id) {
        //TODO
    }

    public void searchStudentByCode(String code){
        //TODO
    }

    public void removeStudnets(String id) {
        //TODO
    }

    public void enrolStudent(String id) {
        //TODO
    }

    public void unenrolStudent(String id) {
        //TODO
    }

}
