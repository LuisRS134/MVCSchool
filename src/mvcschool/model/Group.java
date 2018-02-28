package mvcschool.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumne
 */
public class Group {

    long id;
    String code;
    String grade;
    int level;

    /**
     * ***CONSTRUCTORS****
     */
    public Group(long id, String code, String grade, int level) {
        this.id = id;
        this.code = code;
        this.grade = grade;
        this.level = level;
    }

    /**
     * ****GETTER AND SETTER*****
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Group other = (Group) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group { ");
        sb.append("Id: ");
        sb.append(id);
        sb.append("Code: ");
        sb.append(code);
        sb.append("Grade: ");
        sb.append(grade);
        sb.append("Level: ");
        sb.append(level);
        sb.append(" } ");
        return sb.toString();
    }

    /**
     * input()code inputs an Group from the user
     *
     * @return the article read or null in case of error
     * @throws java.io.IOException
     */
    public static Group input() throws IOException {
        Group group = null;
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Input the id: ");
            long id = Long.parseLong(br.readLine());
            System.out.print("Input the Code: ");
            String code = br.readLine();
            System.out.print("Input the Grade: ");
            String grade = br.readLine();
            System.out.println("Input the Level: ");
            int level = Integer.parseInt(br.readLine());
            group = new Group(id, code, grade, level);
        } catch (NumberFormatException | IOException nfe) {
            group = null;
        }
        return group;
    }

}
