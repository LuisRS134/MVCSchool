package mvcschool.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import mvcschool.EventMessage;
import mvcschool.control.Controller;
import mvcschool.model.Model;

/**
 *
 * @author Luis
 */
public class View implements Observer {

    private Controller control;
    private Model model;
    private Menu menu;
    private boolean exit;

    /**
     * ****CONSTRUCTOR
     *
     * @param control
     * @param model****
     */
    public View(Controller control, Model model) {
        this.control = control;
        this.model = model;
        this.model.addObserver(this);
        this.menu = new Menu();
        doControl();
    }

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

    public void doControl() {
        do {
            menu.show();
            String action = menu.getSelectedOptionActionCommand();
            processAction(action);

        } while (!exit);
    }

    /**
     * we send you the action
     * @param action 
     */
    public void processAction(String action) {
        if (action != null) {
            switch (action) {
                case "exit": // exit.
                    exit = true;
                    break;
                case "list_groups": // list all group.
                    //TODO
                    break;
                case "add_group": // add group.
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
                case "enol_student": // Enrol student in a group.
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

    private void alert(String s) {
        System.out.print(s);
    }

    private void displayList(List lst) {
        for (Object o : lst) {
            System.out.println(o.toString());
        }
    }

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

}
