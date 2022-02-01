package xyz.auction.server.entity;

public class Response {
    private static final String SUCCESS_MESSAGE = "success";
    private static final String SUCCESS_STATUS = "S";
    private static final String FAIL_STATUS = "F";
    public static final String SUCCESS_CODE = "000000";
    private String status;
    private String code;
    private String message;
    private Object data;
    private long timestamp;


    public Response(String code, String message, String status, Object data) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
        timestamp=System.currentTimeMillis();
    }

    public static Response success(Object data) {
        return new Response(SUCCESS_CODE, SUCCESS_MESSAGE, SUCCESS_STATUS, data);
    }

    public static Response fail(String recode, String respMsg) {
        return new Response(recode, respMsg,FAIL_STATUS, null);
    }

    public static Response fail(String recode, Exception exception) {
        //exception.printStackTrace();
        return new Response(recode, exception.getMessage(),FAIL_STATUS, null);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
