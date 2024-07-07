package nghiendt.service;

import nghiendt.dto.UserReturnDTO;
import nghiendt.entity.User;

import java.util.List;

public interface UserService {

    List<UserReturnDTO> findAll();

    User findById(int id);

    User create(User user);

    User update(User user);

    void delete(int id);
}
