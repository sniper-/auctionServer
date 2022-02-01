package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.PayLog;
import xyz.auction.server.db.domain.PayNoticeLog;

import java.util.List;

@Repository
@Transactional
public interface IPayNoticeLogRepostory extends JpaRepository<PayNoticeLog, String> {
    List<PayNoticeLog> findByCardNo(String cardNo);

    List<PayNoticeLog> findByStatus(String status);
}
