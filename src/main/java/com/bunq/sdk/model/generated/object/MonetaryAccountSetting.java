package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class MonetaryAccountSetting extends BunqModel {

  /**
   * The color chosen for the MonetaryAccount.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM or AVATAR_UNDETERMINED.
   */
  @Expose
  @SerializedName("default_avatar_status")
  private String defaultAvatarStatus;

  /**
   * The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING
   */
  @Expose
  @SerializedName("restriction_chat")
  private String restrictionChat;

  /**
   * The color chosen for the MonetaryAccount in hexadecimal format.
   */
  @Expose
  @SerializedName("color_field_for_request")
  private String colorFieldForRequest;

  /**
   * The status of the avatar. Cannot be updated directly.
   */
  @Expose
  @SerializedName("default_avatar_status_field_for_request")
  private String defaultAvatarStatusFieldForRequest;

  /**
   * The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING
   */
  @Expose
  @SerializedName("restriction_chat_field_for_request")
  private String restrictionChatFieldForRequest;

  public MonetaryAccountSetting() {
    this(null, null, null);
  }

  public MonetaryAccountSetting(String color) {
    this(color, null, null);
  }

  public MonetaryAccountSetting(String color, String defaultAvatarStatus) {
    this(color, defaultAvatarStatus, null);
  }

  public MonetaryAccountSetting(String color, String defaultAvatarStatus, String restrictionChat) {
    this.colorFieldForRequest = color;
    this.defaultAvatarStatusFieldForRequest = defaultAvatarStatus;
    this.restrictionChatFieldForRequest = restrictionChat;
  }

  /**
   * The color chosen for the MonetaryAccount.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The status of the avatar. Can be either AVATAR_DEFAULT, AVATAR_CUSTOM or AVATAR_UNDETERMINED.
   */
  public String getDefaultAvatarStatus() {
    return this.defaultAvatarStatus;
  }

  public void setDefaultAvatarStatus(String defaultAvatarStatus) {
    this.defaultAvatarStatus = defaultAvatarStatus;
  }

  /**
   * The chat restriction. Possible values are ALLOW_INCOMING or BLOCK_INCOMING
   */
  public String getRestrictionChat() {
    return this.restrictionChat;
  }

  public void setRestrictionChat(String restrictionChat) {
    this.restrictionChat = restrictionChat;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.color != null) {
      return false;
    }

    if (this.defaultAvatarStatus != null) {
      return false;
    }

    if (this.restrictionChat != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountSetting fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountSetting.class, reader);
  }

}
