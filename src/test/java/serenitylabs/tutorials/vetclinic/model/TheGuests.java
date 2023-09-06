package serenitylabs.tutorials.vetclinic.model;
import serenitylabs.tutorials.vetclinic.features.queries.TheGuestsOnTheWaitingList;
import serenitylabs.tutorials.vetclinic.features.queries.TheRegisteredGuests;

public class TheGuests {
    public static TheRegisteredGuests registerdInTheHotel(PetHotel petHotel) {
        return TheRegisteredGuests.in(petHotel);
    }

    public static TheGuestsOnTheWaitingList  onTheWaitingListAt(PetHotel petHotel) {
        return TheGuestsOnTheWaitingList.forHotel(petHotel);
    }
}
