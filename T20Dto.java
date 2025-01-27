package com.xworkz.validate.dto;

import java.util.Objects;

public class T20Dto {
	
	private String matchvenue;
	private int ticketprice;
	private int totalaudience;
	private int totalovers;
	private String country;
	private String captainname;
	private String winner;
	
	public T20Dto() {
		
		
	}

	public T20Dto(String matchvenue, int ticketprice, int totalaudience, int totalovers, String country,
			String captainname, String winner) {
		
		this.matchvenue = matchvenue;
		this.ticketprice = ticketprice;
		this.totalaudience = totalaudience;
		this.totalovers = totalovers;
		this.country = country;
		this.captainname = captainname;
		this.winner = winner;
	}

	public String getMatchvenue() {
		return matchvenue;
	}

	public void setMatchvenue(String matchvenue) {
		this.matchvenue = matchvenue;
	}

	public int getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}

	public int getTotalaudience() {
		return totalaudience;
	}

	public void setTotalaudience(int totalaudience) {
		this.totalaudience = totalaudience;
	}

	public int getTotalovers() {
		return totalovers;
	}

	public void setTotalovers(int totalovers) {
		this.totalovers = totalovers;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCaptainname() {
		return captainname;
	}

	public void setCaptainname(String captainname) {
		this.captainname = captainname;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "T20Dto [matchvenue=" + matchvenue + ", ticketprice=" + ticketprice + ", totalaudience=" + totalaudience
				+ ", totalovers=" + totalovers + ", country=" + country + ", captainname=" + captainname + ", winner="
				+ winner + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(captainname, country, matchvenue, ticketprice, totalaudience, totalovers, winner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		T20Dto other = (T20Dto) obj;
		return Objects.equals(captainname, other.captainname) && Objects.equals(country, other.country)
				&& Objects.equals(matchvenue, other.matchvenue) && ticketprice == other.ticketprice
				&& totalaudience == other.totalaudience && totalovers == other.totalovers
				&& Objects.equals(winner, other.winner);
	}

	
}
