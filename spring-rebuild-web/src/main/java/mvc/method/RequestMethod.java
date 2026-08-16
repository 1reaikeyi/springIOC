package mvc.method;

/**
 * ClassName: 【16】method.RequestMethod
 * Description: 请求方式枚举
 */
public enum RequestMethod {
    GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE");

    private String description;

    RequestMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

