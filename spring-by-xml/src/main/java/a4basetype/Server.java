package a4basetype;

public class Server {
    private Basetype baseType;
    private String name;

    public Server() {
    }

    public Basetype getBaseType() {
        return baseType;
    }

    public void setBaseType(Basetype baseType) {
        this.baseType = baseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        baseType.show();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Server{" +
                "baseType=" + baseType +
                ", name='" + name + '\'' +
                '}';
    }
}
