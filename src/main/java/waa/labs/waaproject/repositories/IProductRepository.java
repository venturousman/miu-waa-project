package waa.labs.waaproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.labs.waaproject.models.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, Long> {
}
