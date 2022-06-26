package interprobe.homework01.dao;

import interprobe.homework01.entities.Product;
import interprobe.homework01.entities.ProductComment;
import org.apache.tomcat.jni.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
@Repository
public interface ProductCommentDao extends JpaRepository<ProductComment, Long> {
    List<ProductComment> getAllByFkProductId(Long productId);
    List<ProductComment> getAllByCommentDateBetween(LocalDate startDate, LocalDate endDate );
    List<ProductComment> getAllByFkUserId(Long userId);
    List<ProductComment> getAllByFkUserIdAndCommentDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
}
