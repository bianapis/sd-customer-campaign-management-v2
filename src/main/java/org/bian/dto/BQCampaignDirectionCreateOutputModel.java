package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionCreateOutputModel
 */
public class BQCampaignDirectionCreateOutputModel   {
  private String campaignDirectionInstanceReference = null;

  private String campaignDirectionInitiateActionReference = null;

  private Object campaignDirectionInitiateActionRecord = null;

  private String campaignDirectionInstanceStatus = null;

  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Campaign Direction instance 
   * @return campaignDirectionInstanceReference
  **/

  public String getCampaignDirectionInstanceReference() {
    return campaignDirectionInstanceReference;
  }

  public void setCampaignDirectionInstanceReference(String campaignDirectionInstanceReference) {
    this.campaignDirectionInstanceReference = campaignDirectionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return campaignDirectionInitiateActionReference
  **/

  public String getCampaignDirectionInitiateActionReference() {
    return campaignDirectionInitiateActionReference;
  }

  public void setCampaignDirectionInitiateActionReference(String campaignDirectionInitiateActionReference) {
    this.campaignDirectionInitiateActionReference = campaignDirectionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return campaignDirectionInitiateActionRecord
  **/

  public Object getCampaignDirectionInitiateActionRecord() {
    return campaignDirectionInitiateActionRecord;
  }

  public void setCampaignDirectionInitiateActionRecord(Object campaignDirectionInitiateActionRecord) {
    this.campaignDirectionInitiateActionRecord = campaignDirectionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Campaign Direction instance (e.g. initialised, pending, active) 
   * @return campaignDirectionInstanceStatus
  **/

  public String getCampaignDirectionInstanceStatus() {
    return campaignDirectionInstanceStatus;
  }

  public void setCampaignDirectionInstanceStatus(String campaignDirectionInstanceStatus) {
    this.campaignDirectionInstanceStatus = campaignDirectionInstanceStatus;
  }


  /**
   * Get campaignDirectionInstanceRecord
   * @return campaignDirectionInstanceRecord
  **/

  public BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord getCampaignDirectionInstanceRecord() {
    return campaignDirectionInstanceRecord;
  }

  public void setCampaignDirectionInstanceRecord(BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord) {
    this.campaignDirectionInstanceRecord = campaignDirectionInstanceRecord;
  }


}

