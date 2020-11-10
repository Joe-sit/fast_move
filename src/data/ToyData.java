package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        person[0] = new Person("Pattarapon", "Mukhirun");
        person[1] = new Person("Varitchai", "Surachaitanawat");
        person[2] = new Person("Natchapak", "Thaiprasit");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(20.5, ParcelStatus.DELIVERED, new Location(2, 1));
        parcels[1] = new Parcel(26.7, ParcelStatus.SHIPPING, new Location(5, 6));
        parcels[2] = new Parcel(29.5, ParcelStatus.READY_TO_SHIP, new Location(8, 2));
        parcels[3] = new Parcel(30.5, ParcelStatus.SHIPPING, new Location(4, 8));
        parcels[4] = new Parcel(23.5, ParcelStatus.READY_TO_SHIP, new Location(8, 6));
        parcels[5] = new Parcel(21.5, ParcelStatus.DELIVERED, new Location(9, 10));
        parcels[6] = new Parcel(10.5, ParcelStatus.DELIVERED, new Location(10, 0));
        parcels[7] = new Parcel(19.5, ParcelStatus.DELIVERED, new Location(5, 6));
        parcels[8] = new Parcel(29.5, ParcelStatus.SHIPPING, new Location(7, 3));
        parcels[9] = new Parcel(40.5, ParcelStatus.SHIPPING, new Location(8, 2));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}