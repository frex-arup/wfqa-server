package com.wfqa.mroplace.entity;

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
import com.wfqa.common.entity.AuditForSite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dat_customer_associations", schema = "MRO")
@DynamicUpdate
@DynamicInsert
public class CustomerAssociation extends AuditForSite{
    
        @Id
        @Column(name = "ID")
        private Long id;
        
        @Column(name = "SUB_ACCOUNT",length=40)
        private String subAccount;
        
        @Column(name = "LAB_CUSTOMER_CODE", length = 20)
        private String labCustomerCode;
        
        @Column(name = "MRO_CUSTOMER_CODE", length = 20)
        private String mroCustomerCode;

        @Column(name = "CARRIER_CUSTOMER_CODE",length=20)
        private String carrierCustomerCode;
        
        @Column(length = 1)
        @NotNull
        @Pattern(regexp = "A|I|C")
        private String status;
        
        @Column(name = "COLLECTION_SITE_ID")
        private Long collectionSiteId;
        
        @Column(name = "TEST_TYPE", length = 30)
        private String testType;
        
        @Column(name = "MRO_ID")
        private Long mroId;
        
        @Column(name = "CUSTOMER_ID")
        private Long customerId;
        
        @Column(name = "LAB_ID")
        private Long labId;
        
        @Column(name = "IS_POST_ACC_MRO", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean postAccountMro;
        
        @Column(name = "LAB_BILLING_ENTITY", length = 20)
        private String labBillingEntity;
        
        @Column(name = "COLLECTION_BILLING_ENTITY", length = 20)
        private String collectionBillingEntity;
        
        @Column(name = "NBR_OF_FORMS_REQUIRED")
        private Long numberOfFormsReuired;
        
        @Column(name = "KITS_REQUIRED", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean kitsRequired;
        
        @Column(name = "REORDER_TRIGGER_QTY")
        private Long reorderTriggerQuantityNumber;
        
        @Column(name = "CURRENT_NBR_OF_FORMS")
        private Long currentNumberOfForms;
        
        @Column(name = "MAIL_TO", length = 20)
        private String mailTo;
        
        @Column(name = "ACCOUNT_NAME", length = 50)
        private String accountName;
        
        @Column(name = "IMAGE_REQUIRED", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean imageRequired;
        
        @Column(name = "REVIEW_NON_NEGATIVES_ONLY", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean reviewNonNegativesOnly;
        
        @Column(name = "REVIEW_NON_NEGATIVES", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean reviewNonNegatives;
        
        @Column(name = "HAIR_SCREEN_ACCOUNT", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean hairScreenAccount;
        
        @Column(name = "TERMINAL_ID")
        private Long terminalId;
        
        @Column(name = "FORM_FOX_LAB", length = 20)
        private String formfoxLab;
        
        @Column(name = "BUNDLE_TYPE", length = 1)
        private String bundleType;
        
        @Column(name = "POCT_ACCOUNT", length = 1)
        @Convert(converter=BooleanToStringConverter.class)
        private Boolean poctAccount;

}
