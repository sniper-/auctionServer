package xyz.auction.server.fund.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.auction.server.util.ApiResult;
import com.alibaba.fastjson.*;

/**
 * ClassName: FundController
 * Version:
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2022/02/02 22:42
 */
@Api(value="/fund", tags="资金管理")
@RestController
@RequestMapping("/fund")
@Slf4j
public class FundController {
    /*
     * TODO: 能否直接提供一个转账接口
     *  1、入金通知
     *  2、认购订单同步--转账
     *  3、认购结果通知
     *  4、募集出金--多个订单号
     *  5、募集出金通知
     *  6、兑付出金--募集订单号
     *  7、兑付出金通知
     *  8、兑付明细结果通知
     *  9、提现
     *  10、提现结果通知
     */
    @GetMapping(value = "/{userId}", produces = "application/json;charset=UTF-8")
    @ApiOperation("根据用户ID查询账户信息")
    public ApiResult queryAccount(@PathVariable("userId") Long userId) {
        return ApiResult.success(true);
    }

    /* 通知类交易 */
    @GetMapping(value = "/charge", produces = "application/json;charset=UTF-8")
    @ApiOperation("入金通知")
    public String queryAccount(String request) {
        JSONObject reqObj = JSONObject.parseObject(request);
        String fundNo = reqObj.getString("fundNo");
        String amount = reqObj.getString("amount");
        // TODO:入库
        return "";
    }
}
