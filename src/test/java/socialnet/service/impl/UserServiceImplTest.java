//package socialnet.service.impl;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.modelmapper.ModelMapper;
//import org.springframework.util.Assert;
//import socialnet.exceptions.exceptionFolder.UserExistException;
//import socialnet.models.entities.User;
//import socialnet.models.servicies.UserServiceModel;
//import socialnet.repository.UserRepository;
//import socialnet.service.UserService;
//
//class UserServiceImplTest {
//
//    private final UserRepository userRepository;
//    private final UserService userService;
//    private final User testUser;
//    private final ModelMapper modelMapper;
//    private final UserServiceModel userServiceModel;
//
//    UserServiceImplTest(UserRepository userRepository,
//                        UserService userService,
//                        User testUser,
//                        ModelMapper modelMapper,
//                        UserServiceModel userServiceModel) {
//        this.userRepository = userRepository;
//        this.userService = userService;
//        this.testUser = testUser;
//        this.modelMapper = modelMapper;
//        this.userServiceModel = userServiceModel;
//    }
//
//    @BeforeEach
//    void setUp() {
//        User testUser = new User();
//
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    void register() throws UserExistException {
//        this.userService.register(this.modelMapper.map(testUser, UserServiceModel.class));
//        Assert.notEmpty(this.userRepository.findAll(), "Not valid");
//    }
//
//    @Test
//    void resetPassword() {
//    }
//
//    @Test
//    void update() {
//    }
//
//    @Test
//    void confirmPassword() {
//    }
//
//    @Test
//    void getAllUser() {
//    }
//
//    @Test
//    void getUserByUsername() {
//
//
//    }
//
//    @Test
//    void getUserByEmail() {
//    }
//
//    @Test
//    void loadUserByUsername() {
//    }
//}