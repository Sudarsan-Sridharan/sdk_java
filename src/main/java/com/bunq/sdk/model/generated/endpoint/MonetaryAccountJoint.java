package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.CoOwner;
import com.bunq.sdk.model.generated.object.MonetaryAccountSetting;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The endpoint for joint monetary accounts.
 */
public class MonetaryAccountJoint extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_DAILY_LIMIT = "daily_limit";
  public static final String FIELD_OVERDRAFT_LIMIT = "overdraft_limit";
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_REASON = "reason";
  public static final String FIELD_REASON_DESCRIPTION = "reason_description";
  public static final String FIELD_ALL_CO_OWNER = "all_co_owner";
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";
  public static final String FIELD_SETTING = "setting";

  /**
   * The id of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the MonetaryAccountJoint's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the MonetaryAccountJoint's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Avatar of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit")
  private Amount dailyLimit;

  /**
   * Total Amount of money spent today. Timezone aware.
   */
  @Expose
  @SerializedName("daily_spent")
  private Amount dailySpent;

  /**
   * The maximum Amount the MonetaryAccountJoint can be 'in the red'.
   */
  @Expose
  @SerializedName("overdraft_limit")
  private Amount overdraftLimit;

  /**
   * The current balance Amount of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The Aliases for the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The MonetaryAccountJoint's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountJoint. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can only be OTHER.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountJoint.
   * Can be any user provided message.
   */
  @Expose
  @SerializedName("reason_description")
  private String reasonDescription;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("all_co_owner")
  private List<CoOwner> allCoOwner;

  /**
   * The id of the User who owns the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The profile of the account.
   */
  @Expose
  @SerializedName("monetary_account_profile")
  private MonetaryAccountProfile monetaryAccountProfile;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /**
   * The settings of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSetting setting;

  /**
   * The id of the MonetaryAccountJoint.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the MonetaryAccountJoint's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the MonetaryAccountJoint's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Avatar of the MonetaryAccountJoint.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  public Amount getDailyLimit() {
    return this.dailyLimit;
  }

  public void setDailyLimit(Amount dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  /**
   * Total Amount of money spent today. Timezone aware.
   */
  public Amount getDailySpent() {
    return this.dailySpent;
  }

  public void setDailySpent(Amount dailySpent) {
    this.dailySpent = dailySpent;
  }

  /**
   * The maximum Amount the MonetaryAccountJoint can be 'in the red'.
   */
  public Amount getOverdraftLimit() {
    return this.overdraftLimit;
  }

  public void setOverdraftLimit(Amount overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * The current balance Amount of the MonetaryAccountJoint.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The Aliases for the MonetaryAccountJoint.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The MonetaryAccountJoint's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the MonetaryAccountJoint. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can only be OTHER.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountJoint.
   * Can be any user provided message.
   */
  public String getReasonDescription() {
    return this.reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }

  /**
   * The users the account will be joint with.
   */
  public List<CoOwner> getAllCoOwner() {
    return this.allCoOwner;
  }

  public void setAllCoOwner(List<CoOwner> allCoOwner) {
    this.allCoOwner = allCoOwner;
  }

  /**
   * The id of the User who owns the MonetaryAccountJoint.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The profile of the account.
   */
  public MonetaryAccountProfile getMonetaryAccountProfile() {
    return this.monetaryAccountProfile;
  }

  public void setMonetaryAccountProfile(MonetaryAccountProfile monetaryAccountProfile) {
    this.monetaryAccountProfile = monetaryAccountProfile;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * MonetaryAccountJoint.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The settings of the MonetaryAccountJoint.
   */
  public MonetaryAccountSetting getSetting() {
    return this.setting;
  }

  public void setSetting(MonetaryAccountSetting setting) {
    this.setting = setting;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.dailyLimit != null) {
      return false;
    }

    if (this.dailySpent != null) {
      return false;
    }

    if (this.overdraftLimit != null) {
      return false;
    }

    if (this.balance != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.publicUuid != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.reason != null) {
      return false;
    }

    if (this.reasonDescription != null) {
      return false;
    }

    if (this.allCoOwner != null) {
      return false;
    }

    if (this.userId != null) {
      return false;
    }

    if (this.monetaryAccountProfile != null) {
      return false;
    }

    if (this.notificationFilters != null) {
      return false;
    }

    if (this.setting != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountJoint fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountJoint.class, reader);
  }

}