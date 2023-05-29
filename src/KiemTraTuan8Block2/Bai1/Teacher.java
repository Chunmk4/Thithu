package KiemTraTuan8Block2.Bai1;

import KiemTraTuan8Block2.Bai1.People;

public class Teacher extends People {
    private String level;
    private int experience;
    private String subject;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Teacher(){
        super();
    }
    public Teacher (String name , int age , boolean sex , double height , int weight ,String level , int experience , String subject){
        super(name,age,sex,height,weight);
        this.level=level;
        this.experience=experience;
        this.subject=subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                ", experience=" + experience +
                ", subject='" + subject + '\'' +
                '}';
    }
}
