package myapp.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Service
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByEmail(@Param("email") String email);
    List<User> findByFirstName(@Param("firstName") String firstName);
    List<User> findByLastName(@Param("lastName") String lastName);
}