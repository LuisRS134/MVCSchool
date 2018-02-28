package mvcschool.view;

/**
 *
 * @author luis
 */
public class MenuSchool extends Menu{
    
    public MenuSchool() {
        
        super("Menu");//Title
        //menu list with your actions
        addOption(new Option("Exit","exit"));
        addOption(new Option("List group","list_groups"));
        addOption(new Option("Add group","add_group"));
        addOption(new Option("Modify group","modify_group"));
        addOption(new Option("Delete group","delete_group"));
        addOption(new Option("List all students","list_students"));
        addOption(new Option("Add student","add_student"));
        addOption(new Option("Modify student","modify_student"));
        addOption(new Option("Delete student","delete_student"));
        addOption(new Option("Enrol student in a group","enrol_student"));
        addOption(new Option("Unenrol student from group","unenrol_student"));
    }
    
}
