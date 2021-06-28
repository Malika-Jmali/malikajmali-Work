package com.techelevator.auctions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;

import javax.validation.Valid;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	@Autowired
    private AuctionDAO dao;

    public AuctionController(AuctionDAO dao) {
        this.dao = dao;
    }

    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {

        if( !title_like.equals("") ) {
            return dao.searchByTitle(title_like);
        }
        if(currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        }

        return dao.list();
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) throws AuctionNotFoundException {
        return dao.get(id);
    }



    // This is Step 2/4
    @ResponseStatus(HttpStatus.CREATED)// this will return the stapocope
    @RequestMapping( path = "", method = RequestMethod.POST)
    public Auction create(@Valid @RequestBody Auction auction) {  //STEP_4 @Valid
        return dao.create(auction);
    }
    // Step 5
    @RequestMapping( path = "/{id}", method = RequestMethod.PUT)
    public Auction update (@Valid @RequestBody Auction auction, @PathVariable int id) throws AuctionNotFoundException {
        return dao.update(auction, id);
    }  //Dont put a DOT after the method
    // Step 6
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping( path = "/{id}", method = RequestMethod.DELETE )
    public void delete(@PathVariable int id) throws AuctionNotFoundException {
        dao.delete(id);
    }

}
