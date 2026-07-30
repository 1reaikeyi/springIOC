package Object;

import java.util.Arrays;
import java.util.Objects;

public class list implements Cloneable{
    private  String name;
    private int id;
    private double[] score;
    public  list(){

    }



    public list(String name, int id,double[] score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setAge(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

//    @Override
//    //比较者是this，（里面是O）
//    public boolean equals(Object o) {
//        //判断地址
//        if (this == null) {
//            return  true;
//        }//比较类型
//        if (o == null || this.getClass() != o.getClass()) return false;
//        list list = (list) o;
//        //比较内容
//        return this.id == list.id && Objects.equals(this.getName(), list.getName());
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        list list = (list) o;
        return id == list.id && Objects.equals(name, list.name) && Objects.deepEquals(score, list.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, Arrays.hashCode(score));
    }
            //基本数据
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //数组（一）
//        @Override
//        protected Object clone() throws CloneNotSupportedException {
//        list l22 = (list) super.clone();
//        l22.score = l22.score.clone();
//            return l22;
//        }
    //数组（二）
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        // 调用父类的 clone 方法进行浅拷贝
//        list cloned = (list) super.clone();
//
//        // 处理数组类型的属性，进行深拷贝
//        if (this.score != null) {
//            cloned.score = this.score.clone();
//        }
//
//        // 这里可以添加对其他引用类型属性的深拷贝处理
//        // 例如，如果有其他数组或实现了 Cloneable 接口的对象属性，可以类似处理
//
//        return cloned;
//    }
}
