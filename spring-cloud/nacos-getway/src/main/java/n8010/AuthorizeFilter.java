package n8010;

import java.util.List;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

// order 值要大于路由级 AddRequestHeader 过滤器的 order（路由 filter 从 1 开始递增）
// 设为 100 确保 AuthorizeFilter 在 AddRequestHeader 之后执行，才能读到注入的 Truth 头
@Order(100)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        MultiValueMap<String, String> headers = exchange.getRequest().getHeaders();
        // 用 get 而非 getFirst：default-filters 和 route.filters 各添加了一个 Truth 头
        // getFirst 只返回第一个值，get 返回所有值的 List
        List<String> truths = headers.get("Truth");
        System.out.println("truths = " + truths);
        // 校验：两个值都存在（default 注入的 "this!" 和 route 注入的 "that!"）
        if (truths != null && truths.contains("this!") && truths.contains("that!")) {
            // 放行
            System.out.println("校验通过，放行");
            return chain.filter(exchange);
        }
        // 4.拦截
        // 4.1.禁止访问，设置状态码
        exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
        // 4.2.结束处理
        return exchange.getResponse().setComplete();
    }
}
