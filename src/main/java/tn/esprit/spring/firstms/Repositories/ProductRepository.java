package tn.esprit.spring.firstms.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.firstms.Entities.Product;

public interface ProductRepository extends BasedRepository<Product,Integer>{
}
