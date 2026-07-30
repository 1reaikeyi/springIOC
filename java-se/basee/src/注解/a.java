package 注解;
@Tar(name = "孙子兵法")
public class a {
    public static void main(String[] args) {
        Class<?> clazz = a.class;
        if (clazz.isAnnotationPresent(Tar.class)) {
            Tar annotation = clazz.getAnnotation(Tar.class);
            System.out.println(annotation.name());
        }else {
            System.out.println("没有注解");
        }

    }

}
