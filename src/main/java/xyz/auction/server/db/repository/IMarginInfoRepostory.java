package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.MarginLog;

import java.util.List;

@Repository
@Transactional
public interface IMarginInfoRepostory extends JpaRepository<MarginLog, String> {
    MarginLog findBySubLotIdAndUserId(String subLotId, String userId);

    List<MarginLog> findByUserId(String userId);

    List<MarginLog> findBySubLotId(String userId);
}
