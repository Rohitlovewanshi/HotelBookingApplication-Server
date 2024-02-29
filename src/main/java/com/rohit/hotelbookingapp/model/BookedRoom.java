package com.rohit.hotelbookingapp.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name = "check_in")
	private LocalDate checkInDate;
	
	@Column(name = "check_out")
	private LocalDate checkOutDate;
	
	@Column(name = "guest_fullName")
	private String guestName;
	
	@Column(name = "guest_email")
	private String guestEmail;
	
	@Column(name = "adults")
	private int numOfAdults;
	
	@Column(name = "children")
	private int numOfChildrens;
	
	@Column(name = "total_guest")
	private int totalNumOfGuest;
	
	@Column(name = "confirmation_code")
	private String bookingConfirmationCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;
	
	public void calculateTotalNumberOfGuest() {
		this.totalNumOfGuest = this.numOfAdults + this.numOfChildrens;
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
		calculateTotalNumberOfGuest();
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildrens = numOfChildren;
		calculateTotalNumberOfGuest();
	}

	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
}
