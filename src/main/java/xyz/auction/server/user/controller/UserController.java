package xyz.auction.server.user.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.auction.server.db.domain.UserInfo;
import xyz.auction.server.entity.Response;
import xyz.auction.server.user.service.UserService;
import xyz.auction.server.util.CheckParamUtil;

@RequestMapping("/user")
@RestController
@EnableJpaRepositories
public class UserController extends SpringBootServletInitializer {

    @Autowired
    private UserService userService;

    @PostMapping("/registerPhoneNum")
    public JSONObject registerPhoneNum(@RequestBody JSONObject jsonParam) {
        try {
            CheckParamUtil.check(jsonParam, "phoneNum", "invitationCode", "imageCode", "smsCode");
            UserInfo userInfo = userService.findPhoneNum(jsonParam.getString("phoneNum"));
            if (userInfo != null) {
                throw new Exception("用户已注册");
            }
            userInfo = new UserInfo();
            userInfo.setPhoneNum(jsonParam.getString("phoneNum"));
            userInfo.setInvitationCode(jsonParam.getString("invitationCode"));
            userService.saveNewUser(userInfo);
            return (JSONObject) JSONObject.toJSON(Response.success(userInfo));
        } catch (Exception e) {
            return (JSONObject) JSONObject.toJSON(Response.fail("000001", e));
        }

    }
}
