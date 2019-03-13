package entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Classroom.getAll", query = "select c from Classroom c"),
        @NamedQuery(name = "Classroom.getById", query = "select c from Classroom c where c.id = :id")
})
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //region Constructors
    public Classroom(){

    }

    public Classroom(String name){
        setName(name);
    }
    //endregion

    //region Getter Setter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}
