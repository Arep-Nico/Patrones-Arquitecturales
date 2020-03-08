package escuelaing.arep.PatronesArquitecturales.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import escuelaing.arep.PatronesArquitecturales.models.User;
import escuelaing.arep.PatronesArquitecturales.services.UserService;

/**
 * UserController
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/users")
public class UserController {

  @Autowired
  UserService us;

  @GetMapping
  public ResponseEntity<?> getAllUsers() {
    try {
      return new ResponseEntity<>(us.findAllUsers(), HttpStatus.ACCEPTED);
    } catch (Exception ex) {
      Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/{name}")
  public ResponseEntity<?> getUserByName(@PathVariable String name) {
    try {
      return new ResponseEntity<>(us.findUserByName(name), HttpStatus.ACCEPTED);
    } catch (Exception ex) {
      Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/{name}.{lastName}")
  public ResponseEntity<?> getUserByNameAndLastName(@PathVariable String name, @PathVariable String lastName) {
    try {
      return new ResponseEntity<>(us.findUserByNameAndLastName(name, lastName), HttpStatus.ACCEPTED);
    } catch (Exception ex) {
      Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping
  public ResponseEntity<?> createUser(@RequestBody User user) {
    try {
      return new ResponseEntity<>(us.createUser(user), HttpStatus.ACCEPTED);
    } catch (Exception ex) {
      Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping
  public ResponseEntity<?> updateUser(@RequestBody User user) {
    try {
      return new ResponseEntity<>(us.updateUser(user), HttpStatus.ACCEPTED);
    } catch (Exception ex) {
      Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteUser(@PathVariable Long id) {
    try {
      return new ResponseEntity<>(us.deleteUser(id), HttpStatus.ACCEPTED);
    } catch (Exception ex) {
      Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
  }

}