package entities;

public class Classroom {
    private Long id;

    private String name;

    public Classroom(){

    }

    public Classroom(Long id, String name){
        this.id = id;
        setName(name);
    }


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
