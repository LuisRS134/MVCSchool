package mvcschool.model;

/**
 *
 * @author alumne
 */
public class Student {
    long id;
    String name;
    int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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
    
}
