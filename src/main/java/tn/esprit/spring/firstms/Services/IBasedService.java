package tn.esprit.spring.firstms.Services;

import tn.esprit.spring.firstms.Entities.Product;

import java.util.Optional;

public interface IBasedService<T,ID> {
	Optional<Product> retrieveProductById(T id);

}
