package interprobe.homework01.dao;

import interprobe.homework01.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
    List<Product> getAllByExpireDateBefore(LocalDate currentDate);
    List<Product> getAllByExpireDateAfterOrExpireDateIsNull(LocalDate currentDate);
}
