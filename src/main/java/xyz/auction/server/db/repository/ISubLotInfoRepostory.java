package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.SubLotInfo;

import java.util.List;

@Repository
@Transactional
public interface ISubLotInfoRepostory extends JpaRepository<SubLotInfo, String> {
    List<SubLotInfo> findByLotId(String lotId);
}
