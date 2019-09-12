package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingUpdateInputModel
 */
public class BQMarketTrackingUpdateInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String marketTrackingInstanceReference = null;

  private BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private Object marketTrackingUpdateActionTaskRecord = null;

  private String marketTrackingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Tracking instance 
   * @return marketTrackingInstanceReference
  **/

  public String getMarketTrackingInstanceReference() {
    return marketTrackingInstanceReference;
  }

  public void setMarketTrackingInstanceReference(String marketTrackingInstanceReference) {
    this.marketTrackingInstanceReference = marketTrackingInstanceReference;
  }


  /**
   * Get marketTrackingInstanceRecord
   * @return marketTrackingInstanceRecord
  **/

  public BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return marketTrackingUpdateActionTaskRecord
  **/

  public Object getMarketTrackingUpdateActionTaskRecord() {
    return marketTrackingUpdateActionTaskRecord;
  }

  public void setMarketTrackingUpdateActionTaskRecord(Object marketTrackingUpdateActionTaskRecord) {
    this.marketTrackingUpdateActionTaskRecord = marketTrackingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return marketTrackingUpdateActionRequest
  **/

  public String getMarketTrackingUpdateActionRequest() {
    return marketTrackingUpdateActionRequest;
  }

  public void setMarketTrackingUpdateActionRequest(String marketTrackingUpdateActionRequest) {
    this.marketTrackingUpdateActionRequest = marketTrackingUpdateActionRequest;
  }


}

