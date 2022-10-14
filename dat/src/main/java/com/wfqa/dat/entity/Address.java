package com.wfqa.dat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.WhereJoinTable;

import com.wfqa.common.entity.Audit;
import com.wfqa.common.primarykey.Id_RevisionId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "addresses", schema = "DAT")
@DynamicUpdate
@DynamicInsert
@IdClass(Id_RevisionId.class)
public class Address extends Audit {

    @Id
    @Column
    private Long id;
    
    @Id
    @Column(name = "revision_id")
    private Long revisionId;
    
    @Column(name = "street1", length = 80)
    private String addressLine1;
    
    @Column(name = "street2", length = 80)
    private String addressLine2;

    @Column(name = "city", length = 50)
    private String city;
    
    @Column(name = "city_id")
    private Long cityId;
    
    @Column(name = "state", length = 50)
    private String state;
    
    @Column(name = "state_id")
    private Long stateId;
    
    @Column(name = "postal_code", length = 50)
    private String postalCode;
    
    @Column(name = "country", length = 50)
    private String country;
    
    @Column(name = "country_id")
    private Long countryId;

//    @Column(name = "contact_id")
//    private Long contactId;
//    
//    @Column(name = "contact_revision_id")
//    private Long contactRevisionId;
    
    @Column(length = 1)
    @NotNull
    @Pattern(regexp = "A|I|C")
    private String status;
    
    @Column(precision = 10, scale = 6)
    private Double latitude;
    
    @Column(precision = 10, scale = 6)
    private Double longitude;
    
    
//    private String accAddressLine1;
//    private String accAddressLine2;
//    private String accCity;
//    private Long accCityId;
//    private String accState;
//    private Long accStateId;
//    private String accPostalCode;
//    private String accCountry;
//    private Long accCountryId;
    
    @OneToOne 
    @JoinColumns({
        @JoinColumn(name = "contact_id", referencedColumnName = "id"),
        @JoinColumn(name = "contact_revision_id", referencedColumnName = "revision_id")
    })
    @WhereJoinTable(clause = "status = 'A' ")
    private Contact contact;
}
