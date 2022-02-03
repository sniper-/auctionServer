package xyz.auction.server.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * ClassName: APIResult
 * Version:
 * Description: API返回类型
 *
 * @Program:
 * @Author: sniper
 * @Date: 2022/02/02 22:51
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_CODE_SUCCESS=200;
    private Integer code;
    private String msg;
    private T data;

    public static ApiResult success(){
        return success(null);
    }

    public static <T> ApiResult success(T data) {
        return new ApiResult(DEFAULT_CODE_SUCCESS, null, data);
    }

    public static ApiResult error(Integer code, String msg) {
        return error(code, msg,null);
    }

    public static <T> ApiResult error(Integer code, String msg, T data){
        return new ApiResult(code, msg, data);
    }

}
