package com.rohit.hotelbookingapp.service;

import java.util.List;

import com.rohit.hotelbookingapp.model.BookedRoom;

public interface IBookingService {

	void cancelBooking(Long bookingId);

	String saveBooking(Long roomId, BookedRoom bookingRequest);

	BookedRoom findByBookingConfirmationCode(String confirmationCode);

	List<BookedRoom> getAllBookings();

	List<BookedRoom> getAllBookingsByRoomId(Long roomId);

	List<BookedRoom> getBookingsByUserEmail(String email);

}
