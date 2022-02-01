package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.MarginLog;
import xyz.auction.server.db.domain.PayLog;

import java.util.List;

@Repository
@Transactional
public interface IPayInfoRepostory extends JpaRepository<PayLog, String> {
    PayLog findBySubLotIdAndUserId(String subLotId, String userId);

    List<PayLog> findByUserId(String userId);

    List<PayLog> findBySubLotId(String userId);
}
