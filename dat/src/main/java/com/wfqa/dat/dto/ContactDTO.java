package com.wfqa.dat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDTO {

    private Long id;
    private Long revisionId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String faxNumber;
    private String faxNumber2;
    private String email;
    private String firstName2;
    private String lastName2;
    private String phoneNumber2;
    private String email2;
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

    private String physicalFirstName;
    private String physicalLastName;
    private String phyPhoneNumber;
    private String phyFaxNumber;
    private String phyEmail;
}
