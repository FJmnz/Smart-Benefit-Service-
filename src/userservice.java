@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());

            userRepository.save(existingUser);
        }
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void testGetUserById() {

        User user = new User();
        user.setId(1L);
        user.setUsername("testUser");


        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(user));


        User result = userService.getUserById(1L);


        assertEquals(user, result);
    }

    @Test
    public void testSaveUser() {

        User user = new User();
        user.setUsername("newUser");


        userService.saveUser(user);


        Mockito.verify(userRepository, Mockito.times(1)).save(user);
    }


}


