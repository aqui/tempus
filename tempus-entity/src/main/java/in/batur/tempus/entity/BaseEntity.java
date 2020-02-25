package in.batur.tempus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
 
	@Version
	@Column(name = "OPTLOCK", nullable=false)
	public Long version;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", updatable=false)
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE_DATE")
    private Date updated;

    @PrePersist
    protected void onCreate() 
    {
    	updated = created = new Date();
    	version = 0L;
    }

    @PreUpdate
    protected void onUpdate() 
    {
    	updated = new Date();
    }
}