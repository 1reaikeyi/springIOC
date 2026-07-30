package comparable;

public class Student implements Comparable<Student>{
    private String name;
    private int id;
    private  double length;

    public Student(String name, int id, double length) {
        this.name = name;
        this.id = id;
        this.length = length;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", length=" + length +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return o.getId() - this.getId();
    }
}
