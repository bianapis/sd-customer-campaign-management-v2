package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRequestOutputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanRequestOutputModel   {
  private CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;

  private String customerCampaignPortfolioManagementPlanRequestActionTaskReference = null;

  private Object customerCampaignPortfolioManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerCampaignPortfolio
   * @return customerCampaignPortfolio
  **/

  public CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio getCustomerCampaignPortfolio() {
    return customerCampaignPortfolio;
  }

  public void setCustomerCampaignPortfolio(CRCustomerCampaignPortfolioManagementPlanRequestInputModelCustomerCampaignPortfolio customerCampaignPortfolio) {
    this.customerCampaignPortfolio = customerCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Portfolio Management Plan instance request service call 
   * @return customerCampaignPortfolioManagementPlanRequestActionTaskReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanRequestActionTaskReference() {
    return customerCampaignPortfolioManagementPlanRequestActionTaskReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanRequestActionTaskReference(String customerCampaignPortfolioManagementPlanRequestActionTaskReference) {
    this.customerCampaignPortfolioManagementPlanRequestActionTaskReference = customerCampaignPortfolioManagementPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignPortfolioManagementPlanRequestActionTaskRecord
  **/

  public Object getCustomerCampaignPortfolioManagementPlanRequestActionTaskRecord() {
    return customerCampaignPortfolioManagementPlanRequestActionTaskRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanRequestActionTaskRecord(Object customerCampaignPortfolioManagementPlanRequestActionTaskRecord) {
    this.customerCampaignPortfolioManagementPlanRequestActionTaskRecord = customerCampaignPortfolioManagementPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
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

