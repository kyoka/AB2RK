package models;

import org.hibernate.annotations.Cache;
import play.db.jpa.GenericModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 08.12.12
 * Time: 23:45
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "isbn", schema = "raamatukogu")
public class Isbn extends GenericModel {

	@Id
	public String isbn_kood;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teavik_id")
	public Teavik teavik;
}
