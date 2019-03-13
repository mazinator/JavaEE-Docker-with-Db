package entities;

public class Student {
    private Long id;

    private String firstName;

    private String lastName;

    private Classroom classroom;

    //region Constructors
    public Student(){

    }

    public Student(Long id, String firstName, String lastName, Classroom classroom){
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setClassroom(classroom);
    }
    //endregion

    //region Getter Setter
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    //endregion
}
