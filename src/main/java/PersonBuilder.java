public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || name.length() == 0) {
            throw new IllegalStateException("Имя не может быть null");
        }
        if (surname == null || surname.length() == 0) {
            throw new IllegalStateException("Фамилия не может быть null");
        }
        if (age == null) {
            throw new IllegalStateException("Возраст не может быть null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возвраст не может быть меньше нуля");
        }
        return new Person(name, surname, age, address);
    }

}
