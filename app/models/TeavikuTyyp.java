package models;

import play.db.jpa.GenericModel;
import play.db.jpa.JPA;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 09.12.12
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "teaviku_tyyp", schema = "raamatukogu")
public class TeavikuTyyp extends GenericModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_teaviku_tyyp")
	@SequenceGenerator(name = "seq_teaviku_tyyp", sequenceName = "raamatukogu.seq_teaviku_tyyp")
	public Integer tyyp_id;

	public String nimetus;
	public String kirjeldus;

	@OneToMany(mappedBy = "tyyp", fetch = FetchType.LAZY)
	public List<Teavik> teavikud;
}
