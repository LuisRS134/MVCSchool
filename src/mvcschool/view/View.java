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

    public View(Controller control, Model model) {
        this.control = control;
        this.model = model;
        this.model.addObserver(this);
        menu = builMenu();
        doControl();
    }

    private Menu builMenu() {
        Menu mnu = new Menu("Menu");
        mnu.add(new Option("Exit"));
        mnu.add(new Option("List group"));
        mnu.add(new Option("Add group"));
        mnu.add(new Option("Modify group"));
        mnu.add(new Option("Delete group"));
        mnu.add(new Option("List all students"));
        mnu.add(new Option("Add student"));
        mnu.add(new Option("Modify student"));
        mnu.add(new Option("Delete student"));
        mnu.add(new Option("Enrol student in a group"));
        mnu.add(new Option("Unenrol student from group"));
        return mnu;
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
    private void doControl() {
        exit = false;
        do {
            menu.show();
            int optNumber = menu.choose();
            switch (optNumber) {
                case 0: // exit.
                    exit = true;
                    break;
                case 1: // list all group.
                    //TODO
                    break;
                case 2: // add group.
                    //TODO                    
                    break;
                case 3: // modify group.
                    //TODO
                    break;
                case 4: // remove group.
                    //TODO
                    break;
                case 5: //list all students.
                    //TODO
                    break;
                case 6: // add students.
                    //TODO
                    break;
                case 7: // modify students.
                    //TODO
                    break;
                case 8: // remove students.
                    //TODO
                    break;
                case 9: // Enrol student in a group.
                    //TODO
                    break;
                case 10: // Unenrol student from group
                    //TODO
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        } while (!exit);
        System.exit(0);
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
