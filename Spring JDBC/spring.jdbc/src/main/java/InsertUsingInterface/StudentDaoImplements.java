package InsertUsingInterface;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImplements implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(student student){

        String query = "Insert into student(id,name,city) values (?,?,?)";
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }
}
