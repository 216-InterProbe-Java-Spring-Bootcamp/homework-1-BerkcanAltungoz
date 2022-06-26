package interprobe.homework01.dao;

import interprobe.homework01.entities.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public interface ProductCommentDao extends JpaRepository<ProductComment, Long> {
    List<ProductComment> getAllByFkProductId(Long productId);
    List<ProductComment> getAllByFkProductIdAndCommentDateBetween(Long productId, Date startDate, Date endDate );
    List<ProductComment> getAllByFkUserId(Long userId);
    List<ProductComment> getAllByFkUserIdAndCommentDateBetween(Long userId, Date startDate, Date endDate);
}
