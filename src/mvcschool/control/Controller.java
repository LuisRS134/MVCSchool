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
    
    public Controller(Model model) {
        this.model = model;
        this.view = new View(this, model);
    }
    
    public void listGroup(){
        //TODO
    }
    
    public void addGroup(Group group){
        //TODO
    }
    
    public void modifyGroup(String id){
        //TODO
    }
    
    public void removeGroup(String id){
        //TODO
    }
    
    public void listStudents(){
        //TODO
    }
    
    public void addStudents(Student student){
        //TODO
    }
    
    public void modifyStudents(String id){
        //TODO
    }
    
    public void removeStudnets(String id){
        //TODO
    }
    
    public void enrolStudent(){
        //TODO
    }
    
    public void unenrolStudent(){
        //TODO
    }
}
