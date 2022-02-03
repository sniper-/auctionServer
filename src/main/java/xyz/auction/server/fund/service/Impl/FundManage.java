package xyz.auction.server.fund.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.auction.server.db.repository.ICashLogRepostory;

/**
 * ClassName: FundManage
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2022/02/02 22:39
 */
@Component
public class FundManage implements IFundManage{
    @Autowired
    ICashLogRepostory cashLogRepostory;

}
