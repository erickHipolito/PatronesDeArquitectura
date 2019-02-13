package capaNegocio;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the client database table.
 * 
 */
@Embeddable
public class ClientPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="client_name")
	private String clientName;

	@Column(name="client_department_number")
	private short clientDepartmentNumber;

	public ClientPK() {
	}
	public String getClientName() {
		return this.clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public short getClientDepartmentNumber() {
		return this.clientDepartmentNumber;
	}
	public void setClientDepartmentNumber(short clientDepartmentNumber) {
		this.clientDepartmentNumber = clientDepartmentNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClientPK)) {
			return false;
		}
		ClientPK castOther = (ClientPK)other;
		return 
			this.clientName.equals(castOther.clientName)
			&& (this.clientDepartmentNumber == castOther.clientDepartmentNumber);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.clientName.hashCode();
		hash = hash * prime + ((int) this.clientDepartmentNumber);
		
		return hash;
	}
}