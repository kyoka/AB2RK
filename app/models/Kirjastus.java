package models;

import play.db.jpa.GenericModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 09.12.12
 * Time: 0:27
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "kirjastus", schema = "raamatukogu")
public class Kirjastus extends GenericModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_kirjastus")
	@SequenceGenerator(name = "seq_kirjastus", sequenceName = "raamatukogu.seq_kirjastus")
	public Integer kirjastus_id;

	public String nimi;

	public Integer telefoni_number;

	@OneToMany(mappedBy = "kirjastus")
	public List<Teavik> teavikud;


}
