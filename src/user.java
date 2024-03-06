public interface UserService {
    User getUserById(Long id);
    User getUserByUsername(String username);
    void saveUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}

