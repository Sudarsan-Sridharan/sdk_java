package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 * bunq.me fundraiser result containing all payments.
 */
public class BunqMeFundraiserResult extends BunqModel {

  /**
   * The id of the bunq.me.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the bunq.me was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the bunq.me was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("bunqme_fundraiser_profile")
  private BunqMeFundraiserProfile bunqmeFundraiserProfile;

  /**
   * The list of payments, paid to the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("payments")
  private List<Payment> payments;

  /**
   * The id of the bunq.me.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the bunq.me was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the bunq.me was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The bunq.me fundraiser profile.
   */
  public BunqMeFundraiserProfile getBunqmeFundraiserProfile() {
    return this.bunqmeFundraiserProfile;
  }

  public void setBunqmeFundraiserProfile(BunqMeFundraiserProfile bunqmeFundraiserProfile) {
    this.bunqmeFundraiserProfile = bunqmeFundraiserProfile;
  }

  /**
   * The list of payments, paid to the bunq.me fundraiser profile.
   */
  public List<Payment> getPayments() {
    return this.payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
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

    if (this.bunqmeFundraiserProfile != null) {
      return false;
    }

    if (this.payments != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeFundraiserResult fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeFundraiserResult.class, reader);
  }

}
