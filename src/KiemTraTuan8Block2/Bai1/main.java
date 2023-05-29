package KiemTraTuan8Block2.Bai1;

public class main {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);

        people = new People("Tran Quoc Chung", 18, true, 1.75, 70);
        System.out.println(people);

        Teacher teacher = new Teacher();
        System.out.println(teacher);

        teacher = new Teacher("Phi Dinh Tu Anh", 24, false, 1.69, 35, "TS", 1, "OOP");
        System.out.println(teacher);

    }
}
