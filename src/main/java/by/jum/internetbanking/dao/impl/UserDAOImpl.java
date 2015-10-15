package by.jum.internetbanking.dao.impl;

import by.jum.internetbanking.dao.AbstractBaseDAO;
import by.jum.internetbanking.dao.UserDAO;
import by.jum.internetbanking.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl extends AbstractBaseDAO implements UserDAO {


    public List<User> getList() {
        return null;
    }

    public void delete(User user) {
        super.save(user);
    }

    public void update(User user) {
        super.update(user);
    }

    public void save(User user) {
        super.save(user);
    }
}