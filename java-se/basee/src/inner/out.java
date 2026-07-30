package inner;

public class out {
    public String name =  "小明";
    public class buxue{
        //可覆盖
//        public static String name =  "xiaoxaiao";
        public String name =  "xiaoxaiao";
        public void print1() {
            String  name = "七十二变";
            System.out.println("不学，不学");
            System.out.println(name);//七十二变
            System.out.println(this.name);//xiaoxaiao
            System.out.println(out.this.name);//小明
        }
    }

}
