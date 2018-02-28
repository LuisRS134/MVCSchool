package mvcschool.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumne
 */
public class Student {
    long id;
    String name;
    int age;

    /*****CONSTRUCTOR****/
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /******GETTER AND SETTER******/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Students{ ");
        sb.append("Id: ");
        sb.append(id);
        sb.append("Name: ");
        sb.append(name);
        sb.append("Age: ");
        sb.append(age);
        sb.append(" }");
        return sb.toString();
    }
    
     /**
     * input()code inputs an students from the user
     *
     * @return the article read or null in case of error
     * @throws java.io.IOException
     */
    public static Student input() throws IOException {
        Student student = null;
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Input the id: ");
            long id = Long.parseLong(br.readLine());
            System.out.print("Input the Name: ");
            String name = br.readLine();
            System.out.println("Input the Age: ");
            int age = Integer.parseInt(br.readLine());
            student = new Student(id, name, age);
        } catch (NumberFormatException | IOException nfe) {
            student = null;
        }
        return student;
    }
    
}
