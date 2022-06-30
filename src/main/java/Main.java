public class Main {
    public static void main(String[] args) {

        Person person = new PersonBuilderImpl()
                .withName("Vova")
                .withSurname("Troshin")
                .withAge(2)
                .withAddress("Kekovo")
                .build();

        person.happyBirthday();

        Person child = person.newChildBuilder()
                .withName("Vaska")
                .build();

        System.out.println("Parent: " + person.toString());
        System.out.println("Child: " + child.toString());

        try{
            new PersonBuilderImpl()
                    .withName("Test")
                    .withSurname("Testovich")
                    .build();
        } catch (IllegalStateException  e) {
            System.out.println(e.getMessage());
        }

        try{
            new PersonBuilderImpl()
                    .withName("A")
                    .withSurname("B")
                    .withAge(-10)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
