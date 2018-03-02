package mvcschool.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import mvcschool.EventMessage;
import mvcschool.control.Controller;
import mvcschool.model.Group;
import mvcschool.model.Model;
import mvcschool.model.Student;

/**
 *
 * @author Luis
 */
public class View implements Observer {

    private Controller control;
    private Model model;
    private MenuSchool menu;
    private boolean exit;
    String id;

    /**
     * CONSTRUCTOR
     *
     * @param control
     * @param model
     */
    public View(Controller control, Model model) {
        this.control = control;
        this.model = model;
        this.model.addObserver(this);
        this.menu = new MenuSchool();     
    }

    /**
     * You are informed if the action was carried out or not
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof EventMessage) {
            EventMessage evm = (EventMessage) arg;
            switch (evm.getAction()) {
                case INSERT_GROUP:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull insertion of group:" + evm.getData().toString() + "\n");
                    } else {
                        alert("Error in insertion of group:" + evm.getData().toString() + "\n");
                    }
                    break;
                case FIND_MULTIPLE:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        displayList((List) evm.getData());
                    } else {
                        alert("Error searching group with " + evm.getData().toString() + "\n");
                    }
                    break;

                case REMOVE_GROUP:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull delete of group:" + evm.getData().toString() + "\n");
                    }
                    break;

                case INSERT_STUDENTS:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull insertion of student:" + evm.getData().toString() + "\n");
                    } else {
                        alert("Error in insertion of student:" + evm.getData().toString() + "\n");
                    }
                    break;
                case FIND_MULTIPLE_STUDENT:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        displayList((List) evm.getData());
                    } else {
                        alert("Error searching students with " + evm.getData().toString() + "\n");
                    }
                    break;

                case REMOVE_STUDENTS:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull delete of student:" + evm.getData().toString() + "\n");
                    }
                    break;
                default:
                    alert("Unknown error\n");
                    break;
            }
        }
    }

    /**
     * The menu is displayed and you are asked which option you want to make
     * from the menu to send it to the processAction
     */
    public void doControl() throws IOException {
        do {
            menu.show();
            String action = menu.getSelectedOptionActionCommand();
            processAction(action);
        } while (!exit);
    }

    /**
     * Receives the action of the doControl method
     *
     * @param action
     */
    public void processAction(String action) throws IOException {
        if (action != null) {
            switch (action) {
                case "exit": // exit.
                    exit = true;
                    break;
                case "list_groups": // list all group.
                    control.listGroup();
                    break;
                case "add_group": // add group.
                   // Group group=Group.input();
                   // control.addGroup(group);
                    //TODO
                    break;
                case "modify_group": // modify group.
                    //TODO
                    break;
                case "delete_group": // remove group.
                    //TODO
                    break;
                case "list_students": //list all students.
                    //TODO
                    break;
                case "add_student": // add students.
                    //TODO
                    break;
                case "modify_student": // modify students.
                    //TODO
                    break;
                case "delete_modify": // remove students.
                    //TODO
                    break;
                case "enrol_student": // Enrol student in a group.
                    //TODO
                    break;
                case "unenrol_student": // Unenrol student from group
                    //TODO
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }
    }

    /**
     * We send a message to the user
     * @param s 
     */
    private void alert(String s) {
        System.out.print(s);
    }

    /**
     * With this method we will ask the user.
     *
     * @param msg
     * @return
     */
    private String inputString(String msg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        alert(msg);
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
    
    /**
    * 
    * @param lst 
    */
    private void displayList(List lst) {
        for (Object o : lst) {
            System.out.println(o.toString());
        }
    }

    /**
     * we show the group information
     * @param group 
     */
    public void displayGroup(Group group) {

    }

    /**
     * we show the student information
     * @param student 
     */
    public void displayStudent(Student student) {

    }

    /**
     * we show the list of groups
     * @param groupList 
     */
    public void displayGroupList(List<Group> groupList) {
        for (Object o : groupList) {
            System.out.println(o.toString());
        }
    }

    /**
     * we show the list of student
     * @param studentList 
     */
    public void displayStudentList(List<Student> studentList) {
        for (Object o : studentList) {
            System.out.println(o.toString());
        }
    }
    
    /**
     * 
     * @return 
     */
    public Student inputStudent() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public Group inputGroup() {
        return null;
    }
}

/**
 * The controller is instantiated and the add method is called. uses
 * {@link mvcschool.control.Controller#addGroup(mvcschool.model.Group)}
 */
//public void addGroup() {
//TODO
//    }
/**
 * You will be asked the group id to modify. With the search method we confirm
 * if the group id exists, therefore with a message we will tell you if it
 * exists or not. The controller is instantiated and the modify method is
 * called. uses {@link mvcschool.control.Controller#modifyGroup(java.lang.String)
 * }
 */
//  public void modifyGroup() {
//TODO
//}
/**
 * You will be asked the group id to delete. With the search method we confirm
 * if the group id exists, therefore with a message we will tell you if it
 * exists or not. The controller is instantiated and the delete method is
 * called. uses {@link mvcschool.control.Controller#removeGroup(java.lang.String)
 * }
 */
//public void deleteGroup() {
//TODO
//}
/**
 * The controller is instantiated and the students list method is called. uses
 * {@link mvcschool.control.Controller#listStudents()}
 */
// public void listStudents() {
//TODO
//}
/**
 * The controller is instantiated and the add method is called. uses {@link mvcschool.control.Controller#addStudents(mvcschool.model.Student)
 * }
 */
///public void addStudents() {
//TODO
//}
/**
 * You will be asked the student id to modify. With the search method we confirm
 * if the student id exists, therefore with a message we will tell you if it
 * exists or not. The controller is instantiated and the modify method is
 * called. uses {@link mvcschool.control.Controller#modifyStudents(java.lang.String)
 * }
 */
//public void modifyStudents() {
//TODO
//}
/**
 * You will be asked the student id to delete. With the search method we confirm
 * if the student id exists, therefore with a message we will tell you if it
 * exists or not. The controller is instantiated and the delete method is
 * called. uses {@link mvcschool.control.Controller#removeStudents(java.lang.String)
 * }
 */
//public void deleteStudents() {
//TODO
//}
/**
 * the user is asked for the student's id. Instance the controller and with the
 * search method we check if the student really exists, therefore with a message
 * we confirm if it exists or does not exist. Then we ask for the id of the
 * group. The group search method is called to confirm that this group exists
 * and with a message we indicate that the group exists or not. then we will
 * register the student to the indicated group uses {@link mvcschool.control.Controller#enrolStudent(java.lang.String)
 * }
 */
//public void enrolStudents() {
//TODO
//}
/**
 * the user is asked for the student's id. Instance the controller and with the
 * search method we check if the student really exists, therefore with a message
 * we confirm if it exists or does not exist. Then we ask for the id of the
 * group. The group search method is called to confirm that this group exists
 * and with a message we indicate that the group exists or not. then we remove
 * the student from the indicated group uses {@link mvcschool.control.Controller#unenrolStudent(java.lang.String)
 * }
 */
//public void unenrolStudents() {
//TODO
//}

