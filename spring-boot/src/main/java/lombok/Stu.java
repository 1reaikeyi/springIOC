package lombok;
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
public class Stu {

    private String name;

    private int age;

    @NonNull
    private String email1;

    private final String email2;

    public Stu(String name, String email1, String email2) {
        this.name = name;
        this.email2 = email2;
        this.email1 = email1;
    }
    public Stu(int age, String email1, String email2) {
        this.age = age;
        this.email2 = email2;
        this.email1 = email1;
    }
}
