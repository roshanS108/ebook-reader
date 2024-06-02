package com.mybook.easyread.services;

import com.mybook.easyread.data.Library;
import com.mybook.easyread.entity.User;
import com.mybook.easyread.payment.PaymentProcessor;

public class EBookReader {

    private User user;

    private Library library;

    private PaymentProcessor paymentProcessor;

    public EBookReader(User user, Library library, PaymentProcessor paymentProcessor){
        this.user = user;
        this.library = library;
        this.paymentProcessor = paymentProcessor;
    }


}
