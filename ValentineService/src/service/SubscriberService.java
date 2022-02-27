package service;

import models.Subscriber;
import service.impl.SubscriberServiceImpl;

public interface SubscriberService {

    SubscriberService INSTANCE = new SubscriberServiceImpl();

    Subscriber findOrCreateSubscriber(String phone);

    void blockSubcriber(String phone);
}

