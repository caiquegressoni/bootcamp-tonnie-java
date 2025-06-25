public class firstClass {
    public static void main(String[] args){
        var person = new Person(); //Chama a class Person

        person.setName("José");
        person.setAge(32);
        person.setGender("Male");

        System.out.print("Seu nome é: " + person.getName() + " idade: " + person.getAge() + " gênero: " + person.getGender());

    }
}
