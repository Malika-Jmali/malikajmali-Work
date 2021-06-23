package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;

public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public Auction[] listAllAuctions() {
        return restTemplate.getForObject(BASE_URL, Auction[].class);  // this calls the url,
    }
    public Auction listDetailsForAuction(int id) {  //http://localhost:3000/auctions/
        return restTemplate.getForObject(BASE_URL + "/" + id ,Auction.class);
    }
    public Auction[] findAuctionsSearchTitle(String title) { //http://localhost:3000/auctions?title_like"
        return restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
    }
    public Auction[] findAuctionsSearchPrice(double price) {
        return restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);
    }
}
