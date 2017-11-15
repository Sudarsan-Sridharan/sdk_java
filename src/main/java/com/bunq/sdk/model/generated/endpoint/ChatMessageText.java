package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Endpoint for the type of chat message that carries text.
 */
public class ChatMessageText extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/chat-conversation/%s/message-text";

  /**
   * Field constants.
   */
  public static final String FIELD_CLIENT_MESSAGE_UUID = "client_message_uuid";
  public static final String FIELD_TEXT = "text";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Id";

  /**
   * The id of the newly created chat message.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer chatConversationId) {
    return create(apiContext, requestMap, userId, chatConversationId, new HashMap<>());
  }

  /**
   * Add a new text message to a specific conversation.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer chatConversationId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, chatConversationId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The id of the newly created chat message.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}