import java.time.LocalDate;

public class Person {
    private  String name;
    private LocalDate dateOfBirth;
    private  int age;
    private int nomer;
    private String nationality;
    private  LocalDate deyt;

    public Person(String name, LocalDate dateOfBirth, int nomer, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nomer = nomer;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    void netod(){

        }

}

