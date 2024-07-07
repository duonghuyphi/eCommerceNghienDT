package nghiendt.service.impl;

import nghiendt.dto.UserReturnDTO;
import nghiendt.entity.User;
import nghiendt.repository.UserRepository;
import nghiendt.repository.obj.UserReturn;
import nghiendt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserReturnDTO> findAll() {
        List<UserReturn> users = userRepository.findAllUsers();
        List<UserReturnDTO> userDTOs = new ArrayList<>();

        for (UserReturn user : users) {
            UserReturnDTO userReturnDTO = new UserReturnDTO();
            userReturnDTO.setUserId(user.getUserId());
            userReturnDTO.setUsername(user.getUsername());
            userReturnDTO.setEmail(user.getEmail());

            userDTOs.add(userReturnDTO);
        }


        return userDTOs;
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
