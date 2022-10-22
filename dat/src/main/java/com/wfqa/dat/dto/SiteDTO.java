package com.wfqa.dat.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiteDTO {
    private Long id;
    private Long revisionId;
    private String type;
    private Long addressId;
    private String firstName;
    private String lastName;
    private String fleetTerminal;
    private String federalId;
    private String billToCode;
    private String customerCode;
    private String clientCode;
    private Long parentSiteId;
    private Long countryId;
    private String status;
    private String businessType;
    private String employerId;
    private String employerName;
    private Long minorityVendorId;
    private Long contractImageId;
    private Long billToRemitToId;
    private String paymentTerm;
    private String paymentMethod;
    private LocalDate pricingTermBegin;
    private LocalDate pricingTermExpire;
    private String inetAccess;
    private String randomSelection;
    private String randomPeriodicity;
    private String siteHoursText;
    private String ofId;
    private Long compImageId;
    private Long certimageId;
    private String acceptWorkmanComp;
    private Boolean questPreferred;
    private Boolean physApptReqd;
    private Boolean activeSite;
    private Boolean competitivePriceSupplier;
    private Boolean inNetworkSupplier;
    private Boolean udsCollectionApptReqd;
    private Boolean truckParkingAvailable;
    private Boolean performsAfterHourServices;
    private Boolean canModifyCoc;
    private Boolean onsiteServicesAvailable;
    private Boolean customerOnsite;
    private String mdSupplierCode;
    private Boolean currentHRFileReceived;
    private String notificationType;
    private LocalDate consortiumBegDate;
    private LocalDate consortiumEndDate;
    private String qisReferenceId;
    private String formFoxSiteId;
    private Boolean allowHairDrugTests;
    private Boolean allowOralDrugTests;
    private Boolean reviewingMro;
    private Boolean sendUrineDotToFormFox;
    private Boolean sendUrineNonDotToFormFox;
    private Boolean sendHairDotToFormFox;
    private Boolean sendHairNonDotToFormFox;
    private Boolean sendOralDotToFormFox;
    private Boolean sendOralNonDotToFormFox;
    private Boolean sendPhysicalDotToFormFox;
    private Boolean sendPhysicalNonDotToFormFox;
    private Boolean sendBatDotToFormFox;
    private Boolean sendBatNonDotToFormFox;
    private String nationalRegistryNum;
    private Long addressRevisionId;
    private Boolean allowPOCTTests;
    private Boolean sendPOCTDotToFormFox;
    private Boolean sendPOCTNonDotToFormFox;
    private Boolean questPsc;
    private Boolean sendOrdersToCrl;
    private Boolean tier1;
    private Boolean tier2;
    private Boolean tier3;
    private Boolean tier4;
    private String crlSiteCode;
    private Boolean physicalTier1;
    private Boolean physicalTier2;
    private Boolean physicalTier3;
    private Boolean physicalTier4;
    private String questSiteId;
    private Boolean sendUrineDotToQuest;
    private Boolean sendUrineNonDotToQuest;
    private Boolean sendHairDotToQuest;
    private Boolean sendHairNonDotToQuest;
    private Boolean sendOralDotToQuest;
    private Boolean sendOralNonDotToQuest;
    private Boolean sendPhysicalDotToQuest;
    private Boolean sendPhysicalNonDotToQuest;
    private Boolean sendBatDotToQuest;
    private Boolean sendBatNonDotToQuest;
    private Boolean sendPOCTDotToQuest;
    private Boolean sendPOCTNonDotToQuest;
    private Boolean alwaysUseFormFox;
    private String labcorpSiteId;
    private Boolean sendUrineDotToLabCorp;
    private Boolean sendUrineNonDotToLabCorp;
    private Boolean sendHairDotToLabCorp;
    private Boolean sendHairNonDotToLabCorp;
    private Boolean sendOralDotToLabCorp;
    private Boolean sendOralNonDotToLabCorp;
    private Boolean sendPhysicalDotToLabCorp;
    private Boolean sendPhysicalNonDotToLabCorp;
    private Boolean sendBatDotToLabCorp;
    private Boolean sendBatNonDotToLabCorp;
    private Boolean sendPOCTDotToLabCorp;
    private Boolean sendPOCTNonDotToLabCorp;
    private String evtCustomerCode;
    private Boolean eccfNetWork;
    private Boolean performOnsiteCollection;
    private Boolean performObservedCollection;
    private String acumaticaCode;
    private String acumaticaLocationCode;
    private Long accountingAddressId;
    private String marketplaceTier;
    private Boolean marketplaceUrine;
    private Boolean marketplaceHair;
    private Boolean marketplacePhysical;
    private Boolean marketplaceBat;
    private String siteHrs;
    private Boolean excludeFromAutomatedFax;
    private AddressDTO address;
    
    private String name;

    /**
     * private String cityList;
     * private String stateList;
     * private String countryList;
     * 
     * private String billtoCityList;
     * private String billtoStateList;
     * private String billtoCountryList;
     * 
     * 
     * private String minorityVendorList;
     * private String employerIdNumber = "";
     * private String SSN = "";
     * private String taxIdNumber = "";
     * private String billToRemitToList;
     * private String paymentTermList;
     * private String paymentMethodList;
     * private int part40CompImageId;
     * private double eventMiles;
     * // private List<SiteHours> siteHoursList;
     * private String parentCode = "";
     * private int collectorCertImageId;
     * 
     * // private List<CustomerRemarkView> customerRemarks;
     * 
     * // private List<CustomerRemarkView> implementationRemarks;
     * // private List<LocationRemarkView> locationRemarks;
     * 
     * 
     * 
     * private Boolean nationalRegistryMatch;
     * 
     * private double distance;
     * private int labId;
     * private int mroId;
     * private int subAccountId;
     * private String subAccount = "";
     * 
     * 
     * 
     * 
     * 
     * // Add two new field for createdDate and lastUpdatedDate
     * // private String createdDate;
     * // private String createdTime;
     * // private String lastUpdateDate;
     * // private String lastUpdateTime;
     * 
     * 
     * 
     * // Adding formfox to customer location profile
     * private String labUrine;
     * private String labHair;
     * private String labUrineDotNumber;
     * private String labUrineNonDotNumber;
     * private String labHairNonDotNumber;
     * private String crlDotLabAccount;
     * private String crlNonDotLabAccount;
     * private String crlNonDotPanel;
     * private String crlDotPanel;
     * private String psyLabAccount;
     * private String psyPanel;
     * private Boolean sendLocationToFormFox;
     * private String labHairList;
     * private String labUrineList;
     * 
     * 
     * private String accFirstName;
     * private String accLastName;
     * private String accCountryList;
     * private String accCityList;
     * private String accStateList;
     */
}
