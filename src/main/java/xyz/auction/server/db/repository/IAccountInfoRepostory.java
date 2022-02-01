package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.AccountInfo;

@Repository
@Transactional
public interface IAccountInfoRepostory extends JpaRepository<AccountInfo, String> {
    AccountInfo findByCardNo(String cardNo);

    AccountInfo findByUserId(String userId);
}
