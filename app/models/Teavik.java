package models;

import play.db.jpa.GenericModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 08.12.12
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "teavik", schema = "raamatukogu")
public class Teavik extends GenericModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_teavik")
	@SequenceGenerator(name = "seq_teavik", sequenceName = "raamatukogu.seq_teavik")
	public Integer teavik_id;

	public String pealkiri;

	public int ilmumisaasta;

	@ManyToOne
	public Kirjastus kirjastus;

	@ManyToOne
	public TeavikuTyyp tyyp;


	@OneToOne(mappedBy = "teavik", cascade = CascadeType.ALL)
	public Isbn ISBNCode;
}
