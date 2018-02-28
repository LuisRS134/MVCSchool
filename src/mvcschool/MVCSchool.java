package mvcschool;

import java.io.IOException;
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
    public static void main(String[] args) throws IOException {
        Model model = new Model();
        Controller control = new Controller(model);
    }

}
