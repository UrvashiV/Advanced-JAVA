package SelectQueryImplementation;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImplements implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(student student){
        // Insert Query
        String query = "Insert into student(id,name,city) values (?,?,?)";
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public int change(student student) {
        //Update Query
        String query = "update student set name=?,city=? where id=?";
        int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int delete(int id) {
       String query = "delete from student where id=?";
       int result =this.jdbcTemplate.update(query,id);
       return result;
    }

    @Override
    public student getStudent(int id) {
        String query = "select * from student where id=?";
        RowMapper<student> rowMapper = new RowMapperImpl();
       student student = this.jdbcTemplate.queryForObject(query,rowMapper,id);
        return student;
    }
}
