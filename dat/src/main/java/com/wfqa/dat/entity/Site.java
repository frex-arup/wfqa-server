package com.wfqa.dat.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
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

import com.wfqa.common.converter.BooleanToStringConverter;
import com.wfqa.common.entity.AuditForSite;
import com.wfqa.common.primarykey.Id_RevisionId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sites", schema = "DAT")
@DynamicUpdate
@DynamicInsert
@IdClass(Id_RevisionId.class)
public class Site extends AuditForSite {
    @Id
    @Column
    private Long id;
    
    @Id
    @Column(name = "revision_id")
    private Long revisionId;
    
    @Column(length = 20)
    private String type;
    
//    @Column(name = "address_id")
//    private Long addressId;
    
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
    
    @Column(name = "minority_vendor_id")
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
    private LocalDate pricingTermBegin;
    
    @Column(name = "pricing_term_exp")
    private LocalDate pricingTermExpire;
    
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
    private Boolean currentHRFileReceived;
    
    @Column(name = "notification_type", length = 10)
    private String notificationType;
    
    @Column(name = "consortium_beg_date")
    private LocalDate consortiumBegDate;
    
    @Column(name = "consortium_end_date")
    private LocalDate consortiumEndDate;

    @Column(name = "qis_reference_id", length = 10)
    private String qisReferenceId;
    
    @Column(name = "form_fox_site_id", length = 20)
    private String formFoxSiteId;
    
    // FormFox Preferences.
    @Column(name = "allow_hair_drug_tests", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean allowHairDrugTests;
    
    @Column(name = "allow_oral_drug_tests", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean allowOralDrugTests;
    
    @Column(name = "reviewing_mro", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean reviewingMro;
    
    @Column(name = "send_urine_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendUrineDotToFormFox;
    
    @Column(name = "send_urine_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendUrineNonDotToFormFox;
    
    @Column(name = "send_hair_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendHairDotToFormFox;
    
    @Column(name = "send_hair_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendHairNonDotToFormFox;
    
    @Column(name = "send_oral_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOralDotToFormFox;
    
    @Column(name = "send_oral_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOralNonDotToFormFox;
    
    @Column(name = "send_phys_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPhysicalDotToFormFox;
    
    @Column(name = "send_phys_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPhysicalNonDotToFormFox;
    
    @Column(name = "send_bat_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendBatDotToFormFox;
    
    @Column(name = "send_bat_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendBatNonDotToFormFox;
    
    @Column(name = "national_registry_num", length = 20)
    private String nationalRegistryNum;
    
//    @Column(name = "address_revision_id")
//    private Long addressRevisionId;

    @Column(name = "allow_poct_tests", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean allowPOCTTests;
    
    @Column(name = "send_poct_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPOCTDotToFormFox;
    
    @Column(name = "send_poct_non_dot_to_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPOCTNonDotToFormFox;
    
    @Column(name = "quest_psc", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean questPsc;
    
    @Column(name = "send_orders_to_crl", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOrdersToCrl;
    
    @Column(name = "tier_1", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean tier1;
    
    @Column(name = "tier_2", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean tier2;
    
    @Column(name = "tier_3", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean tier3;
    
    @Column(name = "tier_4", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean tier4;
    
    @Column(name = "crl_site_code", length = 1)
    private String crlSiteCode;
    
    @Column(name = "physical_tier_1", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean physicalTier1;
    
    @Column(name = "physical_tier_2", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean physicalTier2;
    
    @Column(name = "physical_tier_3", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean physicalTier3;
    
    @Column(name = "physical_tier_4", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean physicalTier4;
    
    @Column(name = "quest_site_id", length = 20)
    private String questSiteId;
    
    @Column(name = "send_urine_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendUrineDotToQuest;
    
    @Column(name = "send_urine_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendUrineNonDotToQuest;
    
    @Column(name = "send_hair_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendHairDotToQuest;
    
    @Column(name = "send_hair_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendHairNonDotToQuest;
    
    @Column(name = "send_oral_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOralDotToQuest;
    
    @Column(name = "send_oral_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOralNonDotToQuest;
    
    @Column(name = "send_phys_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPhysicalDotToQuest;
    
    @Column(name = "send_phys_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPhysicalNonDotToQuest;
    
    @Column(name = "send_bat_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendBatDotToQuest;
    
    @Column(name = "send_bat_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendBatNonDotToQuest;

    @Column(name = "send_poct_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPOCTDotToQuest;
    
    @Column(name = "send_poct_non_dot_to_quest", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPOCTNonDotToQuest;
    
    @Column(name = "always_use_form_fox", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean alwaysUseFormFox;
    
    @Column(name = "labcorp_site_id", length = 20)
    private String labcorpSiteId;
    
    @Column(name = "send_urine_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendUrineDotToLabCorp;
    
    @Column(name = "send_urine_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendUrineNonDotToLabCorp;
    
    @Column(name = "send_hair_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendHairDotToLabCorp;
    
    @Column(name = "send_hair_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendHairNonDotToLabCorp;
    
    @Column(name = "send_oral_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOralDotToLabCorp;
    
    @Column(name = "send_oral_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendOralNonDotToLabCorp;
    
    @Column(name = "send_phys_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPhysicalDotToLabCorp;
    
    @Column(name = "send_phys_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPhysicalNonDotToLabCorp;
    
    @Column(name = "send_bat_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendBatDotToLabCorp;
    
    @Column(name = "send_bat_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendBatNonDotToLabCorp;

    @Column(name = "send_poct_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPOCTDotToLabCorp;
    
    @Column(name = "send_poct_non_dot_to_labcorp", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean sendPOCTNonDotToLabCorp;
    
    @Column(name = "evt_customer_code", length = 55)
    private String evtCustomerCode;
    
    @Column(name = "eccf_network", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean eccfNetWork;
    
    @Column(name = "perform_onsite_collection", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean performOnsiteCollection;
    
    @Column(name = "perform_observed_collection", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean performObservedCollection;
    
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
    private Boolean marketplaceUrine;
    
    @Column(name = "marketplace_hair", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean marketplaceHair;
    
    @Column(name = "marketplace_phy", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean marketplacePhysical;
    
    @Column(name = "marketplace_bat", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean marketplaceBat;
    
    @Column(name = "site_hrs", length = 25)
    private String siteHrs;

    @Column(name = "exclude_from_automated_fax", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean excludeFromAutomatedFax;
    
    @OneToOne 
    @JoinColumns({
        @JoinColumn(name = "address_id", referencedColumnName = "id"),
        @JoinColumn(name = "address_revision_id", referencedColumnName = "revision_id")
    })
    @WhereJoinTable(clause = "status = 'A' ")
    private Address address;
    
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
    
    
    
    private Boolean nationalRegistryMatch;

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
    private Boolean sendLocationToFormFox;
    private String labHairList;
    private String labUrineList;
        

    private String accFirstName;
    private String accLastName;
    private String accCountryList;
    private String accCityList;
    private String accStateList;
    */
}
