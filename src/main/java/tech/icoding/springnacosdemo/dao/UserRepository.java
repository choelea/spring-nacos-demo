package tech.icoding.springnacosdemo.dao;


import org.springframework.data.repository.CrudRepository;
import tech.icoding.springnacosdemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}