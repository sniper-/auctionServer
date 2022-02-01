package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.CashLog;
import xyz.auction.server.db.domain.LotInfo;

import java.util.List;

@Repository
@Transactional
public interface ILotInfoRepostory extends JpaRepository<LotInfo, String> {
    List<LotInfo> findByStatus(String status);

    @Query(value="select * from lot_info where state =?1 and end_time<date_sub(now(),INTERVAL 1 MINUTE)", nativeQuery = true)
    List<LotInfo> findToBeClosed(String status);
}
