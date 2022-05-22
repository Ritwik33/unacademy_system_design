package lld.designCaseStudies.movieBookingApplication.service;

public interface BookingService {

    public long createBooking(long userId, long movieId, long theatreId, long slotId);

}
