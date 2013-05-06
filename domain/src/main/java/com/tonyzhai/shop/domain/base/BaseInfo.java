package com.tonyzhai.shop.domain.base;import com.tonyzhai.shop.domain.base.support.JsonDateSerializer;import org.codehaus.jackson.annotate.JsonIgnoreProperties;import org.codehaus.jackson.map.annotate.JsonSerialize;import org.springframework.format.annotation.DateTimeFormat;import javax.persistence.*;import java.util.Date;/** * Base Info * * @author Tony Zhai * @since 13-2-24 AM1:39 */@Embeddable@JsonIgnoreProperties({        "createdId",        "createdUsername",        "createdFullName",        "createdDate",        "modifiedId",        "status"})public class BaseInfo {    private String createdUsername;    private String createdId;    private String createdFullName;    @Temporal(TemporalType.TIMESTAMP)    private Date createdDate;    private String modifiedUsername;    private String modifiedFullName;    private String modifiedId;    @Temporal(TemporalType.TIMESTAMP)    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)    @JsonSerialize(using = JsonDateSerializer.class)    private Date modifiedDate;    @Enumerated(EnumType.STRING)    private Status status;    public String getCreatedUsername() {        return createdUsername;    }    public void setCreatedUsername(String createdUsername) {        this.createdUsername = createdUsername;    }    public String getCreatedId() {        return createdId;    }    public void setCreatedId(String createdId) {        this.createdId = createdId;    }    public String getCreatedFullName() {        return createdFullName;    }    public void setCreatedFullName(String createdFullName) {        this.createdFullName = createdFullName;    }    public Date getCreatedDate() {        return createdDate;    }    public void setCreatedDate(Date createdDate) {        this.createdDate = createdDate;    }    public String getModifiedUsername() {        return modifiedUsername;    }    public void setModifiedUsername(String modifiedUsername) {        this.modifiedUsername = modifiedUsername;    }    public String getModifiedFullName() {        return modifiedFullName;    }    public void setModifiedFullName(String modifiedFullName) {        this.modifiedFullName = modifiedFullName;    }    public String getModifiedId() {        return modifiedId;    }    public void setModifiedId(String modifiedId) {        this.modifiedId = modifiedId;    }    public Date getModifiedDate() {        return modifiedDate;    }    public void setModifiedDate(Date modifiedDate) {        this.modifiedDate = modifiedDate;    }    public Status getStatus() {        return status;    }    public void setStatus(Status status) {        this.status = status;    }    public enum Status {        active, delete;    }}