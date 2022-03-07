package my_tasks.tasks.respository;

import my_tasks.tasks.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {

     boolean existsUserByUsername(String username);
}
