package DeleteUsingInterface;

public interface StudentDao {

    public int insert(student student);
    public int change(student student);
    public int delete(int id);

}
