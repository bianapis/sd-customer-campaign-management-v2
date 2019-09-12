package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel   {
  private CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;

  private String customerCampaignPortfolioManagementPlanUpdateActionTaskReference = null;

  private Object customerCampaignPortfolioManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerCampaignPortfolioManagementPlanUpdateActionTaskReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanUpdateActionTaskReference() {
    return customerCampaignPortfolioManagementPlanUpdateActionTaskReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanUpdateActionTaskReference(String customerCampaignPortfolioManagementPlanUpdateActionTaskReference) {
    this.customerCampaignPortfolioManagementPlanUpdateActionTaskReference = customerCampaignPortfolioManagementPlanUpdateActionTaskReference;
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

