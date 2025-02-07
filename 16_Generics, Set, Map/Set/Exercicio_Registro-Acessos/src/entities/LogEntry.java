package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

	private String username;
	private Date mmoment;
	
	public LogEntry() {
	}

	public LogEntry(String username, Date mmoment) {
		this.username = username;
		this.mmoment = mmoment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getMmoment() {
		return mmoment;
	}

	public void setMmoment(Date mmoment) {
		this.mmoment = mmoment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}
	
	
	
	
}
