package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 08.12.12
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(schema = "raamatukogu", name = "autor")
public class Autor extends GenericModel {

	@Id
	@Column(name = "àutor_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor")
	@SequenceGenerator(name = "seq_autor", sequenceName = "raamatukogu.seq_autor")
	public Integer id;

	public String eesnimi;
	public String perenimi;
	public int sunniaasta;

}
