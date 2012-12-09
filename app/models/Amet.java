package models;

import play.db.jpa.GenericModel;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 04.12.12
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "amet", schema = "raamatukogu")
public class Amet extends GenericModel {

	@Id
	@Column(name = "amet_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_amet")
	@SequenceGenerator(name = "seq_amet", sequenceName = "raamatukogu.seq_amet")
	public Long id;

	public String nimetus;

	public String kirjeldus;

}
