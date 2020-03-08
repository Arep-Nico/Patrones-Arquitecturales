package escuelaing.arep.PatronesArquitecturales.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import escuelaing.arep.PatronesArquitecturales.models.User;

public interface UserRepository extends MongoRepository<User, Long> {

  List<User> findByName(String firstName);

  List<User> findByLastName(String lastName);

  List<User> findByAge(int age);

  List<User> findByNameAndLastName(String firstName, String lastName);
}