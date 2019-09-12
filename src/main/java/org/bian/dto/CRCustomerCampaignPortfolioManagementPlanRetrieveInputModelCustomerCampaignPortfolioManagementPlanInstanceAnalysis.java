package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis
 */
public class CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis   {
  private String customerCampaignPortfolioManagementPlanInstanceAnalysisReference = null;

  private String customerCampaignPortfolioManagementPlanInstanceAnalysisReportType = null;

  private String customerCampaignPortfolioManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysisReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceAnalysisReference() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysisReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysisReference(String customerCampaignPortfolioManagementPlanInstanceAnalysisReference) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysisReference = customerCampaignPortfolioManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysisReportType
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceAnalysisReportType() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysisReportType;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysisReportType(String customerCampaignPortfolioManagementPlanInstanceAnalysisReportType) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysisReportType = customerCampaignPortfolioManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysisParameters
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceAnalysisParameters() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysisParameters;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysisParameters(String customerCampaignPortfolioManagementPlanInstanceAnalysisParameters) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysisParameters = customerCampaignPortfolioManagementPlanInstanceAnalysisParameters;
  }


}

