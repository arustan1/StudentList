package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Section {
	private String section;
	private int roomNumber;
	
	public Section() {
		super();
	}
	
	public Section(String section) {
		super();
		this.section = section;
	}

	public Section(String section, int roomNumber) {
		super();
		this.section = section;
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Section [section=" + section + ", roomNumber=" + roomNumber + "]";
	}
	
	

}
