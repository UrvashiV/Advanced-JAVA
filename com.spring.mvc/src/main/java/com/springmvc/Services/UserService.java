package UserService;

import com.springmvc.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.Model.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public int createUser(User user)
    {
        return this.userDao.saveUser(user);
    }
}
