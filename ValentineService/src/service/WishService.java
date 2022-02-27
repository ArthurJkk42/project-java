package service;


import models.Wish;

public interface WishService {
    void createWish(String text, String phoneSender, String phoneReceipt);

    Wish[] receiptWishes(String phone);
}

