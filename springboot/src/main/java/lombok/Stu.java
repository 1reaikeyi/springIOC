package lombok;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Stu {
    @Getter @Setter
    private String name;

    @Getter @Setter
    private int age;

    @NonNull @Getter @Setter
    private String email;

    public Stu(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Stu(int age, String email) {
        this.age = age;
        this.email = email;
    }
}
