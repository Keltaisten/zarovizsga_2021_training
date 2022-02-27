package hu.nive.ujratervezes.zarovizsga.workhours;

public class Person implements Comparable<Person>{
    private String name;
    private int workingHours;
    private String date;

    public Person(String name, int workingHours, String date) {
        this.name = name;
        this.workingHours = workingHours;
        this.date = date;
    }

    @Override
    public String toString() {
        return name + ": " + date;
    }

    @Override
    public int compareTo(Person o) {
        return workingHours - o.workingHours;
    }
}
