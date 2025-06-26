package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.discountPrice = discountPrice;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.memberId = memberId;
    }

    public int calculatePrice() {
     return itemPrice - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "discountPrice=" + discountPrice +
                ", memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}

