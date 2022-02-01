package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.CashLog;
import xyz.auction.server.db.domain.InvitationInfo;

import java.util.List;

@Repository
@Transactional
public interface IInvitationInfoRepostory extends JpaRepository<InvitationInfo, String> {
    InvitationInfo findByCode(String code);
}
