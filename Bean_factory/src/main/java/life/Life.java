package life;

public class Life {
    private int id;

    public Life() {
        System.out.println("第一步：使用无参构造");
    }

    public Life(int id) {
        this.id = id;
        System.out.println("第一步：使用有参构造");
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("第二步：setting");
    }

    public int getId() {
        return id;
    }

    public void ininBean(){
        System.out.println("第三步：初始化");
    }

    public void destroyBean(){
        System.out.println("第五步：摧毁bean");
    }

/**
 * 第一步：使用无参构造
 * 第二步：setting
 * 第三步：初始化
 * 第四部dlife.Life@302552ec
 * 第五步：摧毁bean
 */
}
