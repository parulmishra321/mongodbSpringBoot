package mongodbSpringBoot.repository;

import mongodbSpringBoot.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
