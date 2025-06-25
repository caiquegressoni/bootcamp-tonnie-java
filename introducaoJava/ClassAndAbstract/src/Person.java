public class Person {

    private String name;
    private String gender;
    private int age;

    //Gets

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    //Sets

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

}
