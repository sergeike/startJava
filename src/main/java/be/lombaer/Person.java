package be.lombaer;

import java.util.Objects;

/**
 * Created by sergelombaerts on 4/09/17.
 */
public class Person {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Person aPerson = (Person) o;
        // field comparison
        return Objects.equals(name, aPerson.name);
//               && Objects.equals(lastName, person.lastName);
    }


    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
