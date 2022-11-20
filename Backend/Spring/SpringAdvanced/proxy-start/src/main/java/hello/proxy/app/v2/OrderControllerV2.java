package hello.proxy.app.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequestMapping
@ResponseBody
public class OrderControllerV2 {

    private final OrderServiceV2 orderServiceV2;

    public OrderControllerV2(OrderServiceV2 orderServiceV2) {
        this.orderServiceV2 = orderServiceV2;
    }

    @RequestMapping("/v2/request")
    public String request(String itemId) {
        orderServiceV2.orderItem(itemId);
        return "ok";
    }

    public String noLog() {
        return "ok";
    }
}