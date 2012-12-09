package models;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 09.12.12
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "")
public class TeavikuEksemplar {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_teaviku_eksemplaar")
	@SequenceGenerator(name = "seq_teaviku_eksemplaar", sequenceName = "raamatukogu.seq_teaviku_eksemplaar")
	public Integer eskemplar_id;

//	@Column(name = "teavik_id")
//	@OneToOne()
//	public Teavik teavik;


}
