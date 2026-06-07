package SelectMultipleRowQueryImplementation;

import java.util.List;

public interface StudentDao {

    public int insert(student student);
    public int change(student student);
    public int delete(int id);
    public student getStudent(int id);
    public List<student> getAllStudents();

}
