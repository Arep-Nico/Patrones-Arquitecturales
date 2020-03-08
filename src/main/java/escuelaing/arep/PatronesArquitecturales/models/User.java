package escuelaing.arep.PatronesArquitecturales.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

/**
 * User
 */
@Data
@Document(collection = "Users")
public class User {
  @Transient
  public static final String SEQUENCE_NAME = "users_sequence";
  @Id
  Long id;
  String name;
  String lastName;
  String age;
}