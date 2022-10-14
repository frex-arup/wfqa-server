package com.wfqa.dat.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.wfqa.common.converter.BooleanToStringConverter;
import com.wfqa.common.entity.Audit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sites", schema = "DAT")
@DynamicUpdate
@DynamicInsert
public class Site extends Audit {
    @Id
    @Column
    private Long id;
    
    @Column(length = 20)
    private String type;
    
    @Column(name = "address_id")
    private Long addressId;
    
    @Column(name = "first_name", length = 75)
    private String firstName;
    
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "fleet_terminal", length = 50)
    private String fleetTerminal;
    
    @Column(name = "federal_id", length = 50)
    private String federalId;
    
    @Column(name = "bill_to_code", length = 50)
    private String billToCode;
    
    @Column(name = "customer_code", length = 50)
    private String customerCode;
    
    @Column(name = "client_code", length = 40)
    private String clientCode;
    
    @Column(name = "parent_site_id")
    private Long parentSiteId;
    
    @Column(name = "country_id")
    private Long countryId;
    
    @Column(length = 1)
    @NotNull
    @Pattern(regexp = "A|I|C")
    private String status;
    
    @Column(name = "business_type", length = 20)
    private String businessType;
    
    @Column(name = "employer_id", length = 20)
    private String employerId;
    
    @Column(name = "employer_name", length = 20)
    private String employerName;
    
    @Column(name = "monority_vendor_id")
    private Long minorityVendorId;
    
    @Column(name = "contract_image_id")
    private Long contractImageId;
    
    @Column(name = "bill_to_remit_to_id")
    private Long billToRemitToId;
    
    @Column(name = "payment_term", length = 10)
    private String paymentTerm;
    
    @Column(name = "payment_method", length = 20)
    private String paymentMethod;
    
    @Column(name = "pricing_term_begin")
    private LocalDateTime pricingTermBegin;
    
    @Column(name = "pricing_term_expire")
    private LocalDateTime pricingTermExpire;
    
    @Column(name = "inet_access", length = 1)
    private String inetAccess;
    
    @Column(name = "random_selection", length = 1)
    private String randomSelection;
    
    @Column(name = "random_periodicity", length = 1)
    private String randomPeriodicity;
    
    @Column(name = "site_hours_text", length = 500)
    private String siteHoursText;
    
    @Column(name = "of_id", length = 20)
    private String ofId;
    
    @Column(name = "comp_image_id")
    private Long compImageId;
    
    @Column(name = "cert_image_id")
    private Long certimageId;
    
    @Column(name = "accept_workman_comp", length = 1)
    private String acceptWorkmanComp;
    
    @Column(name = "quest_preferred", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean questPreferred;
    
    @Column(name = "phys_appt_reqd", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean physApptReqd;
    
    @Column(name = "active_site", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean activeSite;
    
    @Column(name = "competitive_price_supplier", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean competitivePriceSupplier;
    
    @Column(name = "in_network_supplier", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean inNetworkSupplier;
    
    @Column(name = "uds_collection_appt_reqd", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean udsCollectionApptReqd;
    
    @Column(name = "truck_parking_available", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean truckParkingAvailable;
    
    @Column(name = "performs_after_hour_services", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean performsAfterHourServices;
    
    @Column(name = "can_modify_coc", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean canModifyCoc;
    
    @Column(name = "onsite_services_available", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean onsiteServicesAvailable;
    
    @Column(name = "customer_onsite", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean customerOnsite;
    
    @Column(name = "md_supplier_code", length = 20)
    private String mdSupplierCode;
    
    @Column(name = "current_hr_file_received", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private String currentHRFileReceived;
    
    @Column(name = "notification_type", length = 10)
    private String notificationType;
    
    @Column(name = "consortium_beg_date")
    private LocalDateTime consortiumBegDate;
    
    @Column(name = "consortium_end_date")
    private LocalDateTime consortiumEndDate;

    @Column(name = "qis_reference_id", length = 10)
    private String qisReferenceId;
    
    @Column(name = "form_fox_site_id", length = 20)
    private String formFoxSiteId;
    
    // FormFox Preferences.
    @Column(name = "allow_hair_drug_tests", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowHairDrugTests;
    
    @Column(name = "allow_oral_drug_tests", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowOralDrugTests;
    
    @Column(name = "reviewing_mro", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean reviewingMro;
    
    @Column(name = "send_urine_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendUrineDotToFormFox;
    
    @Column(name = "send_urine_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendUrineNonDotToFormFox;
    
    @Column(name = "send_hair_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendHairDotToFormFox;
    
    @Column(name = "send_hair_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendHairNonDotToFormFox;
    
    @Column(name = "send_oral_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOralDotToFormFox;
    
    @Column(name = "send_oral_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOralNonDotToFormFox;
    
    @Column(name = "send_phys_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPhysicalDotToFormFox;
    
    @Column(name = "send_phys_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPhysicalNonDotToFormFox;
    
    @Column(name = "send_bat_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendBatDotToFormFox;
    
    @Column(name = "send_bat_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendBatNonDotToFormFox;
    
    @Column(name = "national_registry_num", length = 20)
    private String nationalRegistryNum;
    
    @Column(name = "revision_id")
    private Long revisionId;
    
    @Column(name = "address_revision_id")
    private Long addressRevisionId;
    
    @Column(name = "allow_poct_tests", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowPOCTTests;
    
    @Column(name = "send_poct_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPOCTDotToFormFox;
    
    @Column(name = "send_poct_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPOCTNonDotToFormFox;
    
    @Column(name = "quest_psc", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean questPsc;
    
    @Column(name = "send_orders_to_crl", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOrdersToCrl;
    
    @Column(name = "tier_1", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean tier1;
    
    @Column(name = "tier_2", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean tier2;
    
    @Column(name = "tier_3", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean tier3;
    
    @Column(name = "tier_4", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean tier4;
    
    @Column(name = "crl_site_code", length = 1)
    private String crlSiteCode;
    
    @Column(name = "physical_tier_1", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean physicalTier1;
    
    @Column(name = "physical_tier_2", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean physicalTier2;
    
    @Column(name = "physical_tier_3", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean physicalTier3;
    
    @Column(name = "physical_tier_4", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean physicalTier4;
    
    @Column(name = "quest_site_id", length = 20)
    private String questSiteId;
    
    @Column(name = "send_urine_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendUrineDotToQuest;
    
    @Column(name = "send_urine_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendUrineNonDotToQuest;
    
    @Column(name = "send_hair_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendHairDotToQuest;
    
    @Column(name = "send_hair_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendHairNonDotToQuest;
    
    @Column(name = "send_oral_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOralDotToQuest;
    
    @Column(name = "send_oral_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOralNonDotToQuest;
    
    @Column(name = "send_phys_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPhysicalDotToQuest;
    
    @Column(name = "send_phys_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPhysicalNonDotToQuest;
    
    @Column(name = "send_bat_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendBatDotToQuest;
    
    @Column(name = "send_bat_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendBatNonDotToQuest;

    @Column(name = "send_poct_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPOCTDotToQuest;
    
    @Column(name = "send_poct_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPOCTNonDotToQuest;
    
    @Column(name = "always_use_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean alwaysUseFormFox;
    
    @Column(name = "labcorp_site_id", length = 20)
    private String labcorpSiteId;
    
    @Column(name = "send_urine_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendUrineDotToLabCorp;
    
    @Column(name = "send_urine_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendUrineNonDotToLabCorp;
    
    @Column(name = "send_hair_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendHairDotToLabCorp;
    
    @Column(name = "send_hair_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendHairNonDotToLabCorp;
    
    @Column(name = "send_oral_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOralDotToLabCorp;
    
    @Column(name = "send_oral_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendOralNonDotToLabCorp;
    
    @Column(name = "send_phys_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPhysicalDotToLabCorp;
    
    @Column(name = "send_phys_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPhysicalNonDotToLabCorp;
    
    @Column(name = "send_bat_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendBatDotToLabCorp;
    
    @Column(name = "send_bat_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendBatNonDotToLabCorp;

    @Column(name = "send_poct_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPOCTDotToLabCorp;
    
    @Column(name = "send_poct_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean sendPOCTNonDotToLabCorp;
    
    @Column(name = "evt_customer_code", length = 55)
    private String evtCustomerCode;
    
    @Column(name = "eccf_netWork", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean eccfNetWork;
    
    @Column(name = "perform_onsite_collection", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean performOnsiteCollection;
    
    @Column(name = "perform_observed_collection", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean performObservedCollection;
    
    @Column(name = "acumatica_code", length = 20)
    private String acumaticaCode;
    
    @Column(name = "acumatica_location_code", length = 20)
    private String acumaticaLocationCode;
    
    @Column(name = "accounting_address_id")
    private Long accountingAddressId;
    
    @Column(name = "marketplace_tier", length = 20)
    private String marketplaceTier;
    
    @Column(name = "marketplace_urine", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean marketplaceUrine;
    
    @Column(name = "marketplace_hair", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean marketplaceHair;
    
    @Column(name = "marketplace_phy", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean marketplacePhysical;
    
    @Column(name = "marketplace_bat", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean marketplaceBat;
    
    @Column(name = "site_hrs", length = 25)
    private String siteHrs;

    @Column(name = "exclude_from_automated_fax", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean excludeFromAutomatedFax;
    
    /**
    private String cityList;
    private String stateList;
    private String countryList;

    private String billtoCityList;
    private String billtoStateList;
    private String billtoCountryList;

    
    private String minorityVendorList;
    private String employerIdNumber = "";
    private String SSN = "";
    private String taxIdNumber = "";
    private String billToRemitToList;
    private String paymentTermList;
    private String paymentMethodList;
    private int part40CompImageId;
    private double eventMiles;
//    private List<SiteHours> siteHoursList;
    private String parentCode = "";
    private int collectorCertImageId;
    
//    private List<CustomerRemarkView> customerRemarks;

    //    private List<CustomerRemarkView> implementationRemarks;
//    private List<LocationRemarkView> locationRemarks;
    
    
    
    private boolean nationalRegistryMatch;

    private double distance;
    private int labId;
    private int mroId;
    private int subAccountId;
    private String subAccount = "";

    

    

    // Add two new field for createdDate and lastUpdatedDate
//    private String createdDate;
//    private String createdTime;
//    private String lastUpdateDate;
//    private String lastUpdateTime;

    

    // Adding formfox to customer location profile
    private String labUrine;
    private String labHair;
    private String labUrineDotNumber;
    private String labUrineNonDotNumber;
    private String labHairNonDotNumber;
    private String crlDotLabAccount;
    private String crlNonDotLabAccount;
    private String crlNonDotPanel;
    private String crlDotPanel;
    private String psyLabAccount;
    private String psyPanel;
    private boolean sendLocationToFormFox;
    private String labHairList;
    private String labUrineList;
        

    private String accFirstName;
    private String accLastName;
    private String accCountryList;
    private String accCityList;
    private String accStateList;
    */
}
