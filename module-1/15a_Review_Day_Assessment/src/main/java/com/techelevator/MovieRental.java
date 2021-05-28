package com.techelevator;

import java.text.Format;

public class MovieRental {

    private String title;
    private String isPremiumMovie;
    private String rentalPrice;
    private String format;
    public static void main(String[] args) {
        String VHS, DVD, BluRay;

        System.out.println("VHS");
        System.out.println("DVD");
        System.out.println("BluRay");
    }



    public MovieRental(String title, String format, String isPremiumMovie) {
        this.title = title;
        this.isPremiumMovie = isPremiumMovie;
        this.format= VHS, DVD, BluRay;;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFormat(String format) {
        this.format = (VHS, DVD, BluRay);
        String VHS;
        String DVD;
        String BluRay;
    }

    public void setIsPremiumMovie(String isPremiumMovie) {
        this.isPremiumMovie = rentalPrice + 1.00;
    }

    public String setRentalPrice(String rentalPrice) {
        if (format = VSH) {
            return rentalPrice + 0.99;
        } else if (format = DVD) {
            return rentalPrice + 1.99;
        } else if (format = BluRay) {
            return rentalPrice + 2.99;
        }
        return rentalPrice;
    }



    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public String getIsPremiumMovie() {
        return isPremiumMovie;
    }

    public String getRentalPrice() {
        return rentalPrice;
    }
}
