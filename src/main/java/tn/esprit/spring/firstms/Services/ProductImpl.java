package tn.esprit.spring.firstms.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.firstms.Entities.Product;
import tn.esprit.spring.firstms.Repositories.ProductRepository;
import tn.esprit.spring.firstms.dto.ProductDTO;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class ProductImpl implements IProductService{
	ProductRepository productRepository;
	@Override
	public Optional<Product> retrieveProductById(Object id) {
		return Optional.empty();
	}

	@Override
	public List<ProductDTO> retrieveAllProducts() {
		return null;
	}

	@Override
	public ProductDTO retrieveProductByCodeAndActif(String code, boolean actif) {
		return productRepository.findByCodeAndActif(code,true)
				.map(product -> ProductDTO.builder().id(product.getId())
						.label(product.getLabel())
						.build()).orElseThrow(() -> new IllegalArgumentException(String.valueOf(new StringBuilder("No Product found").append(code))));

	}

}
