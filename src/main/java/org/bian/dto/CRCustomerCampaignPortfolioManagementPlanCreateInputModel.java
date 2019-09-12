package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanCreateInputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanCreateInputModel   {
  private String customerCampaignManagementServicingSessionReference = null;

  private Object customerCampaignPortfolioManagementPlanCreateActionRecord = null;

  private String customerCampaignPortfolioManagementPlanInstanceStatus = null;

  private CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return customerCampaignPortfolioManagementPlanCreateActionRecord
  **/

  public Object getCustomerCampaignPortfolioManagementPlanCreateActionRecord() {
    return customerCampaignPortfolioManagementPlanCreateActionRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanCreateActionRecord(Object customerCampaignPortfolioManagementPlanCreateActionRecord) {
    this.customerCampaignPortfolioManagementPlanCreateActionRecord = customerCampaignPortfolioManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Portfolio Management Plan instance (e.g. initialised, pending, active) 
   * @return customerCampaignPortfolioManagementPlanInstanceStatus
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceStatus() {
    return customerCampaignPortfolioManagementPlanInstanceStatus;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceStatus(String customerCampaignPortfolioManagementPlanInstanceStatus) {
    this.customerCampaignPortfolioManagementPlanInstanceStatus = customerCampaignPortfolioManagementPlanInstanceStatus;
  }


  /**
   * Get customerCampaignPortfolio
   * @return customerCampaignPortfolio
  **/

  public CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolio getCustomerCampaignPortfolio() {
    return customerCampaignPortfolio;
  }

  public void setCustomerCampaignPortfolio(CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolio customerCampaignPortfolio) {
    this.customerCampaignPortfolio = customerCampaignPortfolio;
  }


}

