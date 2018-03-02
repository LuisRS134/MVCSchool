package mvcschool.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import mvcschool.EventMessage;

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
        this.observers = new LinkedList<>();
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // methods to implement Observer/Observable pattern.
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void notifyObservers(Object o) {
        for (Observer obs : observers) {
            obs.update(this, o);
        }
    }

    // Methods to manage data.
    public void listGroup() {
        List<Group> groupList = groups;
        EventMessage evm = new EventMessage(
                EventMessage.EventAction.FIND_MULTIPLE,
                EventMessage.EventType.OK,
                EventMessage.EventTarget.GROUP,
                groupList);
        notifyObservers(evm);
    }

    /**
     * receives the new data that the user enters
     *
     * @param group
     */
    public void addGroup(Group group) {
        System.out.println("conectado con model ---> metodo addGroup");
        //TODO
    }

    /**
     * The list of groups is scanned and the code that was asked in the user's
     * view is compared with the codes that have been entered in the group list,
     * if it matches we let you enter the new data
     *
     * @param id
     */
    public void modifyGroup(String id) {
        //TODO
        System.out.println("conectado con model ---> metodo modifyGroup");
    }

    /**
     * The list of groups is scanned and the code that was asked in the user's
     * view is compared with the codes that have been entered in the group list,
     *
     * @param id
     */
    public void searchGroupByCode(String id) {
        System.out.println("conectado con model ---> metodo searchGroupByCode");
        //TODO
    }

    /**
     * The list of groups is scanned and the code that was asked in the user's
     * view is compared with the codes that have been entered in the group list,
     * if it matches that group will be deleted
     *
     * @param id
     */
    public void removeGroup(String id) {
        System.out.println("conectado con model ---> metodo removeGroup");
        //TODO
    }
    
    public void listStudents() {

        
        List<Student> studentList = students
                ;
        EventMessage evm = new EventMessage(
                EventMessage.EventAction.FIND_MULTIPLE,
                EventMessage.EventType.OK,
                EventMessage.EventTarget.GROUP,
                studentList);
        notifyObservers(evm);
    }

    /**
     * receives the new data that the user enters
     *
     * @param student
     */
    public void addStudents(Student student) {
        System.out.println("conectado con model ---> metodo addStudents");
        //TODO
    }

    /**
     * The list of students is scanned and the id that was asked in the user's
     * view is compared with the id that have been entered in the students list,
     * if it matches we let you enter the new data
     *
     * @param id
     */
    public void modifyStudents(String id) {
        System.out.println("conectado con model ---> metodo modifyStudents");
        //TODO
    }

    /**
     * The list of students is scanned and the code that was asked in the user's
     * view is compared with the codes that have been entered in the students
     * list,
     *
     * @param id
     */
    public void searchStudentByCode(String id) {
        System.out.println("conectado con model ---> metodo searchStudentByCode");
        //TODO
    }

    /**
     * The list of students is scanned and the id that was asked in the user's
     * view is compared with the id that have been entered in the student list,
     * if it matches that student will be deleted
     *
     * @param id
     */
    public void removeStudents(String id) {
        System.out.println("conectado con model ---> metodo removeStudents");
        //TODO  
    }

    /**
     * A student is still admitted to a group
     *
     * @param id
     */
    public void enrolStudent(String id) {
        System.out.println("conectado con model ---> metodo enrolStudent");
        //TODO
    }

    /**
     * A student is removed from a group
     *
     * @param id
     */
    public void unenrolStudent(String id) {
        System.out.println("conectado con model ---> metodo unenrolStudent");
        //TODO
    }
    
}
