package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingExecuteInputModelExecuteRecordType;
import org.bian.dto.BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingExecuteInputModel
 */
public class BQMarketTrackingExecuteInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String marketTrackingInstanceReference = null;

  private BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private Object marketTrackingExecuteActionTaskRecord = null;

  private BQMarketTrackingExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return marketTrackingExecuteActionTaskRecord
  **/

  public Object getMarketTrackingExecuteActionTaskRecord() {
    return marketTrackingExecuteActionTaskRecord;
  }

  public void setMarketTrackingExecuteActionTaskRecord(Object marketTrackingExecuteActionTaskRecord) {
    this.marketTrackingExecuteActionTaskRecord = marketTrackingExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQMarketTrackingExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQMarketTrackingExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

