package com.example.HotelRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hotel/request")
public class HotelRequestController {
    private final Producer producer;
    private HotelInformationService hotelInformationService;

    @Autowired
    public HotelRequestController(Producer producer, HotelInformationService hotelInformationService) {
        this.producer = producer;
        this.hotelInformationService = hotelInformationService;
    }

    @GetMapping
    public String sendMessageToKafkaTopic2(@RequestParam("hotelId") String hotelId){

        HotelRequest hotelRequest = new HotelRequest(hotelId, hotelInformationService.getHotelById(hotelId));
        this.producer.hotelRequestNotify(hotelRequest);
        return "Request was sent successfully!";
    }
}
