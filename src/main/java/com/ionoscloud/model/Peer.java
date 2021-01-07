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
 * Peer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-07T17:22:54.537709+02:00[Europe/Bucharest]")
public class Peer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenterId";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;

  public static final String SERIALIZED_NAME_DATACENTER_NAME = "datacenterName";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NAME)
  private String datacenterName;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


  public Peer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Peer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Peer datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * Get datacenterId
   * @return datacenterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }


  public Peer datacenterName(String datacenterName) {
    
    this.datacenterName = datacenterName;
    return this;
  }

   /**
   * Get datacenterName
   * @return datacenterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterName() {
    return datacenterName;
  }


  public void setDatacenterName(String datacenterName) {
    this.datacenterName = datacenterName;
  }


  public Peer location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peer peer = (Peer) o;
    return Objects.equals(this.id, peer.id) && Objects.equals(this.name, peer.name) && Objects.equals(this.datacenterId, peer.datacenterId) && Objects.equals(this.datacenterName, peer.datacenterName) && Objects.equals(this.location, peer.location);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");
    sb.append("    datacenterName: ").append(toIndentedString(datacenterName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
