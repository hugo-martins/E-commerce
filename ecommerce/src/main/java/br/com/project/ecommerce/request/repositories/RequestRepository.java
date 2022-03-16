package br.com.project.ecommerce.request.repositories;

import br.com.project.ecommerce.request.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
