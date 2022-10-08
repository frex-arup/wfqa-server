package com.wfqa.common.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dat_user", schema = "DAT")
public class DAT_User extends Audit {
	
	@Id
	@Column(name = "login_user_id", length = 40)
	private String loginUserId;
	
	@Column(length = 1)
	@NotNull
	@Pattern(regexp = "A|I|C")
	private String status;
	
	@Column(name = "user_company_id", length = 7)
	private Long userCompanyId;
	
	@Column(length = 20)
	@NotNull
	private String role;
	
	@Column(name = "first_name", length = 50)
	private String firstName;
	
	@Column(name = "last_name", length = 50)
	private String lastName;
	
	@Column(length = 100)
	@NotNull
	private String email;
	
	@Column(name = "tpa_id", length = 7)
	private Long tpaId;
	
	@Column(name = "session_id", length = 200)
	private String sessionId;
	
	@Column(name = "contact_phone", length = 10)
	private String contactPhone;
	
	@Column(name = "security_level")
	private Long securityLevel;
	
	@Column(name = "default_image_index_type")
	private Long defaultImageIndexType;
	
	@Column(name = "bg_screening_role", length = 20)
	private String bgScreeningRole;
	
	@Column(name = "contact_fax", length = 10)
	private String contactFax;
	
	@Column(name = "security_question_skip_count")
	private Long securityQuestionSkipCount;
	
	@Column(name = "default_force_overwrite")
	@Type(type="yes_no")
	private boolean defaultForceOverwrite;
	
	@Column(name = "test_reason_id_str", length = 80)
	private String testReasonIdStr;
	
	@Column(name = "test_type", length = 10)
	private String testType;
	
	@Column(name = "view_safety_concern_letter")
	@Type(type="yes_no")
	private boolean viewSafetyConcernLetter;
	
	@Column(name = "select_alternatives")
	@Type(type="yes_no")
	private boolean selectAlterNatives;
	
	@Column(name = "allow_user_maintenance")
	@Type(type="yes_no")
	private boolean allowUserMaintenance;
	
	@Column(name = "allow_poct_result_entry")
	@Type(type="yes_no")
	private boolean allowPoctResultEntry;
	
	@Column(name = "enable_eccf_network")
	@Type(type="yes_no")
	private boolean enableECCFNetwork;
	
	@Column(name = "time_zone", length = 30)
	private String timeZone;
	
	@Column(name = "allow_covid_tracking")
	@Type(type="yes_no")
	private boolean allowCovidTracking;
	
	@Column(name = "origin_app", length = 10)
	private String originApp;
	
	@Column(name = "allow_reviewed_test_edit")
	@Type(type="yes_no")
	private boolean allowReviewedTestEdit;
	
	@Column(name = "password_hash", length = 60)
	private String passwordHash;
	
	@Column(name = "pw_reset_required")
	@Type(type="yes_no")
	private boolean pwResetRequired;
	
	@Column(name = "new_ui_only")
	@Type(type="yes_no")
	private boolean newUiOnly;
	
	@Column(name = "logon_date_time")
	private LocalDateTime logonDateTime;
	
	@Column(name = "logoff_date_time")
	private LocalDateTime logoffDateTime;
	

}
