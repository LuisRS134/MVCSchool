package mvcschool;

import mvcschool.control.Controller;
import mvcschool.model.Model;

/**
 *
 * @author Luis
 */
public class MVCSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        Controller control = new Controller(model);
    }

}
