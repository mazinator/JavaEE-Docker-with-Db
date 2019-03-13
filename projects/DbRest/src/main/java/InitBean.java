import dao.ClassroomDao;
import dao.StudentDao;
import entities.Classroom;
import entities.Student;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitBean {

    @Inject
    private StudentDao studentDao;
    @Inject
    private ClassroomDao classroomDao;

    @PostConstruct
    public void init(){
        Classroom classroom = new Classroom("5AHIF");
        classroomDao.create(classroom);
        classroom = classroomDao.getById(Long.valueOf(1));

        Student student1 = new Student("Daniel", "Mazanek", classroom);
        Student student2 = new Student("David", "Pointner", classroom);
        Student student3 = new Student("Hansi", "Langoth", classroom);
        studentDao.create(student1);
        studentDao.create(student2);
        studentDao.create(student3);
    }
}
