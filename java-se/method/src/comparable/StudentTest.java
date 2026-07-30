package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0]= new Student("猴子",1,160);
        students[1]= new Student("紫霞",2,10);
        students[2]= new Student("墨子",3,140);
        students[3]= new Student("韩信",4,160);
//        Arrays.sort(students);

//        Arrays.sort(students,new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.getLength()-o2.getLength());
//            }
//        });
//        简化1
        Arrays.sort(students,(o1,o2) -> {
            return (o1.getId()-o2.getId());
        });
        /**
         * 如果返回正数，表示o1的ID大于o2的ID，o1排在后面
         * 如果返回负数，表示o1的ID小于o2的ID，o1排在前面
         * 如果返回0，表示两个ID相等，位置不变
         */

//        简化2
        Arrays.sort(students,(o1,o2) -> (int) (o1.getLength()-o2.getLength()));

        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
    }
    
}
