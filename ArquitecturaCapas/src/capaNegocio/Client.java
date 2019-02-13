package capaNegocio;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClientPK id;

	@Column(name="billing_address")
	private int billingAddress;

	@Column(name="contact_email")
	private String contactEmail;

	@Column(name="contact_password")
	private String contactPassword;

	public Client() {
	}

	public ClientPK getId() {
		return this.id;
	}

	public void setId(ClientPK id) {
		this.id = id;
	}

	public int getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(int billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPassword() {
		return this.contactPassword;
	}

	public void setContactPassword(String contactPassword) {
		this.contactPassword = contactPassword;
	}

}