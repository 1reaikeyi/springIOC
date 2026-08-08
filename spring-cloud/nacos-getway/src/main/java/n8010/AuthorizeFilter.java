package n8010;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Order(1)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1.获取请求头（HttpHeaders 也是 MultiValueMap 的子类型）
        MultiValueMap<String, String> headers = exchange.getRequest().getHeaders();
        // 2.获取 Truth 请求头的值（与网关 AddRequestHeader 过滤器添加的头名对应）
        String truth = headers.getFirst("Truth");
        // 3.校验：值为 "freaking" 才放行
        if ("freaking".contains(truth)) {
            // 放行
            return chain.filter(exchange);
        }
        // 4.拦截
        // 4.1.禁止访问，设置状态码
        exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
        // 4.2.结束处理
        return exchange.getResponse().setComplete();
    }
}
