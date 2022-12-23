package Main.Person.Persons;

import Main.Person.Person;

public class MiddlePerson extends Person {
    private String hobby;

    protected MiddlePerson(String name,String hobby) {
        super(name);
        this.hobby=hobby;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }
}
