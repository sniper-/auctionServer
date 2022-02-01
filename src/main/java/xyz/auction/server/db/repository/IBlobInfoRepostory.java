package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.BlobInfo;

import java.util.List;

@Repository
@Transactional
public interface IBlobInfoRepostory extends JpaRepository<BlobInfo, String> {

    @Query(value = "select * from blob_info where id in ?1", nativeQuery = true)
    List<BlobInfo> findByIds(List<String> ids);
}
