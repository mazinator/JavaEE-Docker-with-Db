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
        Classroom classroom = new Classroom(Long.valueOf(1), "5AHIF");
        classroomDao.create(classroom);

        Student student1 = new Student(Long.valueOf(1), "Daniel", "Mazanek", classroom);
        Student student2 = new Student(Long.valueOf(2), "David", "Pointner", classroom);
        Student student3 = new Student(Long.valueOf(3), "Hansi", "Langoth", classroom);
        studentDao.create(student1);
        studentDao.create(student2);
        studentDao.create(student3);
    }
}
