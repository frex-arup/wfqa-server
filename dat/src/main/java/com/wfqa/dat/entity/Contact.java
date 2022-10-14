package com.wfqa.dat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.wfqa.common.primarykey.Id_RevisionId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contacts", schema = "DAT")
@DynamicUpdate
@DynamicInsert
@IdClass(Id_RevisionId.class)
public class Contact {

    @Id
    @Column
    private Long id;
    
    @Id
    @Column(name = "revision_id")
    private Long revisionId;

    @Column(name = "first_name", length = 50)
    private String firstName;
    
    @Column(name = "last_name", length = 50)
    private String lastName;
    
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
    
    @Column(name = "fax_number", length = 20)
    private String faxNumber;
    
    @Column(name = "fax_number2", length = 20)
    private String faxNumber2;
    
    @Column(name = "email", length = 50)
    private String email;
    
    @Column(name = "first_name2", length = 50)
    private String firstName2;
    
    @Column(name = "last_name2", length = 50)
    private String lastName2;
    
    @Column(name = "phone_number2", length = 20)
    private String phoneNumber2;
    
    @Column(name = "email2", length = 50)
    private String email2;
    
    @Column(length = 1)
    @NotNull
    @Pattern(regexp = "A|I|C")
    private String status;

//    private Long accContactId;
//    private Long accRevisionId;
//
//    private String accFirstName;
//    private String accLastName;
//    private String accPhone;
//    private String accFax;
//    private String accEmail;
//    private String accFirstName2;
//    private String accLastName2;
//    private String accPhone2;
//    private String accFax2;
//    private String accEmail2;

    @Column(name = "phy_first_name", length = 50)
    private String physicalFirstName;
    
    @Column(name = "phy_last_name", length = 50)
    private String physicalLastName;
    
    @Column(name = "phy_phone_number", length = 50)
    private String phyPhoneNumber;
    
    @Column(name = "phy_fax_number", length = 50)
    private String phyFaxNumber;
    
    @Column(name = "phy_email", length = 50)
    private String phyEmail;

}
