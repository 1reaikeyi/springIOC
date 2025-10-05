package a4basetype;

public class Basetype {
    private int id;
    private String name;
    private String type;

    public Basetype() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void add(){
        System.out.println("这里是Basetype类的方法");
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Basetype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    //判断是否是简单类型
//    public static boolean isSimpleValueType(Class<?> type) {
//        return Void.class != type && Void.TYPE != type &&
//        (ClassUtils.isPrimitiveOrWrapper(type) ||
//        Enum.class.isAssignableFrom(type) ||
//        CharSequence.class.isAssignableFrom(type) ||
//        Number.class.isAssignableFrom(type) ||
//        Date.class.isAssignableFrom(type) ||
//        Temporal.class.isAssignableFrom(type) ||
//        URI.class == type || URL.class == type ||
//        Locale.class == type ||
//        Class.class == type);}
    // 1.基本类型和包装类型
//        ClassUtils.isPrimitiveOrWrapper(type) &&
    // 2.枚举类型
//        Enum.class.isAssignableFrom(type) &&
    // 3.字符序列类型
//        CharSequence.class.isAssignableFrom(type) &&
    // 4.数字类型
//        Number.class.isAssignableFrom(type) &&
    // 5.日期类型,实际一般使用ref,----------java.util.Date
//        Date.class.isAssignableFrom(type) &&
    // 6.时间类型
//        Temporal.class.isAssignableFrom(type) &&
    // 7.URI类型
//        URI.class == type &&
    // URL类型
//        URL.class == type &&
    // 区域类型
//        Locale.class == type &&
    // 类类型
//        Class.class == type);
}
