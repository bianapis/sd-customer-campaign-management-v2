package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionUpdateOutputModel
 */
public class BQCampaignDirectionUpdateOutputModel   {
  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;

  private String campaignDirectionUpdateActionTaskReference = null;

  private Object campaignDirectionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return campaignDirectionUpdateActionTaskReference
  **/

  public String getCampaignDirectionUpdateActionTaskReference() {
    return campaignDirectionUpdateActionTaskReference;
  }

  public void setCampaignDirectionUpdateActionTaskReference(String campaignDirectionUpdateActionTaskReference) {
    this.campaignDirectionUpdateActionTaskReference = campaignDirectionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return campaignDirectionUpdateActionTaskRecord
  **/

  public Object getCampaignDirectionUpdateActionTaskRecord() {
    return campaignDirectionUpdateActionTaskRecord;
  }

  public void setCampaignDirectionUpdateActionTaskRecord(Object campaignDirectionUpdateActionTaskRecord) {
    this.campaignDirectionUpdateActionTaskRecord = campaignDirectionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

