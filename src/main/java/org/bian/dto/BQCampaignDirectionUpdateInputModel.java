package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionUpdateInputModel
 */
public class BQCampaignDirectionUpdateInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String campaignDirectionInstanceReference = null;

  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;

  private Object campaignDirectionUpdateActionTaskRecord = null;

  private String campaignDirectionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Portfolio Management Plan instance 
   * @return customerCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReference() {
    return customerCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReference(String customerCampaignPortfolioManagementPlanInstanceReference) {
    this.customerCampaignPortfolioManagementPlanInstanceReference = customerCampaignPortfolioManagementPlanInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return campaignDirectionUpdateActionRequest
  **/

  public String getCampaignDirectionUpdateActionRequest() {
    return campaignDirectionUpdateActionRequest;
  }

  public void setCampaignDirectionUpdateActionRequest(String campaignDirectionUpdateActionRequest) {
    this.campaignDirectionUpdateActionRequest = campaignDirectionUpdateActionRequest;
  }


}

