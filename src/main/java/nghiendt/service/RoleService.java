package nghiendt.service;

import nghiendt.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Role findById(String id);

    Role create(Role role);

    Role update(Role role);

    void delete(String id);
}
