package nika;

public class Person implements Comparable<Person> {
    private String firstName, lastName;

    public Person(String first, String last){
        firstName = first;
        lastName = last;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Person o) {
        int lastNameComp = this.lastName.compareTo(o.lastName);
        if(lastNameComp == 0){
            return this.firstName.compareTo(o.firstName);
        }
        else{
            return lastNameComp;
        }
    }
}
