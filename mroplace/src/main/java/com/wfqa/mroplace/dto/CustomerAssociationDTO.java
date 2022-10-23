package com.wfqa.mroplace.dto;

import java.io.Serializable;

import com.wfqa.dat.dto.SiteDTO;

import lombok.Data;

@Data
public class CustomerAssociationDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private String subAccount;
    private String labCustomerCode;
    private String mroCustomerCode;
    private String carrierCustomerCode;
    private String status;
    private Long collectionSiteId;
    private String testType;
    private Long mroId;
    private Long customerId;
    private Long labId;
    private Boolean postAccountMro;
    private String labBillingEntity;
    private String collectionBillingEntity;
    private Long numberOfFormsReuired;
    private Boolean kitsRequired;
    private Long reorderTriggerQuantityNumber;
    private Long currentNumberOfForms;
    private String mailTo;
    private String accountName;
    private Boolean imageRequired;
    private Boolean reviewNonNegativesOnly;
    private Boolean reviewNonNegatives;
    private Boolean hairScreenAccount;
    private Long terminalId;
    private String formfoxLab;
    private String bundleType;
    private Boolean poctAccount;
    private SiteDTO siteDTO;
}
