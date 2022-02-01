package xyz.auction.server.util;

import com.alibaba.fastjson.JSONObject;

public class CheckParamUtil {
    public static void check(JSONObject jsonParam, String... params) throws Exception {
        for(String param :params) {
            if (jsonParam.get(param) == null) {
                throw new Exception(param + "缺失");
            }
        }
    }
}
