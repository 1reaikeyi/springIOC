package 异常;

public class Exceptiontest {
//    public static void main(String[] args) {
//        saveid(12);
//        saveid(1);
//    }
//    public static void saveid(int a){
//        if(a <= 10 && a > 0){
//            System.out.println("id:"+a);
//        }else{
//            throw new RuntimeExceptionn("运行错误");
//        }
//    }
//    Exception in thread "main" 异常.RuntimeExceptionn: 运行错误

    public static void main(String[] args) {
        try {
            saveid(12);
            saveid(1);
        } catch (Exceptionn e) {
            throw new RuntimeException(e);
        }

    }
    public static void saveid(int a) throws Exceptionn {
        if(a <= 10 && a > 0){
            System.out.println("id:"+a);

        }else{
            throw new Exceptionn("编译错误");
        }
    }
//    Exception in thread "main" java.lang.RuntimeException: 异常.Exceptionn: 编译错误
//    Caused by: 异常.Exceptionn: 编译错误
}
