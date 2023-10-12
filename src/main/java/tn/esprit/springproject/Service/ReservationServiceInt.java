package tn.esprit.springproject.Service;

import tn.esprit.springproject.Model.Reservation;

import java.util.List;

public interface ReservationServiceInt {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation  res);

    Reservation updateReservation (Reservation  res);

    Reservation retrieveReservation (long idReservation);

}
