package ru.dinkagaf.spring31.sevice;

import ru.dinkagaf.spring31.entities.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUser(Integer id);

    public void deleteUser(Integer id);

    public void saveUser(User user);

    public void updateUser(User user);
}
