package tn.esprit.spring.firstms.dto;

import lombok.Builder;

@Builder
public record ProductDTO(int id, String label,double price) {
}
