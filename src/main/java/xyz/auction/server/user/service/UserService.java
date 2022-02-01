package xyz.auction.server.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.auction.server.db.domain.UserInfo;
import xyz.auction.server.db.repository.IAccountInfoRepostory;
import xyz.auction.server.db.repository.IUserInfoRepostory;

@Component
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private IAccountInfoRepostory accountInfoRepostory;
    @Autowired
    private IUserInfoRepostory userInfoRepostory;

    public UserInfo findPhoneNum(String phoneNum) {
        return userInfoRepostory.findByPhoneNum(phoneNum);
    }

    public void saveNewUser(UserInfo userInfo) {
        userInfoRepostory.save(userInfo);
        LOGGER.info("保存成功,userInfo:{}", userInfo);
    }
}
