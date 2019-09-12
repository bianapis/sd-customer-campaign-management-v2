package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanCreateOutputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanCreateOutputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String customerCampaignPortfolioManagementPlanCreateActionReference = null;

  private Object customerCampaignPortfolioManagementPlanCreateActionRecord = null;

  private String customerCampaignPortfolioManagementPlanInstanceStatus = null;

  private CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return customerCampaignPortfolioManagementPlanCreateActionReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanCreateActionReference() {
    return customerCampaignPortfolioManagementPlanCreateActionReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanCreateActionReference(String customerCampaignPortfolioManagementPlanCreateActionReference) {
    this.customerCampaignPortfolioManagementPlanCreateActionReference = customerCampaignPortfolioManagementPlanCreateActionReference;
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

  public CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolio getCustomerCampaignPortfolio() {
    return customerCampaignPortfolio;
  }

  public void setCustomerCampaignPortfolio(CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolio customerCampaignPortfolio) {
    this.customerCampaignPortfolio = customerCampaignPortfolio;
  }


}

