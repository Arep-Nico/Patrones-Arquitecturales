package escuelaing.arep.PatronesArquitecturales.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import escuelaing.arep.PatronesArquitecturales.models.User;
import escuelaing.arep.PatronesArquitecturales.repository.UserRepository;

/**
 * UserService
 */
@Service
public class UserService {

  @Autowired
  UserRepository uRepository;
  @Autowired
  SequenceGeneratorService sgs;

  public List<User> findAllUsers() {
    return uRepository.findAll();
  }

  public List<User> findUserByName(String name) {
    return uRepository.findByName(name);
  }

  public List<User> findUserByNameAndLastName(String name, String lastName) {
    return uRepository.findByNameAndLastName(name, lastName);
  }

  public User createUser(User user) {
    user.setId(sgs.generateSequence(user.SEQUENCE_NAME));
    return uRepository.save(user);
  }

  public User updateUser(User user) {
    return uRepository.save(user);
  }

  public User deleteUser(Long id) {
    Optional<User> deleteUser = uRepository.findById(id);
    uRepository.deleteById(id);
    return deleteUser.get();
  }
}