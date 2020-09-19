package io.raghu.api;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "newportrequest")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	@SequenceGenerator(name = "id_generator", sequenceName = "newport_sequence", allocationSize = 1)
	long reqseq;
	@NotEmpty(message = "Port Id Cannot be null")
	String portid;
	String donor;
	String recipient;
	@NotEmpty(message = "route is not a valid email" )
	String route;
	String subname;
	String portingcode;
	String iscorpflag;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="accportid",referencedColumnName = "portid")
	List<Account> accList;

}
