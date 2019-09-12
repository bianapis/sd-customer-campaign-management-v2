package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanUpdateInputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanUpdateInputModel   {
  private String customerCampaignManagementServicingSessionReference = null;

  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;

  private Object customerCampaignPortfolioManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignManagementServicingSessionReference
  **/

  public String getCustomerCampaignManagementServicingSessionReference() {
    return customerCampaignManagementServicingSessionReference;
  }

  public void setCustomerCampaignManagementServicingSessionReference(String customerCampaignManagementServicingSessionReference) {
    this.customerCampaignManagementServicingSessionReference = customerCampaignManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Portfolio Management Plan instance 
   * @return customerCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReference() {
    return customerCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReference(String customerCampaignPortfolioManagementPlanInstanceReference) {
    this.customerCampaignPortfolioManagementPlanInstanceReference = customerCampaignPortfolioManagementPlanInstanceReference;
  }


  /**
   * Get customerCampaignPortfolio
   * @return customerCampaignPortfolio
  **/

  public CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolio getCustomerCampaignPortfolio() {
    return customerCampaignPortfolio;
  }

  public void setCustomerCampaignPortfolio(CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolio customerCampaignPortfolio) {
    this.customerCampaignPortfolio = customerCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCampaignPortfolioManagementPlanUpdateActionTaskRecord
  **/

  public Object getCustomerCampaignPortfolioManagementPlanUpdateActionTaskRecord() {
    return customerCampaignPortfolioManagementPlanUpdateActionTaskRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanUpdateActionTaskRecord(Object customerCampaignPortfolioManagementPlanUpdateActionTaskRecord) {
    this.customerCampaignPortfolioManagementPlanUpdateActionTaskRecord = customerCampaignPortfolioManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

