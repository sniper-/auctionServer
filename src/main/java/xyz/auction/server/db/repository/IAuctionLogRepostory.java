package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.AuctionLog;

import java.util.List;

@Repository
@Transactional
public interface IAuctionLogRepostory extends JpaRepository<AuctionLog, String> {
    AuctionLog findBySubLotId(String subLotId);

    @Query(value = "select distinct sub_lot_id,user_id,account_id from auction_log where sub_lot_id =?1", nativeQuery = true)
    List<AuctionLog> findAllUserBySubLotId(String subLotId);

    @Query(value = "select * from auction_log where sub_lot_id =?1 order by create_time desc limit 0,1", nativeQuery = true)
    AuctionLog findWinnerUserIdBySubLotId(String subLotId);
}
