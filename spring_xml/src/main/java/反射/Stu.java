package 反射;

public class Stu {
    private String name;
    private int id;

    public Stu() {
    }
    private Stu(String name) {
        this.name = name;
    }
    public Stu(String name, int id) {
        this.name = name;
        this.id = id;
    }
    private Stu(int id){
        this.id = id;
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
    public void add(){
        System.out.println("public void add");
    }



}
