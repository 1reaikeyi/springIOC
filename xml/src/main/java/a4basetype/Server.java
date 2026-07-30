package a4basetype;

public class Server {
    private Basetype baseType;
    private String className;

    public Server() {
    }

    public void setBaseType(Basetype baseType) {
        this.baseType = baseType;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void add() {
        baseType.add();
        System.out.println("这里是Server类的方法");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Server{" +
                "baseType=" + baseType +
                ", className='" + className + '\'' +
                '}';
    }
}
