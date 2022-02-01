package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.AccountInfo;
import xyz.auction.server.db.domain.CashLog;

import java.util.List;

@Repository
@Transactional
public interface ICashLogRepostory extends JpaRepository<CashLog, String> {
    List<CashLog> findByUserId(String userId);
}
