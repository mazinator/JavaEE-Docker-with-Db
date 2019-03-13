package entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Student.getAll", query = "select s from Student s"),
        @NamedQuery(name = "Student.getById", query = "select s from Student s where s.id = :id")
})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToOne
    private Classroom classroom;

    //region Constructors
    public Student(){

    }

    public Student(String firstName, String lastName, Classroom classroom){
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