package nghiendt.repository;

import nghiendt.entity.User;
import nghiendt.repository.obj.UserReturn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value ="SELECT userId, username, email FROM User;", nativeQuery = true)
    List<UserReturn> findAllUsers();
}