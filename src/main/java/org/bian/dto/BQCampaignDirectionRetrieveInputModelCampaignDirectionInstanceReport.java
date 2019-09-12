package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceReport
 */
public class BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceReport   {
  private String campaignDirectionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return campaignDirectionInstanceReportReference
  **/

  public String getCampaignDirectionInstanceReportReference() {
    return campaignDirectionInstanceReportReference;
  }

  public void setCampaignDirectionInstanceReportReference(String campaignDirectionInstanceReportReference) {
    this.campaignDirectionInstanceReportReference = campaignDirectionInstanceReportReference;
  }


}

