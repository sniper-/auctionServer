package xyz.auction.server.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.auction.server.db.domain.UserInfo;

@Repository
@Transactional
public interface IUserInfoRepostory extends JpaRepository<UserInfo, String> {
    UserInfo findByPhoneNum(String phoneNum);
}
