package hello.core.order;

public interface OrderService {
    // 1 주문생성  내용
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
