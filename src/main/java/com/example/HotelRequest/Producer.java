package com.example.HotelRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC = "hotel_requests";

    @Autowired
    private KafkaTemplate<String, HotelRequest> kafkaTemplate;

    public String hotelRequestNotify(HotelRequest hotelRequest) {
        System.out.println(String.format("#### -> Producing hotel request to notification service -> %s", hotelRequest));
        this.kafkaTemplate.send(TOPIC, hotelRequest);
        return "Successfully";
    }
}
