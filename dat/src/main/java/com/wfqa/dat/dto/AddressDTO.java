package com.wfqa.dat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    private Long id;
    private Long revisionId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private Long cityId;
    private String state;
    private Long stateId;
    private String postalCode;
    private String country;
    private Long countryId;
    private Long contactId;
    private Long contactRevisionId;
    private String status;
    private Double latitude;
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
    private ContactDTO contact;

}
