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


package org.openapitools.client.model;

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
import org.openapitools.client.model.AttachedVolumes;
import org.openapitools.client.model.Cdroms;
import org.openapitools.client.model.Nics;

/**
 * ServerEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-19T16:25:36.792145+02:00[Europe/Bucharest]")
public class ServerEntities {
  public static final String SERIALIZED_NAME_CDROMS = "cdroms";
  @SerializedName(SERIALIZED_NAME_CDROMS)
  private Cdroms cdroms;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private AttachedVolumes volumes;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private Nics nics;


  public ServerEntities cdroms(Cdroms cdroms) {
    
    this.cdroms = cdroms;
    return this;
  }

   /**
   * Get cdroms
   * @return cdroms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cdroms getCdroms() {
    return cdroms;
  }


  public void setCdroms(Cdroms cdroms) {
    this.cdroms = cdroms;
  }


  public ServerEntities volumes(AttachedVolumes volumes) {
    
    this.volumes = volumes;
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttachedVolumes getVolumes() {
    return volumes;
  }


  public void setVolumes(AttachedVolumes volumes) {
    this.volumes = volumes;
  }


  public ServerEntities nics(Nics nics) {
    
    this.nics = nics;
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Nics getNics() {
    return nics;
  }


  public void setNics(Nics nics) {
    this.nics = nics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerEntities serverEntities = (ServerEntities) o;
    return Objects.equals(this.cdroms, serverEntities.cdroms) &&
        Objects.equals(this.volumes, serverEntities.volumes) &&
        Objects.equals(this.nics, serverEntities.nics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdroms, volumes, nics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerEntities {\n");
    sb.append("    cdroms: ").append(toIndentedString(cdroms)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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

