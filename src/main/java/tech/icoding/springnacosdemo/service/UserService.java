package tech.icoding.springnacosdemo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.icoding.springnacosdemo.dao.UserRepository;
import tech.icoding.springnacosdemo.model.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}