package web.repository;

import web.models.User;

import java.util.List;

public interface UserRepository {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
