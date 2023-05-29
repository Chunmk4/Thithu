package KiemTraTuan8Block2.Bai1;

public class People {
    private String name;
    private int age;
    private boolean sex;
    private double height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isSex() {
        return sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public People(){}
    public People(String name , int age , Boolean sex , double height , int weight){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.height=height;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
