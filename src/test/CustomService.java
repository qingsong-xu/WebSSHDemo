package test;

public class CustomService {
    private String name;
    private int age;
    private String sex;
    private String status;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void sayHello() {
        System.out.println("hello,my name is " + name + " ,I am a good " + sex + " and I`m " + age + " ,I am " + status);
    }
}
