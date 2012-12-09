package models;

import play.db.jpa.GenericModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 09.12.12
 * Time: 1:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "laenutaja", schema = "raamatukogu")
public class Laenutaja extends GenericModel {
	@Id
	public String isikukood;

}
