package serenitylabs.tutorials.vetclinic.features.queries;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;

import java.util.Collection;
import java.util.List;

public class TheGuestsOnTheWaitingList implements Question<Collection<Pet>> {

    private PetHotel petHotel;

    public TheGuestsOnTheWaitingList(PetHotel petHotel) {
        this.petHotel = petHotel;
    }

    public static TheGuestsOnTheWaitingList  forHotel(PetHotel petHotel) {
        return new TheGuestsOnTheWaitingList(petHotel);
    }


    @Override
    public Collection<Pet> answeredBy(Actor actor) {
        return petHotel.getWaitingList();
    }
}
