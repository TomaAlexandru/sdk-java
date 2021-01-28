/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GroupShareProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-28T15:47:18.888Z[Etc/UTC]")

public class GroupShareProperties {
  public static final String SERIALIZED_NAME_EDIT_PRIVILEGE = "editPrivilege";
  @SerializedName(SERIALIZED_NAME_EDIT_PRIVILEGE)
  private Boolean editPrivilege;

  public static final String SERIALIZED_NAME_SHARE_PRIVILEGE = "sharePrivilege";
  @SerializedName(SERIALIZED_NAME_SHARE_PRIVILEGE)
  private Boolean sharePrivilege;


  public GroupShareProperties editPrivilege(Boolean editPrivilege) {
    
    this.editPrivilege = editPrivilege;
    return this;
  }

   /**
   * edit privilege on a resource
   * @return editPrivilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "edit privilege on a resource")

  public Boolean getEditPrivilege() {
    return editPrivilege;
  }


  public void setEditPrivilege(Boolean editPrivilege) {
    this.editPrivilege = editPrivilege;
  }


  public GroupShareProperties sharePrivilege(Boolean sharePrivilege) {
    
    this.sharePrivilege = sharePrivilege;
    return this;
  }

   /**
   * share privilege on a resource
   * @return sharePrivilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "share privilege on a resource")

  public Boolean getSharePrivilege() {
    return sharePrivilege;
  }


  public void setSharePrivilege(Boolean sharePrivilege) {
    this.sharePrivilege = sharePrivilege;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupShareProperties groupShareProperties = (GroupShareProperties) o;
    return Objects.equals(this.editPrivilege, groupShareProperties.editPrivilege) && Objects.equals(this.sharePrivilege, groupShareProperties.sharePrivilege);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupShareProperties {\n");
    sb.append("    editPrivilege: ").append(toIndentedString(editPrivilege)).append("\n");
    sb.append("    sharePrivilege: ").append(toIndentedString(sharePrivilege)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

