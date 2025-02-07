package tn.esprit.spring.firstms.Services;

import tn.esprit.spring.firstms.Entities.Product;
import tn.esprit.spring.firstms.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface IProductService /*extends IBasedService<>*/{
	List<ProductDTO> retrieveAllProducts();
	ProductDTO retrieveProductByCodeAndActif(String code,boolean actif);
}
