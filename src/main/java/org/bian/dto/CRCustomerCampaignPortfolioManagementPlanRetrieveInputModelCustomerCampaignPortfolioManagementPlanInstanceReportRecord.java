package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord
 */
public class CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord   {
  private String customerCampaignPortfolioManagementPlanInstanceReportReference = null;

  private String customerCampaignPortfolioManagementPlanInstanceReportType = null;

  private String customerCampaignPortfolioManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCampaignPortfolioManagementPlanInstanceReportReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReportReference() {
    return customerCampaignPortfolioManagementPlanInstanceReportReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportReference(String customerCampaignPortfolioManagementPlanInstanceReportReference) {
    this.customerCampaignPortfolioManagementPlanInstanceReportReference = customerCampaignPortfolioManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCampaignPortfolioManagementPlanInstanceReportType
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReportType() {
    return customerCampaignPortfolioManagementPlanInstanceReportType;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportType(String customerCampaignPortfolioManagementPlanInstanceReportType) {
    this.customerCampaignPortfolioManagementPlanInstanceReportType = customerCampaignPortfolioManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCampaignPortfolioManagementPlanInstanceReportParameters
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReportParameters() {
    return customerCampaignPortfolioManagementPlanInstanceReportParameters;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportParameters(String customerCampaignPortfolioManagementPlanInstanceReportParameters) {
    this.customerCampaignPortfolioManagementPlanInstanceReportParameters = customerCampaignPortfolioManagementPlanInstanceReportParameters;
  }


}

