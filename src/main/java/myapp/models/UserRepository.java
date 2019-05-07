package myapp.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
//@Service
public interface UserRepository extends CrudRepository<User, Integer> {

}