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
@Table(name = "dat_user", schema = "DAT")
@DynamicUpdate
@DynamicInsert
public class User extends Audit {
    
    @Id
    @Column(name = "login_user_id", length = 40)
    private String loginUserId;
    
    @Column(length = 1)
    @NotNull
    @Pattern(regexp = "A|I|C")
    private String status;
    
    @Column(name = "user_company_id")
    private Long userCompanyId;
    
    @Column(length = 20)
    @NotNull
    private String role;
    
    @Column(name = "first_name", length = 50)
    private String firstName;
    
    @Column(name = "last_name", length = 50)
    private String lastName;
    
    @Column(length = 100)
//  @NotNull
    private String email;
    
    @Column(name = "tpa_id")
    private Long tpaId;
    
    @Column(name = "session_id", length = 200)
    private String sessionId;
    
    @Column(name = "contact_phone", length = 10)
    private String contactPhone;
    
    @Column(name = "security_level")
    private Long securityLevel;
    
    @Column(name = "default_index_image_type")
    private Long defaultIndexImageType;
    
    @Column(name = "bg_screening_role", length = 20)
    private String bgScreeningRole;
    
    @Column(name = "contact_fax", length = 10)
    private String contactFax;
    
    @Column(name = "security_question_skip_count")
    private Long securityQuestionSkipCount;
    
    @Column(name = "default_force_overwrite", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean  defaultForceOverwrite;
    
    @Column(name = "test_reason_id_str", length = 80)
    private String testReasonIdStr;
    
    @Column(name = "test_type", length = 10)
    private String testType;
    
    @Column(name = "view_safety_concern_letter", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean viewSafetyConcernLetter;
    
    @Column(name = "select_alternatives", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean selectAlterNatives;
    
    @Column(name = "allow_user_maintenance", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowUserMaintenance;
    
    @Column(name = "allow_poct_result_entry", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowPoctResultEntry;
    
    @Column(name = "enable_eccf_network", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean enableECCFNetwork;
    
    @Column(name = "time_zone", length = 30)
    private String timeZone;
    
    @Column(name = "allow_covid_tracking", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowCovidTracking;
    
    @Column(name = "origin_app", length = 10)
    private String originApp;
    
    @Column(name = "allow_reviewed_test_edit", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean allowReviewedTestEdit;
    
    @Column(name = "password_hash", length = 60)
    private String passwordHash;
    
    @Column(name = "pw_reset_required", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean pwResetRequired;
    
    @Column(name = "new_ui_only", length = 1)
    @Convert(converter=BooleanToStringConverter.class)
    private boolean newUiOnly;
    
    @Column(name = "logon_date_time")
    private LocalDateTime logonDateTime;
    
    @Column(name = "logoff_date_time")
    private LocalDateTime logoffDateTime;

}
