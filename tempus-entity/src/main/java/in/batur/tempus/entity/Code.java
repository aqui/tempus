package in.batur.tempus.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "code")
public class Code extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String codeCode;
	private String codeDescription;
	private boolean active;
	@ManyToOne(fetch = FetchType.LAZY)
    private CodeTable codeTable;
}
