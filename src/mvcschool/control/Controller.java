package mvcschool.control;

import mvcschool.model.Group;
import mvcschool.model.Model;
import mvcschool.model.Student;
import mvcschool.view.View;

/**
 *
 * @author Luis
 */
public class Controller {

    private Model model;
    private View view;

    /**
     * ***CONSTRUCTORS***
     */
    public Controller(Model model) {
        this.model = model;
        this.view = new View(this, model);
    }

    /**
     * We instantiate the model and call the method of listing groups.
     */
    public void listGroup() {
        //TODO
    }

    /**
     * We instantiate the model and call the method of add group.
     */
    public void addGroup(Group group) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of modify group.
     */
    public void modifyGroup(String code) {
        //TODO
    }

    
    public void searchGroupByCode(String code) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of remove group.
     */
    public void removeGroup(String id) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of listing students.
     */
    public void listStudents() {
        //TODO
    }

    /**
     * We instantiate the model and call the method of add student.
     */
    public void addStudents(Student student) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of modify student.
     */
    public void modifyStudents(String id) {
        //TODO
    }

    public void searchStudentByCode(String code) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of remove student.
     */
    public void removeStudnets(String id) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of enrol student.
     */
    public void enrolStudent(String id) {
        //TODO
    }

    /**
     * We instantiate the model and call the method of unenrol student.
     */
    public void unenrolStudent(String id) {
        //TODO
    }
}
