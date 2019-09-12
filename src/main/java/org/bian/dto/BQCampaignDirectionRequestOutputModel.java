package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRequestOutputModel
 */
public class BQCampaignDirectionRequestOutputModel   {
  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;

  private String campaignDirectionRequestActionTaskReference = null;

  private Object campaignDirectionRequestActionTaskRecord = null;

  private String campaignDirectionRequestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Campaign Direction instance request service call 
   * @return campaignDirectionRequestActionTaskReference
  **/

  public String getCampaignDirectionRequestActionTaskReference() {
    return campaignDirectionRequestActionTaskReference;
  }

  public void setCampaignDirectionRequestActionTaskReference(String campaignDirectionRequestActionTaskReference) {
    this.campaignDirectionRequestActionTaskReference = campaignDirectionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return campaignDirectionRequestActionTaskRecord
  **/

  public Object getCampaignDirectionRequestActionTaskRecord() {
    return campaignDirectionRequestActionTaskRecord;
  }

  public void setCampaignDirectionRequestActionTaskRecord(Object campaignDirectionRequestActionTaskRecord) {
    this.campaignDirectionRequestActionTaskRecord = campaignDirectionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Campaign Direction service request record 
   * @return campaignDirectionRequestRecordReference
  **/

  public String getCampaignDirectionRequestRecordReference() {
    return campaignDirectionRequestRecordReference;
  }

  public void setCampaignDirectionRequestRecordReference(String campaignDirectionRequestRecordReference) {
    this.campaignDirectionRequestRecordReference = campaignDirectionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

