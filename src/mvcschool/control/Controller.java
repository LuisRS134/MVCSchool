package mvcschool.control;

import java.io.IOException;
import mvcschool.model.Group;
import mvcschool.model.Model;
import mvcschool.model.Student;
import mvcschool.view.View;

/**
 *
 * @author Luis
 */
public class Controller {

    private final Model model;
    private final View view;

    /**
     * ***CONSTRUCTORS***
     */
    public Controller(Model model) throws IOException {
        this.model = model;
        this.view = new View(this, model);
        view.doControl();
    }

    /**
     * We instantiate the model and call the method of listing groups.
     * uses {@link mvcschool.model.Model#listGroup() }
     */
    public void listGroup() {
        //TODO
        System.out.println("conectado con controller-->metodo listGroup");
        model.listGroup();
    }

    /**
     * We instantiate the model and call the method of add group.
     * uses {@link mvcschool.model.Model#addGroup(mvcschool.model.Group)  }
     */
    public void addGroup(Group group) {
        System.out.println("conectado con controller-->metodo addGroup");
        model.addGroup(group);
        //TODO
    }

    /**
     * We instantiate the model and call the method of modify group.
     */
    public void modifyGroup(String code) {
        System.out.println("conectado con controller-->metodo modifyGroup");
        model.modifyGroup(code);
        //TODO
    }

    /**
     * We instantiate the model and call the method of search group.
     * uses {@link mvcschool.model.Model#searchGroupByCode(java.lang.String) }
     * @param code 
     */
    public void searchGroupByCode(String code) {
        //TODO
        System.out.println("conectado con controller-->metodo searchGroupByCode");
        model.searchGroupByCode(code);
    }

    /**
     * We instantiate the model and call the method of remove group.
     * uses {@link mvcschool.model.Model#removeGroup(java.lang.String) ) }
     */
    public void removeGroup(String id) {
        System.out.println("conectado con controller-->metodo removeGroup");
        model.removeGroup(id);
        //TODO
    }

    /**
     * We instantiate the model and call the method of listing students.
     * uses {@link mvcschool.model.Model#listStudents() ) }
     */
    public void listStudents() {
        System.out.println("conectado con controller-->metodo listStudent");
        model.listStudents();
        //TODO
    }

    /**
     * We instantiate the model and call the method of add student.
     * uses {@link mvcschool.model.Model#addStudents(mvcschool.model.Student) ) }
     */
    public void addStudents(Student student) {
        System.out.println("conectado con controller-->metodo addStudent");
        model.addStudents(student);
        //TODO
    }

    /**
     * We instantiate the model and call the method of modify student.
     * uses {@link mvcschool.model.Model#modifyStudents(java.lang.String) }
     */
    public void modifyStudents(String id) {
        System.out.println("conectado con controller-->metodo modifyStudnets");
        model.modifyStudents(id);
        //TODO
    }

    /**
     * We instantiate the model and call the method of search student.
     * uses {@link mvcschool.model.Model#searchStudentByCode(java.lang.String) }
     * @param code 
     */
    public void searchStudentByCode(String code) {
        System.out.println("conectado con controller-->metodo searchStudentByCode");
        model.searchStudentByCode(code);
        //TODO
    }

    /**
     * We instantiate the model and call the method of remove student.
     * uses {@link mvcschool.model.Model#removeStudents(java.lang.String) }
     */
    public void removeStudents(String id) {
        System.out.println("conectado con controller-->metodo removeStudents");
        model.removeStudents(id);
        //TODO
    }

    /**
     * We instantiate the model and call the method of enrol student.
     * uses {@link mvcschool.model.Model#enrolStudent(java.lang.String)} 
     */
    public void enrolStudent(String id) {
        System.out.println("conectado con controller-->metodo enrolStudnet");
        model.enrolStudent(id);
        //TODO
    }

    /**
     * We instantiate the model and call the method of unenrol student.
     * uses {@link mvcschool.model.Model#unenrolStudent(java.lang.String)}
     */
    public void unenrolStudent(String id) {
        System.out.println("conectado con controller-->metodo unenrolStuendent");
        model.unenrolStudent(id);
        //TODO
    }
}
