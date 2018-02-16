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

    private List<Student> students;
    private List<Group> groups;
    private List<Observer> observers;

    public Model() {
        this.observers = new LinkedList<Observer>();
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
        //initData();
    }
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void notifyObservers(Object o){
        for(Observer obs: observers){
            obs.update(this,o);
        }
    }
    
    public void listGroup(){
        //TODO
    } 
    
    public void addGroup(){
        //TODO
    }
    
    public void modifyGroup(){
        //TODO
    }
     public void removeGroup(){
        //TODO
    }
    
    public void listStudents(){
        //TODO
    }
    
    public void addStudents(){
        //TODO
    }
    
    public void modifyStudents(){
        //TODO
    }
    
    public void removeStudnets(){
        //TODO
    }
    
    public void enrolStudent(){
        //TODO
    }
    
    public void unenrolStudent(){
        //TODO
    }

    private void initData() {
        
    }
}
